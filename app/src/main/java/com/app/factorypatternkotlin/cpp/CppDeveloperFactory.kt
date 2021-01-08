package com.app.factorypatternkotlin.cpp

import com.app.factorypatternkotlin.Developer
import com.app.factorypatternkotlin.DeveloperFactory

class CppDeveloperFactory: DeveloperFactory {
  override fun hireDeveloper(): Developer {
    return CppDeveloper()
  }
}