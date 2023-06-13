package estudos.maratonajava.introducao;

public class EstruturaCondicional02 {
    public static void main(String[] args) {
        int age = 17;
        String category;
        if(age < 15){
            category = "children's category";
        } else if(age >= 15 && age < 18) {
            category = "Young category";
        } else {
            category = "Adult category";
        }
        System.out.println(category);
    }
}
