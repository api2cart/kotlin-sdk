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
 * @param name 
 * @param position 
 * @param attributeSetId 
 * @param assignedAttributeIds 
 * @param additionalFields 
 * @param customFields 
 */


data class StoreAttributeGroup (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "position")
    val position: kotlin.Int? = null,

    @Json(name = "attribute_set_id")
    val attributeSetId: kotlin.String? = null,

    @Json(name = "assigned_attribute_ids")
    val assignedAttributeIds: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

