package com.data.handler.adapter.outgoing.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "vts")
data class VtsProperties(
    val url: String,
    val cano: String,
    val appKey: String,
    val appSecret: String,
    val token: String,
    val transactionId: String
)
