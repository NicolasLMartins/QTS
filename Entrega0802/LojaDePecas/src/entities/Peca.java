package entities;

public class Peca {
    
    private int Codigo = 0;
    private int Quant = 0;
    private float Preco = 0f;

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public void setPreco(float preco) {
        Preco = preco;
    }
    public void setQuant(int quant) {
        Quant = quant;
    }

    public float precoTotal() {
        return Preco * Quant;
    }
}
