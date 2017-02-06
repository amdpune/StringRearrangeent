/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//**************************************
// Name: Simple String Rearrangement
// Description:Input the first & second string .
//Read the first & second string
//Display the first string.
//Copy the two strings.
//Display the String.

//
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:None
//
//Side Effects:None
//**************************************

package stringrearrangeent;
import java.util.*;


    public class StringRearrangeent {
    Scanner obj,obj1;


        public static void main(String[] args) {
        String Sout="";
        String_print(Sout);
    }
    public static void String_print(String Sou)


        {
        System.out.println("Programme for String Re-Arrangement");
        System.out.println("***********************************");
        System.out.println("Enter the First String:-");
        Scanner obj=new Scanner(System.in);
        String S=obj.nextLine();
        System.out.println("Eneter the Second String:-");
        Scanner obj1=new Scanner(System.in);
        String S1=obj1.nextLine();
        System.out.println("\n" +S1);
        S1=S;
        System.out.println(S1);
    }
}

		
 