
package Class;

import Class.CalculoPedido;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Pedidos implements  CalculoPedido {

    private String entrada;
    private String pratoPrincipal;
    private String sobremesa;

    // Preços dos pratos - Menu Executivo
    public static final double PRECO_ENTRADA = 10.00;
    public static final double PRECO_PRATO_PRINCIPAL = 45.00;
    public static final double PRECO_SOBREMESA = 20.00;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String Salvar() throws IOException {
        try {
            FileWriter fw = new FileWriter("Comanda.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Entrada: " + this.entrada + " - Preço: R$ " + PRECO_ENTRADA + "\n");
            pw.print("Prato Principal: " + this.pratoPrincipal + " - Preço: R$ " + PRECO_PRATO_PRINCIPAL + "\n");
            pw.print("Sobremesa: " + this.sobremesa + " - Preço: R$ " + PRECO_SOBREMESA + "\n");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Pedido Anotado!";
    }

    public double calcularTotal() {
        return PRECO_ENTRADA + PRECO_PRATO_PRINCIPAL + PRECO_SOBREMESA;
    }

    
    public abstract void gerarNota();
    
    
    public double calcularPreco() {
        double precoTotal = 0.0;
        return precoTotal;
    }
}
