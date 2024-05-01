package com.samuelokello.openjobs.domain.use_case.get_jobs

import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.domain.model.Position
import com.samuelokello.openjobs.domain.repository.JobRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FetchAllOpenPositionsUseCase(private val repository: JobRepository) {
    fun execute(): Flow<Resource<List<Position>>> = flow {
        try {
            val response = repository.getOpenPositions()
            emit(response)
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message ?: "An error occurred"))
        }
    }
}