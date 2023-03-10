package com.itzone.adshelper

class FunctionUtils {
    fun addUser(email:String, password:String): Boolean{
         if (email != "" && password != ""){
             return false
        }
        return true
    }
}