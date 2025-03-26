public class ListaTelefonica{
    private int tam;
    private int pos;
    private int contatos[];

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
        if(pos == 0){
            System.out.println("--> lista vazia <--");
            return;
        }
        System.out.println("--> listar contatos <-- ");
        for(int i=0; i<pos; i++){
            System.out.println("Telefone: "+ contatos[i]);
        }
    }

}