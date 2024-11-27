import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gestionMenu(menu());
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Gestión de la biblioteca");
        System.out.println("--------------------------");
        System.out.println("1. Agregar libro");
        System.out.println("2. Actualizar ejemplares");
        System.out.println("3. Mostrar información de todos los libros");
        System.out.println("4. Buscar por autor");
        System.out.println("5. Buscar por título inicial");
        System.out.println("6. Eliminar libro");
        System.out.println("7, Salir");

        int opcion = sc.nextInt();
        return  opcion;
    }

    public static void gestionMenu(int option){
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int nEjemplares;

        while(option!=7){
            int opcion;
            switch (option) {
                case 1:
                    System.out.println("Título del libro: ");
                    titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    autor = sc.nextLine();
                    System.out.println("Numero de ejemplares: ");
                    nEjemplares = sc.nextInt();
                    sc.nextLine();

                    Libro l = new Libro(titulo, autor, nEjemplares);
                    if (biblioteca.insertarLibro(l) == true){
                        System.out.print("Libro insertado correctamente");
                    }
                    else{
                        System.out.print("La biblioteca está al máximo de su capacidad.");
                    }
                    break;
                case 2:
                    System.out.print("Título del libro a actualizar: ");
                    titulo = sc.nextLine();
                    System.out.print("Numero de ejemplares: ");
                    nEjemplares = sc.nextInt();
                    if(biblioteca.modificarEjemplares(titulo, nEjemplares)){
                        System.out.println("Numero de ejemplares actualizado de forma correcta");
                    }
                    else{
                        System.out.println("El libro noe sta en la biblioteca");
                    }
                    break;
                case 3:
                    biblioteca.mostrarInfo();
                    break;
                case 4:
                    System.out.print("Nombre del autor a buscar: ");
                    autor = sc.nextLine();
                    biblioteca.mostrarLibrosPorAutor(autor);
                    break;
                case 5:
                    System.out.print("Introduce al inicial del titulo a buscar: ");
                    char inicial = sc.nextLine().charAt(0);
                    biblioteca.mostrarLibrosPorAutor(inicial);
                    break;
                case 6:
                    System.out.print("Introduce el libro a eliminar: ");
                    titulo = sc.nextLine();
                    biblioteca.borrarLibro(titulo);
                    break;
                case 7:
                    System.out.println("Hasta la próxima");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida.");
                    opcion = menu();
            }
            opcion = menu();
        }
    }
}
