package estudos.maratonajava.introducao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            System.out.println(++count);
        }
        do{
            System.out.println("dentro do do-while");
        }while (count < 10);
        for(count = 0; count < 10; count++){
            System.out.println("For "+ count);
        }
    }
}
