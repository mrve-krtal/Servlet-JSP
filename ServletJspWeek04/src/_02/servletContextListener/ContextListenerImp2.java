package _02.servletContextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerImp2 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		//Context objemiz olu�tu�unda �al��acak tetiklenecek,
		
		System.out.println("log2..");
		System.out.println("context initialized2..");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		//Context objemiz silindi�inde �al��acak metot
		
		System.out.println("log2..");
		System.out.println("context destroyed2..");
		
	}

}
