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

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param httpPath 
 * @param fileName 
 * @param mimeType 
 * @param propertySize 
 * @param createAt 
 * @param modifiedAt 
 * @param alt 
 * @param avail 
 * @param sortOrder 
 * @param type 
 * @param additionalFields 
 * @param customFields 
 */


data class Image (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "http_path")
    val httpPath: kotlin.String? = null,

    @Json(name = "file_name")
    val fileName: kotlin.String? = null,

    @Json(name = "mime-type")
    val mimeType: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: kotlin.Int? = null,

    @Json(name = "create_at")
    val createAt: A2CDateTime? = null,

    @Json(name = "modified_at")
    val modifiedAt: A2CDateTime? = null,

    @Json(name = "alt")
    val alt: kotlin.String? = null,

    @Json(name = "avail")
    val avail: kotlin.Boolean? = null,

    @Json(name = "sort_order")
    val sortOrder: kotlin.Int? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

