package com.profcristianoaf81.hibernateogmdemo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author cristianoaf81
 */
@Entity
@EqualsAndHashCode
public class Contato implements Serializable{

    private static final long serialVersionUID = -5969703040837681199L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
    @Getter @Setter
    private int id;
    
    @Getter @Setter
    private String nome;    
    @Getter @Setter
    private String tel;
    
    
}
