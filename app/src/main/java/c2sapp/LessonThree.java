package c2sapp;

/**
 * Created by ChristianMoscosa on 5/7/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.cogdasma.c2smob.R;


public class LessonThree extends Fragment {

    public LessonThree() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView webView = (WebView) mainView.findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/www/sample2.html");
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