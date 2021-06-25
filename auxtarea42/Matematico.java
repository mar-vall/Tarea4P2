

public class Matematico extends Persona
{
    private int numeros;
    public Matematico(String nomb, String nac, int ed){
        super(nomb, nac, ed);
    }
    public double sumar(double x, double y){
        return x + y;
    }
    public double restar(double x, double y){
        return x - y;
    }
    public double multiplicar(double x, double y){
        return x * y;
    }
    public double dividir(double x, double y){
        return x / y;
    }
}
