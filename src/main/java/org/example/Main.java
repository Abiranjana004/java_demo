package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public boolean passorfail(int marks){
        if(marks >= 50) {
            System.out.println("Pass");
            return true;
        }
        else {
            System.out.println("Fail");
            return false;
        }
    }
}
