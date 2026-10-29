package saneamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TratamentoReusoTest {

    @Test
    void deveRetornarPretratamento() {
        TratamentoReuso tratamento = new TratamentoReuso();

        assertEquals("Peneiramento/Tratamento biologico", tratamento.pretratar());
    }

    @Test
    void deveCalcularTempoTotal() {
        TratamentoReuso tratamento = new TratamentoReuso();

        assertEquals(210, tratamento.calcularTempoTotal());
    }

    @Test
    void deveRetornarTratamentoCompleto() {
        TratamentoReuso tratamento = new TratamentoReuso();
        tratamento.setEstacao("ETA Central");
        tratamento.setVolumeLitros(50000);

        assertEquals("TratamentoReuso{estacao='ETA Central', etapas=Peneiramento/Tratamento biologico/Floculacao/Decantacao/Filtracao/Desinfeccao, tempoTotal=210}", tratamento.tratar());
    }
}
