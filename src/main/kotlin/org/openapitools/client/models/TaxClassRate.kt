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

import org.openapitools.client.models.TaxClassCountries
import org.openapitools.client.models.TaxClassZipCodes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param tax 
 * @param taxType 
 * @param taxBasedOn 
 * @param countries 
 * @param cities 
 * @param address 
 * @param zipCodes 
 * @param additionalFields 
 * @param customFields 
 */


data class TaxClassRate (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "tax")
    val tax: java.math.BigDecimal? = null,

    @Json(name = "tax_type")
    val taxType: kotlin.Int? = null,

    @Json(name = "tax_based_on")
    val taxBasedOn: kotlin.String? = null,

    @Json(name = "countries")
    val countries: kotlin.collections.List<TaxClassCountries>? = null,

    @Json(name = "cities")
    val cities: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "address")
    val address: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "zip_codes")
    val zipCodes: kotlin.collections.List<TaxClassZipCodes>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

