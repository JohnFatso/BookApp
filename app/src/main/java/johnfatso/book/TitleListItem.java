package johnfatso.book;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TitleListItem.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TitleListItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TitleListItem extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String TITLE = "param1";
    private static final String DESCRIPTION = "param2";
    private static final String FAVOURITE = "param3";
    private static final String IS_FAVOURITABLE = "param4";

    // fragment attributes
    private String title;
    private String description;
    private Boolean favourite;
    private Boolean isFavouriteApplicable;

    private OnFragmentInteractionListener mListener;

    public TitleListItem() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param title Parameter 1.
     * @param description Parameter 2.
     * @param favourite Parameter 2.
     * @return A new instance of fragment TitleListItem.
     */

    public static TitleListItem newInstance(String title, String description, Boolean favourite) {
        TitleListItem fragment = new TitleListItem();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        args.putString(DESCRIPTION, description);
        args.putBoolean(FAVOURITE,favourite);
        args.putBoolean(IS_FAVOURITABLE,true);
        fragment.setArguments(args);
        return fragment;
    }

    public static TitleListItem newInstance(String title, String description) {
        TitleListItem fragment = new TitleListItem();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        args.putString(DESCRIPTION, description);
        args.putBoolean(FAVOURITE,false);
        args.putBoolean(IS_FAVOURITABLE,false);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(TITLE);
            description = getArguments().getString(DESCRIPTION);
            favourite = getArguments().getBoolean(FAVOURITE);
        }

        TextView titleTextView=(TextView) getView().findViewById(R.id.titleText);
        titleTextView.setText(title);
        TextView descriptionView=(TextView) getView().findViewById(R.id.descriptionText);
        descriptionView.setText(description);
        ImageButton favouriteButton = (ImageButton) getView().findViewById(R.id.favouriteButton);
        if(isFavouriteApplicable) {
            favouriteButton.setVisibility(View.VISIBLE);
            setFavouriteStatus(favourite);
        }
        else {
            favouriteButton.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_title_list_item, container, false);
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

    }

    /**
     * declare and define fragment specific user defined functions
     */

    void setFavouriteStatus(Boolean isFavourite){
        ImageButton favouriteButton = getView().findViewById(R.id.favouriteButton);
        if(isFavourite){
            favouriteButton.setImageResource(android.R.drawable.btn_star_big_on);
        }
        else{
            favouriteButton.setImageResource(android.R.drawable.btn_star_big_off);
        }
    }

    /**
     * call this function when the favourite button
     *
     * The function will toggle the favourite status of the title
     * change the favourite status in database
     * toggle the image
     *
      * @param view
     */
    public void onTouchFavouriteButton(View view){
        favourite=!favourite;
        setFavouriteStatus(favourite);
    }
}
