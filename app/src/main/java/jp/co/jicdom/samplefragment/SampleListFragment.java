package jp.co.jicdom.samplefragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleListFragment extends Fragment {

    private static final String TAG = "SampleListFragment";

    private OnHeadlineSelectedListener mCallback;

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

        View rootView = aInflater.inflate(R.layout.list_fragment, aContainer, false);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> aParent, View aView, int aPosition, long aId) {
                Log.d(TAG, "onItemClick" + aPosition);
                mCallback.onArticleSelected(aPosition);
            }
        });
        return rootView;
    }

    void setOnHeadlineSelectedListener(OnHeadlineSelectedListener aCallback) {
        this.mCallback = aCallback;
    }

    public interface OnHeadlineSelectedListener {
        void onArticleSelected(int position);
    }
}
