package exerciciojavaforms;

public class exercicioCelular {
    private String marca;
    private String modelo;
    private String cor;
    private int capacidadeArmazenamento;
    private double preco;

    // Construtor
    public exercicioCelular() {
        // Construtor padrão vazio
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Criando uma instância do objeto TelefoneCelular
        exercicioCelular celular = new exercicioCelular();

        // Atribuindo valores aos atributos usando setters
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S20");
        celular.setCor("Preto");
        celular.setCapacidadeArmazenamento(128);
        celular.setPreco(2999.99);

        // Exibindo os atributos usando getters
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Capacidade de Armazenamento: " + celular.getCapacidadeArmazenamento() + "GB");
        System.out.println("Preço: R$" + celular.getPreco());
    }
}

