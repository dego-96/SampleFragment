package jp.co.jicdom.samplefragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleViewerFragment extends Fragment {

    private static final String TAG = "SampleViewerFragment";
    private View mRootView;

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
        mRootView = aInflater.inflate(R.layout.viewer_fragment, aContainer, false);
        return mRootView;
    }

    void updateTextView(String aText) {
        TextView textView = mRootView.findViewById(R.id.text_view);
        textView.setText(aText);
    }
}
