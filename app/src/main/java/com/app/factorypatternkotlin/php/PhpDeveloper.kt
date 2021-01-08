package com.app.factorypatternkotlin.php

import com.app.factorypatternkotlin.Developer

class PhpDeveloper: Developer {
  override fun hireDeveloper(): String {
    return "You hired PHP developer"
  }

  override fun getSalary(): Int {
    return 2300
  }
}