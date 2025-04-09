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

import org.openapitools.client.models.BatchJobResultItem

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param jobId 
 * @param jobName 
 * @param itemsProcessed 
 * @param itemsSucceed 
 * @param items 
 * @param additionalFields 
 * @param customFields 
 */


data class BatchJobResult (

    @Json(name = "job_id")
    val jobId: kotlin.Int? = null,

    @Json(name = "job_name")
    val jobName: kotlin.String? = null,

    @Json(name = "items_processed")
    val itemsProcessed: kotlin.Int? = null,

    @Json(name = "items_succeed")
    val itemsSucceed: kotlin.Int? = null,

    @Json(name = "items")
    val items: kotlin.collections.List<BatchJobResultItem>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

