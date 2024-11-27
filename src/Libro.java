public class Libro {
    private String titulo;
    private String autor;
    private int nEjemplares;

    //Constructor genérico
    public Libro(){
    }

    //Constructores de la clase
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = 0;
    }

    public Libro(String titulo, String autor, int nEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo:'" + titulo + '\'' +
                ", Autor:'" + autor + '\'' +
                ", Número de ejemplares:" + nEjemplares +
                '}';
    }
}
