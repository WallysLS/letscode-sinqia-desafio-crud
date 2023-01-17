
package br.com.ada.crud.controller.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import br.com.ada.crud.model.Cidade;
import crud.controler.CidadeController;

public class CidadeArmazenamentoVolatilController implements CidadeController {

    private Map<UUID, Cidade> cidades = new HashMap<>();

    @Override
    public void cadastrar(Cidade cidade) {
        cidade.setId(UUID.randomUUID());
        cidades.put(cidade.getId(), cidade);
    }
}