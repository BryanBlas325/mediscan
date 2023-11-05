package com.cibertec.edu.Mediscan.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombres;
	private String apellidos;
	private int nro_documento;
	private int edad;
	private String fecha_pago;
	private String estado;
	
}
