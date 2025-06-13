public class Lista{
    //atributos
    private No inicio;
    private No fim;

    //construtor
    public Lista(){
        this.inicio = null;
        this.fim = null;
    }
    //metodos
    public void inserirIni(int info){
        No novo = new No(info);
        if(isVazia()){
            this.inicio = novo;
            this.fim = novo;
        }else{
            novo.setProx(inicio);
            this.inicio = novo;
        }
    }
    public void inserirFim(int info){

    }
    public void listar(){

    }
    private boolean isVazia(){
        return (inicio == null || fim==null);
    }


}