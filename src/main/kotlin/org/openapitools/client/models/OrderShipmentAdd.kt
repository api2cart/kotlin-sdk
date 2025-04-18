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

import org.openapitools.client.models.OrderShipmentAddItemsInner
import org.openapitools.client.models.OrderShipmentAddTrackingNumbersInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param orderId Defines the order for which the shipment will be created
 * @param storeId Store Id
 * @param warehouseId This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
 * @param shipmentProvider Defines company name that provide tracking of shipment
 * @param shippingMethod Define shipping method
 * @param items Defines items in the order that will be shipped
 * @param sendNotifications Send notifications to customer after shipment was created
 * @param trackingNumbers Defines shipment's tracking numbers that have to be added</br> How set tracking numbers to appropriate carrier:<ul><li>tracking_numbers[]=a2c.demo1,a2c.demo2 - set default carrier</li><li>tracking_numbers[<b>carrier_id</b>]=a2c.demo - set appropriate carrier</li></ul>To get the list of carriers IDs that are available in your store, use the <a href = \"https://api2cart.com/docs/#/cart/CartInfo\">cart.info</a > method
 * @param adjustStock This parameter is used for adjust stock.
 * @param enableCache If the value is 'true' and order exist in our cache, we will use order.info from cache to prepare shipment items.
 * @param trackingLink Defines custom tracking link
 * @param isShipped Defines shipment's status
 * @param checkProcessStatus Disable or enable check process status. Please note that the response will be slower due to additional requests to the store.
 * @param useLatestApiVersion Use the latest platform API version
 */


data class OrderShipmentAdd (

    /* Defines the order for which the shipment will be created */
    @Json(name = "order_id")
    val orderId: kotlin.String? = null,

    /* Store Id */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
    @Json(name = "warehouse_id")
    val warehouseId: kotlin.String? = null,

    /* Defines company name that provide tracking of shipment */
    @Json(name = "shipment_provider")
    val shipmentProvider: kotlin.String? = null,

    /* Define shipping method */
    @Json(name = "shipping_method")
    val shippingMethod: kotlin.String? = null,

    /* Defines items in the order that will be shipped */
    @Json(name = "items")
    val items: kotlin.collections.List<OrderShipmentAddItemsInner>? = null,

    /* Send notifications to customer after shipment was created */
    @Json(name = "send_notifications")
    val sendNotifications: kotlin.Boolean? = false,

    /* Defines shipment's tracking numbers that have to be added</br> How set tracking numbers to appropriate carrier:<ul><li>tracking_numbers[]=a2c.demo1,a2c.demo2 - set default carrier</li><li>tracking_numbers[<b>carrier_id</b>]=a2c.demo - set appropriate carrier</li></ul>To get the list of carriers IDs that are available in your store, use the <a href = \"https://api2cart.com/docs/#/cart/CartInfo\">cart.info</a > method */
    @Json(name = "tracking_numbers")
    val trackingNumbers: kotlin.collections.List<OrderShipmentAddTrackingNumbersInner>? = null,

    /* This parameter is used for adjust stock. */
    @Json(name = "adjust_stock")
    val adjustStock: kotlin.Boolean? = false,

    /* If the value is 'true' and order exist in our cache, we will use order.info from cache to prepare shipment items. */
    @Json(name = "enable_cache")
    val enableCache: kotlin.Boolean? = false,

    /* Defines custom tracking link */
    @Json(name = "tracking_link")
    val trackingLink: kotlin.String? = null,

    /* Defines shipment's status */
    @Json(name = "is_shipped")
    val isShipped: kotlin.Boolean? = true,

    /* Disable or enable check process status. Please note that the response will be slower due to additional requests to the store. */
    @Json(name = "check_process_status")
    val checkProcessStatus: kotlin.Boolean? = false,

    /* Use the latest platform API version */
    @Json(name = "use_latest_api_version")
    val useLatestApiVersion: kotlin.Boolean? = false

) {


}

