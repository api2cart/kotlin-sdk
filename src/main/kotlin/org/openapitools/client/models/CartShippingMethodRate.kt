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
 * @param minWeight 
 * @param maxWeight 
 * @param minOrderAmount 
 * @param maxOrderAmount 
 * @param minItemsCount 
 * @param maxItemsCount 
 * @param price 
 * @param additionalFields 
 * @param customFields 
 */


data class CartShippingMethodRate (

    @Json(name = "min_weight")
    val minWeight: kotlin.String? = null,

    @Json(name = "max_weight")
    val maxWeight: kotlin.String? = null,

    @Json(name = "min_order_amount")
    val minOrderAmount: kotlin.String? = null,

    @Json(name = "max_order_amount")
    val maxOrderAmount: kotlin.String? = null,

    @Json(name = "min_items_count")
    val minItemsCount: kotlin.String? = null,

    @Json(name = "max_items_count")
    val maxItemsCount: kotlin.String? = null,

    @Json(name = "price")
    val price: kotlin.String? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

