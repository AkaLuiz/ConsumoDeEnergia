package com.energia.ConsumoEnergia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Eletrodomestico")
public class Eletrodomestico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nome;
	int watts;
	int horasPorDia;
	int dias;
	int KWH;
	
	public Eletrodomestico() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public int getHorasPorDia() {
		return horasPorDia;
	}
	public void setHorasPorDia(int horasPorDia) {
		this.horasPorDia = horasPorDia;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public int getKWH() {
		return KWH;
	}
	public void setKWH(int kWH) {
		KWH = kWH;
	}
	
	
}
