package layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sggscc.myapplication_6.First;
import com.sggscc.myapplication_6.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SubPage02.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SubPage02#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SubPage02 extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private LinearLayout l1,l2,l3,l4,l5,l6,l7;
    private TextView t1,t2,t3,t4,t5,t6,t7;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SubPage02() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SubPage02.
     */
    // TODO: Rename and change types and number of parameters
    public static SubPage02 newInstance(String param1, String param2) {
        SubPage02 fragment = new SubPage02();
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
    public void click(View v) {
        Intent intent;

        intent = new Intent(getActivity(),First.class);

        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sub_page02, container, false);
        l1 = (LinearLayout)view.findViewById(R.id.layout1);
        l1.setOnClickListener((OnClickListener) this);
      /*  l1 = (LinearLayout)view.findViewById(R.id.layout1);
        l2 = (LinearLayout)view.findViewById(R.id.layout2);
        l3 = (LinearLayout)view.findViewById(R.id.layout3);
        l4 = (LinearLayout)view.findViewById(R.id.layout4);
        l5 = (LinearLayout)view.findViewById(R.id.layout5);
        l6 = (LinearLayout)view.findViewById(R.id.layout6);
        l7 = (LinearLayout)view.findViewById(R.id.layout7);
        t1 = (TextView)view.findViewById(R.id.textView1);
        t2 = (TextView)view.findViewById(R.id.textView2);
        t3 = (TextView)view.findViewById(R.id.textView3);
        t4 = (TextView)view.findViewById(R.id.textView4);
        t5 = (TextView)view.findViewById(R.id.textView5);
        t6 = (TextView)view.findViewById(R.id.textView6);
        t7 = (TextView)view.findViewById(R.id.textView7);*/
        return view;
    }

    public void onClick(View v) {
        Intent intent;

        intent = new Intent(getActivity(),First.class);

        startActivity(intent);
        }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
