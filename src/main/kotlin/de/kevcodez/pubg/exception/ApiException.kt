package de.kevcodez.pubg.exception

//import okhttp3.Response

class ApiException(private val responseCode: Int, private val responseMessage: String) : RuntimeException() {

    override fun toString(): String {
        return "API Exception\nResponse status code: $responseCode\nResponse body: $responseMessage"
    }

    fun getResponseCode(): Int {
        return responseCode
    }

    fun getResponseMessage(): String {
        return responseMessage
    }
}
