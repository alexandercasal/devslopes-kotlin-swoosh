package com.alexandercasal.devslopes.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var mSelectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        mSelectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
