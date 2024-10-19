package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAuto(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro cataloLivros = new CatalogoLivro();
        cataloLivros.adicionarLivro("Livro 1", "Autor 1", 2005);
        cataloLivros.adicionarLivro("Livro 2", "Autor 1", 2005);
        cataloLivros.adicionarLivro("Livro 3", "Autor 1", 2006);
        cataloLivros.adicionarLivro("Livro 4", "Autor 2", 2006);
        cataloLivros.adicionarLivro("Livro 5", "Autor 1", 2010);
        cataloLivros.adicionarLivro("Livro 6", "Autor 3", 2010);

        System.out.println(cataloLivros.pesquisarPorAuto("Autor 1"));
        System.out.println(cataloLivros.pesquisarPorIntervaloAnos(2000, 2006));
        System.out.println(cataloLivros.pesquisarPorTitulo("Livro 6"));
    }

}
