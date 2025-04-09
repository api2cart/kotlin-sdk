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

import org.openapitools.client.models.Pagination
import org.openapitools.client.models.ResponseOrderListResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param returnCode 
 * @param returnMessage 
 * @param pagination 
 * @param result 
 * @param additionalFields 
 * @param customFields 
 */


data class ModelResponseOrderList (

    @Json(name = "return_code")
    val returnCode: kotlin.Int? = null,

    @Json(name = "return_message")
    val returnMessage: kotlin.String? = null,

    @Json(name = "pagination")
    val pagination: Pagination? = null,

    @Json(name = "result")
    val result: ResponseOrderListResult? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

