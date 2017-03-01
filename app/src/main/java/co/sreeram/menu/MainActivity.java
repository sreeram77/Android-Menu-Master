package co.sreeram.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv1,gv2;
    public static String [] foodNameList={"Cookies","Sausage","Chicken","Cracker","Bread","Hot Dog","Bacon","Bull's eye","Chips"};
    public static int [] foodImages={R.drawable.f9,R.drawable.f8,R.drawable.f7,R.drawable.f6,R.drawable.f5,R.drawable.f4,R.drawable.f3,R.drawable.f2,R.drawable.f1};

    public static String [] foodNameList2={"Sandwich","Chicken","Pizza","French Fries","Tea","Ice Cream","Sandwich","Beer Can","Burger","Wine","Chocolate","Doughnut"};
    public static int [] foodImages2={R.drawable.f21,R.drawable.f20,R.drawable.f19,R.drawable.f18,R.drawable.f17,R.drawable.f16,R.drawable.f15,R.drawable.f14,R.drawable.f13,R.drawable.f12,R.drawable.f11,R.drawable.f10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        gv1=(GridView) findViewById(R.id.gridView1);
        gv1.setRotation(270);
        gv1.setAdapter(new CustomAdapter(this, foodNameList,foodImages));
        gv2=(GridView) findViewById(R.id.gridView2);
        gv2.setAdapter(new CustomAdapter(this, foodNameList2,foodImages2));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
}
