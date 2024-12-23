package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 17, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 19, 1.85);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 20, 1.93);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 22, 2.00);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println("======================");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

    }

}
