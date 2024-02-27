package com.example.celciuswarehouse.domain.base

import com.bumptech.glide.load.engine.Resource
import kotlinx.coroutines.flow.Flow

abstract class BaseUseCase<in Q, out T> {

    abstract suspend fun execute(request: Q): Flow<Resource<@UnsafeVariance T?>>
}