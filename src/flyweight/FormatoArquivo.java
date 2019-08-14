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
public class FormatoArquivo extends TipoArquivo {
    protected Arquivo file;
    public FormatoArquivo(String nome) {
        this.file = new Arquivo(nome);
    }

    @Override
    public void movimentaArquivo(Ponto ponto) {
        this.file.movimentaArquivo();
        System.out.println("no ponto " + ponto.x +","+ponto.y);
    }
    
}
