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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param optionName 
 * @param optionValue 
 */


data class ProductVariantUpdateOptionsInner (

    @Json(name = "option_name")
    val optionName: kotlin.String? = null,

    @Json(name = "option_value")
    val optionValue: kotlin.String? = null

) {


}

