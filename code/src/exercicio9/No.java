package exercicio9;

/**
 *
 * @author douglas
 */
public class No {

    int valor;
    No left;
    No right;
    
    public No (int valor) {
        this.valor = valor;
        right = null;
        left = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getLeft() {
        return left;
    }

    public void setLeft(No left) {
        this.left = left;
    }

    public No getRight() {
        return right;
    }

    public void setRight(No right) {
        this.right = right;
    }
       
}
