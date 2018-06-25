package ihc.unb.com.br.myline.myline.screens.Login;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.screens.container.ContainerActivity;

public class LoginActivity extends AppCompatActivity {

    private View view;
    private Button buttonLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        buttonLogin = (Button) findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(buttonClickListener);
    }

    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            startActivity(new Intent(getApplicationContext(), ContainerActivity.class));

        }
    };
}
