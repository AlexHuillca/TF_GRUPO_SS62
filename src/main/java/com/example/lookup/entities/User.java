package com.example.lookup.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nombre_Usuario;
    private String password;
    private String correo;
    private String direccion;
    private Date fecha_registro;
    private boolean enabled;
    private String genero;
    private Long edad;
    private String dni;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_authorities",
            joinColumns = {
                    @JoinColumn(
                            name="user_id",
                            referencedColumnName = "id",
                            nullable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "authority_id",
                            referencedColumnName = "id",
                            nullable = false
                    )
            }
    )
    private List<Authority> authorities;

    public User(String nombre_Usuario, String password, String correo, String direccion, Date fecha_registro, boolean enabled, String genero, Long edad, String dni, List<Authority> authorities) {
        this.Nombre_Usuario = nombre_Usuario;
        this.password = password;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_registro = fecha_registro;
        this.enabled = enabled;
        this.genero = genero;
        this.edad = edad;
        this.dni = dni;
        this.authorities = authorities;
    }
}
