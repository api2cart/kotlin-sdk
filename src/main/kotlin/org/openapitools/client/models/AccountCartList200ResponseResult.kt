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

import org.openapitools.client.models.AccountCartList200ResponseResultCartsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param cartsCount 
 * @param carts 
 */


data class AccountCartList200ResponseResult (

    @Json(name = "carts_count")
    val cartsCount: kotlin.Int? = null,

    @Json(name = "carts")
    val carts: kotlin.collections.List<AccountCartList200ResponseResultCartsInner>? = null

) {


}

