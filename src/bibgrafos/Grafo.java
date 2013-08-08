package bibgrafos;

import java.util.HashSet;
import java.util.Set;

public class Grafo {
    
    private Set<Aresta> a;
    private Set<Vertice> v;
    
    public Grafo(){
        a = new HashSet<Aresta>();
        v = new HashSet<Vertice>();
    }
    
    public Set<Aresta> getA(){
        return this.a;
    }
    public Set<Vertice> getV(){
        return this.v;
    }
    public void setA(Set<Aresta> a){
        this.a = a;
    }
    public void setV(Set<Vertice> v){
        this.v = v;
    }
    public void adVertice(String id){
        Vertice vNovo;
        
        vNovo = new Vertice();
        vNovo.setId(id);
        
        this.v.add(vNovo);
    }
    public void adAresta(String id1, String id2){
        Vertice vNovo[] = new Vertice[2];
        
        vNovo[0] = new Vertice();
        vNovo[1] = new Vertice();
        
        vNovo[0].setId(id1);
        vNovo[1].setId(id2);
        
        this.v.add(vNovo[0]);
        this.v.add(vNovo[1]);        
        
        Aresta ares = new Aresta();
        ares.setPonta(vNovo);
        this.a.add(ares);
    }
    
    public void exibe(){
        
        System.out.println("V = {");
        for(Vertice vt : this.v){
            System.out.println("\t" + vt.getId());
        }
        System.out.print("}");
        
        System.out.println("A = {");
        for(Aresta ar : this.a){
            System.out.println("\t" + ar.exibe());
        }
        System.out.print("}");
        
        
    }
    public int getN(){
        return this.v.size();
    }
    public int getM(){
        return this.a.size();
    }
}