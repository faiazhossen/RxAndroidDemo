package fayaz.example.com.rxandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import org.reactivestreams.Subscription;

public class Demo2Activity extends AppCompatActivity {
    private Subscription mTvSubscription;
    private RecyclerView mRecyclerView;
    private ProgressBar mProgressBar;
    private SimpleStringAdapter mSimpleStringAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
    }
}
