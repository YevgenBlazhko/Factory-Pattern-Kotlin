package com.app.factorypatternkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  private val hireBtn: Button by lazy { findViewById(R.id.hire_btn)}
  private val specialistRg: RadioGroup by lazy { findViewById(R.id.specialist_rg) }
  private val salaryTv: TextView by lazy { findViewById(R.id.salary_tv) }
  private val program: Program by lazy { Program() }

  lateinit var speciality: String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    hireBtn.setOnClickListener {
      program.hireDeveloper(this, speciality)
    }

    specialistRg.setOnCheckedChangeListener { _, checkedId ->
      hireBtn.isEnabled = true
      val salaryMessage = when (checkedId) {
        R.id.java_dev_rb -> {
          speciality = "java"
          "Salary Java Developer: $${program.learnSalaryDeveloper(speciality)}"
        }
        R.id.php_dev_rb -> {
          speciality = "php"
          "Salary PHP Developer: $${program.learnSalaryDeveloper(speciality)}"
        }
        R.id.cpp_dev_rb -> {
          speciality = "c++"
          "Salary C++ Developer: $${program.learnSalaryDeveloper(speciality)}"
        }
        else -> "Unknown developer"
      }
      salaryTv.text = salaryMessage
    }
  }
}