package bibgrafos;

public class BibGrafos {

    public static void main(String[] args) {
        
        Grafo g;
        
        g = FabricaGrafos.caminho(4);
        
        g.exibe();
        
//        g = new Grafo();
//        
//        g.adVertice("a");
//        g.adVertice("b");
//        g.adVertice("c");
//        g.adVertice("d");
//        
//        g.adAresta("a", "b");
//        g.adAresta("b", "c");
//        g.adAresta("c", "d");
//        g.adAresta("d", "a");
//        
//        g.exibe();
    }
}
