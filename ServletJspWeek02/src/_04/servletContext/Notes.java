package _04.servletContext;

public class Notes {

}

//Servlet init parametreleri sadece tan�mland��� servletlere �zg��d�r. 
//context init parametreleri ise t�m proje de ge�erli olacakt�r.

//adim1
//conteiner, web.xml dosyas�n� okur.(deployment description)

//adim2
//her context-param i�in bir name/value cifti olusur.

//adim3
//Servletcontext objesi olu�turulur.

//adim4
//Servletcontext, name/value �iftine referansta olu�ur.

//adim5
//T�m Servlet ve jsp i�in bu Servletcontext olu�ur

//HER servlet/JSP i�in B�R tane SERVLETCONF�G objesi olu�ur.
//T�M servlet/JSP i�in yani T�M PROJE ���N SADECE B�R TANE ServletContext objesi olu�ur.

