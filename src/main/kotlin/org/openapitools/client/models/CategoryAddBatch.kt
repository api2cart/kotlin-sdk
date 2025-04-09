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

import org.openapitools.client.models.CategoryAddBatchPayloadInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param payload Contains an array of categories objects. The list of properties may vary depending on the specific platform.
 */


data class CategoryAddBatch (

    /* Contains an array of categories objects. The list of properties may vary depending on the specific platform. */
    @Json(name = "payload")
    val payload: kotlin.collections.List<CategoryAddBatchPayloadInner>

) {


}

