package com.ardi.appbiodatauts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAlamat;
    private Button btnTelp;
    private Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlamat=(Button)findViewById(R.id.btn_alamat);
        btnTelp=(Button)findViewById(R.id.btn_telp);
        btnEmail=(Button) findViewById(R.id.btn_email);
    }
    public void bukaLokasi(View view) {
        Uri uri1 = Uri.parse("geo:0,0?q=-6.7129327, 111.1398008");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri1);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void bukaTelepon(View view) {
        String phone = "082235593947";
        Intent telpIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(telpIntent);
    }
    public void bukaEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","111202113790@mhs.dinus.ac.id", null));
        startActivity(emailIntent);
    }
}