package com.app.factorypatternkotlin.php

import com.app.factorypatternkotlin.Developer
import com.app.factorypatternkotlin.DeveloperFactory

class PhpDeveloperFactory: DeveloperFactory {
  override fun hireDeveloper(): Developer {
    return PhpDeveloper()
  }
}