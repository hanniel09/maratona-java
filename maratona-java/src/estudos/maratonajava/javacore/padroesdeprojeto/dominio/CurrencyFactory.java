package estudos.maratonajava.javacore.padroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currecy found for this country");
        }
    }
}
