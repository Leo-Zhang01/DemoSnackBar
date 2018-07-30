package sg.edu.rp.c346.demosnackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLauncher, btnLauncher1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLauncher =  findViewById(R.id.btnLauncher);
        btnLauncher1 = findViewById(R.id.btnLauncher1);


        btnLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(v, "Yum Yum!!", Snackbar.LENGTH_SHORT).show();
            }
        });

        btnLauncher1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar sb = Snackbar.make(v, "Yum Yum!!", Snackbar.LENGTH_SHORT);

                sb.setAction("Get a Toast!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Missed me?",Toast.LENGTH_SHORT).show();
                    }
                });

                sb.show();
            }
        });

    }

}
