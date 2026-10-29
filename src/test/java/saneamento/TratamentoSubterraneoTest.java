package saneamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TratamentoSubterraneoTest {

    @Test
    void deveRetornarPretratamento() {
        TratamentoSubterraneo tratamento = new TratamentoSubterraneo();

        assertEquals("Aeracao", tratamento.pretratar());
    }

    @Test
    void deveCalcularTempoTotal() {
        TratamentoSubterraneo tratamento = new TratamentoSubterraneo();

        assertEquals(115, tratamento.calcularTempoTotal());
    }

    @Test
    void deveRetornarTratamentoCompleto() {
        TratamentoSubterraneo tratamento = new TratamentoSubterraneo();
        tratamento.setEstacao("ETA Central");
        tratamento.setVolumeLitros(50000);

        assertEquals("TratamentoSubterraneo{estacao='ETA Central', etapas=Aeracao/Floculacao/Decantacao/Filtracao/Desinfeccao, tempoTotal=115}", tratamento.tratar());
    }
}
