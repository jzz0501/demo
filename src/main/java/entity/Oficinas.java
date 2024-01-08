package entity;

import jakarta.persistence.*;

@Entity
public class Oficinas {
    @Id
    @Column(name = "cod_ofi")
    private String codOfi;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "direccion")
    private String direccion;
    @Basic
    @Column(name = "localidad")
    private String localidad;

    public String getCodOfi() {
        return codOfi;
    }

    public void setCodOfi(String codOfi) {
        this.codOfi = codOfi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oficinas oficinas = (Oficinas) o;

        if (codOfi != null ? !codOfi.equals(oficinas.codOfi) : oficinas.codOfi != null) return false;
        if (nombre != null ? !nombre.equals(oficinas.nombre) : oficinas.nombre != null) return false;
        if (direccion != null ? !direccion.equals(oficinas.direccion) : oficinas.direccion != null) return false;
        if (localidad != null ? !localidad.equals(oficinas.localidad) : oficinas.localidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codOfi != null ? codOfi.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Oficinas{" +
                "codOfi='" + codOfi.trim() + '\'' +
                ", nombre='" + nombre.trim() + '\'' +
                ", direccion='" + direccion.trim() + '\'' +
                ", localidad='" + localidad.trim() + '\'' +
                '}';
    }
}
