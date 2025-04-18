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

import org.openapitools.client.models.StoreAttribute

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param attributesCount 
 * @param attribute 
 * @param additionalFields 
 * @param customFields 
 */


data class ResponseAttributeListResult (

    @Json(name = "attributes_count")
    val attributesCount: kotlin.Int? = null,

    @Json(name = "attribute")
    val attribute: kotlin.collections.List<StoreAttribute>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

