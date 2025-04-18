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

import org.openapitools.client.models.ProductTaxAddTaxRatesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name Defines tax class name where tax has to be added
 * @param taxRates Defines tax rates of specified tax classes
 * @param productId Defines products specified by product id
 */


data class ProductTaxAdd (

    /* Defines tax class name where tax has to be added */
    @Json(name = "name")
    val name: kotlin.String,

    /* Defines tax rates of specified tax classes */
    @Json(name = "tax_rates")
    val taxRates: kotlin.collections.List<ProductTaxAddTaxRatesInner>,

    /* Defines products specified by product id */
    @Json(name = "product_id")
    val productId: kotlin.String? = null

) {


}

