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
public class MovimentaArquivos extends TipoArquivo {
    protected TipoArquivo arquivos;

    public MovimentaArquivos(String nomeDaImagem) {
        this.arquivos = new TipoArquivo(nomeDaImagem);
    }
    
    
    @Override
    public void desenharArquivo(Ponto ponto) {
        arquivos.desenharImagem();
        System.out.println("No ponto (" + ponto.coord_x + "," + ponto.coord_y + ")!");
    }
    
}
