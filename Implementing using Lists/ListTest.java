import java.util.*;
import java.io.*;
public class ListTest{
   
   
   public static List<Integer> readValues(String fileName){
   
   File text;
   Scanner input;
   
   
   List<Integer> list = new LinkedList<Integer>();
    int x= 0;
   
   
   try{
   text = new File(fileName);
    input = new Scanner(text);
    
   while(input.hasNextLine()){
     x = input.nextInt(); 
   list.insert(x);
   System.out.println(x);
   }//while
   }//end try
   catch(FileNotFoundException e){
   System.out.println("file not found");
   }
   catch(InputMismatchException e){
   System.out.println("File is not entirley of integer values");
   }
   return list;
   }
   
   
   public static int bubbleSort(List<Integer> l){
   
   if(l.empty())
      return 0;
   
   int temp;// store data for swaping
   int swap=0;
   int r1=0;
   int r2=0;
   for(int i=0; i<l.length();i++){
      for(int j=0; j<l.length()-1-i;j++){
         l.findIth(j);
         r1 = l.retrieve();
         l.findIth(j+1);
         r2=l.retrieve();
         if(r1 > r2){
         
          temp = r1;
           l.update(r2);
          l.findNext();
        l.update(temp);
         
         swap++;
         }//if 
      }//j loop
   }//i loop
   return swap;
   }
   
   
}