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

import org.openapitools.client.models.Currency

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param totalCount 
 * @param currency 
 * @param additionalFields 
 * @param customFields 
 */


data class ResponseProductCurrencyListResult (

    @Json(name = "total_count")
    val totalCount: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: kotlin.collections.List<Currency>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

