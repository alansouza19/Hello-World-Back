package br.com.hello.world.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TB_PESSOA")
public class PessoaEntity implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
