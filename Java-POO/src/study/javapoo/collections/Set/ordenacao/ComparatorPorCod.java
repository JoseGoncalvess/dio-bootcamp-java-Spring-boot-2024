package study.javapoo.collections.Set.ordenacao;

import java.util.Comparator;

public class ComparatorPorCod implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Integer.compare(p1.getCod(),p2.getCod());
    }
}
