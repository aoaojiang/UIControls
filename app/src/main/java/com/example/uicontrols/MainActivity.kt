package com.example.uicontrols

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val clickListener = View.OnClickListener {
        textView.text = "Button3 Clicked!"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            textView.text = "Button2 Clicked!"
        }

        button3.setOnClickListener(clickListener)
    }

    fun onButton1Clicked(view: View) {
        textView.text = "Button1 Clicked!"
    }

    fun onImageButtonClicked(view: View) {
        when (view.id) {
            R.id.imageButton1 -> textView.text = "ImageButton1 Clicked"
            R.id.imageButton2 -> textView.text = "ImageButton2 Clicked"
        }
    }

    fun onRadioClicked(view: View) {
        textView.text = (view as RadioButton).text
    }

    fun onCheckBoxClicked(view: View) {
        if (checkBox.isChecked)
            textView.text = "CheckBox is checked."
        else
            textView.text = "CheckBox is unchecked."
    }
}
