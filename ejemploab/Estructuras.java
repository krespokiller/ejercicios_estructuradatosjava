public class Estructuras {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        
        arbol.insertar (2229,"Manzanas");
        arbol.insertar(32,"Peras");
        arbol.insertar(5,"Uvas");
        arbol.insertar(2,"Naranjas");
        arbol.insertar (4,"Bananos");
        arbol.insertar(1,"Duraznos");
        arbol.insertar(6,"Mangos");
        arbol.insertar(88,"Guayas");
        arbol.insertar (10,"perascafes");
        arbol.insertar(35,"uvas verdes");
        arbol.insertar(40,"Uvas pasas");
        arbol.insertar(0,"toronjas");

        arbol.recorrer(arbol.raiz);
        
        
    }
    
    
    
}