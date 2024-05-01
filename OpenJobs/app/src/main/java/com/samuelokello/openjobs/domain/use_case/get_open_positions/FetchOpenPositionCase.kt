package com.samuelokello.openjobs.domain.use_case.get_open_positions

import com.samuelokello.openjobs.data.remote.ApiClient
import com.samuelokello.openjobs.data.repository.JobRepositoryImpl
import com.samuelokello.openjobs.domain.repository.JobRepository

class FetchOpenPositionCase (private val api:ApiClient){
    private val jobRepository:JobRepository = JobRepositoryImpl(api)
    suspend operator fun invoke() = jobRepository.getOpenPositions()
}