/**
 * Main
 */
import java.util.LinkedList;// utilizacion de listas enlazadas con metodos diferentes
public class Main {


        public static void main(String[] args) {
            LinkedList cola = new LinkedList();
            for (int i = 0; i < 11; i++) { // numeros del 1 al 10 en la cola
                cola.offer(i);
            }
            while(cola.peek()!=null)
            {
                System.out.println(cola.poll());
            }
        }
}