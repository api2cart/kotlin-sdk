/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.A2CDateTime

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param webhookId 
 * @param entityId 
 * @param time 
 */


data class AccountFailedWebhooks200ResponseResultWebhookInner (

    @Json(name = "webhook_id")
    val webhookId: kotlin.Int? = null,

    @Json(name = "entity_id")
    val entityId: kotlin.String? = null,

    @Json(name = "time")
    val time: A2CDateTime? = null

) {


}

