/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import exercicio9.BinaryTree;
import exercicio9.No;

/**
 *
 * @author douglas
 */
public class main {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calcular c = new Calcular();
        Integer A = 10256;
        Integer B = 512;
                
        System.out.println("Exercico 8: "+c.calcularC(A, B));

        System.out.println("*******************************************");
        
        No n1 = new No(1);
        No n2 = new No(1);
        No n3 = new No(1);
        No n4 = new No(1);

        BinaryTree tree = new BinaryTree(1); 
        tree.adicionar(tree.getRoot(), n1, "left"); 
        tree.adicionar(tree.getRoot(), n2, "right"); 
        tree.adicionar(n2, n3, "left"); 
        tree.adicionar(n2, n4, "right");
        
        System.out.println("Exercico 9: "+tree.somar(tree.getRoot()));
    }
    
    

    
}
