import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;

public class problem1{
  public static void main(String args[]) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    int result = 0;
    Set<Integer> frequencies = new HashSet<>();
    Queue<Integer> repeat = new LinkedList<>();

    while(sc.hasNextInt()){
      int addition = sc.nextInt();
      result = result + addition;
      repeat.add(addition);
      if(!frequencies.contains(result)){
        frequencies.add(result);
      }else if(frequencies.contains(result)){
        System.out.println(result);
        break;
      }
    }

    while(!repeat.isEmpty()){
      int current = repeat.remove();
      result = result + current;
      if(!frequencies.contains(result)){
        frequencies.add(result);
        repeat.add(current);
      }else if(frequencies.contains(result)){
        System.out.println(result);
        break;
      }
    }
  }
}
