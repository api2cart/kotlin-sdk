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

import org.openapitools.client.models.ProductAddBatchPayloadInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param payload Contains an array of product objects. The list of properties may vary depending on the specific platform.
 * @param nestedItemsUpdateBehaviour  Determines how updates to nested items should be handled.<hr><div style=\"font-style:normal\">  Values description:  <div style=\"margin-left: 2%; padding-top: 2%\">    <div style=\"font-size:85%\">      <b>  replace</b>: This option indicates that the nested items should be completely replaced with the new data provided. </br>      <b>  merge</b>: With this option, updates to nested items are merged with the existing data. </br>    </div>  </div></div>
 * @param clearCache 
 * @param reindex 
 */


data class ProductAddBatch (

    /* Contains an array of product objects. The list of properties may vary depending on the specific platform. */
    @Json(name = "payload")
    val payload: kotlin.collections.List<ProductAddBatchPayloadInner>,

    /*  Determines how updates to nested items should be handled.<hr><div style=\"font-style:normal\">  Values description:  <div style=\"margin-left: 2%; padding-top: 2%\">    <div style=\"font-size:85%\">      <b>  replace</b>: This option indicates that the nested items should be completely replaced with the new data provided. </br>      <b>  merge</b>: With this option, updates to nested items are merged with the existing data. </br>    </div>  </div></div> */
    @Json(name = "nested_items_update_behaviour")
    val nestedItemsUpdateBehaviour: ProductAddBatch.NestedItemsUpdateBehaviour? = NestedItemsUpdateBehaviour.replace,

    @Json(name = "clear_cache")
    val clearCache: kotlin.Boolean? = false,

    @Json(name = "reindex")
    val reindex: kotlin.Boolean? = false

) {

    /**
     *  Determines how updates to nested items should be handled.<hr><div style=\"font-style:normal\">  Values description:  <div style=\"margin-left: 2%; padding-top: 2%\">    <div style=\"font-size:85%\">      <b>  replace</b>: This option indicates that the nested items should be completely replaced with the new data provided. </br>      <b>  merge</b>: With this option, updates to nested items are merged with the existing data. </br>    </div>  </div></div>
     *
     * Values: replace,merge
     */
    @JsonClass(generateAdapter = false)
    enum class NestedItemsUpdateBehaviour(val value: kotlin.String) {
        @Json(name = "replace") replace("replace"),
        @Json(name = "merge") merge("merge");
    }

}

