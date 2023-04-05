package com.alonso.customerscrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerID;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70)
    @Column(length = 70, nullable = false)
    private String companyName;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70)
    @Column(length = 70, nullable = false)
    private String contactName;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70)
    @Column(length = 70, nullable = false)
    private String contactTitle;

    @NotNull
    @NotEmpty
    @Size(min = 8, max = 150)
    @Column(length = 150, nullable = false)
    private String address;

    @NotNull
    @NotEmpty
    @Size(min = 3,  max = 70)
    @Column(length = 70, nullable = false)
    private String city;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70)
    @Column(length = 70, nullable = false)
    private String region;

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 8)
    @Column(length = 8, nullable = false)
    private String postalCode;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 70)
    @Column(length = 70, nullable = false)
    private String country;

    @NotNull
    @NotEmpty
    @Size(min = 9, max = 9, message = "Número inválido, debe ser de 9 dígitos")
    @Column(length = 9, nullable = false)
    private String phone;

    @NotNull
    @NotEmpty
    @Column(length = 20, nullable = false)
    private String fax;

}
