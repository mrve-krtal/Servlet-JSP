package _01.notes;

public class LifecycleNotes {
	
}
		//Servlet Lifecycle

		// ### finding&loading

		// Servlet yasam dongusu Servlet class dosyalarinin bulunmasi ile baslar(finding)
		// Deploy islemi sirasinda bizim servlet'lerimiz bulunur;
		// bunun icin deployment descriptor (web.xml) ve annotationlardan yararlanilmaktadir.
		// daha sonrasinda bulunan bu dosyalar yuklenmektedir (loading)

		// servlet ler icin genel olarak yapilandirici kullanilmaz.
		// default olarak eger biz bir yapilandirici tanimlamazsak java bizim icin bir tane yapiladirici olusturur.
		// servletler icin yapilandirici kullanmak yerine init metodu onerilir.
		// servletler public classlar olmalidir! mutlaka default public constructor olmalidir.

		//Servlet container , servlte objesini olusturur;
		// arka planda servlet objesi olusurken kullanilan yontem;
		// Class.forName(classname).newInstance();


		// Her Servlet icin yalnizca bir tane OBJE/instance/object olusur!
		// Burada kesinlikle her request/session icin yeni bir Servlet objesi olma mantigi yoktur!!!
		// Her request icin bir tane thread olusmaktadir. bu istegi ayni client yapsa da fark etmez.

		// servletlerde instance variable tercih edilmez , thread-safe degildir.
		// kendimiz servlet objesi olusturmayacagimiz icin de constructor mantigi yine servlet icin uygun degildir.
		// servlet ayaga kalkmadan once bir seyler yapmak istiyorsak bunun icin uygun olani init metodunu kullanmaktir.

		// #### Servlet Init
		// Servletlerin intialized olmasi icin init metodu tamamlanmalidir.


		/*
		 	GenericServlet.class
		 	
		 	//bu metodu override etmicez.
		 	 servlet objesi olustuktan sonra , init(config) metodu calisir ve servlet initialized olur !
		 	 servlet yasam dongusunde init metodu/initialized islemi SADECE BIR KEZ gerceklesir.
		    
		     @Override
		    public void init(ServletConfig config) throws ServletException {
		        this.config = config;
		        this.init();
		    }
		    
		    bu metodu override edicez.
		      public void init() throws ServletException {
		        // NOOP by default
		    }
		 */


		// #### Servicing
		// Servlet objesi olustu OK
		// Servlet initialize edildi OK
		//  bundan sonra artik servletimiz isteklere cevap verebilir.
		// bu noktada Servlet Container service(servletrequest , servletresoonse) metodunu cagirir.
		// service metodunu override edebiliriz (final degil) fakat BUNU YAPMIYORUZ!!!

		// her istek geldiginde yeni bir thread olusur , javada threadler stack alaninda yasarlar.
		//

		// #### doXXY
		// service metodu gelen istegin turune gore doGet, doPost  vs metodunu cagirir.


		// ### destroying
		// son olarak lifecycle tamamlandigi noktada , destroy metodu calisir.
		// DIKKAT ! -> her istek bitince lifecycle bitmez!!!
		// servlet sinifinda bir degisiklik yaptigimizda , lifecycle bastan baslar.
		// destroy metodu da lifecycle da sadece bir kez calisir.


		// init ve destroy bir kez calisir lifecycle icin
		// doXX ve service metodu her request icin calisir.

		// init ve destroyu override edebiliriz problem degil.
		// doXX mutlaka override edicez
		// service override etmicez!!
 

