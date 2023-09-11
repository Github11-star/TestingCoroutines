package com.firozpocyt.testingcoroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Util(private val dispatcher: CoroutineDispatcher) {

    suspend fun getUserName(): String{
        delay(10000)
        return "FirozPOC"
    }

    suspend fun getUser(): String {
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
        }
        return "User - FirozPOC"
    }

    suspend fun getAddress(): String {
        withContext(dispatcher){
            delay(5000)
        }
        return "User - Address"
    }
}