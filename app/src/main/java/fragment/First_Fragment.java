package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class First_Fragment extends Fragment implements View.OnClickListener{
    private Button btnAdd;
    private EditText etFirst,etSecond;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first_, container, false);
        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnAdd = view.findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int result = Integer.parseInt(etFirst.getText().toString())+Integer.parseInt(etSecond.getText().toString());
        Toast.makeText(getActivity(), "sum is: "+result, Toast.LENGTH_LONG).show();
    }
}
