
/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         // complete constructor
         records = new ArrayList<LogEntry>();

     }
        
     public void readFile(String filename) {
         FileResource resource = new FileResource(filename);
         records.clear();
         for (String line : resource.lines()) {
             LogEntry entry = WebLogParser.parseEntry(line);
             records.add(entry);
         }
    }
        
    public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
    }
}
