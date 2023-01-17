
public class EmailDestinatario {
	private String enderecoDestinario;

	public String getEnderecoDestinaro() {
		return enderecoDestinario;
	}

	public EmailDestinatario() {
		super();
	}


	public void setEnderecoDestinaro(String enderecoDestinaro) {
		this.enderecoDestinario = enderecoDestinaro;
	}

	public EmailDestinatario(String enderecoDestinaro) {
		this.enderecoDestinario = enderecoDestinaro;
	}

	@Override
	public String toString() {
		return "EmailDestinatario [enderecoDestinario=" + enderecoDestinario + "]";
	}
	
	
}
