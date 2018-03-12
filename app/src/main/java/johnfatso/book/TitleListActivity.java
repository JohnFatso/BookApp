package johnfatso.book;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TitleListActivity extends AppCompatActivity {
    // Todo:remove this toast once the real ad unit is configured
    private static final String TOAST_TEXT = "Test ads are being shown. "
            + "To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_list);

        ListView listView=new ListView(this);
        ArrayList<Integer> list=new ArrayList<>(10);
        TitleListAdapter titleListAdapter=new TitleListAdapter(this, R.layout.fragment_title_list_item,R.id.titleText,list);
        //listView.setAdapter();

        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        // Todo:remove this toast once the real ad unit is configured
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();
    }

    class TitleListAdapter extends ArrayAdapter{
        Context context;

        TitleListAdapter(Context context, int resource, int textViewResourceId, ArrayList arrayList){
            super(context,resource,textViewResourceId,arrayList);
            this.context=context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent ){
            View view=new View(context);

            return view;
        }
    }
}
