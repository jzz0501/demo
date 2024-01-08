package entity;

import jakarta.persistence.*;

@Entity
public class Empleados {
    @Id
    @Column(name = "nif")
    private String nif;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "direccion")
    private String direccion;
    @Basic
    @Column(name = "cargo")
    private String cargo;
    @Basic
    @Column(name = "cod_ofi")
    private String codOfi;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodOfi() {
        return codOfi;
    }

    public void setCodOfi(String codOfi) {
        this.codOfi = codOfi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empleados empleados = (Empleados) o;

        if (nif != null ? !nif.equals(empleados.nif) : empleados.nif != null) return false;
        if (nombre != null ? !nombre.equals(empleados.nombre) : empleados.nombre != null) return false;
        if (direccion != null ? !direccion.equals(empleados.direccion) : empleados.direccion != null) return false;
        if (cargo != null ? !cargo.equals(empleados.cargo) : empleados.cargo != null) return false;
        if (codOfi != null ? !codOfi.equals(empleados.codOfi) : empleados.codOfi != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nif != null ? nif.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (codOfi != null ? codOfi.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nif='" + nif.trim() + '\'' +
                ", nombre='" + nombre.trim() + '\'' +
                ", direccion='" + direccion.trim() + '\'' +
                ", cargo='" + cargo.trim() + '\'' +
                ", codOfi='" + codOfi.trim() + '\'' +
                '}';
    }
}
