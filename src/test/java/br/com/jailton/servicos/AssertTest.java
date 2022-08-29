package br.com.jailton.servicos;

import br.com.jailton.entidades.Usuario;
import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void test(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals(1,1);
        Assert.assertEquals("Erro de comparação",1,1);
        Assert.assertEquals(0.51234,0.512,0.001);
        Assert.assertEquals(Math.PI,3.14,0.01);

        int i = 5;
        Integer i2 = 5;


        Assert.assertEquals(Integer.valueOf(i),i2);
        Assert.assertEquals(i,i2.intValue());


        Assert.assertEquals("bola","bola");
        Assert.assertNotEquals("bola","casa");

        Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
        Assert.assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usario 1");
        Usuario u2 = new Usuario("Usario 1");
        Usuario u3 = null;


        Assert.assertEquals(u2,u2);

        //garantir que os objetos sejam da mesma instância, caso aponte para mesma instância
        Assert.assertSame(u2,u2);

        //garantir que apesar de serem iguais são de instâncias diferentes
        Assert.assertNotSame(u1,u2);

        //verificar se é nulo
        Assert.assertTrue(u3 == null);

        Assert.assertNull(u3);
        Assert.assertNotNull(u2);

    }
}
