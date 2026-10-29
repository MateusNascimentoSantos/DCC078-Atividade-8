package saneamento;

public class TratamentoSuperficial extends TratamentoAgua {

    public String pretratar() {
        return "Gradeamento/Desarenacao";
    }

    public int getTempoPretratamento() {
        return 40;
    }

}
