package com.localdriveai.app

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message = TextView(this).apply {
            text = """
                LOCAL DRIVE AI

                Project initialized.

                Android Auto media service:
                Ready

                Next:
                Connect audio sources
                Add connection monitoring
                Test with your vehicle
            """.trimIndent()

            textSize = 18f
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }

        setContentView(message)
    }
}
