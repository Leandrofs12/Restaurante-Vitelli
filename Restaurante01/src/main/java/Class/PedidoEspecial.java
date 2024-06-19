package Class;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoEspecial extends Pedidos {

   
    public void gerarNota() {
        try {
            FileWriter fw = new FileWriter("NotaEspecial.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Pedido Especial\n");
            pw.print("Entrada: " + getEntrada() + " - Preço: R$ " + PRECO_ENTRADA + "\n");
            pw.print("Prato Principal: " + getPratoPrincipal() + " - Preço: R$ " + PRECO_PRATO_PRINCIPAL + "\n");
            pw.print("Sobremesa: " + getSobremesa() + " - Preço: R$ " + PRECO_SOBREMESA + "\n");
            pw.print("Total: R$ " + calcularTotal() + "\n");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PedidoEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double calcularPreco() {
        double precoTotal = 0.0;
        return precoTotal;
    }
}
