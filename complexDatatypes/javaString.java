package complexDatatypes;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class javaString{
    public static void main (String[] args){
        System.out.println("Sedulous! This program is for string operations in java");
        String name = "Engineer Okoth Smart";
        System.out.println("Your name has " + name.length() + " character");
        System.out.println("The first letter in your name is "+ name.charAt(0) +" While the last character is "+ name.charAt(name.length() -1));
        System.out.println("In lower case your name is "+ name.toLowerCase() + " while in upper case your name becomes " + name.toUpperCase());

        //check for substrings
        System.out.println(name.contains("art")? "Your name contains the text 'art' " : "your name does not contain the string 'art'");

        //check indexes in strings
        System.out.println("letter s is at index " + name.indexOf('S'));

        //blank and empty strings
        String empty1 ="  ";
        System.out.println(" Is the name empty?: " + empty1.isEmpty());
        System.out.println("Is your name blank? : " + empty1.isBlank());

        //string comparison
        String a ="Sedulous";
        String b = "sedulous";
        System.out.println("Is a the same as b: " + a.equals(b));

        //splitting and joining
        String items = "oranges bananas mangoes";
        String[] itemsArray = items.split(" ");
        System.out.println(Arrays.toString(itemsArray));
        String joined = String.join("/","02","08","2026");
        System.out.println("This application was engineered by Jatelo on "+ joined);

        //Modifying and replacing
        String text =" Jatelo ia a Sedulous Engineer ";
        String trimmed = text.trim();
        System.out.println(trimmed.replace("Sedulous","Very Sedulous"));
        System.out.println("sedulous! ".repeat(3));

        //formatting strings
        int score =95;
        System.out.println(String.format("%s scored %d . it was marvellous", name, score));

        //Extracting and cutting strings
        System.out.println(name.substring(6,13));
        System.out.println(name.substring(8));




    }
}