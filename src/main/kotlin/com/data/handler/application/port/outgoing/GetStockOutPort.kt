package com.data.handler.application.port.outgoing

interface GetStockOutPort {
    suspend fun getStockInfo(symbol: String): String
}
