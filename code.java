import java.util.Random;

public class code {
    public static void main(String[] args) {

        Random rand = new Random();
        int upperbound = 25;
        int upperbound_2 = 47;
        int int_random = rand.nextInt(upperbound);
        int int_random_2 = rand.nextInt(upperbound_2);

        Cat.AddTwoNums(int_random, int_random * int_random);
        Cat.MultiplyTwoNums(int_random_2, int_random_2 * int_random_2);
    }

    public static void PrintString(String string){
        System.out.println(string);
    }

    public static void PrintInt(Integer int1){
        System.out.println(int1);
    }
}
