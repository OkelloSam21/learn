package com.samuelokello.openjobs.data

import com.samuelokello.openjobs.data.remote.ApiClient
import com.samuelokello.openjobs.data.remote.api.KtorApiClient
import com.samuelokello.openjobs.data.remote.dto.PositionDTO
import com.samuelokello.openjobs.data.remote.helper.Endpoint
import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.domain.model.Position
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import kotlinx.serialization.json.Json

class ApiClientImpl(private val ktorApiClient: KtorApiClient) : ApiClient {
    private val json = Json { ignoreUnknownKeys = true }
    override suspend fun getPositions(): Resource<List<Position>> {
        return try {
            val response: HttpResponse = ktorApiClient.getKtorHttpClient().get {
                url(Endpoint.AllJobs.route)
            }
            val data = json.decodeFromString<List<Position>>(response.bodyAsText())
            Resource.Success(data)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage ?: "An error occurred")
        }
    }

    override suspend fun getPositionById(id: Int): Resource<PositionDTO> {
        TODO("Not yet implemented")
    }
}