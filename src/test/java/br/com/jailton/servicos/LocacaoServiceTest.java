package br.com.jailton.servicos;

import br.com.jailton.entidades.Filme;
import br.com.jailton.entidades.Locacao;
import br.com.jailton.entidades.Usuario;
import br.com.jailton.servicos.LocacaoService;
import br.com.jailton.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {

    @Test
    public void teste() {
        //cenario
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Usuario 1");
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //acao
        Locacao locacao = service.alugarFilme(usuario, filme);

        //verificação
        Assert.assertEquals(5.0, locacao.getValor(),0.01);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }

}
