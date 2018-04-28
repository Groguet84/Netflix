package com.example.root.netflix;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    AdminSQLiteOpenHelper admin;
    SQLiteDatabase bd, bd2, bd3;
    Button  btn20171a, btn20171b, btn20171c, btn20172a, btn20172b, btn20172c, btn20173a, btn20173b, btn20173c, btn20174a, btn20174b, btn20174c,
            btn20175a, btn20175b, btn20175c, btn20176a, btn20176b, btn20176c, btn20177a, btn20177b, btn20177c, btn20178a, btn20178b, btn20178c,
            btn20179a, btn20179b, btn20179c, btn201710a, btn201710b, btn201710c, btn201711a, btn201711b, btn201711c, btn201712a, btn201712b, btn201712c,
            btn20181a, btn20181b, btn20181c, btn20182a, btn20182b, btn20182c, btn20183a, btn20183b, btn20183c, btn20184a, btn20184b, btn20184c,
            btn20185a, btn20185b, btn20185c, btn20186a, btn20186b, btn20186c, btn20187a, btn20187b, btn20187c, btn20188a, btn20188b, btn20188c,
            btn20189a, btn20189b, btn20189c, btn201810a, btn201810b, btn201810c, btn201811a, btn201811b, btn201811c, btn201812a, btn201812b, btn201812c;
    Button  btn2017, btn2018;
    LinearLayout ly2017, ly2018;
    String fecha = "2018";
    String[] Vicente={"0","0","0","0","0","0","0","0","0","0","0","0"},
            Martin={"0","0","0","0","0","0","0","0","0","0","0","0"},
            Eloy={"0","0","0","0","0","0","0","0","0","0","0","0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Declaramos los botones
        btn20171a = (Button) findViewById(R.id.button20171A);
        btn20171a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(!v.getTag().equals("") && !v.getTag().equals("0"))
                    anularPago(v);
                if(v.getTag().equals("0"))
                    aumentarDeuda(v);
                return true;
            }
        });

        btn20171b = (Button) findViewById(R.id.button20171B);
        btn20171b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20171c = (Button) findViewById(R.id.button20171C);
        btn20171c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(Eloy[0].indexOf("-")!=0 && !Eloy[0].equals("0"))
                    anularPago(v);
                else
                    aumentarDeuda(v);
                return true;
            }
        });
        btn20172a = (Button) findViewById(R.id.button20172A);
        btn20172a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20172b = (Button) findViewById(R.id.button20172B);
        btn20172b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20172c = (Button) findViewById(R.id.button20172C);
        btn20172c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20173a = (Button) findViewById(R.id.button20173A);
        btn20173a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20173b = (Button) findViewById(R.id.button20173B);
        btn20173b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20173c = (Button) findViewById(R.id.button20173C);
        btn20173c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20174a = (Button) findViewById(R.id.button20174A);
        btn20174a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20174b = (Button) findViewById(R.id.button20174B);
        btn20174b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20174c = (Button) findViewById(R.id.button20174C);
        btn20174c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20175a = (Button) findViewById(R.id.button20175A);
        btn20175a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20175b = (Button) findViewById(R.id.button20175B);
        btn20175b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20175c = (Button) findViewById(R.id.button20175C);
        btn20175c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20176a = (Button) findViewById(R.id.button20176A);
        btn20176a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20176b = (Button) findViewById(R.id.button20176B);
        btn20176b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20176c = (Button) findViewById(R.id.button20176C);
        btn20176c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20177a = (Button) findViewById(R.id.button20177A);
        btn20177a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20177b = (Button) findViewById(R.id.button20177B);
        btn20177b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20177c = (Button) findViewById(R.id.button20177C);
        btn20177c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20178a = (Button) findViewById(R.id.button20178A);
        btn20178a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20178b = (Button) findViewById(R.id.button20178B);
        btn20178b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20178c = (Button) findViewById(R.id.button20178C);
        btn20178c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20179a = (Button) findViewById(R.id.button20179A);
        btn20179a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20179b = (Button) findViewById(R.id.button20179B);
        btn20179b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20179c = (Button) findViewById(R.id.button20179C);
        btn20179c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201710a = (Button) findViewById(R.id.button201710A);
        btn201710a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201710b = (Button) findViewById(R.id.button201710B);
        btn201710b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201710c = (Button) findViewById(R.id.button201710C);
        btn201710c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201711a = (Button) findViewById(R.id.button201711A);
        btn201711a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201711b = (Button) findViewById(R.id.button201711B);
        btn201711b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201711c = (Button) findViewById(R.id.button201711C);
        btn201711c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201712a = (Button) findViewById(R.id.button201712A);
        btn201712a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201712b = (Button) findViewById(R.id.button201712B);
        btn201712b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201712c = (Button) findViewById(R.id.button201712C);
        btn201712c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });

        btn20181a = (Button) findViewById(R.id.button20181A);
        btn20181a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20181b = (Button) findViewById(R.id.button20181B);
        btn20181b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20181c = (Button) findViewById(R.id.button20181C);
        btn20181c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20182a = (Button) findViewById(R.id.button20182A);
        btn20182a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20182b = (Button) findViewById(R.id.button20182B);
        btn20182b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20182c = (Button) findViewById(R.id.button20182C);
        btn20182c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20183a = (Button) findViewById(R.id.button20183A);
        btn20183a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20183b = (Button) findViewById(R.id.button20183B);
        btn20183b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20183c = (Button) findViewById(R.id.button20183C);
        btn20183c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20184a = (Button) findViewById(R.id.button20184A);
        btn20184a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20184b = (Button) findViewById(R.id.button20184B);
        btn20184b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20184c = (Button) findViewById(R.id.button20184C);
        btn20184c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20185a = (Button) findViewById(R.id.button20185A);
        btn20185a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20185b = (Button) findViewById(R.id.button20185B);
        btn20185b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20185c = (Button) findViewById(R.id.button20185C);
        btn20185c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20186a = (Button) findViewById(R.id.button20186A);
        btn20186a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20186b = (Button) findViewById(R.id.button20186B);
        btn20186b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20186c = (Button) findViewById(R.id.button20186C);
        btn20186c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20187a = (Button) findViewById(R.id.button20187A);
        btn20187a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20187b = (Button) findViewById(R.id.button20187B);
        btn20187b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20187c = (Button) findViewById(R.id.button20187C);
        btn20187c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20188a = (Button) findViewById(R.id.button20188A);
        btn20188a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20188b = (Button) findViewById(R.id.button20188B);
        btn20188b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20188c = (Button) findViewById(R.id.button20188C);
        btn20188c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20189a = (Button) findViewById(R.id.button20189A);
        btn20189a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20189b = (Button) findViewById(R.id.button20189B);
        btn20189b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn20189c = (Button) findViewById(R.id.button20189C);
        btn20189c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201810a = (Button) findViewById(R.id.button201810A);
        btn201810a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201810b = (Button) findViewById(R.id.button201810B);
        btn201810b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201810c = (Button) findViewById(R.id.button201810C);
        btn201810c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201811a = (Button) findViewById(R.id.button201811A);
        btn201811a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201811b = (Button) findViewById(R.id.button201811B);
        btn201811b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201811c = (Button) findViewById(R.id.button201811C);
        btn201811c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201812a = (Button) findViewById(R.id.button201812A);
        btn201812a.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201812b = (Button) findViewById(R.id.button201812B);
        btn201812b.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });
        btn201812c = (Button) findViewById(R.id.button201812C);
        btn201812c.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                anularPago(v);
                return true;
            }
        });


        btn2017 = (Button) findViewById(R.id.button2017);
        btn2018 = (Button) findViewById(R.id.button2018);

        ly2017 = (LinearLayout) findViewById(R.id.dosmildiecisiete);
        ly2018 = (LinearLayout) findViewById(R.id.dosmildieciocho);

        admin = new AdminSQLiteOpenHelper(this,
                "netflix", null, 1);
        bd = admin.getWritableDatabase();

        Cursor fila = bd.rawQuery(
                "SELECT codigo FROM netflix", null);


        cargarBotones();
    }
    public void cargarBotones(){


        Cursor fila = bd.rawQuery(
                "SELECT * FROM netflix WHERE personatges LIKE 'Sento' AND fecha LIKE '%"+fecha+"'", null);
        if(fila.moveToFirst())
            Vicente[0]=fila.getString(3);
        //Toast.makeText(this, "Numero: "+fila.getCount(), Toast.LENGTH_SHORT).show();
        int i=1;

        while(fila.moveToNext()){
            //Toast.makeText(this, "Misa: "+fila.getString(3), Toast.LENGTH_SHORT).show();
            Vicente[i]=fila.getString(3);
            i++;
        }

        fila = bd.rawQuery(
                "SELECT * FROM netflix WHERE personatges LIKE 'Martin' AND fecha LIKE '%"+fecha+"'", null);
        if(fila.moveToFirst())
            Martin[0]=fila.getString(3);
        i=1;
        while(fila.moveToNext()){
            Martin[i]=fila.getString(3);
            i++;
        }
        fila = bd.rawQuery(
                "SELECT * FROM netflix WHERE personatges LIKE 'Eloy' AND fecha LIKE '%"+fecha+"'", null);
        if(fila.moveToFirst())
            Eloy[0]=fila.getString(3);
        i=1;
        while(fila.moveToNext()){
            Eloy[i]=fila.getString(3);
            i++;
        }

        if(fecha.equals("2017")) {
            //Toast.makeText(this, "Cargamos botons de     -"+Vicente[0], Toast.LENGTH_SHORT).show();
            btn20171a.setText(String.valueOf(Vicente[0]));
            if(String.valueOf(Vicente[0]).equals("0"))
                btn20171a.setBackgroundColor(Color.RED);
            else btn20171a.setBackgroundColor(Color.GREEN);
            btn20172a.setText(Vicente[1]);
            if(Vicente[1].equals("0"))
                btn20172a.setBackgroundColor(Color.RED);
            else btn20172a.setBackgroundColor(Color.GREEN);
            btn20173a.setText(Vicente[2]);
            if(Vicente[2].equals("0"))
                btn20173a.setBackgroundColor(Color.RED);
            else btn20173a.setBackgroundColor(Color.GREEN);
            btn20174a.setText(Vicente[3]);
            if(Vicente[3].equals("0"))
                btn20174a.setBackgroundColor(Color.RED);
            else btn20174a.setBackgroundColor(Color.GREEN);
            btn20175a.setText(Vicente[4]);
            if(Vicente[4].equals("0"))
                btn20175a.setBackgroundColor(Color.RED);
            else btn20175a.setBackgroundColor(Color.GREEN);
            btn20176a.setText(Vicente[5]);
            if(Vicente[5].equals("0"))
                btn20176a.setBackgroundColor(Color.RED);
            else btn20176a.setBackgroundColor(Color.GREEN);
            btn20177a.setText(Vicente[6]);
            if(Vicente[6].equals("0"))
                btn20177a.setBackgroundColor(Color.RED);
            else btn20177a.setBackgroundColor(Color.GREEN);
            btn20178a.setText(Vicente[7]);
            if(Vicente[7].equals("0"))
                btn20178a.setBackgroundColor(Color.RED);
            else btn20178a.setBackgroundColor(Color.GREEN);
            btn20179a.setText(Vicente[8]);
            if(Vicente[8].equals("0"))
                btn20179a.setBackgroundColor(Color.RED);
            else btn20179a.setBackgroundColor(Color.GREEN);
            btn201710a.setText(Vicente[9]);
            if(Vicente[9].equals("0"))
                btn201710a.setBackgroundColor(Color.RED);
            else btn201710a.setBackgroundColor(Color.GREEN);
            btn201711a.setText(Vicente[10]);
            if(Vicente[10].equals("0"))
                btn201711a.setBackgroundColor(Color.RED);
            else btn201711a.setBackgroundColor(Color.GREEN);
            btn201712a.setText(Vicente[11]);
            if(Vicente[11].equals("0"))
                btn201712a.setBackgroundColor(Color.RED);
            else btn201712a.setBackgroundColor(Color.GREEN);

            btn20171b.setText(Martin[0]);
            if(Martin[0].equals("0"))
                btn20171b.setBackgroundColor(Color.RED);
            else btn20171b.setBackgroundColor(Color.GREEN);
            btn20172b.setText(Martin[1]);
            if(Martin[1].equals("0"))
                btn20172b.setBackgroundColor(Color.RED);
            else btn20172b.setBackgroundColor(Color.GREEN);
            btn20173b.setText(Martin[2]);
            if(Martin[2].equals("0"))
                btn20173b.setBackgroundColor(Color.RED);
            else btn20173b.setBackgroundColor(Color.GREEN);
            btn20174b.setText(Martin[3]);
            if(Martin[3].equals("0"))
                btn20174b.setBackgroundColor(Color.RED);
            else btn20174b.setBackgroundColor(Color.GREEN);
            btn20175b.setText(Martin[4]);
            if(Martin[4].equals("0"))
                btn20175b.setBackgroundColor(Color.RED);
            else btn20175b.setBackgroundColor(Color.GREEN);
            btn20176b.setText(Martin[5]);
            if(Martin[5].equals("0"))
                btn20176b.setBackgroundColor(Color.RED);
            else btn20176b.setBackgroundColor(Color.GREEN);
            btn20177b.setText(Martin[6]);
            if(Martin[6].equals("0"))
                btn20177b.setBackgroundColor(Color.RED);
            else btn20177b.setBackgroundColor(Color.GREEN);
            btn20178b.setText(Martin[7]);
            if(Martin[7].equals("0"))
                btn20178b.setBackgroundColor(Color.RED);
            else btn20178b.setBackgroundColor(Color.GREEN);
            btn20179b.setText(Martin[8]);
            if(Martin[8].equals("0"))
                btn20179b.setBackgroundColor(Color.RED);
            else btn20179b.setBackgroundColor(Color.GREEN);
            btn201710b.setText(Martin[9]);
            if(Martin[9].equals("0"))
                btn201710b.setBackgroundColor(Color.RED);
            else btn201710b.setBackgroundColor(Color.GREEN);
            btn201711b.setText(Martin[10]);
            if(Martin[10].equals("0"))
                btn201711b.setBackgroundColor(Color.RED);
            else btn201711b.setBackgroundColor(Color.GREEN);
            btn201712b.setText(Martin[11]);
            if(Martin[11].equals("0"))
                btn201712b.setBackgroundColor(Color.RED);
            else btn201712b.setBackgroundColor(Color.GREEN);

            btn20171c.setText(Eloy[0]);
            if(Eloy[0].equals("0"))
                btn20171c.setBackgroundColor(Color.RED);
            else btn20171c.setBackgroundColor(Color.GREEN);
            btn20172c.setText(Eloy[1]);
            if(Eloy[1].equals("0"))
                btn20172c.setBackgroundColor(Color.RED);
            else btn20172c.setBackgroundColor(Color.GREEN);
            btn20173c.setText(Eloy[2]);
            if(Eloy[2].equals("0"))
                btn20173c.setBackgroundColor(Color.RED);
            else btn20173c.setBackgroundColor(Color.GREEN);
            btn20174c.setText(Eloy[3]);
            if(Eloy[3].equals("0"))
                btn20174c.setBackgroundColor(Color.RED);
            else btn20174c.setBackgroundColor(Color.GREEN);
            btn20175c.setText(Eloy[4]);
            if(Eloy[4].equals("0"))
                btn20175c.setBackgroundColor(Color.RED);
            else btn20175c.setBackgroundColor(Color.GREEN);
            btn20176c.setText(Eloy[5]);
            if(Eloy[5].equals("0"))
                btn20176c.setBackgroundColor(Color.RED);
            else btn20176c.setBackgroundColor(Color.GREEN);
            btn20177c.setText(Eloy[6]);
            if(Eloy[6].equals("0"))
                btn20177c.setBackgroundColor(Color.RED);
            else btn20177c.setBackgroundColor(Color.GREEN);
            btn20178c.setText(Eloy[7]);
            if(Eloy[7].equals("0"))
                btn20178c.setBackgroundColor(Color.RED);
            else btn20178c.setBackgroundColor(Color.GREEN);
            btn20179c.setText(Eloy[8]);
            if(Eloy[8].equals("0"))
                btn20179c.setBackgroundColor(Color.RED);
            else btn20179c.setBackgroundColor(Color.GREEN);
            btn201710c.setText(Eloy[9]);
            if(Eloy[9].equals("0"))
                btn201710c.setBackgroundColor(Color.RED);
            else btn201710c.setBackgroundColor(Color.GREEN);
            btn201711c.setText(Eloy[10]);
            if(Eloy[10].equals("0"))
                btn201711c.setBackgroundColor(Color.RED);
            else btn201711c.setBackgroundColor(Color.GREEN);
            btn201712c.setText(Eloy[11]);
            if(Eloy[11].equals("0"))
                btn201712c.setBackgroundColor(Color.RED);
            else btn201712c.setBackgroundColor(Color.GREEN);
        }
        if(fecha.equals("2018")){
            //Toast.makeText(this, "Cargamos botons de     -"+Vicente[0], Toast.LENGTH_SHORT).show();
            btn20181a.setText(String.valueOf(Vicente[0]));
            if(String.valueOf(Vicente[0]).equals("0"))
                btn20181a.setBackgroundColor(Color.RED);
            else btn20181a.setBackgroundColor(Color.GREEN);
            btn20182a.setText(Vicente[1]);
            if(Vicente[1].equals("0"))
                btn20182a.setBackgroundColor(Color.RED);
            else btn20182a.setBackgroundColor(Color.GREEN);
            btn20183a.setText(Vicente[2]);
            if(Vicente[2].equals("0"))
                btn20183a.setBackgroundColor(Color.RED);
            else btn20183a.setBackgroundColor(Color.GREEN);
            btn20184a.setText(Vicente[3]);
            if(Vicente[3].equals("0"))
                btn20184a.setBackgroundColor(Color.RED);
            else btn20184a.setBackgroundColor(Color.GREEN);
            btn20185a.setText(Vicente[4]);
            if(Vicente[4].equals("0"))
                btn20185a.setBackgroundColor(Color.RED);
            else btn20185a.setBackgroundColor(Color.GREEN);
            btn20186a.setText(Vicente[5]);
            if(Vicente[5].equals("0"))
                btn20186a.setBackgroundColor(Color.RED);
            else btn20186a.setBackgroundColor(Color.GREEN);
            btn20187a.setText(Vicente[6]);
            if(Vicente[6].equals("0"))
                btn20187a.setBackgroundColor(Color.RED);
            else btn20187a.setBackgroundColor(Color.GREEN);
            btn20188a.setText(Vicente[7]);
            if(Vicente[7].equals("0"))
                btn20188a.setBackgroundColor(Color.RED);
            else btn20188a.setBackgroundColor(Color.GREEN);
            btn20189a.setText(Vicente[8]);
            if(Vicente[8].equals("0"))
                btn20189a.setBackgroundColor(Color.RED);
            else btn20189a.setBackgroundColor(Color.GREEN);
            btn201810a.setText(Vicente[9]);
            if(Vicente[9].equals("0"))
                btn201810a.setBackgroundColor(Color.RED);
            else btn201810a.setBackgroundColor(Color.GREEN);
            btn201811a.setText(Vicente[10]);
            if(Vicente[10].equals("0"))
                btn201811a.setBackgroundColor(Color.RED);
            else btn201811a.setBackgroundColor(Color.GREEN);
            btn201812a.setText(Vicente[11]);
            if(Vicente[11].equals("0"))
                btn201812a.setBackgroundColor(Color.RED);
            else btn201812a.setBackgroundColor(Color.GREEN);

            btn20181b.setText(Martin[0]);
            if(Martin[0].equals("0"))
                btn20181b.setBackgroundColor(Color.RED);
            else btn20181b.setBackgroundColor(Color.GREEN);
            btn20182b.setText(Martin[1]);
            if(Martin[1].equals("0"))
                btn20182b.setBackgroundColor(Color.RED);
            else btn20182b.setBackgroundColor(Color.GREEN);
            btn20183b.setText(Martin[2]);
            if(Martin[2].equals("0"))
                btn20183b.setBackgroundColor(Color.RED);
            else btn20183b.setBackgroundColor(Color.GREEN);
            btn20184b.setText(Martin[3]);
            if(Martin[3].equals("0"))
                btn20184b.setBackgroundColor(Color.RED);
            else btn20184b.setBackgroundColor(Color.GREEN);
            btn20185b.setText(Martin[4]);
            if(Martin[4].equals("0"))
                btn20185b.setBackgroundColor(Color.RED);
            else btn20185b.setBackgroundColor(Color.GREEN);
            btn20186b.setText(Martin[5]);
            if(Martin[5].equals("0"))
                btn20186b.setBackgroundColor(Color.RED);
            else btn20186b.setBackgroundColor(Color.GREEN);
            btn20187b.setText(Martin[6]);
            if(Martin[6].equals("0"))
                btn20187b.setBackgroundColor(Color.RED);
            else btn20187b.setBackgroundColor(Color.GREEN);
            btn20188b.setText(Martin[7]);
            if(Martin[7].equals("0"))
                btn20188b.setBackgroundColor(Color.RED);
            else btn20188b.setBackgroundColor(Color.GREEN);
            btn20189b.setText(Martin[8]);
            if(Martin[8].equals("0"))
                btn20189b.setBackgroundColor(Color.RED);
            else btn20189b.setBackgroundColor(Color.GREEN);
            btn201810b.setText(Martin[9]);
            if(Martin[9].equals("0"))
                btn201810b.setBackgroundColor(Color.RED);
            else btn201810b.setBackgroundColor(Color.GREEN);
            btn201811b.setText(Martin[10]);
            if(Martin[10].equals("0"))
                btn201811b.setBackgroundColor(Color.RED);
            else btn201811b.setBackgroundColor(Color.GREEN);
            btn201812b.setText(Martin[11]);
            if(Martin[11].equals("0"))
                btn201812b.setBackgroundColor(Color.RED);
            else btn201812b.setBackgroundColor(Color.GREEN);

            btn20181c.setText(Eloy[0]);
            if(Eloy[0].equals("0"))
                btn20181c.setBackgroundColor(Color.RED);
            else btn20181c.setBackgroundColor(Color.GREEN);
            btn20182c.setText(Eloy[1]);
            if(Eloy[1].equals("0"))
                btn20182c.setBackgroundColor(Color.RED);
            else btn20182c.setBackgroundColor(Color.GREEN);
            btn20183c.setText(Eloy[2]);
            if(Eloy[2].equals("0"))
                btn20183c.setBackgroundColor(Color.RED);
            else btn20183c.setBackgroundColor(Color.GREEN);
            btn20184c.setText(Eloy[3]);
            if(Eloy[3].equals("0"))
                btn20184c.setBackgroundColor(Color.RED);
            else btn20184c.setBackgroundColor(Color.GREEN);
            btn20185c.setText(Eloy[4]);
            if(Eloy[4].equals("0"))
                btn20185c.setBackgroundColor(Color.RED);
            else btn20185c.setBackgroundColor(Color.GREEN);
            btn20186c.setText(Eloy[5]);
            if(Eloy[5].equals("0"))
                btn20186c.setBackgroundColor(Color.RED);
            else btn20186c.setBackgroundColor(Color.GREEN);
            btn20187c.setText(Eloy[6]);
            if(Eloy[6].equals("0"))
                btn20187c.setBackgroundColor(Color.RED);
            else btn20187c.setBackgroundColor(Color.GREEN);
            btn20188c.setText(Eloy[7]);
            if(Eloy[7].equals("0"))
                btn20188c.setBackgroundColor(Color.RED);
            else btn20188c.setBackgroundColor(Color.GREEN);
            btn20189c.setText(Eloy[8]);
            if(Eloy[8].equals("0"))
                btn20189c.setBackgroundColor(Color.RED);
            else btn20189c.setBackgroundColor(Color.GREEN);
            btn201810c.setText(Eloy[9]);
            if(Eloy[9].equals("0"))
                btn201810c.setBackgroundColor(Color.RED);
            else btn201810c.setBackgroundColor(Color.GREEN);
            btn201811c.setText(Eloy[10]);
            if(Eloy[10].equals("0"))
                btn201811c.setBackgroundColor(Color.RED);
            else btn201811c.setBackgroundColor(Color.GREEN);
            btn201812c.setText(Eloy[11]);
            if(Eloy[11].equals("0"))
                btn201812c.setBackgroundColor(Color.RED);
            else btn201812c.setBackgroundColor(Color.GREEN);
        }
    }
    public void cambiarAnyo(View v){
        if(v.getTag().equals("2017")) {
            ly2017.setVisibility(View.VISIBLE);
            ly2018.setVisibility(View.GONE);
        }
        if(v.getTag().equals("2018")) {
            ly2017.setVisibility(View.GONE);
            ly2018.setVisibility(View.VISIBLE);
        }
        fecha = String.valueOf(v.getTag());
        cargarBotones();
    }
    public void realizarPago(View v){
        ContentValues registro;
        Integer codigo=obtenerCodigo();


        String[] valores;
        String personatge="", fecha="", pago="";

        valores=String.valueOf(v.getTag()).split("-");
        personatge=valores[0];
        fecha=valores[1];
        pago=valores[2];





        Boolean isExist=false;
        if(obtenerCodigo()==1)
            isExist=false;
        else isExist=true;

        if(isExist) {
            Integer codigoActualizacion=0;
                Cursor fila = bd.rawQuery(
                        "SELECT codigo FROM netflix WHERE personatges LIKE '"+personatge+"' AND fecha LIKE '"+fecha+"'", null);

                if(fila.moveToFirst()) {
                    codigoActualizacion=fila.getInt(0);
                }

            registro = new ContentValues();
            registro.put("pagos", pago);
            Toast.makeText(this, "Actualizamos el codigo: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            int cant = bd.update("netflix", registro, "codigo = '"+codigoActualizacion+"'", null);
                Toast.makeText(this, "Estamos actualizando: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            if (cant == 1) {
                Toast.makeText(this, "Se ha actualizado con exito", Toast.LENGTH_SHORT).show();
                cargarBotones();
            }
            else
                Toast.makeText(this, "Se ha producido un error inesperado", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "Creamos la tabla desde cero", Toast.LENGTH_SHORT).show();
            //Si la tabla esta vacia, la rellenamos
            String[] personatges={"Sento", "Martin", "Eloy"};
            String[] anyos={"2017", "2018"};
            String[] meses={"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

            for(int i=0; i<anyos.length;i++){
                for(int j=0;j<meses.length;j++){
                    for(int z=0;z<personatges.length;z++){
                        registro = new ContentValues();
                        codigo=obtenerCodigo();
                        registro.put("codigo", codigo);
                        registro.put("personatges", String.valueOf(personatges[z]));
                        registro.put("fecha", String.valueOf(meses[j]+"/"+anyos[i]));
                        registro.put("pagos", String.valueOf(0));

                        bd.insert("netflix", null, registro);
                    }
                }
            }
        }
        //bd.close();

    }
    public void aumentarDeuda(View v){
        Toast.makeText(this, "AUmentar deuda", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Anular pago", Toast.LENGTH_SHORT).show();

        ContentValues registro;
        Integer codigo=obtenerCodigo();


        String[] valores;
        String personatge="", fecha="", pago="";

        valores=String.valueOf(v.getTag()).split("-");
        personatge=valores[0];
        fecha=valores[1];
        pago="-3";





        Boolean isExist=false;
        if(obtenerCodigo()==1)
            isExist=false;
        else isExist=true;

        if(isExist) {
            Integer codigoActualizacion=0;
            Cursor fila = bd.rawQuery(
                    "SELECT codigo FROM netflix WHERE personatges LIKE '"+personatge+"' AND fecha LIKE '"+fecha+"'", null);

            if(fila.moveToFirst()) {
                codigoActualizacion=fila.getInt(0);
            }

            registro = new ContentValues();
            registro.put("pagos", pago);
            Toast.makeText(this, "Actualizamos el codigo: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            int cant = bd.update("netflix", registro, "codigo = '"+codigoActualizacion+"'", null);
            Toast.makeText(this, "Estamos actualizando: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            if (cant == 1) {
                Toast.makeText(this, "Se ha actualizado con exito", Toast.LENGTH_SHORT).show();
                cargarBotones();
            }
            else
                Toast.makeText(this, "Se ha producido un error inesperado", Toast.LENGTH_SHORT).show();

        }
    }
    public void anularPago(View v){
        Toast.makeText(this, "Anular pago", Toast.LENGTH_SHORT).show();

        ContentValues registro;
        Integer codigo=obtenerCodigo();


        String[] valores;
        String personatge="", fecha="", pago="";

        valores=String.valueOf(v.getTag()).split("-");
        personatge=valores[0];
        fecha=valores[1];
        pago="0";





        Boolean isExist=false;
        if(obtenerCodigo()==1)
            isExist=false;
        else isExist=true;

        if(isExist) {
            Integer codigoActualizacion=0;
            Cursor fila = bd.rawQuery(
                    "SELECT codigo FROM netflix WHERE personatges LIKE '"+personatge+"' AND fecha LIKE '"+fecha+"'", null);

            if(fila.moveToFirst()) {
                codigoActualizacion=fila.getInt(0);
            }

            registro = new ContentValues();
            registro.put("pagos", pago);
            Toast.makeText(this, "Actualizamos el codigo: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            int cant = bd.update("netflix", registro, "codigo = '"+codigoActualizacion+"'", null);
            Toast.makeText(this, "Estamos actualizando: "+codigoActualizacion, Toast.LENGTH_SHORT).show();
            if (cant == 1) {
                Toast.makeText(this, "Se ha actualizado con exito", Toast.LENGTH_SHORT).show();
                cargarBotones();
            }
            else
                Toast.makeText(this, "Se ha producido un error inesperado", Toast.LENGTH_SHORT).show();

        }
        //bd.close();

    }
    public Integer obtenerCodigo(){

        Integer codigo=0;
        String nombre="";
        Cursor fila = bd.rawQuery(
                "SELECT codigo FROM netflix ORDER BY codigo DESC", null);
        if(fila.moveToFirst()) {
            codigo = fila.getInt(0);
            codigo++;
        }
        else codigo=1;

        return codigo;
    }
}
