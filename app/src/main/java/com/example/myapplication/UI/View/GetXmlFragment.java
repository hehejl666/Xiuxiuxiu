package com.example.myapplication.UI.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.Base.BaseFragment;
import com.example.myapplication.Moudle.KonPhotos;
import com.example.myapplication.R;
import com.example.myapplication.UI.Interface.IgetxmlFragment;
import com.example.myapplication.Util.GetKonXiuXiu;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by 17930 on 2016/2/24.
 */
public class GetXmlFragment extends BaseFragment implements IgetxmlFragment {

    @Bind(R.id.id_xml_button)
    Button idXmlButton;


    KonPhotos konPhotos;
    @Bind(R.id.id_recyclerview)
    RecyclerView idRecyclerview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.getxml, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        idRecyclerview.setLayoutManager(new GridLayoutManager(getContext(),2));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public static GetXmlFragment newInstance() {

        Bundle args = new Bundle();

        GetXmlFragment fragment = new GetXmlFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.id_xml_button)
    public void onClick() {
        Log.e("onclick", "btnClick");
        new GetKonXiuXiu(this).volleyGet();

    }

    @Override
    public void SetTextView(String str) {

    }

    @Override
    public void SetKonPotos(KonPhotos konPhotos) {
        this.konPhotos = konPhotos;
        //idRecyclerview.setAdapter();
    }
}
