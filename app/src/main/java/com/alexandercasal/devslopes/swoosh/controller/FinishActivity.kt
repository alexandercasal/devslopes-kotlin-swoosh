package com.alexandercasal.devslopes.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alexandercasal.devslopes.swoosh.R
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_LEAGUE
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        text_search_leagues.text = "Looking for $league $skill league near you..."
    }
}
