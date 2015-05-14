package c2sapp;

/**
 * Created by ChristianMoscosa on 5/5/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.wizardsgroup.christianmoscosa.c2sapp.R;


public class LessonOne extends Fragment {
    public LessonOne() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_lesson_one, container, false);
//        return rootView;

        View mainView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView webView = (WebView) mainView.findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/www/en-Sensorex_SAM-1_use_en.html");
        return mainView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}