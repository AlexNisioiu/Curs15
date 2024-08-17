package Functional;

/**
 * public static void puneGresie(executia ta specifica){
 * 1000 de pasi(1000 de linii de code)
 * executia ta specifica
 * 1000 de pasi(1000 de linii de code)
 * }
 */
public class OldJava {

    public static void main(String[] args) {
        placeTiles(new Spin());
    }

    public static void placeTiles(CustomExecution customExecution) {
        System.out.println("1000 de linii de cod");
        System.out.println(customExecution.execute());
        System.out.println("1000 de linii de cod");


    }

}

interface CustomExecution {
    String execute();

}

class FiveTaps implements CustomExecution {

    @Override
    public String execute() {
        return "Five taps";
    }
}

class Spin implements CustomExecution {

    @Override
    public String execute() {
        return "Spin";
    }
}

