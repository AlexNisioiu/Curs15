package org.example.Functional;

/**
 * public static void puneGresie(executia ta specifica){
 *     1000 de pasi (1000 line of code)
 *     executia ta specifica
 *     1000 de pasi (1000 lines of code)
 * }
 */
public class OldJava {

    public static void main(String[] args) {
        placeTiles(new Spin());
    }
    public static void placeTiles(CustomExecution customExecution){
        System.out.println("1000 lines of code");
        System.out.println(customExecution.execute());
        System.out.println("1000 lines of code");

    }
}
interface CustomExecution{
    String execute();
}

class FiveTaps implements CustomExecution{

    @Override
    public String execute() {
        return "Five Taps";
    }
}

class Spin implements CustomExecution{

    @Override
    public String execute() {
        return "Spin";
    }
}