package _09.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	//ara birim oldu�u i�in s�n�f�(MyFilter) implements edece�iz.
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		String paramName=filterConfig.getInitParameter("FilterParamName");
		System.out.println("param name: "+paramName);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//Burada ilgili filtreleme i�lemi yapaca��z. log'lama, kontrol, request parametleri check edilecek gerekli i�lemler burada yap�lacak.
	
		System.out.println("do filter..");
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
				
	}

}
