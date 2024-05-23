package classes;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private Integer idDep;
    private String nombre;
    private String localidad;
    private Set<Empleado> empleados = new HashSet<Empleado>(0);

    public Departamento() {
    }

    public Departamento(Integer idDep, String nombre, String localidad, Set<Empleado> empleados) {
        super();
        this.idDep = idDep;
        this.nombre = nombre;
        this.localidad = localidad;
        this.empleados = empleados;
    }

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }


}
