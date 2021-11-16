package TratamentoDeErrosExcessoes.Exercicios;

class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }

}