import org.junit.Assert;
import org.junit.Test;



public class TestesAula {

    // 2x AssertTrue -OK
    // 2x AssertFalse -OK
    // 1x AssertNull -OK
    // 1x AssertNotNull - OK
    // 2x AssertEquals - primitivo -OK
    // 2x AssertEquals - object

    // 1x - AssertArrayEquals -OK
    // 1x - assertSame
    // 1x - assertNotSame -OK


    @Test
    public void testeCarroLigarCorretamente() {
        Carro carro = new Carro();
        carro.ligarCarro();
        Assert.assertTrue(carro.getLigado());
    }

    @Test
    public void testeCarroPossuiMacaco() {
        Carro carro = new Carro();
        Assert.assertTrue(carro.getPossuiMacaco());
    }

    @Test
    public void testeCarroDeveIniciarDesligado(){
        Carro carro = new Carro();
        Assert.assertFalse(carro.getLigado());
        Assert.assertEquals(0, carro.getVelocidadeAtual().intValue());
        Assert.assertNull(carro.getProprietario());
    }

    @Test
    public void testeCarroDesligarCorretamente() {
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.desligarCarro();
        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void testeCarroPossuiProprietario() {
        Carro carro = new Carro();
        carro.setProprietario("Ricard Carioca");
        Assert.assertNotNull(carro.getProprietario());
    }
    @Test
    public void testeCarroDeveAcelerarCorretamente(){
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        Assert.assertEquals(10, carro.getVelocidadeAtual().intValue());
    }

    @Test
    public void testeCarroPodeSerDesligado(){
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();
        Assert.assertEquals(0, carro.getVelocidadeAtual().intValue());
    }

    @Test
    public void testeCarrosDiferentesMasMesmoModelo(){
        Carro meuCarro = new Carro("BMW","I5 M60");
        Carro carroPropaganda = new Carro("BMW","I5 M60");

        Assert.assertEquals(meuCarro,carroPropaganda);
        Assert.assertNotSame(meuCarro,carroPropaganda);
    }


    @Test
    public void testarListaDeComprasComListaDeEstoque() {
        Carro[] listaCompras = {new Carro("BMW", "X6"),
                new Carro("BMW", "XR3"),
                new Carro("BMW", "M2")};
        Carro[] listaPedido = {new Carro("BMW", "X6"),
                new Carro("BMW", "XR3"),
                new Carro("BMW", "M2")};

        Assert.assertArrayEquals(listaCompras, listaPedido);
    }
}
