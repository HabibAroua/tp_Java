package p1;

public class MainParser
{
	private String email;  
	private String did_you_mean; 
	private String user; 
	private String domain;
	private boolean format_valid;  
	private boolean mx_found;
	private boolean smtp_check;  
	private String catch_all;
	private boolean role;
	private boolean disposable;
	private boolean free; 
	private double score;
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getDid_you_mean() 
	{
		return did_you_mean;
	}
	
	public void setDid_you_mean(String did_you_mean) 
	{
		this.did_you_mean = did_you_mean;
	}
	
	public String getUser() 
	{
		return user;
	}
	
	public void setUser(String user) 
	{
		this.user = user;
	}
	
	public String getDomain()
	{
		return domain;
	}
	
	public void setDomain(String domain)
	{
		this.domain = domain;
	}
	
	public boolean isFormat_valid() 
	{
		return format_valid;
	}
	
	public void setFormat_valid(boolean format_valid) 
	{
		this.format_valid = format_valid;
	}
	
	public boolean isMx_found() 
	{
		return mx_found;
	}
	
	public void setMx_found(boolean mx_found)
	{
		this.mx_found = mx_found;
	}
	
	public boolean isSmtp_check() 
	{
		return smtp_check;
	}
	
	public void setSmtp_check(boolean smtp_check)
	{
		this.smtp_check = smtp_check;
	}
	
	public String getCatch_all()
	{
		return catch_all;
	}
	
	public void setCatch_all(String catch_all) 
	{
		this.catch_all = catch_all;
	}
	
	public boolean isRole() 
	{
		return role;
	}
	
	public void setRole(boolean role)
	{
		this.role = role;
	}
	
	public boolean isDisposable()
	{
		return disposable;
	}
	
	public void setDisposable(boolean disposable)
	{
		this.disposable = disposable;
	}
	
	public boolean isFree()
	{
		return free;
	}
	
	public void setFree(boolean free) 
	{
		this.free = free;
	}
	
	public double getScore() 
	{
		return score;
	}
	
	public void setScore(double score)
	{
		this.score = score;
	}
	
}
