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
 * A size chart for the product. Only one property is supported.
 *
 * @param id Defines a pre-generated size chart template
 * @param url Defines a size chart image URL
 */


data class ProductAddSizeChart (

    /* Defines a pre-generated size chart template */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Defines a size chart image URL */
    @Json(name = "url")
    val url: kotlin.String? = null

) {


}

