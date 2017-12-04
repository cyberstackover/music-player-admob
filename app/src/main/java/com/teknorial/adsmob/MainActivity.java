package com.teknorial.adsmob;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest; //Import class AdRequest
import com.google.android.gms.ads.AdView;    //import class Adview


public class MainActivity extends ActionBarActivity {

    public final static String AUDIO_URL = "audio_url";
    public final static String IMG_URL = "image_url";

    //ActionBarActivity sudah deprecated

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** open player  */
    public void openPlayer(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/ELSA_SAFIRA_SURAT_CINTA_UNTUK_STARLA_MONATA.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/Lwm5rmI_zBo/mqdefault.jpg");
        startActivity(intent);
    }

    /** open player2 */
    public void openPlayer2(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Anisa_Rahma_MIMPI_TERINDAH.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/yPaoZElNvds/hqdefault.jpg");
        startActivity(intent);
    }

    /** open player3 */
    public void openPlayer3(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Elsa_Safira_Indah_Pada_Waktunya.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/GRKsFJsnRVM/maxresdefault.jpg");
        startActivity(intent);
    }

    /** open player4  */
    public void openPlayer4(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Elsa_Safira_Polisi.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/Z64Ow8pY4CY/maxresdefault.jpg");
        startActivity(intent);
    }

    /** open player5  */
    public void openPlayer5(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/LALA_WIDI_LUNGSET.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/NWIqi3ZfFvw/hqdefault.jpg");
        startActivity(intent);
    }

    /** open player6  */
    public void openPlayer6(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Lely_Yuanita_Suket_Teki.mp3");
        intent.putExtra(IMG_URL, "http://i.ytimg.com/vi/nRsdv739Nds/hqdefault.jpg");
        startActivity(intent);
    }

    /** open player7  */
    public void openPlayer7(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/NIKEN_APRILIA_DIA.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/88Zxmkcp8FM/hqdefault.jpg");
        startActivity(intent);
    }

    /** open player8  */
    public void openPlayer8(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Ratna_Antika_GOYANG_WALANG_KEKE.mp3");
        intent.putExtra(IMG_URL, "http://img.youtube.com/vi/Jb4qhiRscV0/hqdefault.jpg");
        startActivity(intent);
    }

    /** open player9  */
    public void openPlayer9(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Ratna_Antika_Konco_Mesra.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/iZ8ertuWFGI/maxresdefault.jpg");
        startActivity(intent);
    }

    /** open player10  */
    public void openPlayer10(View view) {
        Intent intent = new Intent(this, URLMediaPlayerActivity.class);
        intent.putExtra(AUDIO_URL, "http://herwintika.id/music/Ratna_Antika_Sambalado.mp3");
        intent.putExtra(IMG_URL, "https://i.ytimg.com/vi/GDq-rPv4ejA/hqdefault.jpg");
        startActivity(intent);
    }
}
