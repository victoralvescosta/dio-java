package Execicio01;

public class Fatura {
     String numero;
     String descricao;
     int item;
     double precoPorItem;

    public Fatura(String numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public Fatura(int item) {
        this.item = item;
    }

    public Fatura(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public
}
