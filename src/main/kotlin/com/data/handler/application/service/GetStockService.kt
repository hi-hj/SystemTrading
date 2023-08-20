package com.data.handler.application.service

import com.data.handler.application.port.incoming.GetStockUseCase
import com.data.handler.application.port.outgoing.GetStockOutPort
import org.springframework.stereotype.Service

@Service
class GetStockService(
    private val outPort: GetStockOutPort
) : GetStockUseCase {
    override suspend fun getStockInfo(symbol: String): String {
        return outPort.getStockInfo(symbol)
    }
}
