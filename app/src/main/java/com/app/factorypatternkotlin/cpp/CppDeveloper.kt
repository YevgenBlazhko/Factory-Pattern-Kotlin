package com.app.factorypatternkotlin.cpp

import com.app.factorypatternkotlin.Developer

class CppDeveloper: Developer {
  override fun hireDeveloper(): String {
    return "You hired C++ developer"
  }

  override fun getSalary(): Int {
    return 1800
  }
}