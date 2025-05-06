public class No{
    //atributos
    private int info; //telefone
    private No  prox;

    public No(int info){
        this.info = info;
        this.prox = null;
    }

    public int getInfo(){
        return this.info;
    }
    public void setInfo(int info){
        this.info = info;
    }

    public No getProx(){
        return this.prox;
    }
    public void setProx(No prox){
        this.prox = prox;
    }

}