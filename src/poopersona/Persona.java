
package poopersona;

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private String colorOjos;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, double peso, double estatura, String colorOjos, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String Comer(){
        return "La persona esta comiendo....";
    }
    public String Correr(){
        return "La persona esta corriendo....";
    }
    public String Tomar(){
        return "La persona esta tomando agua....";
    }
    public String Dormir(){
        return "La persona esta durmiendo en el sofa...";
    }
    public String Despertar(){
        return "Ella acaba de despertarse....";
    }
    public String Bailar(){
        return "Ellos estan bailando....";
    }
    
    
    //Se pueden llamar varios metodos igual pero con diferentes parametros pero seria sobre cargar 
}
