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

    public int calcularValorTotal() {
        return itemList.size();
    }

    public void exibirItens() {
        System.out.println(itemList);
    }
}
