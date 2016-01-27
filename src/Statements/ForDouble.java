package Statements;
import java.util.ArrayList;

public class ForDouble { 
   
 public static void main(String args[]) { 
   ArrayList<Double> list = new ArrayList<Double>();

   list.add(10.14);
   list.add(20.22);
   list.add(30.78);
   list.add(40.46);

   double sum = 0.0;
   for(double itr : list)
     sum = sum + itr;
   System.out.println(sum);
 
 } 
}


