/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;


/**
 *
 * @author douglas
 */
public class Calcular {
    
    static Integer VALOR_LIMITE = 1000000;
    
    public Integer calcularC(Integer A, Integer B){
        Integer ret = 0;

        StringBuilder valor = new StringBuilder();

        Integer tam = A.toString().length() + B.toString().length();

        for (int pos = 0; pos < tam; pos++) {
            if (pos < A.toString().length()) {
                valor.append(A.toString().charAt(pos));
            }

            if (pos < B.toString().length()) {
                valor.append(B.toString().charAt(pos));
            }
        }

        ret = Integer.decode(valor.toString());

        return ((ret > VALOR_LIMITE) ? -1 : ret);
    }
}
