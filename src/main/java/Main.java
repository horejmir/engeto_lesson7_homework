public class Main {

    public static void main(String[] args) {

        System.out.println("Součet: " + sum(1.3, 2.2, -4));
    }

    public static double sum(double... doubles){
        double sum = 0;

        for(double a : doubles) sum += a;

        return sum;
    }

}
