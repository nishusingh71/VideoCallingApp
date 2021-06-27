package com.example.videocallingapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.jitsi.meet.sdk.JitsiMeetActivity
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.conferenceName)

    }

    fun onButtonClick(view: View) {
        val text=editText.text.toString()
        if (text.isNotEmpty()){
            val options=JitsiMeetConferenceOptions.Builder()
                .setRoom(text)
                .build()
            JitsiMeetActivity.launch(this,options)
        }
    }
}