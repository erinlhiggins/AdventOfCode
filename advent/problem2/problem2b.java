import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem2b{
  public static void main(String args[]) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    ArrayList<String> inputFile = new ArrayList<>();
    while(sc.hasNextLine()){
      String input = sc.nextLine();
      inputFile.add(input);
    }
    for(int i = 0; i < inputFile.size();i++){
      String test = inputFile.get(i);
      for(int j = i + 1; j < inputFile.size(); j++){
        String test2 = inputFile.get(j);
        int allowedValue = 1;
        for(int l = 0; l < test2.length();l++){
          if(test.charAt(l)!=test2.charAt(l)){
            allowedValue--;
          }
        }
        if(allowedValue == 0){
          System.out.println("test: "+test+"test2: "+test2);
        }
      }
    }
  }
}
