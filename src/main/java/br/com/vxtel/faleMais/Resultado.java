package br.com.vxtel.faleMais;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author axavi
 *
 * Classe responsável por armazenar os dados que serão urtilizados para o
 * cálculo do valor da ligação.
 */
public class Resultado {

    public String dddOrigem;
    public String dddDestino;
    public int minutos;
    public String planoEscolhido;
    public double valorPorMinuto;
    public double valorComPlano;
    public double valorSemPlano;

    public Resultado(
            String dddOrigem,
            String dddDestino,
            int minutos,
            String planoEscolhido,
            double valorPorMinuto) {

        this.dddOrigem = dddOrigem;
        this.dddDestino = dddDestino;
        this.minutos = minutos;
        this.planoEscolhido = planoEscolhido;
        this.valorPorMinuto = valorPorMinuto;
    }

    public String getDddOrigem() {
        return dddOrigem;
    }

    public void setDddOrigem(String dddOrigem) {
        this.dddOrigem = dddOrigem;
    }

    public String getDddDestino() {
        return dddDestino;
    }

    public void setDddDestino(String dddDestino) {
        this.dddDestino = dddDestino;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getPlanoEscolhido() {
        return planoEscolhido;
    }

    public void setPlanoEscolhido(String planoEscolhido) {
        this.planoEscolhido = planoEscolhido;
    }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }

    public double getValorComPlano() {
        return valorComPlano;
    }

    public void setValorComPlano(double valorComPlano) {
        this.valorComPlano = valorComPlano;
    }

    public double getValorSemPlano() {
        return valorSemPlano;
    }

    public void setValorSemPlano(double valorSemPlano) {
        this.valorSemPlano = valorSemPlano;
    }

    public void calcularValorComPlano() {
        int minutosPlano = Integer.parseInt(this.planoEscolhido.split(" ")[2]);
        int minutosCobrados = this.getMinutos() - minutosPlano;
        if (minutosCobrados < 0) {
            minutosCobrados = 0;
        }
        double valorMinutoPlano = this.valorPorMinuto * 0.1 + this.valorPorMinuto;
        double valor = valorMinutoPlano * minutosCobrados;
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        this.valorComPlano = bd.doubleValue();
    }

    public void calcularValorSemPlano() {
        double valor = this.valorPorMinuto * this.getMinutos();
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
        this.valorSemPlano = bd.doubleValue();
    }
}
