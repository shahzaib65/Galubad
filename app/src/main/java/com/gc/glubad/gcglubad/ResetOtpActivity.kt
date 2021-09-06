package com.gc.glubad.gcglubad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.gc.glubad.gcglubad.databinding.ActivityResetOtpBinding

class ResetOtpActivity : AppCompatActivity() {
    lateinit var binding: ActivityResetOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ED1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            @SuppressLint("ResourceAsColor")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.ED1.text.length == 1) {
                    binding.ED2.requestFocus()
                    binding.ED1.setBackgroundResource(R.drawable.edit_fill_bg)
                    binding.ED1.setTextColor(resources.getColor(R.color.white))

                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
        binding.ED2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("ResourceAsColor")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.ED2.text.length == 1) {
                    binding.ED3.requestFocus()
                    binding.ED2.setBackgroundResource(R.drawable.edit_fill_bg)
                    binding.ED2.setTextColor(resources.getColor(R.color.white))
                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
        binding.ED3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            @SuppressLint("ResourceAsColor")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.ED3.text.length == 1) {
                    binding.ED4.requestFocus()
                    binding.ED3.setBackgroundResource(R.drawable.edit_fill_bg)
                    binding.ED3.setTextColor(resources.getColor(R.color.white))
                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
        binding.ED4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            @SuppressLint("ResourceAsColor")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (binding.ED4.text.length == 1) {
                    binding.ED4.setBackgroundResource(R.drawable.edit_fill_bg)
                    binding.ED4.setTextColor(resources.getColor(R.color.white))
                }
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
    }
}