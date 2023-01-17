import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		
		MailMap emails = new MailMap();
		EmailDestinatario samila = new EmailDestinatario();
		EmailRemetente email01 = new EmailRemetente();
		samila.setEnderecoDestinaro("Samila@gmail.com");
		email01.setEnderecoRemetente("leticia@gmail.com");
		email01.setDataEnvio("15/01");
		email01.setDataRecebimento("16/01");
		email01.setAssunto("teste");
		email01.setTextoEmail("Testado");

		
	
		EmailRemetente email02 = new EmailRemetente();
		samila.setEnderecoDestinaro("Sfsdamila@gmail.com");
		email02.setEnderecoRemetente("letsdfasicia@gmail.com");
		email02.setDataEnvio("15sfsa/01");
		email02.setDataRecebimento("1sadfs6/01");
		email02.setAssunto("tesafsste");
		email02.setTextoEmail("Tesdasstado");
		
		emails.enviarEmails.put( samila, email01);
		emails.enviarEmails.put( samila, email02);

		emails.print(emails);
	}

}
