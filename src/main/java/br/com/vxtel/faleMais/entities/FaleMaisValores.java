package br.com.vxtel.faleMais.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Anderson Xavier
 *
 * Classe responsável por criar a base de dados com os valores que serão
 * cobrados no Produto FaleMais.
 *
 */
@Entity
public class FaleMaisValores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

//    @OneToMany
//    @JoinTable(name="FaleMaisValores_DDDOrigem",
//            joinColumns = @JoinColumn(name = "faleMaisValores_id"),
//            inverseJoinColumns = @JoinColumn(name = "DDDs_id"))
//    private DDDs dddOrigem;

//    @OneToMany
//    @JoinTable(name="FaleMaisValores_DDDDestino",
//            joinColumns = @JoinColumn(name = "faleMaisValores_id"),
//            inverseJoinColumns = @JoinColumn(name = "DDDs_id"))
//    private DDDs dddDestino;

    public double valorPorMinuto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }
}
