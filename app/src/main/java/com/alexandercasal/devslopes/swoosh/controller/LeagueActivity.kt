package com.alexandercasal.devslopes.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alexandercasal.devslopes.swoosh.utilities.EXTRA_LEAGUE
import com.alexandercasal.devslopes.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var mSelectedLeague:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (toggle_mens.isChecked || toggle_womens.isChecked || toggle_coed.isChecked) {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, mSelectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

    fun onSelectMens(view: View) {
        toggle_womens.isChecked = false
        toggle_coed.isChecked = false
        mSelectedLeague = "Mens"
    }

    fun onSelectWomens(view: View) {
        toggle_mens.isChecked = false
        toggle_coed.isChecked = false
        mSelectedLeague = "Womens"
    }

    fun onSelectCoEd(view: View) {
        toggle_mens.isChecked = false
        toggle_womens.isChecked = false
        mSelectedLeague = "CoEd"
    }
}
