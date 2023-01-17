
package br.com.ad.crud;

import java.util.Scanner;

import br.com.ad.crud.controller.impl.CidadeArmazenamentoVolatilController;
import br.com.ad.crud.view.CidadeView;

public class Main {

    public static void main(String[] args) {

        CidadeView view = new CidadeView(new CidadeArmazenamentoVolatilController(), new Scanner(System.in));
        view.exibirOpcoes();
    }
}