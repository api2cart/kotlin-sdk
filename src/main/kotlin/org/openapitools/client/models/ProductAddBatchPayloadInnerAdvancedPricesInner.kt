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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `value` 
 * @param quantity 
 * @param groupId 
 * @param startTime 
 * @param expireTime 
 */


data class ProductAddBatchPayloadInnerAdvancedPricesInner (

    @Json(name = "value")
    val `value`: java.math.BigDecimal,

    @Json(name = "quantity")
    val quantity: java.math.BigDecimal,

    @Json(name = "group_id")
    val groupId: kotlin.Int? = null,

    @Json(name = "start_time")
    val startTime: kotlin.String? = null,

    @Json(name = "expire_time")
    val expireTime: kotlin.String? = null

) {


}

