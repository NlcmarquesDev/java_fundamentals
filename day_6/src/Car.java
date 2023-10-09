public class Car {
    private String  marca;
    private String modelo;
    private int ano;
    private int value;

    Car(String marca, String modelo, int ano, int value){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.value = value;

    }

    public String getMarca(){
     return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public int getValue(){
        return value;
    }

    public void setMarca(String marca){
        this.marca = marca;

    }
    public void setModelo(String modelo){
        this.modelo = modelo;

    }
    public void setAno(int ano){
        this.ano = ano;

    }
    public void setValue(int value){
        this.value = (int) (value *1.1);
    }

}
