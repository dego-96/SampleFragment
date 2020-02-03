package jp.co.jicdom.samplefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    @Override
    public void onCreate(Bundle aSavedInstanceState) {
        super.onCreate(aSavedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater aInflater,
                             ViewGroup aContainer,
                             Bundle aSavedInstanceState) {
        View rootView = aInflater.inflate(R.layout.sample_fragment, aContainer, false);
        return rootView;
    }
}
