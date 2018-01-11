package exercicio9;

/**
 *
 * @author douglas
 */
public class BinaryTree {

    private No root;

    public BinaryTree(int valor) {
        root = new No(valor);
    }

    public void adicionar(No pai, No filho, String orientacao) {
        if (orientacao.equals("left")) {
            pai.setLeft(filho);
        } else {
            pai.setRight(filho);
        }
    }

    public No getRoot() {
        return root;
    }

    public double somar(No no) {
        double totalLeft, totalRight, total;
        if (no == null) {
            return 0;
        } else {
            somar(no.left);
            totalLeft = no.valor;
            
            somar(no.right);
            totalRight = no.valor;

            total = totalLeft + totalRight;
            return total;
        }
    }
}
