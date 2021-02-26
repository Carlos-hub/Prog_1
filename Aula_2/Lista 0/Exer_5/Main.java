public class Main {
    
    public static void main(String args[]){
        String var = " atrapalham ";
        String atr = " atrapalham ";
        int i = 1;
        while(i<101){
            System.out.println( i +" Java "+ var +" muita gente");
            
            if(i<101){
                var+=atr;
            }
            i++;
        }
    }
}
