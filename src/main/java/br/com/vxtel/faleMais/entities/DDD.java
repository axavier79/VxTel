package br.com.vxtel.faleMais.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Anderson Xavier
 *
 * Classe responsável por guardar a entidade que representará os DDDs que serão
 * utilizados no Produto FaleMais.
 *
 */
@Entity
public class DDD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

//    @ManyToOne
    public String codDDD;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodDDD() {
        return codDDD;
    }

    public void setCodDDD(String codDDD) {
        this.codDDD = codDDD;
    }
}
