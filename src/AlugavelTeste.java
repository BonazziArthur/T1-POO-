import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlugavelTeste {

    @Test
    public void testeAddAluguel() {
        var alugavel = new Alugavel(1, "Nome", 0);
        var aluguel = new Aluguel("10", 8, "000", "Nome1", 10, alugavel);
        alugavel.adicionaAluguel(aluguel);

        assertEquals(aluguel, alugavel.getListaDeAlugueis().get(0));
    }

    @Test
    public void testeGetNome() {
        Alugavel alugavel = new Alugavel(1, "nome", 0);

        Assertions.assertEquals(alugavel.getNome(), "nome");
    }

    @Test
    public void testaSetNome() {
        Alugavel alugavel = new Alugavel(1, "nome", 0);

        alugavel.setNome("nome");
        Assertions.assertEquals(alugavel.getNome(), "nome");
    }

    @Test
    public void testaGetRua() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        Assertions.assertEquals(alugavel.getRua(), "Pedro ivo");
    }

    @Test
    public void testaSetRua() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        alugavel.setRua("Pedro ivo");
        Assertions.assertEquals(alugavel.getRua(), "Pedro ivo");
    }

    @Test
    public void testaGetBairro() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        Assertions.assertEquals(alugavel.getBairro(), "Floresta");
    }

    @Test
    public void testaSetBairro() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        alugavel.setBairro("Floresta");
        Assertions.assertEquals(alugavel.getBairro(), "Floresta");
    }
    @Test
    public void testaGetCodigo() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        Assertions.assertEquals(alugavel.getCodigo(), 1);
    }
    @Test
    public void testaSetCodigo() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        alugavel.setCodigo(1);
        Assertions.assertEquals(alugavel.getCodigo(), 1);
    }
    @Test
    public void testaGetPrecoDiario() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        Assertions.assertEquals(alugavel.getPrecoDiario(), 10);
    }

    @Test
    public void testaSetPrecoDiario() {
        Alugavel alugavel = new Alugavel(1, "Nome1", 10, "Pedro ivo", "Floresta");

        alugavel.setPrecoDiario(10);
        Assertions.assertEquals(alugavel.getPrecoDiario(),10);
    }
}