package ihc.unb.com.br.myline.myline.screens.account;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ihc.unb.com.br.myline.R;
import ihc.unb.com.br.myline.myline.screens.container.ContainerActivity;

public class AccountFragment extends AppCompatActivity {

    private TextView buttonSignup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_account);

        buttonSignup = (TextView) findViewById(R.id.btn_create);

        buttonSignup.setOnClickListener(buttonClickListener);
    }

    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            startActivity(new Intent(getApplicationContext(), ContainerActivity.class));
            Toast.makeText(getApplicationContext(), "Cadastro efetuado com sucesso!", Toast.LENGTH_SHORT).show();

        }
    };
}
