package estudos.maratonajava.javacore.colecoes.dominio;

public class Smartophone {
    private String serialNumber;
    private String marca;

    public Smartophone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartophone smartophone = (Smartophone) obj;
        return serialNumber != null && serialNumber.equals(smartophone.serialNumber) && marca.equals(smartophone.marca);

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
