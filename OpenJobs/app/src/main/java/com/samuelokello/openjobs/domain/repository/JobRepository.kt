package com.samuelokello.openjobs.domain.repository

import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.data.remote.dto.PositionDTO
import com.samuelokello.openjobs.domain.model.Position

interface JobRepository {
    suspend fun getOpenPositions(): Resource<List<Position>>
}
