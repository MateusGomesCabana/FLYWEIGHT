/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author Mateus
 */
class Arquivo {
    protected String nomeDoAquivo;

    public Arquivo(String nomeDoAquivo) {
        this.nomeDoAquivo = nomeDoAquivo;
    }
    public void movimentaArquivo() {
        System.out.println(nomeDoAquivo + " Movimentado!");
    }
}
