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

    @JsonIgnore
    @OneToMany(mappedBy = "idUsuario",fetch = FetchType.EAGER)
    private List<PreferenciasUsuario> preferencia;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public List<PreferenciasUsuario> getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(List<PreferenciasUsuario> preferencia) {
        this.preferencia = preferencia;
    }
}
