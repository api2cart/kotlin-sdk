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
 * @param shipmentId Shipment id indicates the number of delivery
 * @param trackingNumber Defines tracking number
 * @param storeId Store Id
 * @param orderId Defines the order id
 * @param carrierId Defines tracking carrier id
 * @param trackingProvider Defines name of the company which provides shipment tracking
 * @param trackingLink Defines custom tracking link
 * @param sendNotifications Send notifications to customer after tracking was created
 */


data class OrderShipmentTrackingAdd (

    /* Shipment id indicates the number of delivery */
    @Json(name = "shipment_id")
    val shipmentId: kotlin.String,

    /* Defines tracking number */
    @Json(name = "tracking_number")
    val trackingNumber: kotlin.String,

    /* Store Id */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* Defines the order id */
    @Json(name = "order_id")
    val orderId: kotlin.String? = null,

    /* Defines tracking carrier id */
    @Json(name = "carrier_id")
    val carrierId: kotlin.String? = null,

    /* Defines name of the company which provides shipment tracking */
    @Json(name = "tracking_provider")
    val trackingProvider: kotlin.String? = null,

    /* Defines custom tracking link */
    @Json(name = "tracking_link")
    val trackingLink: kotlin.String? = null,

    /* Send notifications to customer after tracking was created */
    @Json(name = "send_notifications")
    val sendNotifications: kotlin.Boolean? = false

) {


}

