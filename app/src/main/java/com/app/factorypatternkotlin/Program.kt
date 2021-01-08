package com.app.factorypatternkotlin

import android.content.Context
import com.app.factorypatternkotlin.Show.log
import com.app.factorypatternkotlin.Show.toast
import com.app.factorypatternkotlin.cpp.CppDeveloperFactory
import com.app.factorypatternkotlin.java.JavaDeveloperFactory
import com.app.factorypatternkotlin.php.PhpDeveloperFactory

class Program {

  companion object {
    fun hireDeveloperBySpecialty(specialty: String): DeveloperFactory {
      return when {
        specialty.equals("java", ignoreCase = true) -> JavaDeveloperFactory()
        specialty.equals("c++", ignoreCase = true) -> CppDeveloperFactory()
        specialty.equals("php", ignoreCase = true) -> PhpDeveloperFactory()
        else -> throw RuntimeException ("$specialty is unknown")
      }
    }
  }

  fun hireDeveloper(ctx: Context, specialty: String) {
    hiringDeveloper(ctx, specialty)
  }

  private fun hiringDeveloper(ctx: Context, specialty: String) {
    try {
      val developerFactory = hireDeveloperBySpecialty(specialty)
      val developer = developerFactory.hireDeveloper()
      val hiredDeveloper = developer.hireDeveloper()
      toast(ctx, hiredDeveloper)
    } catch (e: Exception) {
      log(e.toString())
    }
  }

  fun learnSalaryDeveloper(specialty: String): Int {
    return getSalaryDeveloper(specialty)
  }

  private fun getSalaryDeveloper(specialty: String): Int {
    return try {
      val developerFactory = hireDeveloperBySpecialty(specialty)
      val developer = developerFactory.hireDeveloper()
      developer.getSalary()
    } catch (e: Exception) {
      log(e.toString())
      0
    }
  }
}