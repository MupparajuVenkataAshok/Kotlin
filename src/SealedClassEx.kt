class SealedClassEx {
}
sealed class NetworkResult(){
    data class Success(val data:String): NetworkResult()
    data class Failure(val errormessage:String): NetworkResult()
    object Loading:NetworkResult()
}
fun main(){
    val success = NetworkResult.Success("data recieved")
    val failure = NetworkResult.Failure("Internal Server Error")
    val loading = NetworkResult.Loading
    handleNetworkResult(success)
    handleNetworkResult(failure)
    handleNetworkResult(loading)
}
fun handleNetworkResult(networkResult: NetworkResult){
    when(networkResult){
        is NetworkResult.Success ->{
            println("Success : ${networkResult.data}")
        }
        is NetworkResult.Failure ->{
            println("Failure : ${networkResult.errormessage}")
        }
        is NetworkResult.Loading ->{
            println("Loading...")
        }
    }
}

