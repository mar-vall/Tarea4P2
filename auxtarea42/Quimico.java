
public class Quimico extends Persona
{
    private String[] elementos;
    public Quimico(String[] tablaElementos, String nomb, String nac, int ed){
        super(nomb, nac, ed);
        elementos = tablaElementos;
    }
    public String identificarElemento(String elemento){
        String reporte = "";
        int i = 0;
        boolean bandera = true;
        while(!bandera && i < elementos.length){
            if(elemento == elementos[i]){
                reporte = "el elemento es " + elementos[i];
                bandera = true;
            }
            i++;
        }
        return reporte;
    }
}
