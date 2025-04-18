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

import org.openapitools.client.models.MarketplaceProduct

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param marketplaceProductsCount 
 * @param marketplaceProduct 
 * @param additionalFields 
 * @param customFields 
 */


data class ResponseMarketplaceProductFindResult (

    @Json(name = "marketplace_products_count")
    val marketplaceProductsCount: kotlin.Int? = null,

    @Json(name = "marketplace_product")
    val marketplaceProduct: kotlin.collections.List<MarketplaceProduct>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

