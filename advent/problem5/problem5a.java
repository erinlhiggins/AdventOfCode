import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem5a{
  public static void main(String []args) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    sc.useDelimiter("");
    List<Character> seen = new ArrayList<>();
    while(sc.hasNext()){
      char current = sc.next().charAt(0);
      if(seen.size()==0){
        seen.add(current);
      }else{
        if(Character.isUpperCase(current)){
          if(Character.isLowerCase(seen.get(seen.size()-1))){
            if(Character.toLowerCase(current) == Character.toLowerCase(seen.get(seen.size()-1))){
              seen.remove(seen.size()-1);
            }else{
              seen.add(current);
            }
          }else{
            seen.add(current);
          }
        }else if(Character.isLowerCase(current)){
          if(Character.isUpperCase(seen.get(seen.size()-1))){
            if(Character.toLowerCase(current) == Character.toLowerCase(seen.get(seen.size()-1))){
              seen.remove(seen.size()-1);
            }else{
              seen.add(current);
            }
          }else{
            seen.add(current);
          }
        }
      }
    }
    System.out.println(seen.size());
  }
}
