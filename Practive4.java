//Using Java program this program can open (run) applications (Notepad, Calculator). We use instance of Runtime.getRuntime() and method exec() to open / run application.

import java.util.*;
public class Practive4 {
    public static void main(String[] args){
        Runtime app=Runtime.getRuntime();
        try{
            app.exec("notepad");
            app.exec("calc");
            app.exec("mspaint");
            app.exec("explorer");
            app.exec("cmd");
        }
        catch(Exception Ex){
            System.out.println("Error:"+Ex.toString());
        }
    }
    
}
