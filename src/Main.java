public class Main {

    public static void main(String[] args) {
        Parabola p = new Parabola(1F,-2F,1F);
        StraightLine s = new StraightLine(1F,1F);
        System.out.println("Parabola: " + p.PrintCoefficients());
        System.out.println("Parabola: " + p.PrintSolutions());
        System.out.println("StraightLine: " + s.PrintCoefficients());
        System.out.println("StraightLine: " + s.PrintSolutions());
    }

}
