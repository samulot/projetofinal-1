package br.com.marcorp.projetofinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="itmn032_agendamento")
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_seq")
	private int num_seq;
	
	@Column(name="nome_cli", length=100)
	private String nomeCliente;
	
	@Column(name="email_cli", length=100)
	private String emailCliente;
	
	@Column(name="celular_cli", length=20)
	private String celularCliente;
	
	@Column(name="data_agendamento")
	@Temporal(TemporalType.DATE)
	private Date dataAgendamento;
	
	@Column(name="hora_agendamento")
	@Temporal(TemporalType.TIME)
	private Date horaAgendamento;
	
	@Column(name="observacao", length=255)
	private String observacoes;
	

	public int getNum_seq() {
		return num_seq;
	}

	public void setNum_seq(int num_seq) {
		this.num_seq = num_seq;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCelularCliente() {
		return celularCliente;
	}

	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Date getHoraAgendamento() {
		return horaAgendamento;
	}

	public void setHoraAgendamento(Date horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
		
}