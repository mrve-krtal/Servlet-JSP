package _04.servletContext;

public class Notes {

}

//Servlet init parametreleri sadece tanýmlandýðý servletlere özgüüdür. 
//context init parametreleri ise tüm proje de geçerli olacaktýr.

//adim1
//conteiner, web.xml dosyasýný okur.(deployment description)

//adim2
//her context-param için bir name/value cifti olusur.

//adim3
//Servletcontext objesi oluþturulur.

//adim4
//Servletcontext, name/value çiftine referansta oluþur.

//adim5
//Tüm Servlet ve jsp için bu Servletcontext oluþur

//HER servlet/JSP için BÝR tane SERVLETCONFÝG objesi oluþur.
//TÜM servlet/JSP için yani TÜM PROJE ÝÇÝN SADECE BÝR TANE ServletContext objesi oluþur.

