package raouf.zer.com.elmekki101;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by raouf on 05/01/16.
 */
public class CatPage extends Activity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.cat_page);}


        public void onClickL(View v) {
                // TODO Auto-generated method stub
                if (v.getId() == R.id.butL) {
                        Intent i = new Intent(CatPage.this, LusterPage.class);
                        startActivity(i);
                }
        }

}
