package cn.edu.tongji.sse.twitch.gkd.view.PersonalView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.tongji.sse.twitch.gkd.R;
import cn.edu.tongji.sse.twitch.gkd.view.RunningView.RunningActivity;
import cn.edu.tongji.sse.twitch.gkd.view.SettingView.SystemSettingActivity;
import cn.edu.tongji.sse.twitch.gkd.view.SocialView.SocialActivity;

public class PersonalActivity extends AppCompatActivity implements IPersonalView{
    private ImageButton personal,running,create_post,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_ui);

        personal=findViewById(R.id.personnal);
        running=findViewById(R.id.running);
        create_post=findViewById(R.id.create_post);
        setting=findViewById(R.id.setting);

        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, PersonalActivity.class);
                startActivity(intent);
            }
        });

        running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, RunningActivity.class);
                startActivity(intent);
            }
        });

        create_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, SocialActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalActivity.this, SystemSettingActivity.class);
                startActivity(intent);
            }
        });
    }
}