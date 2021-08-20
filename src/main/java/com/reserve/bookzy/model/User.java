package com.reserve.bookzy.model;


import lombok.*;

import javax.persistence.*;


@Table(name = "USER")
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "USERNAME")
    private String userName;
}