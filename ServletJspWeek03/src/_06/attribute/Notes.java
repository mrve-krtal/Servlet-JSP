package _06.attribute;

import java.util.Enumeration;

public class Notes {

}

//attributeler, request,session ve context scope'a eklediğimiz objelerdir.

//ServletContext->context scope
// HttpSession ->session scope
//ServletRequest->request scope

//AŞAĞIDAKİ METOTLAR (ServletContext, HttpSession, ServletRequest) 3'UNDE DE ORTAKTIR. AYNI YAPIYA SAHİPTİRLER.
//Tek farkı ilgili scope da çalışmaları.
//public Object getAttribute(String name);
//public Enumeration<String> getAttributeNames();
//public void setAttribute(String name, Object object);
//public void removeAttribute(String name);


