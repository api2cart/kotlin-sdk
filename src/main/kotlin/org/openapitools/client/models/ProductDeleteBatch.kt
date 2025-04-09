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

import org.openapitools.client.models.ProductDeleteBatchPayloadInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param payload Contains an array of product deletion requests, each including the product ID.
 */


data class ProductDeleteBatch (

    /* Contains an array of product deletion requests, each including the product ID. */
    @Json(name = "payload")
    val payload: kotlin.collections.List<ProductDeleteBatchPayloadInner>

) {


}

