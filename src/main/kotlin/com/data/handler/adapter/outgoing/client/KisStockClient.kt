package com.data.handler.adapter.outgoing.client

import com.data.handler.adapter.outgoing.config.VtsProperties
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class KisStockClient(
    private val vtsProperties: VtsProperties,
) {
    val webClient: WebClient = WebClient.builder()
        .baseUrl(vtsProperties.url)
        .defaultHeader("content-Type", "application/json")
        .defaultHeader("authorization", "Bearer ${vtsProperties.token}")
        .defaultHeader("appkey", vtsProperties.appKey)
        .defaultHeader("appsecret", vtsProperties.appSecret)
        .defaultHeader("tr_id", vtsProperties.transactionId)
        .build()
}
