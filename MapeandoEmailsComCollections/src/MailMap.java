import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MailMap {
		Map<EmailDestinatario, EmailRemetente> enviarEmails = new HashMap<>();
		
		
		public void print(MailMap email) {
			for ( EmailDestinatario key : enviarEmails.keySet()) {
				System.out.println(key+ " = " + enviarEmails.get(key));
				System.out.println();
			}
		}

}
