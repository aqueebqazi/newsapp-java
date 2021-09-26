package com.example.newsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import com.example.newsapp.ui.Webviewconroller;
import com.example.newsapp.ui.home.HomeViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Skynews#newInstance} factory method to
 * create an instance of this fragment.f
 */
public class Skynews extends Fragment {
      
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Skynews skynews;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Skynews() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Skynews.
     */
    // TODO: Rename and change types and number of parameters
    public static Skynews newInstance(String param1, String param2) {
        Skynews fragment = new Skynews();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       /* return inflater.inflate(R.layout.fragment_skynews, container, false);
        WebView webView = fin*/

        View root = inflater.inflate(R.layout.fragment_skynews, container, false);
        WebView webView = root.findViewById(R.id.Skywebview);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new Webviewconroller());
        return root;
    }
}