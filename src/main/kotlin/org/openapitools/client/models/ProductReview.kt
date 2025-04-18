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
import org.openapitools.client.models.Media
import org.openapitools.client.models.ProductReviewRating

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param productId 
 * @param customerId 
 * @param nickName 
 * @param email 
 * @param summary 
 * @param message 
 * @param rating 
 * @param ratings 
 * @param status 
 * @param createdTime 
 * @param medias 
 * @param additionalFields 
 * @param customFields 
 */


data class ProductReview (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "product_id")
    val productId: kotlin.String? = null,

    @Json(name = "customer_id")
    val customerId: kotlin.String? = null,

    @Json(name = "nick_name")
    val nickName: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "summary")
    val summary: kotlin.String? = null,

    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "rating")
    val rating: java.math.BigDecimal? = null,

    @Json(name = "ratings")
    val ratings: kotlin.collections.List<ProductReviewRating>? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "created_time")
    val createdTime: A2CDateTime? = null,

    @Json(name = "medias")
    val medias: kotlin.collections.List<Media>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

