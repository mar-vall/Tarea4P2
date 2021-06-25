
public class Persona
{
   protected String nombre;
   protected int edad;
   protected String nacionalidad;
   public Persona(String n, String nacion, int e){
       nombre = n;
       nacionalidad = nacion;
       edad = e;
   }
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String n){
       nombre = n;
   }
   public String getNacionalidad(){
       return nacionalidad;
   }
   public String presentarse(){
       return "Hola, mi nombre es " + getNombre() + ", soy de " + getNacionalidad();
   }
}
