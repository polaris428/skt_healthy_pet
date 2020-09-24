package com.example.skthealthypet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class List_Main_Fragment extends Fragment {
    public List_Main_Fragment() {
        // Required empty public constructor
    }
    public static Context mCon;
    private ListView mListView;
    static int opend=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list_main_, null);
        /* 위젯과 멤버변수 참조 획득 */
        mCon = container.getContext();
        mListView = v.findViewById(R.id.listView);
        SharedPreferences pref = mCon.getSharedPreferences("ListInventory", Activity.MODE_PRIVATE);
        ListValues.p = pref.getInt("Index", -1);
        /* 아이템 추가 및 어댑터 등록 */
        dataSetting();
        Button btn = (Button)v.findViewById(R.id.add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressAddBtn(v);
            }
        });

        return v;
    }

    private void dataSetting(){
        // 리스트뷰에 어댑터 등록
        mListView.setAdapter(ListValues.mMyAdapter);

        final SharedPreferences pref = mCon.getSharedPreferences("ListInventory" , Activity.MODE_PRIVATE);
        String inName,inContent;
        Boolean isDaily;
        if(opend==0){
            for(int i=0; i<=pref.getInt("Index",-10); i++) {
                inName = pref.getString("NAME_" + i, "ERROR");
                inContent = pref.getString("CONTENT_" + i, "ERROR");
                isDaily = pref.getBoolean("ISDAILY_" + i, false);
                ListValues.mMyAdapter.addItem(inName, inContent, isDaily);
            }
           opend++;
        }
    }

    public void pressAddBtn(View v){
        Intent intent = new Intent(v.getContext(), List_AddPopUp_Activity.class);
        startActivity(intent);
    }
}