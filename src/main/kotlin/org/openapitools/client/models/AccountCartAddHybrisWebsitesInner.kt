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
 * @param uid 
 * @param url 
 * @param storeIds 
 */


data class AccountCartAddHybrisWebsitesInner (

    @Json(name = "uid")
    val uid: kotlin.String,

    @Json(name = "url")
    val url: kotlin.String,

    @Json(name = "storeIds")
    val storeIds: kotlin.collections.List<kotlin.String>

) {


}

