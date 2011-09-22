package org.romaframework.module.mail.javamail;

import java.util.Map;

public class ServerConfiguration {

	private String											pop3;
	private String											smtp;
	private String											imap;
	private Map<String, Authentication>	authentications;
	private boolean											debug;

	public String getPop3() {
		return pop3;
	}

	public void setPop3(String pop3) {
		this.pop3 = pop3;
	}

	public String getSmtp() {
		return smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public String getImap() {
		return imap;
	}

	public void setImap(String imap) {
		this.imap = imap;
	}

	public boolean getDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public Map<String, Authentication> getAuthentications() {
		return authentications;
	}

	public void setAuthentications(Map<String, Authentication> authentications) {
		this.authentications = authentications;
	}

}
