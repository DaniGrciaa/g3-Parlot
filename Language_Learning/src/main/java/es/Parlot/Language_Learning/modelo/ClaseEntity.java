package es.Parlot.Language_Learning.modelo;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@jakarta.persistence.Table(name = "clase", schema = "parlot_db", catalog = "")
@IdClass(es.Parlot.Language_Learning.modelo.ClaseEntityPK.class)
public class ClaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_estudiante")
    private int idEstudiante;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id_profesor")
    private int idProfesor;

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Basic
    @Column(name = "fecha_hora")
    private Timestamp fechaHora;

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Basic
    @Column(name = "duracion")
    private int duracion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Basic
    @Column(name = "precio")
    private BigDecimal precio;

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Basic
    @Column(name = "estado")
    private Object estado;

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClaseEntity that = (ClaseEntity) o;

        if (id != that.id) return false;
        if (idEstudiante != that.idEstudiante) return false;
        if (idProfesor != that.idProfesor) return false;
        if (duracion != that.duracion) return false;
        if (fechaHora != null ? !fechaHora.equals(that.fechaHora) : that.fechaHora != null) return false;
        if (precio != null ? !precio.equals(that.precio) : that.precio != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idEstudiante;
        result = 31 * result + idProfesor;
        result = 31 * result + (fechaHora != null ? fechaHora.hashCode() : 0);
        result = 31 * result + duracion;
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}
