package com.example.icph;

public class AccountActivity {
    public class AccountActivity extends AppCompatActivity {

        private TextView tvNickname;
        private TextView tvLevel;
        private Button btnLogout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_account);

            // 获取布局中的元素
            tvNickname = findViewById(R.id.tv_nickname);
            tvLevel = findViewById(R.id.tv_level);
            btnLogout = findViewById(R.id.btn_logout);

            // 设置昵称和等级等元素的展示
            String nickname = "用户名"; // 替换为从数据库获取的昵称
            int level = 1; // 替换为从数据库获取的等级
            tvNickname.setText("昵称：" + nickname);
            tvLevel.setText("等级：" + level);

            // 设置退出登录按钮的点击事件
            btnLogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 实现退出登录逻辑
                    finish();
                }
            });
        }
    }



}
