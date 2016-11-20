package tw.org.iii.chiyu01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView myTv;
    private View myClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R => 自動產生的 class 檔案 (R.java)
        setContentView(R.layout.activity_main);
        // 所有的物件 都在畫面排版的時候 就被new出來


        // 用 findViewById 把 物件找出來
        // 所有看到的東西 都是 view 要用強制轉型弄回原來的物件
        myTv = (TextView) findViewById(R.id.tv);
        // 一開始就宣告是 view 就不用轉了
        myClick = findViewById(R.id.click);

//        myClick.setOnClickListener(new View.OnClickListener(){
//        });

        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLottery();
            }
        });


    }

    private void showLottery(){
        HashSet<Integer> set = new HashSet<>();
        while ( set.size()<6 ){
            set.add((int)(Math.random()*49+1));
        }
        // 因為 set 不是一個 CharSequence 所以要用 toString()
        myTv.setText(set.toString());

    }


}
