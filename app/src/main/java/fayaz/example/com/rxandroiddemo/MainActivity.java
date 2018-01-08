package fayaz.example.com.rxandroiddemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupActionBar();
        setupExampleList();
    }

    private void setupExampleList() {
        RecyclerView recyclerView = findViewById(R.id.example_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new DemoAdapter(this,getExamples()));
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.example_list_title);
        }
    }

    public static List<ExampleActivityAndName> getExamples() {

        List<ExampleActivityAndName> exampleActivityAndNames = new ArrayList<>();
        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo1Activity.class,
                "Demo1 ColorList"
        ));

        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo2Activity.class,
                "Demo2 TvShow"
        ));

        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo3Activity.class,
                "Demo3 Improved TVsHOW"
        ));

        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo4Activity.class,
                "Demo4 ButtonCounter"
        ));

        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo1Activity.class,
                "Demo5 Value Display"
        ));

        exampleActivityAndNames.add(new ExampleActivityAndName(
                Demo1Activity.class,
                "Demo6 city search"
        ));



        return exampleActivityAndNames;
    }
}
