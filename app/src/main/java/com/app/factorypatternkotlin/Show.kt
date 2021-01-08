package com.app.factorypatternkotlin

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.app.factorypatternkotlin.Const.TAG

object Show {
  fun log(message: String) {
    Log.i(TAG, message)
  }
  fun toast(ctx: Context, message: String) {
    Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show()
  }
}