package com.example.trafficregulations

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var rulesCheckBox: CheckBox
    private lateinit var infoTextView: TextView
    private lateinit var rulesTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rulesCheckBox = findViewById(R.id.rulesCheckBox)
        infoTextView = findViewById(R.id.infoTextView)
        rulesTextView = findViewById(R.id.rulesTextView)

        rulesCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                infoTextView.text = getString(R.string.rules_title)
                rulesTextView.text = getString(
                    R.string.rules_list,
                    getString(R.string.rule_1),
                    getString(R.string.rule_2),
                    getString(R.string.rule_3),
                    getString(R.string.rule_4),
                    getString(R.string.rule_5)
                )
            } else {
                infoTextView.text = getString(R.string.info_text)
                rulesTextView.text = ""
            }
        }
    }
}


