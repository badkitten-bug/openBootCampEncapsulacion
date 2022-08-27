public class Main {
    public static void main(String[] args) {
        Persona edad = new Persona();
        edad.setEdad(14);
        Persona nombre = new Persona();
        nombre.setNombre("Steve");
        Persona telefono = new Persona();
        telefono.setTelefono(958236730);
        
        System.out.println(edad.getEdad());
        System.out.println(nombre.getNombre());
        System.out.println(telefono.getTelefono());
    }
}

class Persona {

   private int edad;
   private String nombre;
   private int telefono;

   public void setEdad(int edad){
       this.edad = edad;
   }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
       return this.edad;
    }
    public String getNombre(){
       return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
