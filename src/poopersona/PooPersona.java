package poopersona;

public class PooPersona {

    public static void main(String[] args) {
      //Vamos a instanciar Persona 
      /*Persona oPer1 = new Persona();
      oPer1.setNombre("Pedro perez");
      oPer1.setEdad(35);
      oPer1.setPeso(64.0);
      oPer1.setEstatura(2);
      oPer1.setColorOjos("Cafés oscuros");
      oPer1.setSexo("Femenino");
        System.out.println("Nombre: "+oPer1.getNombre());
       // System.out.println(oPer1.Correr());*/
      
      //Instanciando el objeto
      Abogado objAbogado1 = new Abogado("Penalista","","Juan Jaramillo",20,64.0,1.60,"Cafes oscuros","femenino");
      objAbogado1.setTitulo("Familia");
        System.out.printf("El titulo es %s  nombre  %s  edad %d ",objAbogado1.getTitulo(),objAbogado1.getNombre(),objAbogado1.getEdad());
        System.out.println(objAbogado1.Litigar(objAbogado1.getCursos()));
        
    }
    
}
