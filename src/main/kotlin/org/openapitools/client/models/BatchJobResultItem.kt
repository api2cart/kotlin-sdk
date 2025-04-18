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
 * @param id 
 * @param status 
 * @param entityId 
 * @param errors 
 * @param warnings 
 * @param additionalFields 
 * @param customFields 
 */


data class BatchJobResultItem (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "entity_id")
    val entityId: kotlin.String? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "warnings")
    val warnings: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

