package dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar(){
        throw new UnsupportedOperationException("Não funciona com acesso a banco");
    }

    @Override
    public String buscar(String id) {
        throw new UnsupportedOperationException("Não funciona com acesso a banco");
    }

    @Override
    public void atualizar(String id, String novoDado) {
        throw new UnsupportedOperationException("Não funciona com acesso a banco");
    }

    @Override
    public void excluir(String id) {
        throw new UnsupportedOperationException("Não funciona com acesso a banco");
    }
}
