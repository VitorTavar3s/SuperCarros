import java.util.Objects;

public class Carro {
    private Boolean ligado;
    private Integer velocidadeAtual;
    private String modelo;
    private String marca;
    private Boolean possuiMacaco = true;
    private String proprietario;
    private String cor;


    public Carro(){
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public Carro(String marca, String modelo) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Boolean getPossuiMacaco() {
        return possuiMacaco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void acelerar() {
        this.velocidadeAtual += 10;
    }

    public void frear() {
        this.velocidadeAtual -= 10;
    }

    public void ligarCarro() {
        this.ligado = true;
    }

    public void desligarCarro() {
        this.ligado = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(modelo, carro.modelo) && Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca);
    }


}

