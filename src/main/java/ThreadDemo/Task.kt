package ThreadDemo

import java.util.concurrent.Callable

class Task : Callable<String>{
    override fun call(): String {
        val result =""
        result.apply {  }
        return  result
    }

}