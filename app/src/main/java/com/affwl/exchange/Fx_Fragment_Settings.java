package com.affwl.exchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 1/25/2018.
 */

public class Fx_Fragment_Settings extends Fragment {
    TextView tx;
    @Nullable
    @Override   /** Right click - Generate - Override Method - slect onCreateView */
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View v=  inflater.inflate (R.layout.fragment_fx_settings,null);
       tx=(TextView) v.findViewById(R.id.tv11);
       tx.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(v.getContext(), OneClickTrading.class);
               startActivity(i);
           }
       });
        return  v;
        }

    /** Right click - Generate - Override Method - slect onViewCreate */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);

        /** since it is a fragment we use view.findViewById */
//        view.findViewById (R.id.btn).setOnClickListener (new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText (getActivity (),"button clicked",Toast.LENGTH_SHORT).show ();
//            }
//        });
    }
}
