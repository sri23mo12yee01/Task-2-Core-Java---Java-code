import java.io.*;
import java.util.Scanner;
  
class code7 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine(); String nstr="";
        char ch;
        
      System.out.println("Original word: "+ str);
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
  
