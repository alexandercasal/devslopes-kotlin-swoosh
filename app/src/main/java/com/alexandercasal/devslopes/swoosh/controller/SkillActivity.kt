package com.alexandercasal.devslopes.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_LEAGUE
import com.alexandercasal.devslopes.swoosh.R
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var mSelectedLeague = ""
    var mSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        mSelectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSelectBeginner(view: View) {
        toggle_baller.isChecked = false
        mSkill = "Beginner"
    }

    fun onSelectBaller(view: View) {
        toggle_beginner.isChecked = false
        mSkill = "Baller"
    }

    fun onClickFinish(view: View) {
        if (toggle_beginner.isChecked || toggle_baller.isChecked) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, mSelectedLeague)
            finishActivity.putExtra(EXTRA_SKILL, mSkill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
