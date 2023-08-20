package com.data.handler.adapter.incoming

import com.data.handler.application.port.incoming.GetStockUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(
    private val getStockUseCase: GetStockUseCase
) {
    @GetMapping("/stock")
    suspend fun getDailyPrice(@RequestParam symbol: String): String {
        return getStockUseCase.getStockInfo(symbol)
    }
}
