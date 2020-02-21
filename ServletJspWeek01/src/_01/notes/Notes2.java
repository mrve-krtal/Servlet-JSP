package _01.notes;

public class Notes2 {

}

//Servlet'lerin main metodu yoktur! Servlet'lerin butun kontrolu , yasam
//dongusu/lifecycle , Servlet Container'in sorumlulugu altindadir.

//Servlet Container;
//eger istek bir servlet ya da jsp ise ozaman Servlet Container bu istek ile ilgilenir. 
//istek static se bu istekle ilgilenmez.


//Servlet Container'in gorevleri
//Servlet Container , Servlet' in yonetiminden , calistirilmasindan , kisacasi her seyinden sorumludur.

//iletisim saglamak/ iletisim destegi / communication support
//web server ile servlet arasindaki iletisimi servlet container saglar.
//boylece port dinlemek , socket olusturmak durumunda kalmayiz.

//yasam dongusu / lifecycle management
//servletlerin yasam dongusunden container/engine sorumludur.

//thread destegi/ multithread support
//her request/istek bir thread'e karsilik gelir. bizim yeni therad olusturmak, yonetmek vs gibi bir problemimiz olmayacak!

//JSP support/jsp destegi (java server pages)
//JSF --> java server faces -> konumuz degil suan :)

//Servlet Container , JSP dosyalarini java translate eder! 
//JSP ------> .java dosyalarina translate edilir.


//Servlet'in gorevleri...

//1) istemci/end-user tarafindan gonderilen acik/explicit bilgileri okumak.
//kullanici form'a veri girdi, formu submit etti. Servlet aracigiliyla bu gonderilen verileri/datalari okuyabilir/ulasabiliriz.

//2) istemci(browser) tarafindan gonderilen kapali bilgileri okumak.
//kapali/implicit -> user agent , media type , cookiler vs.

//3)sonuc uretmek
//controller olarak gorev yapmaktadir.
//katmanli mimari yapisini dusundugumuzde servlet-jsp projesi icin ,
//servlet -> controller , service layer'i cagirir, service layer --> dao layer 'i cagiracaktir.

//JSP sayfasinda veritabanina baglanmak , cesitli isler yapmak vs OLMAMALIDIR!!!

