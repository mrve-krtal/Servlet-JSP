package _01.simple.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagHandler3 extends SimpleTagSupport {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		//super.doTag();
		
		getJspContext().getOut().print("username: "+userName);
	}
}
