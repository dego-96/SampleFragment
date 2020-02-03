package jp.co.jicdom.samplefragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleViewerFragment extends Fragment {

    private static final String TAG = "SampleViewerFragment";

    @Override
    public void onCreate(Bundle aSavedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(aSavedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater aInflater,
                             ViewGroup aContainer,
                             Bundle aSavedInstanceState) {
        Log.d(TAG, "onCreateView");
        return aInflater.inflate(R.layout.viewer_fragment, aContainer, false);
    }
}
