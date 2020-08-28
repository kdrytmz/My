package com.blogapp.aws.movieuitemplate.utils;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSource {







    public static List<Movie> getPopularMovies(){

       List<Movie> lstMovies = new ArrayList<>();

        lstMovies.add(new Movie( "Naim", R.drawable.naim,R.drawable.naim,"","Studio..","8.1","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/11/01/09//19554205_hd_013.mp4"));

        lstMovies.add(new Movie("Güzel Günler Göreceğiz",R.drawable.guzelgunler,R.drawable.guzelgunler,"Hasan Tolga Pulat ın yönettiği paralel hikayeler draması Güzel Günler Göreceğiz, bir gün içinde ve İstanbul’da geçiyor. Hikaye, beş farklı karakterin - Cumali, Ali, Figen, İzzet ve Anna- kesişen yollarını anlatıyor ama hiç kimse bir diğerininfarkında değil, dolayısıyla da birbirlerinin hayatlarına müdahaleleri yok. Günün sonunda ise  aslında insanların müdahale ettiği hayat ortaya çıkıyor. Filmin oyuncu kadrosunda Uğur Polat, Buğra Gülsoy, Nesrin Cevadzade, Feride Çetin ve Barış Atay Mengüllü isimleri öne çıkıyor...48. Antalya Altın Portakal Film Festivali'nde yarışan yapım En İyi Film, En İyi Senaryo, En İyi Kurgu ve En İyi Yardımcı Kadın Oyuncu ödüllerine layık görülmüştü.","Studio..","5.4","https://tr.vid.web.acsta.net/uk/medias//nmedia/s3/90/18/85/12/74/19304257_sd_013.mp4"));

        lstMovies.add(new Movie("Kin",R.drawable.kin,R.drawable.kin,"Kin, hafta sonu için türlü plan yapan gençlerin başlarına gelenleri konu ediyor. Üç kız arkadaş, güzel bir   hafta sonu geçirmek için plan yapar. İçlerinden birinin ailesine ait otel olmasından yararlanan kızlar soluğu otelde alır.  Tamamen kendilerine ait bir hafta sonu geçirmek isteyen kızlar, bu yüzden programlarına erkek arkadaşlarını dahil etmez.Kızların planına dahil olmadıkları için bozulan erkekler, kızların ürkütücü bulabileceği ama kendieri için çok eğlenceli olacağını düşündükleri bir plan yaparlar. İçlerinden biri kız arkadaşına evlilik teklifi edecektir ve buna yönelik plan yaparlar.Ancak yaşananlar hiç de onların planladıkları gibi olmaz. Yaşanan olaylar aslında gençlerin gerçekte kim olduğunu ortaya çıkarır.","Studio..","7.0","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/18/04/27/08/19549186_hd_013.mp4"));

        lstMovies.add(new Movie("Mucize 2 Aşk",R.drawable.mucize2,R.drawable.mucize2,"Engelli bir adam olan Aziz ile görücü usulü evlendiği karısı Mızgin, köyde yaşadıkları sorunlardan iyice bıkar.Kendilerine yeni bir hayat kurmak isteyen çift, Batı da bir kasabaya gider. Ancak gittikleri kasabada da türlü sorunlarla karşılaşırlar.Çift, ne olursa olsun insanların önyargılarını aşıp, hayatta tutunmak için çabalar. Mızgin e aşık olan Aziz, karısı için engellerinden kurtulmaya karar verir bu uğurda zorlu bir mücadeleye girişir. Aziz, Mahir öğretmen ve sinemacı Bahattin in de desteği ile eşi için birçok  mucizeyi gerçekleştirir. 2014 yapımı \"Mucize\" filminin devam halkası olan yapımın yönetmenliğini ve senaristliğini bir kez daha Mahsun Kırmızıgül üstleniyor.","Studio..","8.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/22/16//19551341_hd_013.mp4"));

        lstMovies.add(new Movie("Recep İvedik 6",R.drawable.recepivedik,R.drawable.recepivedik,"Recep İvedik 6, Konya ya giderken kendisini Kenya da bulan Recep İvedik in maceralarını konu ediyor. Recep İvedik in hayatı kendisine gelen bir davet ile bambaşka bir hal alır. Davet ile Recep İvedik, kuru fasulye festivaline çağırılmaktadır. Daveti memnuniyetle karşılayan Recep, arkadaşı Nurullah ı da yanına alarak Konya ya doğru yola koyulur. Daha yolculuğa başlar başlamaz türlü talihsizlikler yaşayan ikili, yolculuğun sonunda kendilerini Konya yerine Kenya da bulur. Seyahat acentesinin hatası sonucu Kenya ya gelen Recep ve Nurullah, Türkiye ye geri dönmenin yolunu arar.Bilmedikleri bir coğrafyada bulunan Recep ile Nurullah, kendilerini birden iki düşman yerli kabilenin arasında bulur. Kendisine has yöntemlerle içinde bulunduğu vahşi dünyada ayakta kalmaya çalışan Recep in başına bu süreçte birbirinden ilginç olaylar gelir.","Studio..","8","https://ssdcdn1.closeload.com/vdo/thegiantpear-2017-bluyts-altyazimp4-kxBvqnvDkAm.mp4"));

        lstMovies.add(new Movie("She Dies Tomorrow",R.drawable.shediestomorrow,R.drawable.shediestomorrow,"Genç bir kadın olan Amy, uyandığında yarın öleceğini düşünmeye başlar. Hasta değil, sadece yarın dünyadaki son günü olduğuna inanır.Amy, bu düşüncesini arkadaşları ile paylaştığında işler daha karmaşık bir hal alır. Amy’nin söylediklerinden sonra arkadaşları da kendi hayatları hakkında endişe etmeye başlar.","Studio..","3.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/07/21/14//19556359_hd_013.mp4"));

        return lstMovies;


    }
    public static List<Movie>getWeekMovies(){
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("She Dies Tomorrow",R.drawable.shediestomorrow,R.drawable.shediestomorrow,"Genç bir kadın olan Amy, uyandığında yarın öleceğini düşünmeye başlar. Hasta değil, sadece yarın dünyadaki son günü olduğuna inanır.Amy, bu düşüncesini arkadaşları ile paylaştığında işler daha karmaşık bir hal alır. Amy’nin söylediklerinden sonra arkadaşları da kendi hayatları hakkında endişe etmeye başlar.","Studio..","3.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/07/21/14//19556359_hd_013.mp4"));

        lstMovies.add(new Movie("Mucize 2 Aşk",R.drawable.mucize2,R.drawable.mucize2,"Engelli bir adam olan Aziz ile görücü usulü evlendiği karısı Mızgin, köyde yaşadıkları sorunlardan iyice bıkar.Kendilerine yeni bir hayat kurmak isteyen çift, Batı da bir kasabaya gider. Ancak gittikleri kasabada da türlü sorunlarla karşılaşırlar.Çift, ne olursa olsun insanların önyargılarını aşıp, hayatta tutunmak için çabalar. Mızgin e aşık olan Aziz, karısı için engellerinden kurtulmaya karar verir bu uğurda zorlu bir mücadeleye girişir. Aziz, Mahir öğretmen ve sinemacı Bahattin in de desteği ile eşi için birçok  mucizeyi gerçekleştirir. 2014 yapımı \"Mucize\" filminin devam halkası olan yapımın yönetmenliğini ve senaristliğini bir kez daha Mahsun Kırmızıgül üstleniyor.","Studio..","8.7","https://cdn.illuminati.to/videoplayback/ea95306305a51bf2fdf1500349e93bf513efc19272afe34eaa5ef688780f3883&selected_id=3"));

        lstMovies.add(new Movie("Recep İvedik 6",R.drawable.recepivedik,R.drawable.recepivedik,"Recep İvedik 6, Konya ya giderken kendisini Kenya da bulan Recep İvedik in maceralarını konu ediyor. Recep İvedik in hayatı kendisine gelen bir davet ile bambaşka bir hal alır. Davet ile Recep İvedik, kuru fasulye festivaline çağırılmaktadır. Daveti memnuniyetle karşılayan Recep, arkadaşı Nurullah ı da yanına alarak Konya ya doğru yola koyulur. Daha yolculuğa başlar başlamaz türlü talihsizlikler yaşayan ikili, yolculuğun sonunda kendilerini Konya yerine Kenya da bulur. Seyahat acentesinin hatası sonucu Kenya ya gelen Recep ve Nurullah, Türkiye ye geri dönmenin yolunu arar.Bilmedikleri bir coğrafyada bulunan Recep ile Nurullah, kendilerini birden iki düşman yerli kabilenin arasında bulur. Kendisine has yöntemlerle içinde bulunduğu vahşi dünyada ayakta kalmaya çalışan Recep in başına bu süreçte birbirinden ilginç olaylar gelir.","Studio..","8","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/30/15//19554191_hd_013.mp4"));

        return lstMovies;

    }
    public static List<Movie>getActionMovies(){

        List<Movie> lstMovies = new ArrayList<>();

        lstMovies.add(new Movie("Adaletsiz-Dragged Acros Concrete",R.drawable.action_adaletsiz,R.drawable.action_adaletsiz,"S. Craig Zahler'in yönetmenliğini ve senaristliğini yaptığı Adaletsiz - Dragged Across Concrete filmi Aksiyon, Suç, Dram, Gerilim türünde çekilmiş Kanada , Abd yapımı bir filmdir. 02 Mart 2019 (ABD)'de vizyona giren film türkçe altyazılı sizlerle buluştu. Başrolleri üstlenen ünlü oyuncular Mel Gibson ve Vince Vaughn’un canlandırdıkları karakterler emniyetten atılan polisler olmuştur. Adaletsiz, bu iki ırkçı ve şiddet eğilimli polisin atıldıkran sonra ceplarında para kalmadığında daha da pis işlere karışacaklardır. Adaletsiz - Dragged Across Concrete 2018 1080p Full HD Film izle","Studio..","3.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/04/26/09//19552731_hd_013.mp4"));

        lstMovies.add(new Movie("Kin",R.drawable.kin,R.drawable.kin,"Kin, hafta sonu için türlü plan yapan gençlerin başlarına gelenleri konu ediyor. Üç kız arkadaş, güzel bir   hafta sonu geçirmek için plan yapar. İçlerinden birinin ailesine ait otel olmasından yararlanan kızlar soluğu otelde alır.  Tamamen kendilerine ait bir hafta sonu geçirmek isteyen kızlar, bu yüzden programlarına erkek arkadaşlarını dahil etmez.Kızların planına dahil olmadıkları için bozulan erkekler, kızların ürkütücü bulabileceği ama kendieri için çok eğlenceli olacağını düşündükleri bir plan yaparlar. İçlerinden biri kız arkadaşına evlilik teklifi edecektir ve buna yönelik plan yaparlar.Ancak yaşananlar hiç de onların planladıkları gibi olmaz. Yaşanan olaylar aslında gençlerin gerçekte kim olduğunu ortaya çıkarır.","Studio..","7.0","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/30/15//19554191_hd_013.mp4"));

        lstMovies.add(new Movie("Avengers:Endgame",R.drawable.actionendgame,R.drawable.actionendgame,"Avengers Infinity War\"un ardından pek çok süper kahraman küle dönüşmüştür. Doktor Strange, Gamora, Drax, Mantis, genç Örümcek Adam, Black Panther, Bucky Barnes, Groot, Scarlet Witch, Vision, Star Lord, Maria Hill, The Wasp ve Nick Fury gibi pek çok kahraman, Thanos'un Sonsuzluk Eldiveni'ni ele geçirmesi ve kendi dengesini kurması yüzünden yok olmuştur ve dünya umutsuz haldedir. Dünya üzerinde kalan Black Widow, Kaptan Amerika, Thor ve Hulk kendi yaslarını tutmaktayken, Iron ve Nebula ise kontrol edemedikleri bir uzay gemisinin içinde, uzay boşluğunda sürüklenmektedirler. Süper kahramanlar takımı için işler pek de iyi görünmemektedir. Ancak Kuantum Bölgesi'nden çıkmanın bir yolunu bularak Avengers ekibinin kalan üyelerine giden Ant-Man, yeni bir umut ışığı olacaktır. Daha önce var olduğunu bilmedikleri bölgeler, kahramanlar ve evrenlerin varlığını öğrenen ekip, Thanos'un kurduğu bu çarpık dengeyi değiştirmek ve kendilerinden alınanı geri getirmek için hayatlarının en büyük mücadelesine girişeceklerdir. Hepsi kişisel olarak önem verdikleri şeyleri kaybetmiş olan kahramanlarımız için intikam vakti gelmiştir","Studio..","8.4","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/18/12/07/15//19551321_hd_013.mp4"));


        return lstMovies;

    }
    public static List<Movie>getYerliMovies(){

        List<Movie> lstMovies = new ArrayList<>();

        lstMovies.add(new Movie("7.Koğuştaki Mucize",R.drawable.yerli7kogustakimucize,R.drawable.yerli7kogustakimucize,"7. Koğuştaki Mucize, 7 yaşındaki kızı ile aynı zeka yaşına sahip bir babanın adalet arayışını konu ediyor. 1983 yılında bir Ege kasabasında küçük bir kız ölür. Ölen küçük kız sıkıyönetim komutanının kızıdır ve onun ölümünün sorumlusu olarak babaannesi ile yaşayan ve 7 yaşında bir kızı olan Memo görülür. Memo, her ne kadar suçsuz olduğunu anlatsa da kimse ona inanmaz. İdam cezasına çarptırılan Memo'nun yakınları adaletin sağlanması için uğraşırken, Memo ve kızı Ova'nın tek istediği birbirlerine kavuşabilmektir. Memo, bir mucize gerçekleşip idam cezasından kurtulabilecek midir? Yönetmenliğini Mehmet Ada Öztekin'in üstlendiği filmin oyuncu kadrosunda Aras Bulut İynemli, Nisa Sofiya Aksongur, Celile Toyon, İlker Aksum, Mesut Akusta, Deniz Baysal, Yurdaer Okur gibi isimler yer alıyor.","Studio..","8.3","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/09/06/16//19553737_hd_013.mp4"));

        lstMovies.add(new Movie("Bayi Toplantısı",R.drawable.yerlibayitoplantisi,R.drawable.yerlibayitoplantisi,"Bayi Toplantısı, mecburen katıldıkları bayi toplantısında kendilerini birbirinden eğlenceli maceraların içinde bulan üç beyaz eşya satıcısının hikayesini konu ediyor. Namık, Adem ve Sadık, geçimlerini efnaflık yaparak sağlayan üç adamdır. Birbirlerini tanımayan bu üç adamın yolu katıldıkları bayi toplantısında kesişir. Hayatlarının zor bir döneminden geçen Namık, Adem ve Sadık, başlarına gelen olaylar sonrasında kendilerini macera dolu bir planın içinde bulur. Bayilerini kurtarmaya çalışan ekibin bu süreçte birbirine güvenmekten ve hızlı etmekten başka çaresi yoktur.","Studio..","4.6","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/30/15//19554191_hd_013.mp4"));

        lstMovies.add(new Movie("Eltilerin Savaşı",R.drawable.yerlieltilerinsavasi,R.drawable.yerlieltilerinsavasi,"Eltilerin Savaşı, iki elti olan Sultan ve Gizem arasında yaşanan tatlı çekişmelere, bitmek bilmeyen rekabete odaklanıyor. Gizem ve Sultan elti olan iki genç kadındır. İkili arasında yaşanan ufak atışmalar bir süre sonra yerini tatlı bir rekabete bırakır. Birbirlerinin yaptıklarından geri kalmayan eltiler, kendilerini eğlenceli bir savaşın içinde bulur. Kardeş olan Selim ve Fatih de bir süre sonra eşleri arasında yaşanan bu rekabet rüzgarına kapılır. Sosyal medyaya düşkünlükleri ile bilinen Gizem ve Sultan’ın evlilik hayatlarına odaklanılan filmde, iki eltinin yarış içindeyken Selim ve Fatih’i nasıl etkiledikleri de gözler önüne seriliyor. Yönetmen koltuğunda Onur Bilgetay'ın oturduğu filmin senaryosunu, başrolde de yer alan Gupse Özay kaleme alıyor. Filmin kadrosunda Özay'a, Merve Dizdar, Ferit Aktuğ ve Uraz Kaygılaroğlu eşlik ediyor.","Studio..","5.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/01/02/07//19554747_hd_013.mp4"));

        lstMovies.add(new Movie("Gamonya:Hayaller Ülkesi",R.drawable.yerligamonyahayallerulkesi,R.drawable.yerligamonyahayallerulkesi,"Gamonya: Hayaller Ülkesi, bilmediği bir dünyada zorlu bir mücadeleye girişen küçük bir çocuğun hikayesini konu ediyor. Mutsuz bir çocuk olan Umut, dedesi Ahmet ile birlikte yaşamaktadır. Dedesinin yaşadığı bir kaza, hayal kurmayı unutmuş bir çocuk olan Umut'un bilmediği bir dünya ile tanışmasına neden olur. Kaza sonucu fantastik bir dünya olan Gamonya'da yaşayan insanlarla tanışan Umut, burasının umutsuz çocuklara hayal ürettiğini öğrenir. Gamonya'da yaşayan insanların kendisinden yardım istemesi üzerine, kendisini sihirli bir maceranın ortasında bulan Umut, bu süreçte yeniden hayal kurmayı öğrenebilecek midir?","Studio..","5.2","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/12/19/15//19554646_hd_013.mp4"));

        lstMovies.add(new Movie("Sıfır Bir",R.drawable.yerlisifirbir,R.drawable.yerlisifirbir,"Sıfır Bir, Adana'daki suç dolu hayatlarını arkalarında bırakarak İzmir'e yerleşen Savaş, Cihat ve Azad'ın hikayesini konu ediyor. Adanalı çete lideri Savaş, Cihat ve Azad ile birlikte şiddet dolu geçmişlerini arkalarında bırakmaya karar verir. Üç arkadaş hayatlarında yeni bir başlangıç yapmak için Adana’dan ayrılıp, İzmir’e yerleşir. Burada kendilerine silahlardan uzak yeni bir hayat kuran üç arkadaş, bir oto yıkamacı açar. Ancak onlar geçmişlerinden ne kadar uzak kalmak isteseler de kendilerini yeniden savaşın ortasında bulur. Melek adındaki küçük bir kız çocuğu, başına gelen onca kötü şeyin ardından Savaş ve arkadaşlarının yanına sığınınca ekip harekete geçer. Melek’e taciz eden ve annesinin organlarını alıp onu ölüme mahkum eden adamların peşine düşen Savaş, Cihat ve Azad, kendilerini dönüşü olmayan bir yolun içinde bulur.","Studio..","6.9","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/12/19/15//19554646_hd_013.mp4"));

        lstMovies.add(new Movie("Recep İvedik 6",R.drawable.recepivedik,R.drawable.recepivedik,"Recep İvedik 6, Konya ya giderken kendisini Kenya da bulan Recep İvedik in maceralarını konu ediyor. Recep İvedik in hayatı kendisine gelen bir davet ile bambaşka bir hal alır. Davet ile Recep İvedik, kuru fasulye festivaline çağırılmaktadır. Daveti memnuniyetle karşılayan Recep, arkadaşı Nurullah ı da yanına alarak Konya ya doğru yola koyulur. Daha yolculuğa başlar başlamaz türlü talihsizlikler yaşayan ikili, yolculuğun sonunda kendilerini Konya yerine Kenya da bulur. Seyahat acentesinin hatası sonucu Kenya ya gelen Recep ve Nurullah, Türkiye ye geri dönmenin yolunu arar.Bilmedikleri bir coğrafyada bulunan Recep ile Nurullah, kendilerini birden iki düşman yerli kabilenin arasında bulur. Kendisine has yöntemlerle içinde bulunduğu vahşi dünyada ayakta kalmaya çalışan Recep in başına bu süreçte birbirinden ilginç olaylar gelir.","Studio..","8","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/30/15//19554191_hd_013.mp4"));

        lstMovies.add(new Movie("Mucize 2 Aşk",R.drawable.mucize2,R.drawable.mucize2,"Engelli bir adam olan Aziz ile görücü usulü evlendiği karısı Mızgin, köyde yaşadıkları sorunlardan iyice bıkar.Kendilerine yeni bir hayat kurmak isteyen çift, Batı da bir kasabaya gider. Ancak gittikleri kasabada da türlü sorunlarla karşılaşırlar.Çift, ne olursa olsun insanların önyargılarını aşıp, hayatta tutunmak için çabalar. Mızgin e aşık olan Aziz, karısı için engellerinden kurtulmaya karar verir bu uğurda zorlu bir mücadeleye girişir. Aziz, Mahir öğretmen ve sinemacı Bahattin in de desteği ile eşi için birçok  mucizeyi gerçekleştirir. 2014 yapımı \"Mucize\" filminin devam halkası olan yapımın yönetmenliğini ve senaristliğini bir kez daha Mahsun Kırmızıgül üstleniyor.","Studio..","8.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/10/22/16//19551341_hd_013.mp4"));

        lstMovies.add(new Movie("Güzel Günler Göreceğiz",R.drawable.guzelgunler,R.drawable.guzelgunler,"Hasan Tolga Pulat ın yönettiği paralel hikayeler draması Güzel Günler Göreceğiz, bir gün içinde ve İstanbul’da geçiyor. Hikaye, beş farklı karakterin - Cumali, Ali, Figen, İzzet ve Anna- kesişen yollarını anlatıyor ama hiç kimse bir diğerininfarkında değil, dolayısıyla da birbirlerinin hayatlarına müdahaleleri yok. Günün sonunda ise  aslında insanların müdahale ettiği hayat ortaya çıkıyor. Filmin oyuncu kadrosunda Uğur Polat, Buğra Gülsoy, Nesrin Cevadzade, Feride Çetin ve Barış Atay Mengüllü isimleri öne çıkıyor...48. Antalya Altın Portakal Film Festivali'nde yarışan yapım En İyi Film, En İyi Senaryo, En İyi Kurgu ve En İyi Yardımcı Kadın Oyuncu ödüllerine layık görülmüştü.","Studio..","5.4","https://tr.vid.web.acsta.net/uk/medias//nmedia/s3/90/18/85/12/74/19304257_sd_013.mp4"));



        return lstMovies;

    }
    public static List<Movie>getAileMovies(){

        List<Movie> lstMovies = new ArrayList<>();

        lstMovies.add(new Movie("Ejderhanı Nasıl Eğitirsin",R.drawable.aileejderhaninasil,R.drawable.aileejderhaninasil,"Berk Adası'nda ejderha ve vikinglerin birleşmesinin üstünden beş yıl geçmiştir ve adada tam bir barış ve huzur atmosferi hakimdir. Astrid ve ekibi artık boş zamanlarını adanın yeni gözde oyunu olan ejderha yarışlarıyla geçirmekte ve kahramanlar yeni keşif gezilerine adım atmaktadırlar. Bu yolculuklardan birinde çok eski zamanlardan kalma buzdan gizli bir buzdan mağara keşfederler ve mağaranın içinde yaşayan yüzlerce vahşi ejderhayı böylece uyandırmış olurlar. Gizemli Dragon Rider'ın da büyük bir tehlike yarattığı bir savaş başladığında, iki kahramanımız Hiccup ve Toothless'a düşen barışı koruyup inandıkları şeyi savunmaları olur. 2010 yılında izleyiciyle buluşan 'Ejderhanı Nasıl Eğitirsin' filminin devam filmi olan yapıtta Hiccup ve ejderhasının macera dolu öyküsü, yeni karakterlerle kaldığı yerden devam edecek. Filmin yönetmenliğini ilk filmde olduğu gibi yine Dean DeBlois üstlenirken, Cressida Cowell'in romanından uyarlayan da yine yönetmenin kendisi.","Studio..","8.3","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/13/09/12/09/19534289_hd_013.mp4"));

        lstMovies.add(new Movie("İnanılmaz Aile",R.drawable.aileinanilmazaile,R.drawable.aileinanilmazaile,"Animasyon kahramanı Mr Incredible adı altında dünyada var olan kötülüklerle mücadele eden ve insanları kötücül şeylerden korumaya çalışan Bob Parr, dünyaca meşhurdur. Bir süre sonra hayatının bu denli yorucu olmasından yana şikayetçi olup emekliye ayrılmak ister. Eşi ve çocukları ile beraber daha sakin ve sıradan bir yaşam düzenine geçer. Çok geçmeden bu düzenden de sıkılır çünkü sigortacılık gibi bir iş onu pek kesmemektedir. Evren niyet ve isteklerini duyar ve ona bir mesaj iletilir. Bir adada artık gizli bir görevin sahibidir.","Studio..","4.6","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/13/06/27/21/19533889_sd_013.mp4"));

        lstMovies.add(new Movie("Ratatuy",R.drawable.aileratatuy,R.drawable.aileratatuy,"Şişman fare Remy, yemeğe olan düşkünlüğü nedeniyle tek bir hayale sahiptir: Aşçı olabilmek! Bu idealini gerçekleştirmek için Paris'in yolunu tutan sevimli fare kaza eseri kendisini şehrin en iyi restoranının kanalizasyonunda bulur. Restoranın yeni çöpçüsüyle ilginç bir anlaşma yapan Remy, tüm hünerlerini sergileyebileceği büyülü mutfağa ulaşmaştır. Ancak bu tek hayalini gerçekleştirmek, farelerden iğrenen bir insanlığın var olduğu bir dünyada pek kolay olmayacaktır. Walt Disney'den çıkan film, Kayıp Balık Nemo, Yukarı Bak, Oyuncak Hikayesi gibi animasyon türünün en yaratıcı örneklerinin üretildiği Pixar stüdyolarının ürünü. Yönetmenlik ve senaryo yazımını Brad Bird ve Jan Pinkava ikilisinin üstlendiği Ratatuy, gösterime girdiği yıl Akademi Ödülleri'nde 'En İyi Animasyon Film' Oscar'ını kazanmıştı.","Studio..","5.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/s3/90/18/62/93/86/18637505_sd_013.mp4"));

        lstMovies.add(new Movie("Sevimli Canavarlar 3D",R.drawable.ailesevimlicanavarlar,R.drawable.ailesevimlicanavarlar,"'Sevimli Canavarlar', Canavarlar Dünyası isimli kendilerine ait bir dünyada yaşayan ve yaşayabilmek için insanlara ihtiyaç duyan ilginç ve sevimli canavarların dünyasının insanlarla karıştığı an ortaya çıkan trajikomik hikayeyi anlatır. Bu dünyada canavarlar yaşayabilmek için insanlara muhtaçtır çünkü insanları korkuttukları an duydukları çığlık onlar için enerji kaynağı gibidir. Bu ilginç dünyaya yanlışıkla küçük bir kız çocuğunun yolu düşünce işler çığrından çıkar. Çünkü insanlar bu tuhaf yaratıklara ters etki yapmaktadır ve dehşete kapılan canavarlar salgın bir hastalığın yayılacağını düşünüyorlardır. Bu küçük kız zannettikleri gibi onların yaşamını tehdit ediyor mudur? Toy Story', 'Up' ve 'Wall-E' gibi animasyon tarihinin en yaratıcı filmlerini üreten Pixar Stüdyoları bu filmlerden aşağı kalır yanı olmayan bir yapıta daha imza atıyor..","Studio..","5.2","https://tr.vid.web.acsta.net/uk/medias//nmedia/s3/90/18/80/17/94/19469751_sd_013.mp4"));

        lstMovies.add(new Movie("Kız Arkadaşım",R.drawable.ailekizarkadasim,R.drawable.ailekizarkadasim,"Vada, zamanının çoğunu en iyi erkek arkadaşıyla geçiren ve hastalıklardan korkan bir kızdır. Onbir yaşındaki Vada’nın hayatı, babasının yeniden evlenmeye karar vermesiyle bir anda kararır. En büyük yıkımı ise en yakın arkadaşını kaybettiğinde yaşayacaktır. Macaulay Culkin’in en meşhur olduğu zamanlarda çekilmiş olan bu romantik film, gençlerin gözdesi olmuştu.\n","Studio..","6.9","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/13/06/26/09/19533812_sd_013.mp4"));

        return lstMovies;

    }
    public static List<Movie>getDramaMovies(){

        List<Movie> lstMovies = new ArrayList<>();

        lstMovies.add(new Movie("365 DNİ",R.drawable.drama365dni,R.drawable.drama365dni,"Sicilya Mafya ailesinin bir üyesi olan genç ve yakışıklı Massimo Torricelli, babasının öldürülmesinin üzerine onun yerine geçer. Genç bir kadın olan Laura ise, Verşova’da lüks bir otelde satış direktörü olarak çalışır. Kariyer hayatında oldukça başarılı olan Laura’nın özel hayatında işler pek de yolunda gitmez. Erkek arkadaşı Martin ile ilişkisine son bir şans veren Laura, sevgilisi ve birkaç arkadaşı ile birlikte Sicilya’ya gider. Bu gezi Laura’nın hayatının değişmesine neden olur. Sicilya’da yolu Massimo ile kesişen Laura, adanın en tehlikeli adamı tarafından kaçırılır. Massimo, Laura’nın kendisine aşık olması için ona 365 gün süre verir.","Studio..","3.3","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/06/09/09//19556095_hd_013.mp4"));

        lstMovies.add(new Movie("Acı Kiraz",R.drawable.dramaacikiraz,R.drawable.dramaacikiraz,"Acı Kiraz, bir kiraz ağacının gölgesinde hayata tutunmaya çalışan insanların hikayesini konu ediyor. Film, hayallerini gerçekleştirmek için çıktıkları yolda ihanete uğrayan göçmenleri, lösemi hastası olan evladını kurtarmak için her şeyi yapmaya hazır olan bir babayı, borç içinde yüzen sahtekar bir nakliyeciyi, kiraz yetiştiricisi olan bir çiftçiyi, çok kültürlü, çok kimlikli Makedonya’yı ulus olarak etrafında toplayan kirazın hikayesini anlatıyor.","Studio..","5.4","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/02/03/09//19555022_hd_013.mp4"));

        lstMovies.add(new Movie("Dangerous Lies",R.drawable.dramadangerouslies,R.drawable.dramadangerouslies,"Dangerous Lies, bakımını üstlendiği zengin adamın ölümünün ardından tüm mirasını kendisine bıraktığını öğrenen genç bir kadının hikayesini konu ediyor. Genç bir kadın, zengin bir adamın bakıcılığını yapmaktadır. Adamın ölümü, kadın dahil geride bıraktıklarına büyük bir şok etkisi yapar. Adam, tüm mirasını zor durumda olan bakıcısına bırakmıştır. Büyük bir servetin yeni sahibi olan kadın, adamın mirasını neden kendisine bıraktığına anlam veremez. Çok geçmeden kadın, servet ile birlikte karanlık sırlara da sahip olur. Kendisini bir anda bir aldatmaca ve tehlike yumağının içinde bulan kadın, hayatta kalmak için her şeyi sorgulamaya başlar.","Studio..","5.7","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/04/14/08//19555747_hd_013.mp4"));

        lstMovies.add(new Movie("Gece Nöbeti",R.drawable.dramagecenobeti,R.drawable.dramagecenobeti,"Gece Nöbeti, oldukça zeki ve otistik olan Bart Bromley (Tye Sheridan) adında bir otel görevlisine odaklanıyor. Bart, sosyal becerilerini geliştirmek için misafirleri güvenlik kameralarıyla kaydetmektedir. Bart'ın vardiyası sırasında otelde bir kadın öldürülür ve baş şüpheli otel görevlisi olur. Bart, ne kadar masumiyetini kanıtlamak istese de, polise güvenlik kameralarından bahsedemez. Polis soruşturması derinleşirken, güzel bir misafirle (Ana de Armas) özel bir bağ kurar. Bart, kadın bir sonraki kurban olmadan önce gerçek katili durdurmalıdır.","Studio..","5.2","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/01/16/10//19554849_hd_013.mp4"));

        lstMovies.add(new Movie("Lost Girls",R.drawable.dramalostgirls,R.drawable.dramalostgirls,"Lost Girls, kayıp kızını bulmaya çalışan bir kadının hikayesini konu ediyor. Mari Gilbert, kızı kaybolduğunda adeta deliye döner. Kızının bulunması için her şeyi yapmaya hazır olan kadın, bu süreçte polislerin olaya karşı tepkisiz kaldığını fark eder. Bunun üzerine kızını kendi aramaya başlayan Mari, araştırmalarını ilerlettikçe kızının davasının Long Island'daki çözülmemiş fahişe cinayetleri ile ilgili olduğu keşfeder.","Studio..","8","http://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/03/11/11//19555403_hd_013.mp4"));

        lstMovies.add(new Movie("Mendilim Kekik Kokuyor",R.drawable.dramamendilimkekikkokuyor,R.drawable.dramamendilimkekikkokuyor,"Anadolu'da bir kasabada yaşayan Hasan ile amcasının oğlu Yusuf, Elif adında bir kadına aşık olur. Elif'in gönlü de iki adamdan birine düşer ama bunun kim olduğunu kimseye belli etmez. Tam da bu sırada eli silah tutan tüm erkekler Çanakkale Cephesi'ne çağırılır. Cepheye gitmeden önce Elif'e açılmak isteyen Yusuf, genç kadına Hasan'ın başkasını sevdiğini belirterek ilanı aşk eder ve Elif'in Hasan için işlediği kekik kokulu mendili gizlice alır. Cepheye doğru yola koyulan Yusuf, Hasan ve diğer gönüllüler, İstanbullu Eftal ile birlikte keşfe çıkan Karagöz Oynatıcısı Rüstem Çavuş ile karşılaşır. Bu sırada Anzak'ta meydana gelen saldırı sonucu gönüllülerden bir kısmı ölürken Hasan, Yusuf, Çopur, Rüstem Çavuş ve İstanbullu Eftal esir kampına götürülür.","Studio..","3.3","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/20/02/21/14//19555196_hd_013.mp4"));

        lstMovies.add(new Movie("Vahsetin Çağrısı",R.drawable.dramavahsetincagrisi,R.drawable.dramavahsetincagrisi,"Vahştin Çağrısı, bir kızak köpeğinin, Alaska'da vahşi yaşamda hayatta kalmak için verdiği mücadele konu ediliyor. Bir kızak köpeği olan Buck, Kaliforniya'daki hayatından koparılarak kızak çekmesi için Alaska'ya götürülür. Bir anda mutlu yuvasından ayrılıp hayatı tepetaklak olan Buck, Alaska'nın zorlu yaşamına uyum sağlamaya çalışır. Posta dağıtım işinin çaylağı olan Buck, gün geçtike bu dünyaya alışır. Onun bu vahşi hayata alışma sürecinde yaşadıkları, Buck'un kendisini keşfetmesini sağlayacaktır.","Studio..","6.8","https://tr.vid.web.acsta.net/uk/medias//nmedia/90/19/11/20/15//19554384_hd_013.mp4"));

        return lstMovies;

    }




}