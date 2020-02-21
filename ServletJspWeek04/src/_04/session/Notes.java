package _04.session;

public class Notes {

}

//HTTP protokolu , server ile client arasindaki iletisimi saglayan dildir.
//HTTP protokolu stateless/durumsuz bir protokoldur.

//client/browser , server'a istekte bulunur baglanti acilir, server istegi
//karsilar cevabi doner , baglanti kapanir.
//baglanti kalici degildir.

//Session , ayni client/istemci icin birden fazla istek icin devamlilik saglar.
//Bunun icin HttpSession objemizi kullanabiliriz.

//istemci/client server a istekte bulunur. Servlet Container , tekil/unique bir
//Session ID bilgisini olusturur ve bu id bilgisini response/cevaba ekler.
//istemci bundan sonraki istekler icin bu Session Id bilgisiyle server'a gelir
//, artik elinde Ses sion Id bilgisi oldugu icin server ilgili client'i tanir.

//bu bilgi tasinmasi Cookie objeleri uzerinden olmaktadir.


//HttpSession objesi olusturma
//Session Id bilgisi olusturma
//Cookie objeleri olusturma
//Session ID - Cookie objesini iliskilendirme
//Response'sa Session Id bilgisini ekleme gibi butun islerden Servlet Container sorumludur.
 