package com.app.factorypatternkotlin.java

import com.app.factorypatternkotlin.Developer
import com.app.factorypatternkotlin.DeveloperFactory

class JavaDeveloperFactory: DeveloperFactory {
  override fun hireDeveloper(): Developer {
    return JavaDeveloper()
  }
}