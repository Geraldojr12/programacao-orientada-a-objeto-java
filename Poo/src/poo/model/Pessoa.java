package poo.model;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	
	public enum tipoPessoa {FISICA, JURIDICA}
	 
	
	  public Integer codigo;
	  public String nome;
	  private String documento;
	  public tipoPessoa tipo;
	  
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		if (documento == null) {
			throw new RuntimeException("Documento nao pode ser nulo ou vazio");
		}
		
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = tipoPessoa.FISICA);
		}
		else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = tipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
		}
	}
	
	private void setDocumento(String documento, tipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	public tipoPessoa getTipo() {
		return tipo;
	}
	

}
