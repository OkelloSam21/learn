package com.samuelokello.openjobs.data.remote.api

import android.net.sip.SipErrorCode.TIME_OUT
import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import java.util.concurrent.TimeUnit

class KtorApiClient {
    private val httpClient = HttpClient(OkHttp) {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )

            engine {
                config {
                    connectTimeout(TIME_OUT.toLong(), TimeUnit.MICROSECONDS)
                    readTimeout(TIME_OUT.toLong(), TimeUnit.MICROSECONDS)
                    writeTimeout(TIME_OUT.toLong(), TimeUnit.MICROSECONDS)
                }
            }

        }

        install(Logging) {
            object : Logger {
                override fun log(message: String) {
                    Log.v("Logger Ktor =>", message)
                }
            }
            level = LogLevel.ALL
        }

        install(ResponseObserver) {
            onResponse { response ->
                Log.d("HTTP status: ", "${response.status.value}")
            }
        }

        install(DefaultRequest) {
            header(HttpHeaders.ContentType, ContentType.Application.Json)
        }
    }

    fun getKtorHttpClient(): HttpClient{
        return httpClient
    }
}