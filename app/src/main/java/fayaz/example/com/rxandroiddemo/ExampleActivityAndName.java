package fayaz.example.com.rxandroiddemo;

import android.app.Activity;

/**
 * Created by FAIAZ on 1/8/2018.
 */

public class ExampleActivityAndName {

    public final Class<? extends Activity> mAClass;
    public final String mName;

    public ExampleActivityAndName(Class<? extends Activity> mAClass, String mName) {
        this.mAClass = mAClass;
        this.mName = mName;
    }
}
