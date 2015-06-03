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

import helper.SetWebViewClient;


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
        SetWebViewClient setWebViewClient = new SetWebViewClient(inflater, container).invoke();
        WebView webView = setWebViewClient.getWebView();
        View mainView = setWebViewClient.getMainView();
        webView.loadUrl("file:///android_asset/www/c2ssample.html");
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

