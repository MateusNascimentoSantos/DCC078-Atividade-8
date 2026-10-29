package saneamento;

public class TratamentoSubterraneo extends TratamentoAgua {

    public String pretratar() {
        return "Aeracao";
    }

    public int getTempoPretratamento() {
        return 25;
    }

    @Override
    public String getTipoCaptacao() {
        return "TratamentoSubterraneo";
    }
}
