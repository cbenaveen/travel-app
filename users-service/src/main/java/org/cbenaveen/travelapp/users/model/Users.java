package org.cbenaveen.travelapp.users.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(generator = "users_id_generator")
    @SequenceGenerator(
            name = "users_id_generator",
            sequenceName = "users_id",
            initialValue = 100000
    )
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "email_address")
    @NotNull
    private String emailAddress;

    @Column(name = "password")
    @NotNull
    private String password;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_on")
    @NotNull
    private Date createdOn;

    @Column(name = "status")
    @NotNull
    private String status;
}
