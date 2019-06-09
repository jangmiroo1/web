package com.n2014858052.main.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Lombok
@Getter
@Setter
@NoArgsConstructor

// JPA
@Entity
@Table
public class Basic implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String email;

    @Column
    private String number;

    @Builder
    public Basic(String title, String subTitle, String email, String number) {
        this.title = title;
        this.subTitle = subTitle;
        this.email = email;
        this.number = number;
    }
}
