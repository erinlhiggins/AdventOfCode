import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem4a{
  public static class DateItem{
    String value;
    int month;
    int day;
    int hour;
    int minute;
    DateItem(String v, int m, int d, int h, int min){
      value = v;
      month = m;
      day = d;
      hour = h;
      minute = min;
    }
  }
  public static void main(String args[]) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    List<DateItem> inOrder = new ArrayList<>();
    while(sc.hasNextLine()){
      String current = sc.nextLine();
      System.out.println("current: "+current);
      //67(month) 910(day) 1213(hour) 1516(minute)
      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();
      StringBuilder sb3 = new StringBuilder();
      StringBuilder sb4 = new StringBuilder();
      sb1.append(current.charAt(6));
      sb1.append(current.charAt(7));
      sb2.append(current.charAt(9));
      sb2.append(current.charAt(10));
      sb3.append(current.charAt(12));
      sb3.append(current.charAt(13));
      sb4.append(current.charAt(15));
      sb4.append(current.charAt(16));
      int month = Integer.parseInt(sb1.toString());
      int day = Integer.parseInt(sb2.toString());
      int hour = Integer.parseInt(sb3.toString());
      int minute = Integer.parseInt(sb4.toString());
      DateItem currentDate = new DateItem(current, month, day, hour, minute);
      int i = 0;
      if(inOrder.size() == 0){
        inOrder.add(currentDate);
        i = inOrder.size();
      }
      while(i < inOrder.size()){
        System.out.println("in order: "+inOrder.get(i).value);
        if(inOrder.get(i).month > month){
          System.out.println("month");
          System.out.println(month);
          System.out.println(inOrder.get(i).month);
          i++;
        }else if(inOrder.get(i).day > day){
          System.out.println("day");
          System.out.println(day);
          System.out.println(inOrder.get(i).day);
          i++;
        }else if(inOrder.get(i).hour != 23 && inOrder.get(i).hour > hour){
          System.out.println("hour");
          System.out.println(hour);
          System.out.println(inOrder.get(i).hour);
          i++;
        }else if(inOrder.get(i).minute > minute){
          System.out.println("minute");
          System.out.println(minute);
          System.out.println(inOrder.get(i).minute);
          i++;
        }else{
          break;
        }
      }
      if(i == inOrder.size()){
        inOrder.add(currentDate);
      }else{
        inOrder.add(i, currentDate);
      }
    }
    for(int i = 0; i < inOrder.size(); i++){
      System.out.println(inOrder.get(i).value);
    }
  }
}
