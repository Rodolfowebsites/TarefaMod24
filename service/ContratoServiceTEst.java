package service;

import Servicee.ContratoService;
import Servicee.IContratoService;
import dao.ContratoDao;
import dao.IContratoDao;
import dao.mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTEst {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void EsperadoErroNoSalvarComBancoDeDados() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test
    public void buscarTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        service.salvar();
        String contrato = service.buscar("1");
        Assert.assertEquals("Contrato 1", contrato);
    }

    @Test
    public void atualziarTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        service.salvar();
        service.atualizar("1", "Novo Contrato");
        String contrato = service.buscar("1");
        Assert.assertEquals("Novo Contrato", contrato);
    }

    @Test
    public void excluirTest() {
        IContratoService service = new ContratoService(new ContratoDaoMock());
        service.salvar();
        service.excluir("1");
        String contrato = service.buscar("1");
        Assert.assertNull(contrato);

    }
}
