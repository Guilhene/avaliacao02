public class Carro {

    private int velocidade;
    private int velocidadeMaxima;

    public Carro(){
        this.velocidade = 0;
        velocidadeMaxima = 160;
    }

    public void setAcelera(int velocidade){
        if (velocidade > 0 && velocidade <= velocidadeMaxima){
            this.velocidade += velocidade;
        }
    }

    public void setFreio(int velocidade){
        if (velocidade >= 0 && velocidade <= velocidadeMaxima){
            this.velocidade -= velocidade;
        }
    }

    public int getExibirVelocidade(){
        return velocidade;
    }
}
