package susalud.gob.pe.thefm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import susalud.gob.pe.thefm.MainActivity;
import susalud.gob.pe.thefm.R;

/**
 * Created by Jose Cuentas Turpo on 07/07/2015 - 05:14 PM.
 * E-mail: jcuentast@gmail.com
 */
public class HyperArtistsFragment extends Fragment {
    public static final String TAG = "HyperArtistsFragment";
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof MainActivity) {
            Log.i(TAG,"onAttach: is true");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_hyped_artists, container, false);
        return root;
    }
}
