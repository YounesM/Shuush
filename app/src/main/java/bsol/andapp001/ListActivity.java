package bsol.andapp001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        populateList();
    }

    private void populateList() {
        String[] items = {"Zone1","Zone2","Zone3","Zone4"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.items,items);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }


}
