package _01.simple.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagHandler2 extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		//super.doTag();
		
		getJspBody().invoke(null);
	}

}
