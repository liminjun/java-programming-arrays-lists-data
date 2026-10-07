
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class UniqueTester
{
    
    
    public void testUniqueIP() {
        // complete method
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("short-test_log");
        int uniqueIps = la.countUniqueIps();
        System.out.println("Number of unique IPs: " + uniqueIps);
    }
}
