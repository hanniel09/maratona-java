package estudos.maratonajava.introducao;

public class EstruturaCondicional03 {
    public static void main(String[] args) {
        double salary = 6000;
        String donateToInstitutions = "I'm can donated to institutions";
        String noDonateToInstitutions = "I'm can't donated to institutions";
        String results = salary > 3000 ? donateToInstitutions : noDonateToInstitutions;
        System.out.println(results);
    }
}
