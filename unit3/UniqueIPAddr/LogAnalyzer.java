import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
    private ArrayList<LogEntry> records;
    public LogAnalyzer() {
        records = new ArrayList<LogEntry>();
    }
    public void readFile(String filename) {
        FileResource resource = new FileResource(filename);
        records.clear();
        for (String line : resource.lines()) {
            LogEntry le = WebLogParser.parseEntry(line);
            records.add(le);
        }
    }
    public int countUniqueIps() {
        ArrayList<String> uniqueIps = new ArrayList<String>();
        for (LogEntry le : records) {
            String ipAddr = le.getIpAddress();
            if (!uniqueIps.contains(ipAddr)) {
                uniqueIps.add(ipAddr);
            }
        }
        return uniqueIps.size();
    }
}