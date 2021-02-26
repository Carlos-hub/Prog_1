import java.util.Locale;
import java.util.Scanner;//include do C para ler dados.
public class Main {
    
    public static void main(String args[]){
        int inteiro= 10;
        float vetor[];
        vetor = new float[10];
        vetor[0] = 3.4f;
        vetor[1] = 5.3f;


        //for(int i=0;i<vetor.length;i++){
            //System.out.print(vetor[i]);
        //}
        //int mes = 2;
            //switch(mes){
                //case 1 : {
                    //System.out.println("janeiro");
                    //break;
                //}
                //case 2 : {
                    //System.out.println("outubro");
                    //break;
                //}
            //}
            
            //scanner = new Scanner(System.in);//Ler do Teclado.
            //scanner.useLocale(Locale.US);//colocar ponto no lugar de virgula no JAVA
            //inteiro = scanner.nextInt();//no C scanf("%d",&inteiro) vse for Float: scanner.nextFloat()
            Scanner scanner ;

            scanner.nextLine();
            System.out.println("digite seu nome: ");
            String nomeCompleto = scanner.nextLine();//fgets
            //scanner.close() frescurinha
        }
}
