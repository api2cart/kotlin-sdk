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

import org.openapitools.client.models.CategoryAddBatchPayloadInnerImagesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param avail 
 * @param description 
 * @param metaTitle 
 * @param metaDescription 
 * @param metaKeywords 
 * @param parentId 
 * @param sortOrder 
 * @param seoUrl 
 * @param storeId 
 * @param images 
 * @param storesIds 
 */


data class CategoryAddBatchPayloadInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "avail")
    val avail: kotlin.Boolean? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "meta_title")
    val metaTitle: kotlin.String? = null,

    @Json(name = "meta_description")
    val metaDescription: kotlin.String? = null,

    @Json(name = "meta_keywords")
    val metaKeywords: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "parent_id")
    val parentId: kotlin.String? = null,

    @Json(name = "sort_order")
    val sortOrder: kotlin.Int? = null,

    @Json(name = "seo_url")
    val seoUrl: kotlin.String? = null,

    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    @Json(name = "images")
    val images: kotlin.collections.List<CategoryAddBatchPayloadInnerImagesInner>? = null,

    @Json(name = "stores_ids")
    val storesIds: kotlin.collections.List<kotlin.String>? = null

) {


}

