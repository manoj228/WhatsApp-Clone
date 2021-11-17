package manoj.appcomp.whatsapp_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import manoj.appcomp.whatsapp_clone.Adapter.FragmentAdapter;
import manoj.appcomp.whatsapp_clone.databinding.ActivityMainBinding;
import manoj.appcomp.whatsapp_clone.databinding.ActivitySignInBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mAuth = FirebaseAuth.getInstance();

        // set binding for fragments
        binding.viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.settings:
               startActivity(new Intent(MainActivity.this, SettingsActivity.class));
               break;

            case R.id.groupChat:
                startActivity(new Intent(MainActivity.this, GroupChatActivity.class));
                break;

            case R.id.logout:
                mAuth.signOut();
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}