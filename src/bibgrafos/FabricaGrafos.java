package bibgrafos;

public class FabricaGrafos {
    
    public static Grafo k(int n){
        
        Grafo g = new Grafo();
        
        for(int i=1; i<=n; i++){
            g.adVertice("v" + i);
        }
        
        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                g.adAresta("v" + i, "v" + j);
            }
        }
        
        return g;
    }
    public static Grafo caminho(int n){
        
        Grafo g = new Grafo();
        
        for(int i=1; i<=n; i++){
            g.adVertice("v" + i);
        }
        
        for(int i=1; i<n; i++){
            g.adAresta("v" + i, "v" + (i+1));
        }
        
        return g;
    }
    public static Grafo circuito(int n){
        
        Grafo g = caminho(n);
        
        g.adAresta("v1", "v" + n);
        
        return g;
    }    
}