package _01.notes;

public class HandleRequestNotes {

}

//Servlet'lerin butun kontrolunden/ yasam dongusunden Servlet Container
//sorumludur.

//1.adim
//End user/kullanici Servlet i cagiran url linkine gider.

//2.adim
//Servlet Container , istegin Servlet oldugunu anlar ve 2 tane obje olusturur.
//a)HttpServletResponse
//b)HttpServletRequest objeleridir.

//3.adim
//Servlet Container , yeni istek icin bir thread olusturur ve service metodunu
//cagirir.
//2.adimda olusan request ve response objeleri bu metoda gecer.

//4.adim
//service metodu hangi metodun cagrilacagina karar verir.
//ilgili HTTP request'ine bagli olarak, GET ise doGet , POST ise doPost

//5.adim
//doXX metodu metodu calisir. gerekli islemler yapilir

//6.adim
//service metodu tamamlanir. response ve request objeleri , GC (garbage
//collector) tarafindan temizlenmeye uygun hale gelir.
//thread sonlanir.