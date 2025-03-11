package Servicee;

import dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;



    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar(){
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(String id) {
        return contratoDao.buscar(id);
    }

    @Override
    public void atualizar(String id, String novoDado) {
        contratoDao.atualizar(id, novoDado);
    }

    @Override
    public void excluir(String id) {
        contratoDao.excluir(id);
    }
}
