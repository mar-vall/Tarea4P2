
public class Fisico extends Persona
{
    private Vector vector;
    public Fisico(String nomb, String nac, int ed){
        super(nomb, nac, ed);
    }
    public Vector sumarVectores(Vector vector1, Vector vector2){
        Vector resultado;
        double sumai = vector1.getVi() + vector2.getVi();
        double sumaj = vector1.getVj() + vector2.getVj();
        resultado = new Vector(sumai, sumaj);
        return resultado;
    }
}
