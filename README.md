# Avaliação Técnica


## Respostas

### Número 1

- **A**
- **C**
- **E**

### Número 2

- **D**

### Número 3

- **A**
- **C**

### Número 4

- **C**

### Número 5

- **A**
- **D**

### Número 6

- **E**

### Número 7

- **C**

### Número 8

```
public class main {

    static Integer VALOR_LIMITE = 1000000;
    
    public static void main(String[] args) {

        Integer A = 10256;
        Integer B = 512;
                
        System.out.println(calcular(A, B));
    }

    private static Integer calcular(Integer A, Integer B) {
        Integer ret = 0;
        
        StringBuilder valor = new StringBuilder();
        
        Integer tam = A.toString().length() + B.toString().length();
        
        for (int pos = 0; pos < tam; pos++) {
            if (pos < A.toString().length())
                valor.append(A.toString().charAt(pos));
            
            if (pos < B.toString().length())
                valor.append(B.toString().charAt(pos));
        }
        
        ret = Integer.decode(valor.toString());
        
        return ((ret > VALOR_LIMITE) ? -1 : ret);
    }
}
```

### Número 9

Exercicio no código fonte.

```
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
```