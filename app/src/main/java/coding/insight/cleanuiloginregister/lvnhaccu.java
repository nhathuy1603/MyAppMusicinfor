package coding.insight.cleanuiloginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class lvnhaccu extends AppCompatActivity {
    ListView  LvNhacCu;
    ArrayList<NhacCu> arrayNhacCu;
    NhacCuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvnhaccu);

       AnhXa();
        adapter = new NhacCuAdapter(this,R.layout.list_nhac_cu,arrayNhacCu);
        LvNhacCu.setAdapter(adapter);

    }

    private void AnhXa() {
        LvNhacCu =  (ListView)  findViewById(R.id.listviewNhacCu);
        arrayNhacCu = new ArrayList<>();
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar1) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar2) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar3) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce WHB","6-String | Lutz Spruce Top |",R.drawable.guiatr4) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor Edition 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar5) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar3) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor 912ce WHB","6-String | Lutz Spruce Top |",R.drawable.guiatr4) );
        arrayNhacCu.add(new NhacCu(" Guitar taylor Edition 912ce","6-String | Lutz Spruce Top |",R.drawable.guitar5) );


    }


}