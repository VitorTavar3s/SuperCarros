import org.junit.Assert;
import org.junit.Test;

public class MainTest {


        @Test
        public  void testeDeveLigarCorretamente() {
            // Teste 01 - Validar se o carro liga corretamente
            // Given
            Carro carro = new Carro();
            // When
            carro.ligarCarro();
            // Then
            Assert.assertEquals(true,carro.getLigado());
        }

        @Test
        public void testeDeveDesligarCorretamente() {
        // Given
        Carro carro = new Carro();
        carro.ligarCarro();

        // When
        carro.desligarCarro();

        // Then
        Assert.assertFalse(carro.getLigado());
    }

    @Test
    public void testeDeveAcelerarCorretamete() {
        // Dado
        // carro ligado
        Carro carro = new Carro();
        carro.ligarCarro();

        // Quando
        // acelerar

        carro.acelerar();

        // Entao
        // velocidade == ?
        Assert.assertEquals((Integer) 10,carro.getVelocidadeAtual());
    }

    @Test
    public void testeDeveFrearCorretamente(){
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();

        carro.frear();

        Assert.assertEquals((Integer) 0,carro.getVelocidadeAtual());
    }

    @Test
    public void testeAcelerarMaximo(){
        Carro carro = new Carro();
        carro.ligarCarro();

        for(int i=0;i<10;i++){
            carro.acelerar();
        }

        Assert.assertEquals((Integer) 100,carro.getVelocidadeAtual());
    }
}
