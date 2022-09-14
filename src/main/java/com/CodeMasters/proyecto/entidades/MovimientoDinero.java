package com.CodeMasters.proyecto.entidades;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

    @Entity
    @Table(name = "movimiento_dinero")
    public class MovimientoDinero {

        @Id
        @Column(unique = true)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "monto_dinero")
        private double montoDinero;

        @Column(name = "concepto_movimiento")
        private String conceptoMovimiento;

        @ManyToOne
        @JoinColumn(name = "id")
        private Empleado usuario;

        public MovimientoDinero() {
        }

        public MovimientoDinero(Long id, double montoDinero, String conceptoMovimiento, Empleado usuario) {
            this.id = id;
            this.montoDinero = montoDinero;
            this.conceptoMovimiento = conceptoMovimiento;
            this.usuario = usuario;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
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

        public Empleado getUsuario() {
            return usuario;
        }

        public void setUsuario(Empleado usuario) {
            this.usuario = usuario;
        }
    }
}
