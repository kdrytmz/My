package com.blogapp.aws.movieuitemplate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.adapters.CastAdapter;
import com.blogapp.aws.movieuitemplate.models.Cast;
import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView MovieThumbnailImg,MovieCoverImg;
    private TextView tv_title,tv_description,tv_rating,MovieURL;
    private FloatingActionButton play_fab;
    private RecyclerView RvCast;
    private CastAdapter castAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        // ini views
        iniViews();
        //setup cast list
        setupRVCastPopular();




    }




    void iniViews() {
        RvCast=findViewById(R.id.rv_cast);

        play_fab = findViewById(R.id.play_fab);
        String movieTitle = getIntent().getExtras().getString("title");
        String describe=getIntent().getExtras().getString("describe");
        String ratinge=getIntent().getExtras().getString("detailsRate");
        String streamLink=getIntent().getExtras().getString("StreamLink");
        int imageResourceId = getIntent().getExtras().getInt("imgURL");
        int imagecover = getIntent().getExtras().getInt("imgCover");

        MovieThumbnailImg = findViewById(R.id.detail_movie_img);
        Glide.with(this).load(imageResourceId).into(MovieThumbnailImg);
        MovieThumbnailImg.setImageResource(imageResourceId);
        MovieCoverImg = findViewById(R.id.detail_movie_cover);
        Glide.with(this).load(imagecover).into(MovieCoverImg);

        tv_title = findViewById(R.id.detail_movie_title);
        tv_title.setText(movieTitle);
        getSupportActionBar().setTitle(movieTitle);

        tv_description = findViewById(R.id.detail_movie_desc);
        tv_description.setText(describe);


        tv_rating=findViewById(R.id.detail_movie_rating);
        tv_rating.setText(ratinge);








        play_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),MoviePlayerActivity.class);
                intent.putExtra("StreamLink",streamLink);
                startActivity(intent);


            }
        });

        // setup animation
        MovieCoverImg.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
        play_fab.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));





    }

    void setupRVCastPopular(){


        int imagecover = getIntent().getExtras().getInt("imgCover");

          List<Cast> mdata = new ArrayList<>();


            //CAST POPULAR MOVİES
            if (imagecover==R.drawable.naim){

            mdata.add(new Cast("Naim Haya Vaneck", R.drawable.naimhayatvaneck));
            mdata.add(new Cast("Gürkan Uygun", R.drawable.naimgurkanuygun));
            mdata.add(new Cast("Selen Öztürk", R.drawable.naimselenozturk));
            mdata.add(new Cast("Uğur Güneş", R.drawable.naimugurgunes));
            mdata.add(new Cast("Naim Yetkin Dikinciler", R.drawable.naimyetkindikinciler));

            }



            if (imagecover==R.drawable.shediestomorrow){

            mdata.add(new Cast("Olivia Taylor Dudley", R.drawable.shediesoliviataylordudley));
            mdata.add(new Cast("Jane Adams", R.drawable.shediesjaneadams));
            mdata.add(new Cast("Kate Lyn Sheil", R.drawable.shedieskatelynsheil));
            mdata.add(new Cast("Kentucker Audley", R.drawable.shedieskentuckeraudley));
            mdata.add(new Cast("Tunde Adembimpe", R.drawable.shediestundeadembimpe));
        }






            //CAST ACTİON CAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİONCAST ACTİON
              if (imagecover==R.drawable.kin){

            mdata.add(new Cast("Zoe kravitz", R.drawable.kinzoekravitz));
            mdata.add(new Cast("Carri Coon", R.drawable.kincarriecoon));
            mdata.add(new Cast("Jack Reynor", R.drawable.kinjackreynor));
            mdata.add(new Cast("Dennis Quaid", R.drawable.kindennisquaid));
            mdata.add(new Cast("Hames Franco", R.drawable.kinhamesfranco));



        }
              if (imagecover==R.drawable.action_adaletsiz){

            mdata.add(new Cast("Olivia Taylor Dudley", R.drawable.adaletsizlaurieholden));
            mdata.add(new Cast("Jane Adams", R.drawable.adaletsizjennifercarpenter));
            mdata.add(new Cast("Kate Lyn Sheil", R.drawable.adaletsizdonjohnson));
            mdata.add(new Cast("Kentucker Audley", R.drawable.adaletsizmelgibson));
            mdata.add(new Cast("Tunde Adembimpe", R.drawable.adaletsizmichaelhaiwhite));
        }
              if (imagecover==R.drawable.actionendgame){

            mdata.add(new Cast("Brie Larson", R.drawable.avengersbrielarson));
            mdata.add(new Cast("Schri Evans", R.drawable.avengerschrisevans));
            mdata.add(new Cast("Mark Ruffalo", R.drawable.avengersmark));
            mdata.add(new Cast("Robert Downey", R.drawable.avengersrobertdowney));
            mdata.add(new Cast("Scarlet Johansson", R.drawable.avengersscarlettjohansson));
        }







        //CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ v CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ CAST YERLİ
        if (imagecover==R.drawable.yerli7kogustakimucize){

            mdata.add(new Cast("Aras Bulut İğnemli", R.drawable.yedincikogusarasbulutiynemli));
            mdata.add(new Cast("Deniz Baysal", R.drawable.yedincikogusdenizbaysal));
            mdata.add(new Cast("İlker Aksum", R.drawable.yedincikogusilkeraksum));
            mdata.add(new Cast("Nisa Sofia Aksongur", R.drawable.yedincikogusnisasofiyaaksongur));
            mdata.add(new Cast("Sarp Akkaya", R.drawable.yedincikogussarpakkaya));
        }

        if (imagecover==R.drawable.yerlibayitoplantisi){

            mdata.add(new Cast("Büşra Pekin", R.drawable.bayibusrapekin));
            mdata.add(new Cast("İbrahim Büyükak", R.drawable.bayiibrahimbuyukak));
            mdata.add(new Cast("Onur Buldu", R.drawable.bayionurbuldu));
            mdata.add(new Cast("Safa Sarı", R.drawable.bayisafasari));
            mdata.add(new Cast("Doğu Demirkol", R.drawable.bayidogudeirkol));
        }

        if (imagecover==R.drawable.yerlieltilerinsavasi){

            mdata.add(new Cast("Gupse Özay", R.drawable.eltigupseozay));
            mdata.add(new Cast("Merve Dizdar", R.drawable.eltimervedizdar));
            mdata.add(new Cast("Ali İpin", R.drawable.eltialiipin));
            mdata.add(new Cast("Füsun Demirel", R.drawable.eltifusundemirel));
            mdata.add(new Cast("Uraz Kaygılaroğlu", R.drawable.eltiurazkaygilaroglu));
        }

        if (imagecover==R.drawable.yerligamonyahayallerulkesi){

            mdata.add(new Cast("Berat Efe Parlar", R.drawable.gamonyaberatefeparlar));
            mdata.add(new Cast("Burcu Altın", R.drawable.gamonyaburcualtin));
            mdata.add(new Cast("Eda Döğer", R.drawable.gamonyaedadoger));
            mdata.add(new Cast("Zeynep Ilgın Çelik", R.drawable.gamonyazeynepilgincelik));
            mdata.add(new Cast("Doğa Dalgıç", R.drawable.gamonyadoradalgic));
        }

        if (imagecover==R.drawable.yerlisifirbir){

            mdata.add(new Cast("Burak Akyüz", R.drawable.sifirbirburakakyuz));
            mdata.add(new Cast("Savaş Satış", R.drawable.sifirbirsavassatis));
            mdata.add(new Cast("CengizHan Yurdutek", R.drawable.sifirbircengizhanyurdutek));
            mdata.add(new Cast("Mehmet Elmas", R.drawable.sifirbirmehmetelmas));
            mdata.add(new Cast("Onur Akbay", R.drawable.sifirbironurakbay));
        }

        if (imagecover==R.drawable.recepivedik){

            mdata.add(new Cast("Şahan Gökbahar", R.drawable.recepivediksahangokbahar));
            mdata.add(new Cast("Nurullah Çelebi", R.drawable.recepivediknurullahcelebi));
            mdata.add(new Cast("Furkan Bayraktar", R.drawable.recepivedikfurkanbayraktar));
            mdata.add(new Cast("Somer Karvan", R.drawable.recepivediksomerkarvan));

        }

        if (imagecover==R.drawable.mucize2){

            mdata.add(new Cast("Biran Damla Yılmaz", R.drawable.mucizebiran));
            mdata.add(new Cast("Ayda Aksel", R.drawable.mucizeaydaaksel));
            mdata.add(new Cast("Ayda Gürler", R.drawable.mucizesenaygurler));
            mdata.add(new Cast("Fikret kuskan", R.drawable.mucizefikretkuskan));
            mdata.add(new Cast("Mert Turak", R.drawable.mucizemertturak));
        }

        if (imagecover==R.drawable.guzelgunler){

            mdata.add(new Cast("Bedia Ener", R.drawable.guzelgunlernesrincevadzade));
            mdata.add(new Cast("Buğra Gülsoy", R.drawable.guzelgunlerbugragulsoy));
            mdata.add(new Cast("Feride Çetin", R.drawable.guzelgunlerferidecetin));
            mdata.add(new Cast("Nesrin Cevadzade", R.drawable.guzelgunlerbediaener));
            mdata.add(new Cast("Barış Atay Mengüllü", R.drawable.guzelgunlerbar));

        }

        // CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE CASTAİLE


        // CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA CASTDRAMA

        if (imagecover==R.drawable.drama365dni){
            mdata.add(new Cast("Anna-Maria Sieklucka", R.drawable.ucyuzannamariasieklucka));
            mdata.add(new Cast("Bronislaw Wroclawski", R.drawable.ucyuzbronislawwroclawski));
            mdata.add(new Cast("Grazyna Szapolowska", R.drawable.ucyuzgrazynaszapolowska));
            mdata.add(new Cast("Michelle Morrone", R.drawable.ucyuzmichellemorrone));


        }
        if (imagecover==R.drawable.dramaacikiraz){
            mdata.add(new Cast("Belçim Bilgin", R.drawable.acikirazbelcimbilgin));
            mdata.add(new Cast("Bülent Şakrak", R.drawable.acikirazbulentsakrak));
            mdata.add(new Cast("Erdal Beşikci", R.drawable.acikirazerdalbesikci));
            mdata.add(new Cast("Ertan Saban", R.drawable.acikirazertansaban));
            mdata.add(new Cast("Halil Ergün", R.drawable.acikirazhalilergun));
        }
        if (imagecover==R.drawable.dramadangerouslies){
            mdata.add(new Cast("Camila Mendes", R.drawable.dangerousliescailamendes));
            mdata.add(new Cast("Sasha Alexander", R.drawable.dangerousliessashaalexander));
            mdata.add(new Cast("Cam Gigandet", R.drawable.dangerousliescamgigandet));
            mdata.add(new Cast("Jamie Chung", R.drawable.dangerousliesjamiechung));
            mdata.add(new Cast("Jessie T. Usher", R.drawable.dangerousliesjessieusher));

        }
        if (imagecover==R.drawable.dramagecenobeti){

            mdata.add(new Cast("Ana de Armas", R.drawable.gecenobetianadearmas));
            mdata.add(new Cast("Helen Hunt", R.drawable.gecenobetihelenhunt));
            mdata.add(new Cast("John Leguizamo", R.drawable.gecenobetijohnleguizamo));
            mdata.add(new Cast("Pam Eichner", R.drawable.gecenobetipameichner));
            mdata.add(new Cast("Tye Sheridan", R.drawable.gecenobetityesheridan));
        }
        if (imagecover==R.drawable.dramalostgirls){

            mdata.add(new Cast("Amy Ryan", R.drawable.lostgirlsamyryan));
            mdata.add(new Cast("Gabriel Bryne", R.drawable.lostgirlsgabrielbyrne));
            mdata.add(new Cast("Lola Kirke", R.drawable.lostgirlslolakirke));
            mdata.add(new Cast("Reed Birney", R.drawable.lostgirlsreedbirney));
            mdata.add(new Cast("Thomasin McKenzie", R.drawable.lostgirlsthomasinmckenzie));
        }

        if (imagecover==R.drawable.dramamendilimkekikkokuyor){

            mdata.add(new Cast("Devrim Yakut", R.drawable.mendilimdevrimyakut));
            mdata.add(new Cast("Hakan Devrim Göztepe", R.drawable.mendilimhakandevrimgoztepe));
            mdata.add(new Cast("Wilma Alles", R.drawable.mendilimwilmaalles));
            mdata.add(new Cast("Mehmet Çevik", R.drawable.mendilimmehmetcevik));
            mdata.add(new Cast("Çetin Büyükakın", R.drawable.mendilimcetin));

        }
        if (imagecover==R.drawable.dramavahsetincagrisi){

            mdata.add(new Cast("Cara Gee", R.drawable.vahsetinccaragee));
            mdata.add(new Cast("Jean Louisa Kelly", R.drawable.vahsetincjeanlouisakelly));
            mdata.add(new Cast("Karen Gillian", R.drawable.vahsetinckarengillian));
            mdata.add(new Cast("Harrison Ford", R.drawable.vahsetincharrisonford));
            mdata.add(new Cast("Omar Sy", R.drawable.vahsetincomarsy));
        }












        castAdapter=new CastAdapter(this,mdata);
        RvCast.setAdapter(castAdapter);
        RvCast.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }





}
