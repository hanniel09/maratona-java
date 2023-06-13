package estudos.maratonajava.javacore.padroesdeprojeto.test;

import estudos.maratonajava.javacore.padroesdeprojeto.dominio.Country;
import estudos.maratonajava.javacore.padroesdeprojeto.dominio.Currency;
import estudos.maratonajava.javacore.padroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
