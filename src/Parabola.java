import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Parabola extends Polynomial {

    private Float a;
    private Float b;
    private Float c;

    public Parabola(Float a, Float b, Float c) {
        super(new ArrayList<>());
        this.a = a;
        this.b = b;
        this.c = c;
        coefficients.add(a);
        coefficients.add(b);
        coefficients.add(c);
        CalculateSolutions();
    }

    private void CalculateSolutions() {
        solutions.add((float) ((-b + sqrt(b*b - 4*a*c)) / (2*a)));
        solutions.add((float) ((-b - sqrt(b*b - 4*a*c)) / (2*a)));
    }

    public String PrintSolutions(){
        return super.PrintSolutions();
    }

    public String PrintCoefficients(){
        return super.PrintCoefficients();
    }

}