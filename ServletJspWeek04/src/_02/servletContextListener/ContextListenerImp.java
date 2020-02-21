package _02.servletContextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerImp implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		//Context objemiz oluþtuðunda çalýþacak tetiklenecek,
		
		System.out.println("log..");
		System.out.println("context initialized..");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		//Context objemiz silindiðinde çalýþacak metot
		
		System.out.println("log..");
		System.out.println("context destroyed..");
		
	}

}
