package com.example.ragingduckgamereview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class genre1RPG extends AppCompatActivity {

    private List<String> list;
    private ListView listView;
    private EditText editSearch;
    private SearchAdapter adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre1_rpg);

        editSearch = (EditText)findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

        settingList();

        arrayList = new ArrayList<String>();
        arrayList.addAll(list);

        adapter = new SearchAdapter(list, this);
        listView.setAdapter(adapter);

        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String text = editSearch.getText().toString();
                search(text);

            }
        });

    }

    public void search(String charText){
        list.clear();
        if(charText.length() ==0){
            list.addAll(arrayList);
        }
        else
        {
            for(int i =0; i<arrayList.size(); i++)
            {
                if(arrayList.get(i).toLowerCase().contains(charText))
                {
                    list.add(arrayList.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
    }
    private void settingList(){
        list.add("GrandChase 그랜드 체이스");
        list.add("The Ascent 디 어센트");
        list.add("Tribes of Midgard 트라입스 오브 미드가르드");
        list.add("High Fleet 하이 플리트");
        list.add("Hell Let Loose 헬 렛 루즈");
        list.add("Rouge Company 로그 컴퍼니");
        list.add("FIFA2021 피파2021");
        list.add("F1 에프1");
        list.add("Knockout City 넉아웃 시티");
        list.add("NBA 2K21 엔비에이 2K2");
        list.add("The Cyclist : Tactics 더 사이클리스트 : 택틱스");
        list.add("DRIFT21 드리프트21");
        list.add("The Elders Scrolls 5 : Skyrim 엘더스크롤 : 스카이림");
        list.add("Divinity2 : OriginalSin 디비니티 2 : 오리지널 씬");
        list.add("Witcher 3 : Wild Hunt 위쳐3 : 와일드 헌트");
        list.add("Dragon Quest 11 드래곤 퀘스트 11");
        list.add("Doom Eternal 둠 이터널");
        list.add("Halo 헤일로");
        list.add("Bioshock Infinite 바이오쇼크 인피니트");
        list.add("Biohazard Village 바이오하자드 빌리지");
        list.add("Super Mario Odyssey 슈퍼마리오 오디세이");
        list.add("The last of us 더 라스트 오브 어스");
        list.add("The Legend of Zelda : Breath of the wild 젤다의 전설 : 브레스 오브 더 와일드");
        list.add("Little nightmares 리틀 나이트 메어");
        list.add("God of War 갓 오브 워");
        list.add("Devil May Cry 5 데빌 메이 크라이5");


    }
}