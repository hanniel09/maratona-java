package estudos.maratonajava.introducao;

public class Array02 {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Hanniel";
        names[1] = "Paulo";
        names[2] = "Ryan";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }


    }
}