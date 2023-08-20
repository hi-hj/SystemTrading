package com.data.handler.application.port.incoming

interface GetStockUseCase {
    suspend fun getStockInfo(symbol: String): String
}
