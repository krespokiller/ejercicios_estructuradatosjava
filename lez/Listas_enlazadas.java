public class Listas_enlazadas{

    private Nodo primero;
    private int size;
    public Listas_enlazadas(){//constructor
        this.primero=null;
        this.size=0;
    }
    public void Lista_vacia(){
        if (primero==null) {
            System.out.println("la lista esta vacia");
        }else{
            System.out.println("la lista tiene datos");
        }
    }
    
    public void addNodo(int dato){
        Nodo nuevo = new Nodo(dato);// añadir nuevo nodo
        nuevo.siguiente = primero;
        primero = nuevo ;
        size++;
    }
    public int size(){
        return size;
    }
    public void Listar(){
        Nodo actual = primero;
        while (actual!=null) {
            System.out.print("["+actual.dato+"] ->");
            actual = actual.siguiente;
        }
    }
    public static void main(String[] args) {
        Listas_enlazadas lista = new Listas_enlazadas();
        lista.Lista_vacia();// verifica si la lista está vacia
        
        lista.addNodo(4);
        lista.addNodo(27734);
        lista.addNodo(4234);
        lista.addNodo(444);
        lista.addNodo(24);
        
        lista.Listar();
        System.out.print("tamaño:" + lista.size());
        System.out.println("");
        lista.Lista_vacia();
    }
}