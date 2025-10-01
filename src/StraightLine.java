import java.util.ArrayList;

public class StraightLine extends Polynomial {

    private Float m;
    private Float q;

    public StraightLine(Float m, Float q) {
        super(new ArrayList<>());
        this.m = m;
        this.q = q;
        coefficients.add(m);
        coefficients.add(q);
        CalculateSolution();
    }

    private void CalculateSolution() {
        solutions.add(-q/m);
    }

    public String PrintSolutions(){
        return super.PrintSolutions();
    }

    public String PrintCoefficients(){
        return super.PrintCoefficients();
    }

}
