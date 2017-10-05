package com.alexandercasal.devslopes.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alexandercasal.devslopes.swoosh.R
import com.alexandercasal.devslopes.swoosh.model.Player
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var mPlayer: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        mPlayer = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelable(EXTRA_PLAYER, mPlayer)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            mPlayer = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onSelectBeginner(view: View) {
        toggle_baller.isChecked = false
        mPlayer.skill = "Beginner"
    }

    fun onSelectBaller(view: View) {
        toggle_beginner.isChecked = false
        mPlayer.skill = "Baller"
    }

    fun onClickFinish(view: View) {
        if (toggle_beginner.isChecked || toggle_baller.isChecked) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, mPlayer)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
