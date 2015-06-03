package search;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cogdasma.c2smob.R;

public class ListOfSearchResult extends Fragment {

    public ListOfSearchResult() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        String result = bundle.getString("query");

        Toast.makeText(getActivity().getApplicationContext(), result, Toast.LENGTH_SHORT).show();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_of_search_result, container, false);
    }
}
