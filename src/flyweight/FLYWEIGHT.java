/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author ALUNO
 */
public class FLYWEIGHT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servidor factory = new Servidor();
       factory.getFlyweight(Servidor.Formatos.ARQUIVO).movimentaArquivo(new Ponto(0, 0));
    }
    
}
