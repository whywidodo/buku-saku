package labs.nusantara.bukusaku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by ASUS on 02/06/2016.
 */
public class HariActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);


        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);
    }

    public void c_share(View v) {
        String txt_share = "Dapatkan Aplikasi Buku Saku di : https://play.google.com/store/apps/details?id=labs.nusantara.bukusaku";
        String extra = "NusantaraLabs";
        Intent intentshare = new Intent("android.intent.action.SEND");
        intentshare.setType("text/plain");
        intentshare.putExtra("android.intent.extra.SUBJECT", extra);
        intentshare.putExtra("android.intent.extra.TEXT", txt_share);
        startActivity(Intent.createChooser(intentshare,
                "Bagikan Aplikasi Melalui"));
    }
}
