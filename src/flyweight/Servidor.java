/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Servidor {

    protected ArrayList<TipoArquivo> arquivos;

    public enum Formatos {
        ARQUIVO, ARQUIVO2
    }

    public Servidor() {
        this.arquivos = new ArrayList<>();
        arquivos.add(new FormatoArquivo("jogador.png"));
        arquivos.add(new FormatoArquivo("inimigo1.png"));
    }

    public TipoArquivo getFlyweight(Formatos arquivo) {

        switch (arquivo) {
            case ARQUIVO:
                return arquivos.get(0);
            case ARQUIVO2:
                return arquivos.get(1);

        }
        return null;
    }
}
