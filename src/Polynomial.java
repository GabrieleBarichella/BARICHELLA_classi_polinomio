import java.util.ArrayList;

public abstract class Polynomial {
    protected ArrayList<Float> coefficients;
    protected ArrayList<Float> solutions = new ArrayList<>();

    public Polynomial(ArrayList<Float> coefficients) {
        this.coefficients = coefficients;
    }

    public String PrintSolutions() {
        String result = "";
        for (int i = 0; i < solutions.size(); i++) {
            result += solutions.get(i);
            if (i < solutions.size() - 1) result += ", ";
        }
        return result;
    }


    public String PrintCoefficients() {
        String result = "";
        for (int i = 0; i < coefficients.size(); i++) {
            result += coefficients.get(i);
            if (i < coefficients.size() - 1) result += ", ";
        }
        return result;
    }
}
