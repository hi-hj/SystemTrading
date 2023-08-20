package com.data.handler.adapter.outgoing

import com.data.handler.adapter.outgoing.client.KisStockClient
import com.data.handler.adapter.outgoing.config.VtsProperties
import com.data.handler.application.port.outgoing.GetStockOutPort
import org.springframework.stereotype.Component

@Component
class GetStockAdapter(
    private val kisStockClient: KisStockClient,
    private val vtsProperties: VtsProperties
) : GetStockOutPort {

    override suspend fun getStockInfo(symbol: String): String {
        val apiUrl = "/uapi/domestic-stock/v1/quotations/inquire-daily-price"
        val response = kisStockClient.webClient
            .get()
            .uri { uriBuilder ->
                uriBuilder.path(apiUrl)
                    .queryParam("fid_cond_mrkt_div_code", "J")
                    .queryParam("fid_input_iscd", symbol)
                    .queryParam("fid_period_div_code", "D")
                    .queryParam("fid_org_adj_prc", "1")
                    .build()
            }
            .headers { headers ->
                headers.set("content-Type", "application/json")
                headers.set("authorization", "Bearer ${vtsProperties.token}")
                headers.set("appkey", vtsProperties.appKey)
                headers.set("appsecret", vtsProperties.appSecret)
                headers.set("tr_id", vtsProperties.transactionId)
            }
            .retrieve()
            .bodyToMono(String::class.java)
            .block()

        println(response)

        return response ?: ""
    }
}
