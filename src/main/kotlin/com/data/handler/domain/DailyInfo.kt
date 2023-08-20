package com.data.handler.domain

import com.data.handler.enums.InvestmentType
import java.time.LocalDate

data class DailyInfo(
    val type: InvestmentType,
    val name: String,
    val symbol: String,
    val date: LocalDate,
    val openingPrice: Int,
    val closingPrice: Int,
    val highestPrice: Int,
    val lowestPrice: Int,
    val accumVolume: Int,
    val accumTransactionAmount: Int,
    val previousDayVariation: Int,
    val previousDaySign: Short
)
