import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

final String Menu = "A- Add D- Delete P- Print Q- Quit";
boolean done = false;
String cmd = "";

do {
    displayList();
    cmd = SafeInput.getRegExString(in,Menu,"[AaDdPpQq]");
    cmd = cmd.toUpperCase();
    String item="";
    switch(cmd)
    {
        case"A":
            list.add(SafeInput.getNonZerolength(in,"Enter your item to the list"));//prompt user to add item to list
            //make sure it is not an empty string
            //add it to list
            break;
        case"D":
        list.remove(SafeInput.getRangedInt(in,"What item would you like to delete",1,100));
            //Prompt user for the number of the item to delete
            break;
        case"P":
            System.out.println(list); //print list
            break;
        case"Q":
            System.exit(0);
            break;
    }
    System.out.println("cmd is " + cmd);
}while(!done);
    }
    private static void displayList()
    {
        System.out.println("---------------------------------------");
        if(list.size()!= 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%5s", i + 1, list.get(i));
            }
        }
        else
            System.out.println("------------ List is Empty ------------");

    }
}