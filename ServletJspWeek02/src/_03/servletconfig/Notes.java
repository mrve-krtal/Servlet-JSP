package _03.servletconfig;

public class Notes {

}

//public String getServletName();
//public ServletContext getServletContext();
//public String getInitParameter(String name);
//public Enumeration<String> getInitParameterNames();

//servlet lifecycle da -> initialize islemi oncesi ServletConfig objesi olusur.

/*
* public void init(ServletConfig config) throws ServletException { 
* this.config= config; 
* this.init(); }
*/

//Her Servlet/JSP objesi icin birtane ServletConfig objesi olusur.
//ServletConfig objesi , deployment descriptor (web.xml) dosyasinda ya da
//annotaion ile tanimladigimiz init parametrelerine ulasmak icin kullanilir.


//adim1 
//Servlet Container , web.xml dosyasini okur


//adim2
//container , ServletConfig objesi/instance olusturur.


//adim3
//her init paremeter icin String name/value cifti olusturulur.


//adim4 
//ServletConfig objesi bu name/value ciftine referansta bulunur.

//adim5
//Servlet Container , ilgili servlet objesini olustur.

//adim6
//container , init(servletconfig) metodunu cagirir.

