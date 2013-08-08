package bibgrafos;

public class Aresta {
    
    private Vertice ponta[];
    
    public Aresta(){
        this.ponta = new Vertice[2];
    }
    
    public Vertice[] getPonta(){
        return this.ponta;
    }
    public void setPonta(Vertice ponta[]){
        if(ponta.length == 2)
            this.ponta = ponta;
    }
    public String exibe(){
        return "{" + this.ponta[0].getId() + ", " + this.ponta[1].getId() + "}";
    }
    
}
