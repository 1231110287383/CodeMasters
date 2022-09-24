package com.CodeMasters.proyecto.entidades;

import javax.persistence.*;
import java.util.Date;


@Entity
    @Table(name = "movimiento_dinero")
    public class MovimientoDinero {

    @Id
    @Column(name = "id_movimiento", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "monto_dinero")
    private double montoDinero;

    @Column(name = "concepto_movimiento")
    private String conceptoMovimiento;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    private Empresa empresaMovimiento;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empleado.class)
    private Empleado usuarioMovimiento;

    private Date fechaCreacion;

    private Date fechaActualizacion;


    public MovimientoDinero() {
    }

    public MovimientoDinero(Long id, double montoDinero, String conceptoMovimiento, Empresa empresaMovimiento, Empleado usuarioMovimiento, Date fechaCreacion, Date fechaActualizacion) {
        this.montoDinero = montoDinero;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empresaMovimiento = empresaMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empresa getEmpresaMovimiento() {
        return empresaMovimiento;
    }

    public void setEmpresaMovimiento(Empresa empresaMovimiento) {
        this.empresaMovimiento = empresaMovimiento;
    }

    public Empleado getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(Empleado usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

}