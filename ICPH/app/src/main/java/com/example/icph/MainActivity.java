package com.example.icph;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    RadioButton radiobutton_recommendation;
    RadioButton radiobutton_invitation;
    RadioButton radiobutton_tool;
    RadioButton radiobutton_material;
    RadioButton radiobutton_account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabInitialization();


        //监听
        RadioGroup radioGroup= this.findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            Drawable drawable_recommendation_selected;
            Drawable drawable_recommendation_unselected;
            Drawable drawable_invitation_selected;
            Drawable drawable_invitation_unselected;
            Drawable drawable_tool_selected;
            Drawable drawable_tool_unselected;
            Drawable drawable_material_selected;
            Drawable drawable_material_unselected;
            Drawable drawable_account_selected;
            Drawable drawable_account_unselected;


            //检查并更改
            if(checkedId==R.id.tab_recommendation) {

                drawable_recommendation_selected = ResourcesCompat.getDrawable(getResources(), R.drawable.recommendation_selected, null);
                assert drawable_recommendation_selected != null;
                drawable_recommendation_selected.setBounds(0, 0, 30, 30);
                radiobutton_recommendation = findViewById(R.id.tab_recommendation);
                radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_selected, null, null);

                drawable_invitation_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.invitation_unselected, null);
                assert drawable_invitation_unselected != null;
                drawable_invitation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_invitation = findViewById(R.id.tab_invitation);
                radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_unselected, null, null);

                drawable_tool_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.tool_unselected, null);
                assert drawable_tool_unselected != null;
                drawable_tool_unselected.setBounds(0, 0, 30, 30);
                radiobutton_tool = findViewById(R.id.tab_tool);
                radiobutton_tool.setCompoundDrawables(null, drawable_tool_unselected, null, null);

                drawable_material_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.material_unselected, null);
                assert drawable_material_unselected != null;
                drawable_material_unselected.setBounds(0, 0, 30, 30);
                radiobutton_material = findViewById(R.id.tab_material);
                radiobutton_material.setCompoundDrawables(null, drawable_material_unselected, null, null);

                drawable_account_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.account_unselected, null);
                assert drawable_account_unselected != null;
                drawable_account_unselected.setBounds(0, 0, 30, 30);
                radiobutton_account = findViewById(R.id.tab_account);
                radiobutton_account.setCompoundDrawables(null, drawable_account_unselected, null, null);

            } else if (checkedId==R.id.tab_invitation) {

                drawable_recommendation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.recommendation_unselected,null);
                assert drawable_recommendation_unselected != null;
                drawable_recommendation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_recommendation=findViewById(R.id.tab_recommendation);
                radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_unselected, null,null);

                drawable_invitation_selected = ResourcesCompat.getDrawable(getResources(),R.drawable.invitation_selected,null);
                assert drawable_invitation_selected != null;
                drawable_invitation_selected.setBounds(0, 0, 30, 30);
                radiobutton_invitation=findViewById(R.id.tab_invitation);
                radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_selected, null,null);

                drawable_tool_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.tool_unselected,null);
                assert drawable_tool_unselected != null;
                drawable_tool_unselected.setBounds(0, 0, 30, 30);
                radiobutton_tool=findViewById(R.id.tab_tool);
                radiobutton_tool.setCompoundDrawables(null, drawable_tool_unselected, null,null);

                drawable_material_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.material_unselected,null);
                assert drawable_material_unselected != null;
                drawable_material_unselected.setBounds(0, 0, 30, 30);
                radiobutton_material=findViewById(R.id.tab_material);
                radiobutton_material.setCompoundDrawables(null, drawable_material_unselected, null,null);

                drawable_account_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.account_unselected,null);
                assert drawable_account_unselected != null;
                drawable_account_unselected.setBounds(0, 0, 30, 30);
                radiobutton_account=findViewById(R.id.tab_account);
                radiobutton_account.setCompoundDrawables(null, drawable_account_unselected, null,null);

            } else if (checkedId==R.id.tab_tool) {

                drawable_recommendation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.recommendation_unselected,null);
                assert drawable_recommendation_unselected != null;
                drawable_recommendation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_recommendation=findViewById(R.id.tab_recommendation);
                radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_unselected, null,null);

                drawable_invitation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.invitation_unselected,null);
                assert drawable_invitation_unselected != null;
                drawable_invitation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_invitation=findViewById(R.id.tab_invitation);
                radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_unselected, null,null);

                drawable_tool_selected = ResourcesCompat.getDrawable(getResources(),R.drawable.tool_selected,null);
                assert drawable_tool_selected != null;
                drawable_tool_selected.setBounds(0, 0, 30, 30);
                radiobutton_tool=findViewById(R.id.tab_tool);
                radiobutton_tool.setCompoundDrawables(null, drawable_tool_selected, null,null);

                drawable_material_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.material_unselected,null);
                assert drawable_material_unselected != null;
                drawable_material_unselected.setBounds(0, 0, 30, 30);
                radiobutton_material=findViewById(R.id.tab_material);
                radiobutton_material.setCompoundDrawables(null, drawable_material_unselected, null,null);

                drawable_account_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.account_unselected,null);
                assert drawable_account_unselected != null;
                drawable_account_unselected.setBounds(0, 0, 30, 30);
                radiobutton_account=findViewById(R.id.tab_account);
                radiobutton_account.setCompoundDrawables(null, drawable_account_unselected, null,null);

            } else if (checkedId==R.id.tab_material) {

                drawable_recommendation_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.recommendation_unselected, null);
                assert drawable_recommendation_unselected != null;
                drawable_recommendation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_recommendation = findViewById(R.id.tab_recommendation);
                radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_unselected, null, null);

                drawable_invitation_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.invitation_unselected, null);
                assert drawable_invitation_unselected != null;
                drawable_invitation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_invitation = findViewById(R.id.tab_invitation);
                radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_unselected, null, null);

                drawable_tool_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.tool_unselected, null);
                assert drawable_tool_unselected != null;
                drawable_tool_unselected.setBounds(0, 0, 30, 30);
                radiobutton_tool = findViewById(R.id.tab_tool);
                radiobutton_tool.setCompoundDrawables(null, drawable_tool_unselected, null, null);

                drawable_material_selected = ResourcesCompat.getDrawable(getResources(), R.drawable.material_selected, null);
                assert drawable_material_selected != null;
                drawable_material_selected.setBounds(0, 0, 30, 30);
                radiobutton_material = findViewById(R.id.tab_material);
                radiobutton_material.setCompoundDrawables(null, drawable_material_selected, null, null);

                drawable_account_unselected = ResourcesCompat.getDrawable(getResources(), R.drawable.account_unselected, null);
                assert drawable_account_unselected != null;
                drawable_account_unselected.setBounds(0, 0, 30, 30);
                radiobutton_account = findViewById(R.id.tab_account);
                radiobutton_account.setCompoundDrawables(null, drawable_account_unselected, null, null);

            } else if (checkedId==R.id.tab_account) {

                drawable_recommendation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.recommendation_unselected,null);
                assert drawable_recommendation_unselected != null;
                drawable_recommendation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_recommendation=findViewById(R.id.tab_recommendation);
                radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_unselected, null,null);

                drawable_invitation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.invitation_unselected,null);
                assert drawable_invitation_unselected != null;
                drawable_invitation_unselected.setBounds(0, 0, 30, 30);
                radiobutton_invitation=findViewById(R.id.tab_invitation);
                radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_unselected, null,null);

                drawable_tool_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.tool_unselected,null);
                assert drawable_tool_unselected != null;
                drawable_tool_unselected.setBounds(0, 0, 30, 30);
                radiobutton_tool=findViewById(R.id.tab_tool);
                radiobutton_tool.setCompoundDrawables(null, drawable_tool_unselected, null,null);

                drawable_material_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.material_unselected,null);
                assert drawable_material_unselected != null;
                drawable_material_unselected.setBounds(0, 0, 30, 30);
                radiobutton_material=findViewById(R.id.tab_material);
                radiobutton_material.setCompoundDrawables(null, drawable_material_unselected, null,null);

                drawable_account_selected = ResourcesCompat.getDrawable(getResources(),R.drawable.account_selected,null);
                assert drawable_account_selected != null;
                drawable_account_selected.setBounds(0, 0, 30, 30);
                radiobutton_account=findViewById(R.id.tab_account);
                radiobutton_account.setCompoundDrawables(null, drawable_account_selected, null,null);

            }
        });






    }

    //https://blog.csdn.net/thw_m/article/details/79112386?ops_request_misc=&request_id=&biz_id=102&utm_term=radiobutton%20%E9%80%89%E9%A1%B9%E5%8D%A1&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-3-79112386.142^v73^control,201^v4^add_ask,239^v2^insert_chatgpt&spm=1018.2226.3001.4187
    public void TabInitialization(){
        Drawable drawable_recommendation_selected = ResourcesCompat.getDrawable(getResources(),R.drawable.recommendation_selected,null);
        assert drawable_recommendation_selected != null;
        drawable_recommendation_selected.setBounds(0, 0, 30, 30);
        radiobutton_recommendation=findViewById(R.id.tab_recommendation);
        radiobutton_recommendation.setCompoundDrawables(null, drawable_recommendation_selected, null,null);

        Drawable drawable_invitation_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.invitation_unselected,null);
        assert drawable_invitation_unselected != null;
        drawable_invitation_unselected.setBounds(0, 0, 30, 30);
        radiobutton_invitation=findViewById(R.id.tab_invitation);
        radiobutton_invitation.setCompoundDrawables(null, drawable_invitation_unselected, null,null);

        Drawable drawable_tool_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.tool_unselected,null);
        assert drawable_tool_unselected != null;
        drawable_tool_unselected.setBounds(0, 0, 30, 30);
        radiobutton_tool=findViewById(R.id.tab_tool);
        radiobutton_tool.setCompoundDrawables(null, drawable_tool_unselected, null,null);

        Drawable drawable_material_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.material_unselected,null);
        assert drawable_material_unselected != null;
        drawable_material_unselected.setBounds(0, 0, 30, 30);
        radiobutton_material=findViewById(R.id.tab_material);
        radiobutton_material.setCompoundDrawables(null, drawable_material_unselected, null,null);

        Drawable drawable_account_unselected = ResourcesCompat.getDrawable(getResources(),R.drawable.account_unselected,null);
        assert drawable_account_unselected != null;
        drawable_account_unselected.setBounds(0, 0, 30, 30);
        radiobutton_account=findViewById(R.id.tab_account);
        radiobutton_account.setCompoundDrawables(null, drawable_account_unselected, null,null);
    }



}