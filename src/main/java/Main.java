public class Main {

    public static void main(String[] args) {

        double a = 1.3;
        double b = 2.2;
        double c = -4;

        System.out.println("Součet: "+ a + " + " + b + " + " + c + " = " + sum(1.3, 2.2, -4));
    }

    public static double sum(double... doubles){
        double sum = 0;

        for(double a : doubles) sum += a;

        return sum;
    }

}
