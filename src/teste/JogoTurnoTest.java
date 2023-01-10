package teste;

import main.JogoTurno;
import main.TurnoEstadoAtaque;
import main.TurnoEstadoBloqueio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTurnoTest {
    @Test
    void deveArmazenarEstados() {
        JogoTurno partida = new JogoTurno();
        partida.setAtual(TurnoEstadoAtaque.getInstance());
        partida.setAtual(TurnoEstadoAtaque.getInstance());
        assertEquals(2, partida.getHistorico().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        JogoTurno partida = new JogoTurno();
        partida.setAtual(TurnoEstadoAtaque.getInstance());
        partida.setAtual(TurnoEstadoBloqueio.getInstance());
        partida.restauraEstado(0);
        assertEquals(TurnoEstadoAtaque.getInstance(), partida.getAtual());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        JogoTurno partida = new JogoTurno();
        partida.setAtual(TurnoEstadoAtaque.getInstance());
        partida.setAtual(TurnoEstadoBloqueio.getInstance());
        partida.setAtual(TurnoEstadoAtaque.getInstance());
        partida.restauraEstado(1);
        assertEquals(TurnoEstadoBloqueio.getInstance(), partida.getAtual());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            JogoTurno partida = new JogoTurno();
            partida.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}