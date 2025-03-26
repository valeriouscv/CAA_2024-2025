public class ListaTelefonica{
    private int tam;
    private int pos;
    private int contatos[];

    private boolean estaVazio(){
        return (pos == 0);
    }
    private boolean estaCheio(){
        return (pos == tam);
    }
    public ListaTelefonica(){
        tam = 100;
        pos = 0;
        contatos = new int[tam];
    }

    public void inserirContacto(int telefone){
        if(!estaCheio()){
            contatos[pos]=telefone;
            pos++;
            System.out.println("contato inserido com sucesso");
        }else{
            System.out.println("lista esta cheia");
        }
    }
    public void listarContactos(){
        if(estaVazio()){
            System.out.println("--> lista vazia <--");
            return;
        }
        System.out.println("--> listar contatos <-- ");
        for(int i=0; i<pos; i++){
            System.out.println("Telefone: "+ contatos[i]);
        }
    }

    private int buscar(int numTelef){
        for (int i = 0; i < pos; i++) {
            if(numTelef ==  contatos[i]) 
                return i;
        }
        return -1;
    }
    public void pesquisar(int numTelef){
        int i = buscar(numTelef);
        if(i == -1){
            System.out.println("'"+numTelef+"' nao foi encontrado");
        }else{
            System.out.println("'"+numTelef+"' foi encontrado com sucesso");
        }
    }

    public void remover(int numTelef){
        if(estaVazio()){
            System.out.println("--> lista vazia <--");
            return;
        }
        int i = buscar(numTelef);
        if(i == -1){
            System.out.println("'"+numTelef+"' nao foi encontrado");
        }else{
            for(int j=i; j<pos; j++){
                contatos[j] = contatos[j+1];
            }
            pos--;
            System.out.println("'"+numTelef+"' foi removido com sucesso");
        }
    }

}