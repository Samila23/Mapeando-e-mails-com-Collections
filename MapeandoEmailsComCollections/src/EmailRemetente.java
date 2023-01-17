
public class EmailRemetente {
	private String enderecoRemetente;
	private String dataEnvio;
	private String dataRecebimento;
	private String assunto;
	private String textoEmail;
	
	
	public EmailRemetente(String enderecoRemetente, String dataEnvio, String dataRecebimento, String assunto,
			String textoEmail) {
		this.enderecoRemetente = enderecoRemetente;
		this.dataEnvio = dataEnvio;
		this.dataRecebimento = dataRecebimento;
		this.assunto = assunto;
		this.textoEmail = textoEmail;
	}
	
	public EmailRemetente() {
	}


	public String getEnderecoRemetente() {
		return enderecoRemetente;
	}
	public void setEnderecoRemetente(String enderecoRemetente) {
		this.enderecoRemetente = enderecoRemetente;
	}
	public String getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getTextoEmail() {
		return textoEmail;
	}
	public void setTextoEmail(String textoEmail) {
		this.textoEmail = textoEmail;
	}

	@Override
	public String toString() {
		return "EmailRemetente [enderecoRemetente=" + enderecoRemetente + ", dataEnvio=" + dataEnvio
				+ ", dataRecebimento=" + dataRecebimento + ", assunto=" + assunto + ", textoEmail=" + textoEmail + "]";
	}
	
	
 
}
