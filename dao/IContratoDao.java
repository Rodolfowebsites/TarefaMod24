package dao;

public interface IContratoDao {
    void salvar();
    String buscar(String id);
    void atualizar(String id, String novoDado);
    void excluir(String id);

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
