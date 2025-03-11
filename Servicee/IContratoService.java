package Servicee;

public interface IContratoService {
    String salvar();
    String buscar(String id);
    void atualizar(String id, String novoDado);
    void excluir(String id);
}
