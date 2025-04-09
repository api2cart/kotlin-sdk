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
 * @param id 
 * @param productId 
 * @param childId 
 * @param createdTime 
 * @param additionalFields 
 * @param customFields 
 */


data class CustomerWishListItem (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "product_id")
    val productId: kotlin.String? = null,

    @Json(name = "child_id")
    val childId: kotlin.String? = null,

    @Json(name = "created_time")
    val createdTime: A2CDateTime? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

