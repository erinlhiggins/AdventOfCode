import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem2{
  public static void main(String args[]) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    int numTwo = 0;
    int numThree = 0;
    int finalNumTwo = 0;
    int finalNumThree = 0;
    while(sc.hasNextLine()){
      Map<Character, Integer> frequencies = new HashMap<>();
      String currentInput = sc.nextLine();
      numTwo = 0;
      numThree = 0;
      for(int i = 0; i < currentInput.length(); i++){
          if(frequencies.containsKey(currentInput.charAt(i))){
            int currentNum = frequencies.get(currentInput.charAt(i));
            frequencies.put(currentInput.charAt(i), currentNum + 1);
            if(currentNum == 1){
              numTwo = numTwo + 1;
            }
            if(currentNum == 2){
              numTwo = numTwo - 1;
              numThree = numThree + 1;
            }
            if(currentNum == 3){
              numThree = numThree - 1;
            }
          }else if(!frequencies.containsKey(currentInput.charAt(i))){
            frequencies.put(currentInput.charAt(i), 1);
          }
      }
      if(numThree > 1){
        numThree = 1;
      }
      if(numTwo > 1){
        numTwo = 1;
      }
      finalNumTwo = finalNumTwo + numTwo;
      finalNumThree = finalNumThree + numThree;
    }
    int result = finalNumTwo * finalNumThree;
    System.out.println(result);
  }
}
