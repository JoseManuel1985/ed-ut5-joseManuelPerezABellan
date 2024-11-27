public class Biblioteca {
    private static final int MAXIMO_EJEMPLARES = 100;
    private Libro[] libros;
    private int nLibros;

    //Constructor
    public Biblioteca() {
        libros = new Libro[MAXIMO_EJEMPLARES];
        nLibros = 0;
    }

    public boolean insertarLibro(Libro l){
        if(nLibros<MAXIMO_EJEMPLARES){
            libros[nLibros] = l;
            nLibros++;
            return true;
        }
        else{
            return false;
        }
    }
    //Metodo que devuelve true si modifica el numero de ejemplares de libros
    public boolean modificarEjemplares(String nombreL, int nEjemplares){
        for(int i = 0; i<nLibros; i++){
            if(libros[i].getTitulo().equals(nombreL)){
                libros[i].setnEjemplares(nEjemplares);
                return true;
            }
        }
        return false;
    }

    public void mostrarInfo(){
        System.out.println("Listado de libros de la biblioteca:");
        for(int i = 0; i<nLibros;i++){
            System.out.println(libros[i].toString());
        }
        System.out.println("La biblioteca tiene: " + nLibros + " libros.");
    }

    //Buscar libro por autor
    public void mostrarLibrosPorAutor(String autor){
        System.out.println("Listado libros de " + autor);
        for(int i = 0; i<nLibros; i++){
            if(libros[i].getAutor().equals(autor)){
                System.out.println("- " + libros[i].getTitulo());
            }
        }
    }

    //Buscar libro por inicial
    public void mostrarLibrosPorAutor(char inicial){
        System.out.println("Listado libros de " + inicial);
        for(int i = 0; i<nLibros; i++){
            if(libros[i].getTitulo().charAt(0) == inicial){
                System.out.println("- " + libros[i].getTitulo());
            }
        }
    }

    public void borrarLibro(String titulo){
        Libro[] copiaLibros = new Libro[MAXIMO_EJEMPLARES];
        int i=0;
        while(i<nLibros){
            if(libros[i].getTitulo().equals(titulo)){
                libros[i]=libros[i+1];
                i++;
            }
            else{
                copiaLibros[i] = libros[i];
            }
            i++;
        }
    }

}
