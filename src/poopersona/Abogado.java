
package poopersona;

public class Abogado extends Persona {
    private String titulo;
    private String cursos;

    public Abogado() {
    }

    public Abogado(String titulo, String cursos, String nombre, int edad, double peso, double estatura, String colorOjos, String sexo) {
        super(nombre, edad, peso, estatura, colorOjos, sexo);
        this.titulo = titulo;
        this.cursos = cursos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
    
    public String Litigar(String cursos){
        return cursos.equals("") ? "No puede litigar" : "Puede litigar";
    }
    //Operador ternario cursos.equals("") ? "No puede litigar" : "Puede litigar";
    
}
