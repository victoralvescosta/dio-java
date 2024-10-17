package list.exerciciosList.ex01;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome , preco , quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Laranja", 2.50, 2);
        carrinhoDeCompras.adicionarItem("Carne de porco", 20.00, 1);
        carrinhoDeCompras.adicionarItem("Carne de porco", 20.00, 1);
        carrinhoDeCompras.adicionarItem("Arroz", 6.50, 12);
        System.out.println("O valor total da lista de compras é: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Carne de porco");

        System.out.println("O valor total da lista de compras é: " + carrinhoDeCompras.calcularValorTotal());

    }
}
