package sparks;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Navigation {
	
	public Navigation ()
	{
	
	}

	
	public String save ()
	{
		return "Studenttable";
	}
	
	public String manage ()
	{
		return "Adminpage";
	}
	
	public String addstudent ()
	{
		return "Student";
	}
	
	public String login ()
	{
		return "Login";
	}
	
	public String register ()
	{
		return "Registration";
	}
	public String submit ()
	{
		return "Registrationresponse";
	}
	
	
	public String home ()
	{
		return "Sparkstrainingfacility";
	}
	public String loginsubmit ()
	{
		return "Loginresponse";
	}
}
