package com.example.demo.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //anotation que diz que essa classe representara uma tabela do meu banco de dados
public class UserEntity {
    @Id //a chave primaria, o id da tabela
    @GeneratedValue //uma sequence do JPA, gera um ai automatico caso eu nao informe
    private Long id;

    private String fullName;

    private String email;

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
