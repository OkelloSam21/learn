package com.samuelokello.openjobs.data.repository

import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.data.remote.ApiClient
import com.samuelokello.openjobs.data.remote.dto.PositionDTO
import com.samuelokello.openjobs.domain.model.Position
import com.samuelokello.openjobs.domain.repository.JobRepository

class JobRepositoryImpl(private val apiClient: ApiClient) : JobRepository {
    override suspend fun getOpenPositions(): Resource<List<Position>> {
        return apiClient.getPositions()
    }
}