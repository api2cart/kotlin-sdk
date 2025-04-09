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

import org.openapitools.client.models.CouponCondition

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param scope 
 * @param applyTo 
 * @param type 
 * @param quantity 
 * @param `value` 
 * @param currencyCode 
 * @param includeTax 
 * @param conditions 
 * @param additionalFields 
 * @param customFields 
 */


data class CatalogPriceRuleAction (

    @Json(name = "scope")
    val scope: kotlin.String? = null,

    @Json(name = "apply_to")
    val applyTo: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "quantity")
    val quantity: java.math.BigDecimal? = null,

    @Json(name = "value")
    val `value`: java.math.BigDecimal? = null,

    @Json(name = "currency_code")
    val currencyCode: kotlin.String? = null,

    @Json(name = "include_tax")
    val includeTax: kotlin.Boolean? = null,

    @Json(name = "conditions")
    val conditions: kotlin.collections.List<CouponCondition>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

