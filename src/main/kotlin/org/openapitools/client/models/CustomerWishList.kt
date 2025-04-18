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
import org.openapitools.client.models.CustomerWishListItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param description 
 * @param isPublic 
 * @param createdAt 
 * @param modifiedAt 
 * @param products 
 * @param additionalFields 
 * @param customFields 
 */


data class CustomerWishList (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "is_public")
    val isPublic: kotlin.String? = null,

    @Json(name = "created_at")
    val createdAt: A2CDateTime? = null,

    @Json(name = "modified_at")
    val modifiedAt: A2CDateTime? = null,

    @Json(name = "products")
    val products: kotlin.collections.List<CustomerWishListItem>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

