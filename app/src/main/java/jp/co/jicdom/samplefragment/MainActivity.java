package jp.co.jicdom.samplefragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements SampleListFragment.OnHeadlineSelectedListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment(@NonNull Fragment aFragment) {
        Log.d(TAG, "onAttachFragment");
        if (aFragment instanceof SampleListFragment) {
            SampleListFragment fragment = (SampleListFragment) aFragment;
            fragment.setOnHeadlineSelectedListener(this);
        }
    }

    public void onArticleSelected(int aPosition) {
        Log.d(TAG, "onArticleSelected");

        SampleViewerFragment viewerFragment = (SampleViewerFragment) getSupportFragmentManager().findFragmentById(R.id.viewer_fragment);
        if (viewerFragment != null) {
            String text = getString(R.string.hello);
            text += "\nList Item " + aPosition;
            viewerFragment.updateTextView(text);
        }
    }
}
