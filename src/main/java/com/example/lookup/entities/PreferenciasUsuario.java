package com.example.lookup.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "preferencias_usuario")
public class PreferenciasUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preferencia", nullable = false)
    private Long id;

    @Column(name = "color_favorito")
    private Integer colorFavorito;

    @Column(name = "tipo_prenda_favorito")
    private Integer tipoPrendaFavorito;

    @Column(name = "talla_favorita")
    private Integer tallaFavorita;

    @Column(name = "tipo_evento")
    private Integer tipoEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private User idUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(Integer colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public Integer getTipoPrendaFavorito() {
        return tipoPrendaFavorito;
    }

    public void setTipoPrendaFavorito(Integer tipoPrendaFavorito) {
        this.tipoPrendaFavorito = tipoPrendaFavorito;
    }

    public Integer getTallaFavorita() {
        return tallaFavorita;
    }

    public void setTallaFavorita(Integer tallaFavorita) {
        this.tallaFavorita = tallaFavorita;
    }

    public Integer getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(Integer tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public User getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(User idUsuario) {
        this.idUsuario = idUsuario;
    }
}