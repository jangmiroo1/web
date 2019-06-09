package com.n2014858052.main.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Profile {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String sns;

    @Column
    private String id;

    @Column
    private String link;

    @Column
    private LocalDateTime time;

    @Builder

    public Profile(String sns, String id, String link, LocalDateTime time) {
        this.sns = sns;
        this.id = id;
        this.link = link;
        this.time = time;
    }
}
