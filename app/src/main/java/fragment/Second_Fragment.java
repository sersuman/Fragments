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
public class Second_Fragment extends Fragment implements View.OnClickListener{

    private Button btnCalculate;
    private EditText etRadius;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalculate = view.findViewById(R.id.btnRadius);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float area = 3.14f * Float.parseFloat(etRadius.getText().toString())*2;
        Toast.makeText(getActivity(),"radius is: "+area,Toast.LENGTH_LONG).show();
    }
}
