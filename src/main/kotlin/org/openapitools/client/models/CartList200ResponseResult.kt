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

import org.openapitools.client.models.CartList200ResponseResultSupportedCartsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param supportedCarts 
 */


data class CartList200ResponseResult (

    @Json(name = "supported_carts")
    val supportedCarts: kotlin.collections.List<CartList200ResponseResultSupportedCartsInner>? = null

) {


}

