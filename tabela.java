import java.util.Scanner;
public class tabela {
    public void iniciar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite limite da tabela: ");
        int limite = sc.nextInt();
        for(int x = 1;x!=limite;x++){
            for(int y = 1;y<=x;y++){
                System.out.print(x*y+" ");
            }
            System.out.println(" ");
        }

    }
    
}
