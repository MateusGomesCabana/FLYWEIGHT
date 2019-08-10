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
public class Arquivos {

    protected ArrayList<TipoArquivo> arquivos;

    public Arquivos() {
        this.arquivos = new ArrayList<>();
        arquivos.add(new FormatoArquivo("jogador.png"));
        arquivos.add(new FormatoArquivo("inimigo1.png"));
    }

    public TipoArquivo getFlyweight(String arquivo) {
        switch (arquivo) {
            case "jogador.png":
                return arquivos.get(0);
            case "inimigo1.png":
                return arquivos.get(1);

        }
        return null;
    }
}
