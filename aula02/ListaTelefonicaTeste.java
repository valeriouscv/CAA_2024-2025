import java.util.Scanner;

public class ListaTelefonicaTeste {
    private static void pausa(){
        Scanner ler = new Scanner(System.in);
        ler.nextLine(); 
    }
    public static void menu(){
        System.out.println("\n\n\n");
        System.out.println("+-----------------------------+");
        System.out.println("| ---> Lista Telefonica  <--- |");
        System.out.println("+-----------------------------+");
        System.out.println("| 1 - inserir contacto        |");
        System.out.println("| 2 - pesquisar contacto      |");
        System.out.println("| 3 - listar todos contacto   |");
        System.out.println("| 4 - remover contacto        |");
        System.out.println("+-----------------------------+");
        System.out.println("| 0 -  sair                   |");
        System.out.println("+-----------------------------+");
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaTelefonica lista = new ListaTelefonica();
        int op;
        while(true) {
            menu();
            System.out.print("Escolha uma opcao: ");
            op = ler.nextInt();
            switch (op) {
                case 1: 
                    System.out.println("Indique o numero telefone: ");
                    int numTel = ler.nextInt();
                    lista.inserirContacto(numTel);
                    pausa();
                    break;
                case 2: 
                    System.out.println("Indique o numero telefone: ");
                    numTel = ler.nextInt();
                    lista.pesquisar(numTel);
                    pausa();
                    break;
                case 3: 
                    lista.listarContactos();
                    pausa();
                    break;
                case 4: 
                    System.out.println("Indique o numero telefone: ");
                    numTel = ler.nextInt();
                    lista.remover(numTel);
                    pausa();
                    break;
                case 0: return;
                default: System.out.println("--> Opcao Invalida"); 
                    pausa();
                    break; 
            }
           
        } 

    }
}
