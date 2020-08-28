package com.blogapp.aws.movieuitemplate.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.adapters.MovieAdapter;
import com.blogapp.aws.movieuitemplate.adapters.MovieItemClickListener;
import com.blogapp.aws.movieuitemplate.adapters.SliderPagerAdapter;
import com.blogapp.aws.movieuitemplate.models.Movie;
import com.blogapp.aws.movieuitemplate.models.Slide;
import com.blogapp.aws.movieuitemplate.utils.DataSource;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity implements MovieItemClickListener {

   
    private List<Slide> lstSlides ;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView MoviesRV,moviesRvWeek,moviesRvAction,moviesRVYerli,moviesRvaile,moviesRvdrama;
    private ImageButton actionbutton,yerlibutton,dramabutton,ailebutton;







    public HomeActivity() {

    }




    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        iniViews();
        iniSlider();
        iniPopular();
        iniWeekMovies();
        iniActionMovies();
        iniYerliMovies();
        iniAileMovies();
        iniDramaMovies();
        iniButonlar();








    }







    private void iniButonlar() {
        yerlibutton=findViewById(R.id.button_category_yerli);
        actionbutton=findViewById(R.id.button_category_action);
        ailebutton=findViewById(R.id.button_category_aile);
        dramabutton=findViewById(R.id.button_category_drama);


        actionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(getApplicationContext(),ActionActivity.class);

            startActivity(i);           }
        });

        yerlibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),YerliActivity.class);
                startActivity(intent);
            }
        });

        ailebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentaile=new Intent(getApplicationContext(),AileActivity.class);
                startActivity(intentaile);
            }
        });

        dramabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdrama=new Intent(getApplicationContext(),DramaActivity.class);
                startActivity(intentdrama);
            }
        });



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
    private void iniDramaMovies() {
        MovieAdapter dramaMovieAdapter=new MovieAdapter(this, DataSource.getDramaMovies(),this);
        moviesRvdrama.setAdapter(dramaMovieAdapter);
        moviesRvdrama.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniAileMovies() {
        MovieAdapter aileMovieAdapter=new MovieAdapter(this, DataSource.getAileMovies(),this);
        moviesRvaile.setAdapter(aileMovieAdapter);
        moviesRvaile.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }


    private void iniYerliMovies() {
        MovieAdapter yerliMovieAdapter=new MovieAdapter(this, DataSource.getYerliMovies(),this);
        moviesRVYerli.setAdapter(yerliMovieAdapter);
        moviesRVYerli.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniActionMovies() {
        MovieAdapter actionMovieAdapter =new MovieAdapter(this,DataSource.getActionMovies(),this);
        moviesRvAction.setAdapter(actionMovieAdapter);
        moviesRvAction.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniWeekMovies() {
        MovieAdapter weekMovieAdapter=new MovieAdapter(this,DataSource.getWeekMovies(),this);
        moviesRvWeek.setAdapter(weekMovieAdapter);
        moviesRvWeek.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

    }

    private void iniPopular() {
        // Recyclerview Setup
        // ini data
        MovieAdapter movieAdapter = new MovieAdapter(this, DataSource.getPopularMovies(),this);
        MoviesRV.setAdapter(movieAdapter);
        MoviesRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void iniSlider() {
        // prepare a list of slides ..
        lstSlides = new ArrayList<>() ;
        lstSlides.add(new Slide(R.drawable.drama365dni,"365 DNİ \n"));
        lstSlides.add(new Slide(R.drawable.actionendgame,"Avengers:End Game\n"));
        lstSlides.add(new Slide(R.drawable.yerlisifirbir,"Sıfır Bir \n"));
        lstSlides.add(new Slide(R.drawable.aileratatuy,"Ratatuy \n"));
        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstSlides);
        sliderpager.setAdapter(adapter);
        // setup timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(),4000,6000);
        indicator.setupWithViewPager(sliderpager,true);
    }

    private void iniViews() {
        sliderpager = findViewById(R.id.slider_pager) ;
        indicator = findViewById(R.id.indicator);
        MoviesRV = findViewById(R.id.Rv_movies);
        moviesRvWeek=findViewById(R.id.rv_movies_week);
        moviesRvAction=findViewById(R.id.Rv_action_movies);
        moviesRVYerli=findViewById(R.id.Rv_yerli_movies);
        moviesRvaile=findViewById(R.id.Rv_aile_movies);
        moviesRvdrama=findViewById(R.id.Rv_drama_movies);


    }









    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        // here we send movie information to detail activity
        // also we ll create the transition animation between the two activity

        Intent intent = new Intent(this,MovieDetailActivity.class);
        // send movie information to deatilActivity
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("imgURL",movie.getThumbnail());
        intent.putExtra("imgCover",movie.getCoverPhoto());
        intent.putExtra("describe",movie.getDescription());
        intent.putExtra("detailsRate",movie.getRating());
        intent.putExtra("StreamLink",movie.getStreamingLink());
           // lets crezte the animation
        ActivityOptions options = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this,
                                                        movieImageView,"sharedName");
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent,options.toBundle());
        }


        // i l make a simple test to see if the click works

        Toast.makeText(this,"İyi Seyirler : " + movie.getTitle(),Toast.LENGTH_LONG).show();
        // it works great


    }



    class SliderTimer extends TimerTask {


        @Override
        public void run() {

            HomeActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (sliderpager.getCurrentItem()<lstSlides.size()-1) {
                        sliderpager.setCurrentItem(sliderpager.getCurrentItem()+1);
                    }
                    else
                        sliderpager.setCurrentItem(0);
                }
            });


        }
    }





}
