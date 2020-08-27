import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class problem3a{
  public static void main(String args[]) throws Exception{
    File file = new File("input.txt");
    Scanner sc = new Scanner(file);
    int[][] arr = new int[1000][1000];
    int overlap = 0;
    while(sc.hasNextLine()){
      String current = sc.nextLine();
      String[] information = current.split(" ");
      boolean seenComma = false;
      boolean seenX = false;
      StringBuilder boundxString = new StringBuilder();
      StringBuilder boundyString = new StringBuilder();
      StringBuilder startxString = new StringBuilder();
      StringBuilder startyString = new StringBuilder();
      //2 is the start
      //3 is the dimensions
      for(int k = 0; k < information[2].length()-1; k++){
        if(!seenComma || information[2].charAt(k)==','){
          if(information[2].charAt(k)!=','){
            startxString.append(information[2].charAt(k));
          }else{
            seenComma = true;
          }
        }else if(seenComma){
          startyString.append(information[2].charAt(k));
        }
      }

      for(int m = 0; m < information[3].length(); m++){
        if(!seenX || information[3].charAt(m)=='x'){
          if(information[3].charAt(m)!='x'){
            boundxString.append(information[3].charAt(m));
          }else{
            seenX = true;
          }
        }else if(seenX){
          boundyString.append(information[3].charAt(m));
        }
      }

      int startx = Integer.parseInt(startxString.toString());
      int starty = Integer.parseInt(startyString.toString());
      int boundx = Integer.parseInt(boundxString.toString());
      int boundy = Integer.parseInt(boundyString.toString());

      for(int i = startx; i < startx + boundx; i++){
        for(int j = starty; j < starty + boundy; j++){
          arr[i][j] = arr[i][j] + 1;
        }
      }
    }
    int result = 0;
        for (int[] row : arr) {
            for (int i : row) {
                if (i > 1) {
                    result++;
                }
            }
        }
    System.out.println(result);
    String returnVal = part2(arr);
    System.out.println(returnVal);
  }
  public static String part2(int[][] arr) throws Exception{
      File file = new File("input.txt");
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()){
        String current = sc.nextLine();
        String[] information = current.split(" ");
        boolean seenComma = false;
        boolean seenX = false;
        StringBuilder boundxString = new StringBuilder();
        StringBuilder boundyString = new StringBuilder();
        StringBuilder startxString = new StringBuilder();
        StringBuilder startyString = new StringBuilder();
        List<String> id = new ArrayList<>();
        //2 is the start
        //3 is the dimensions
        for(int k = 0; k < information[2].length()-1; k++){
          if(!seenComma || information[2].charAt(k)==','){
            if(information[2].charAt(k)!=','){
              startxString.append(information[2].charAt(k));
            }else{
              seenComma = true;
            }
          }else if(seenComma){
            startyString.append(information[2].charAt(k));
          }
        }

        for(int m = 0; m < information[3].length(); m++){
          if(!seenX || information[3].charAt(m)=='x'){
            if(information[3].charAt(m)!='x'){
              boundxString.append(information[3].charAt(m));
            }else{
              seenX = true;
            }
          }else if(seenX){
            boundyString.append(information[3].charAt(m));
          }
        }

        int startx = Integer.parseInt(startxString.toString());
        int starty = Integer.parseInt(startyString.toString());
        int boundx = Integer.parseInt(boundxString.toString());
        int boundy = Integer.parseInt(boundyString.toString());

        boolean found = true;
        for(int i = startx; i < startx + boundx; i++){
          for(int j = starty; j < starty + boundy; j++){
            if(arr[i][j] > 1){
              found = false;
            }
          }
        }
        if(found){
          return information[0];
        }
    }
    return "None";
  }
}
