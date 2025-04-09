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
 * Manufacturer information.
 *
 * @param name Defines manufacturer`s name
 * @param address Defines manufacturer`s address
 * @param phone Defines manufacturer`s phone
 * @param email Defines manufacturer`s email
 */


data class ProductAddManufacturerInfo (

    /* Defines manufacturer`s name */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Defines manufacturer`s address */
    @Json(name = "address")
    val address: kotlin.String? = null,

    /* Defines manufacturer`s phone */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* Defines manufacturer`s email */
    @Json(name = "email")
    val email: kotlin.String? = null

) {


}

