import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     Scanner leer = new Scanner(System.in);

        try {
            Stack<Pila> Libro = new Stack<Pila>();
            int opciones;
            do{
                System.out.println("\n \nMENU..................... \n \n");
                System.out.println("1.- ingresar libros");
                System.out.println("2.- ver libros");
                System.out.println("O ingresa otra cosa para terminar \n");
                opciones  = ler.nextInt();
                if (opciones==1) {
                    System.out.println("Haz Oprimido 1..... \n");
                    System.out.print("Introduzca número de libros: \n");
                    int n = leer.nextInt();
                    for (int i = 0; i < n; i++) {
                        leer.nextLine();
                        System.out.print("\n\n Enter to skip... \n\n ");

                        System.out.print(" Título: ");
                        String titulo = leer.nextLine();
            
                        Pila li = new Pila(titulo);
                        Libro.push(li);
                    }
                } else if (opciones==2) {
                 while (!Libro.isEmpty()) {
                    Pila a = Libro.pop();
                    System.out.println(" \n Titulo: " + a.getTitulo());}
                } else if (opciones!=1 || opciones!=2) {
                    opciones = 0;
                }
            }while(opciones!=0);
     } finally{
        leer.close(); 
        ler.close();
     }   
    }
}