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

import org.openapitools.client.models.ReturnOrderProduct
import org.openapitools.client.models.ReturnStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param orderId 
 * @param customerId 
 * @param storeId 
 * @param createdAt 
 * @param modifiedAt 
 * @param status 
 * @param orderProducts 
 * @param comment 
 * @param staffNote 
 * @param additionalFields 
 * @param customFields 
 */


data class Return (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "order_id")
    val orderId: kotlin.String? = null,

    @Json(name = "customer_id")
    val customerId: kotlin.String? = null,

    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,

    @Json(name = "modified_at")
    val modifiedAt: kotlin.String? = null,

    @Json(name = "status")
    val status: ReturnStatus? = null,

    @Json(name = "order_products")
    val orderProducts: kotlin.collections.List<ReturnOrderProduct>? = null,

    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "staff_note")
    val staffNote: kotlin.String? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

