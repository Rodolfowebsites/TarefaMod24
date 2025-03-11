package dao.mock;

import dao.IContratoDao;

import java.util.HashMap;
import java.util.Map;

public class ContratoDaoMock implements IContratoDao {
    private Map<String, String> contratos = new HashMap<>();

    @Override
    public void salvar() {
        contratos.put("1", "Contrato 1");
    }

    @Override
    public String buscar(String id) {
        return contratos.get(id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        if (contratos.containsKey(id)) {
            contratos.put(id, novoDado);
        } else {
            throw new UnsupportedOperationException("Contrato não encontrado");
        }
    }

    @Override
    public void excluir(String id) {
        contratos.remove(id);
    }
}
