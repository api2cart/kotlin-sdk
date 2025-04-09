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
 * @param type 
 * @param status 
 * @param optInLevel 
 */


data class CustomerAddConsentsInner (

    @Json(name = "type")
    val type: CustomerAddConsentsInner.Type,

    @Json(name = "status")
    val status: kotlin.String,

    @Json(name = "opt_in_level")
    val optInLevel: kotlin.String

) {

    /**
     * 
     *
     * Values: email,sms
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "email") email("email"),
        @Json(name = "sms") sms("sms");
    }

}

