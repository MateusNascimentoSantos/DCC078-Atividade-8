package saneamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TratamentoSuperficialTest {

    @Test
    void deveRetornarPretratamento() {
        TratamentoSuperficial tratamento = new TratamentoSuperficial();

        assertEquals("Gradeamento/Desarenacao", tratamento.pretratar());
    }

    @Test
    void deveCalcularTempoTotal() {
        TratamentoSuperficial tratamento = new TratamentoSuperficial();

        assertEquals(130, tratamento.calcularTempoTotal());
    }

    @Test
    void deveRetornarTratamentoCompleto() {
        TratamentoSuperficial tratamento = new TratamentoSuperficial();
        tratamento.setEstacao("ETA Central");
        tratamento.setVolumeLitros(50000);

        assertEquals("Tratamento{estacao='ETA Central', etapas=Gradeamento/Desarenacao/Floculacao/Decantacao/Filtracao/Desinfeccao, tempoTotal=130}", tratamento.tratar());
    }
}
