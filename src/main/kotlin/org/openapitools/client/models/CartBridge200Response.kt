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

import org.openapitools.client.models.CartBridge200ResponseResult

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param returnCode 
 * @param returnMessage 
 * @param result 
 */


data class CartBridge200Response (

    @Json(name = "return_code")
    val returnCode: kotlin.Int? = null,

    @Json(name = "return_message")
    val returnMessage: kotlin.String? = null,

    @Json(name = "result")
    val result: CartBridge200ResponseResult? = null

) {


}

