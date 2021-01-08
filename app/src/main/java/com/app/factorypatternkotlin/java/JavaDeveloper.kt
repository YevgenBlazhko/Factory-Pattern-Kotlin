package com.app.factorypatternkotlin.java

import com.app.factorypatternkotlin.Developer

class JavaDeveloper: Developer {
  override fun hireDeveloper(): String {
    return "You hired Java Developer"
  }

  override fun getSalary(): Int {
    return 2500
  }
}