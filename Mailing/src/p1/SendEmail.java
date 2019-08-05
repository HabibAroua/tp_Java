package p1;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail 
{
	private String myEmail;
	private String myPassword;
	private Properties props;
	private String receiverMail;
	private String subject;
	private String text;
	
	public SendEmail()
	{
		this.props=new Properties();
	}
	
	public SendEmail(String myEmail , String myPassword , String receiverMail , String subject , String text)
	{
		this.props=new Properties();
		this.myEmail=myEmail;
		this.myPassword=myPassword;
		this.receiverMail=receiverMail;
		this.subject=subject;
		this.text=text;
	}
	
	public void setMyEmail(String myEmail)
	{
		this.myEmail=myEmail;
	}
	
	public String getMyEmail()
	{
		return this.myEmail;
	}
	
	public void setMyPassword(String myPassword)
	{
		this.myPassword=myPassword;
	}
	
	public String getMyPassword()
	{
		return this.myPassword;
	}
	
	public void setReceiverMail(String receiverMail)
	{
		this.receiverMail=receiverMail;
	}
	
	public String getReceiverMail(String receiverMail)
	{
		return this.receiverMail;
	}
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
	
	public String getSubject()
	{
		return this.subject;
	}
	
	public void setText(String text)
	{
		this.text=text;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	private void defProp()
	{
		this.props.put("mail.smtp.starttls.enable", "true");
		this.props.put("mail.smtp.auth", "true");
		this.props.put("mail.smtp.host", "smtp.gmail.com");
		this.props.put("mail.smtp.port", "587");
	}
	
	public Boolean send()
	{
		this.defProp();
		final String username = this.myEmail;
        final String password = this.myPassword;
		Session session = Session.getInstance(props,new javax.mail.Authenticator() 
        {
        	protected PasswordAuthentication getPasswordAuthentication() 
        	{
                return new PasswordAuthentication(username, password);
            }
        });

        try 
        {
        	Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(this.myEmail));
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(this.receiverMail));
            message.setSubject(this.subject);
            message.setText(this.text);

            Transport.send(message);
            System.out.println("Done");
            return true;
        } 
        catch (MessagingException e) 
        {
            throw new RuntimeException(e);
        }
	}
}
