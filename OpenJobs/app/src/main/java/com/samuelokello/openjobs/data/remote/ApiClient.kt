package com.samuelokello.openjobs.data.remote

import com.samuelokello.openjobs.data.remote.helper.Resource
import com.samuelokello.openjobs.data.remote.dto.PositionDTO
import com.samuelokello.openjobs.domain.model.Position

interface ApiClient {
suspend fun getPositions(): Resource<List<Position>>
suspend fun getPositionById(id: Int): Resource<PositionDTO>
}