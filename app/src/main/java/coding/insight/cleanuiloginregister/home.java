package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinearLayout linearLayout;
        LinearLayout linearLayout1;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        linearLayout = (LinearLayout) findViewById(R.id.profile_id);
        linearLayout1 = (LinearLayout) findViewById(R.id.lvnhaccu);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent   = new Intent(home.this, MyProfile.class);
                startActivity(intent);
            }
        });


        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, lvnhaccu.class);
                startActivity(intent);
            }
        });

    }
}