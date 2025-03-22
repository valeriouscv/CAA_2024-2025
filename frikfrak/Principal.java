import java.util.Scanner;

public class Principal{
    private static char[][] tab =  new char[3][3];
    
    public static void criar(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tab[i][j]=' ';
            }
        }
    }
    public static void jogar(char peca, int linha, int coluna){
        tab[linha][coluna]=peca;
    }
    public static void mostrar(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.err.println("+---+---+---+");
        System.out.println("| "+tab[0][0]+" | "+tab[0][1]+" | "+tab[0][2]+" |");
        System.err.println("+---+---+---+");
        System.out.println("| "+tab[1][0]+" | "+tab[1][1]+" | "+tab[1][2]+" |");
        System.err.println("+---+---+---+");
        System.out.println("| "+tab[2][0]+" | "+tab[2][1]+" | "+tab[2][2]+" |");
        System.err.println("+---+---+---+");
    }
    public static void main(String[] args) {
        criar();
        Scanner ler = new Scanner(System.in);
        //as 3 primeiras jogadas
        for (int i = 0; i < 3; i++) {
            //jogador 1
            System.out.println("-- Jogador 1 --");
            System.out.print("linha: ");
            int linha1 = ler.nextInt();
            System.out.print("coluna: ");
            int coluna1 = ler.nextInt();
            jogar('x', linha1, coluna1);
            mostrar();
             //jogador 2
             System.out.println("-- Jogador 2 --");
             System.out.print("linha: ");
             int linha2 = ler.nextInt();
             System.out.print("coluna: ");
             int coluna2 = ler.nextInt();
             jogar('o', linha2, coluna2);
             mostrar();
        }
        //verificar se ha vencedor
        //se nao houver vencedor, mover peças até ter vencedor (ou empate)
    }
}