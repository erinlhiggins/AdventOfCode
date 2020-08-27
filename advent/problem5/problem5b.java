import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem5b{
  public static void main(String []args) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    sc.useDelimiter("");
    int shortest = 0;
    List<StringBuilder> removed = new ArrayList<>();
    for(int t = 0;t < 26;t++){
      StringBuilder letterStringB = new StringBuilder();
      removed.add(letterStringB);
    }
    List<Character> seen = new ArrayList<>();
    while(sc.hasNext()){
      char current = sc.next().charAt(0);
      for(int h = 0; h < removed.size(); h++){
        removed.get(h).append(current);
      }
      if(Character.toLowerCase(current)=='a'){
        StringBuilder newVal = removed.get(0);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(0, newVal);
      }else if(Character.toLowerCase(current)=='b'){
        StringBuilder newVal = removed.get(1);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(1, newVal);
      }else if(Character.toLowerCase(current)=='c'){
        StringBuilder newVal = removed.get(2);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(2, newVal);
      }else if(Character.toLowerCase(current)=='d'){
        StringBuilder newVal = removed.get(3);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(3, newVal);
      }else if(Character.toLowerCase(current)=='e'){
        StringBuilder newVal = removed.get(4);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(4, newVal);
      }else if(Character.toLowerCase(current)=='f'){
        StringBuilder newVal = removed.get(5);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(5, newVal);
      }else if(Character.toLowerCase(current)=='g'){
        StringBuilder newVal = removed.get(6);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(6, newVal);
      }else if(Character.toLowerCase(current)=='h'){
        StringBuilder newVal = removed.get(7);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(7, newVal);
      }else if(Character.toLowerCase(current)=='i'){
        StringBuilder newVal = removed.get(8);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(8, newVal);
      }else if(Character.toLowerCase(current)=='j'){
        StringBuilder newVal = removed.get(9);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(9, newVal);
      }else if(Character.toLowerCase(current)=='k'){
        StringBuilder newVal = removed.get(10);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(10, newVal);
      }else if(Character.toLowerCase(current)=='l'){
        StringBuilder newVal = removed.get(11);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(11, newVal);
      }else if(Character.toLowerCase(current)=='m'){
        StringBuilder newVal = removed.get(12);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(12, newVal);
      }else if(Character.toLowerCase(current)=='n'){
        StringBuilder newVal = removed.get(13);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(13, newVal);
      }else if(Character.toLowerCase(current)=='o'){
        StringBuilder newVal = removed.get(14);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(14, newVal);
      }else if(Character.toLowerCase(current)=='p'){
        StringBuilder newVal = removed.get(15);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(15, newVal);
      }else if(Character.toLowerCase(current)=='q'){
        StringBuilder newVal = removed.get(16);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(16, newVal);
      }else if(Character.toLowerCase(current)=='r'){
        StringBuilder newVal = removed.get(17);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(17, newVal);
      }else if(Character.toLowerCase(current)=='s'){
        StringBuilder newVal = removed.get(18);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(18, newVal);
      }else if(Character.toLowerCase(current)=='t'){
        StringBuilder newVal = removed.get(19);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(19, newVal);
      }else if(Character.toLowerCase(current)=='u'){
        StringBuilder newVal = removed.get(20);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(20, newVal);
      }else if(Character.toLowerCase(current)=='v'){
        StringBuilder newVal = removed.get(21);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(21, newVal);
      }else if(Character.toLowerCase(current)=='w'){
        StringBuilder newVal = removed.get(22);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(22, newVal);
      }else if(Character.toLowerCase(current)=='x'){
        StringBuilder newVal = removed.get(23);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(23, newVal);
      }else if(Character.toLowerCase(current)=='y'){
        StringBuilder newVal = removed.get(24);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(24, newVal);
      }else if(Character.toLowerCase(current)=='z'){
        StringBuilder newVal = removed.get(25);
        newVal.deleteCharAt(newVal.length()-1);
        removed.set(25, newVal);
      }
    }
    for(int g = 0; g < removed.size(); g++){
      String currentString = removed.get(g).toString();
      for(int i = 0; i < currentString.length(); i++){
        char current = currentString.charAt(i);
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
      if(shortest == 0){
        shortest = seen.size();
      }else if(shortest > seen.size()){
        shortest = seen.size();
      }
      seen.clear();
    }
    System.out.println(shortest);
  }
}
