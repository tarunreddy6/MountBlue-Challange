copy this (https://www.hackerrank.com/contests/mountblue-technologies/challenges/making-anagrams )for Probem Statement.!
// Happy Coding :)
          
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'makingAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int makingAnagrams(String s1, String s2) {
    // Write your code here
      
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<s1.length(); i++){
            if(map.get(s1.charAt(i)) == null){
                map.put(s1.charAt(i), 1);
            } else {
            
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }
        }
        for(int i=0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                int temp = map.get(s2.charAt(i));
                if(temp == 1){
                   map.remove(s2.charAt(i)); 
                } else {
                    map.put(s2.charAt(i), temp-1);
                }
            } else {
                count++;
            }
        }         
        for(Integer i: map.values()){
            count = count + i;
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

