import java.util.Random;

public class Random_A {
    private int randomNumber;
    public Random_A(){

    }


    public int valor_aleatorio(){
        Random num_aleatorio = new Random();
        randomNumber = num_aleatorio.nextInt(101);
        return randomNumber;
    }
}
