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
 * @param from The starting time of the of available booking slot in 24 hours format. Required if <code>type=date_time</code>
 * @param to The ending time of the of available booking slot in 24 hours format. Required if <code>type=date_time</code>
 */


data class ProductAddSpecificsInnerBookingDetailsAvailabilitiesInnerTimesInner (

    /* The starting time of the of available booking slot in 24 hours format. Required if <code>type=date_time</code> */
    @Json(name = "from")
    val from: kotlin.String,

    /* The ending time of the of available booking slot in 24 hours format. Required if <code>type=date_time</code> */
    @Json(name = "to")
    val to: kotlin.String

) {


}

