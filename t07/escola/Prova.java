package t07.escola;
public class Prova implements Identificacao {
    private byte numQuestoes;

    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(byte n) {
        if(n > 0) {
            this.numQuestoes = n;
        }
    }
}