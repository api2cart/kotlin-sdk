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
 * Percent of an item's price to be charged as the sales tax for the order. Look at cart.info method response for allowed values.<hr><div style=\"font-style:normal\">Param structure:<div style=\"margin-left: 2%;\"><code style=\"padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\">sales_tax[<b>tax_percent</b>] = decimal (##.###)</br>sales_tax[<b>tax_state</b>] = string</br>sales_tax[<b>shipping_inc_in_tax</b>] = bool</br></code></div></div>
 *
 * @param taxPercent 
 * @param taxState 
 * @param shippingIncInTax 
 */


data class ProductAddSalesTax (

    @Json(name = "tax_percent")
    val taxPercent: java.math.BigDecimal? = null,

    @Json(name = "tax_state")
    val taxState: kotlin.String? = null,

    @Json(name = "shipping_inc_in_tax")
    val shippingIncInTax: kotlin.Boolean? = null

) {


}

