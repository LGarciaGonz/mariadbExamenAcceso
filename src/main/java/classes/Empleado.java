package classes;

import java.sql.Date;

public class Empleado {
    private Integer idEmp;
    private Integer idDepto;
    private String apellido;
    private String oficio;
    private Date fechaAlta;
    private Float salario;
    private Float comision;

    public Empleado() {
    }

    public Empleado(Integer idEmp, Integer idDepto, String apellido, String oficio, Date fechaAlta,
                    Float salario, Float comision) {
        super();
        this.idEmp = idEmp;
        this.idDepto = idDepto;
        this.apellido = apellido;
        this.oficio = oficio;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
        this.comision = comision;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Integer getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Integer idDepto) {
        this.idDepto = idDepto;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }



}
