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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.OrderShipmentUpdate
import org.openapitools.client.models.OrderShipmentAddTrackingNumbersInner

class OrderShipmentUpdateTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OrderShipmentUpdate
        //val modelInstance = OrderShipmentUpdate()

        // to test the property `shipmentId` - Shipment id indicates the number of delivery
        should("test shipmentId") {
            // uncomment below to test the property
            //modelInstance.shipmentId shouldBe ("TODO")
        }

        // to test the property `storeId` - Store Id
        should("test storeId") {
            // uncomment below to test the property
            //modelInstance.storeId shouldBe ("TODO")
        }

        // to test the property `orderId` - Defines the order that will be updated
        should("test orderId") {
            // uncomment below to test the property
            //modelInstance.orderId shouldBe ("TODO")
        }

        // to test the property `trackingNumbers` - Defines shipment's tracking numbers that have to be added</br> How set tracking numbers to appropriate carrier:<ul><li>tracking_numbers[]=a2c.demo1,a2c.demo2 - set default carrier</li><li>tracking_numbers[<b>carrier_id</b>]=a2c.demo - set appropriate carrier</li></ul>To get the list of carriers IDs that are available in your store, use the <a href = \"https://api2cart.com/docs/#/cart/CartInfo\">cart.info</a > method
        should("test trackingNumbers") {
            // uncomment below to test the property
            //modelInstance.trackingNumbers shouldBe ("TODO")
        }

        // to test the property `replace` - Allows rewrite tracking numbers
        should("test replace") {
            // uncomment below to test the property
            //modelInstance.replace shouldBe ("TODO")
        }

        // to test the property `isShipped` - Defines shipment's status
        should("test isShipped") {
            // uncomment below to test the property
            //modelInstance.isShipped shouldBe ("TODO")
        }

        // to test the property `trackingLink` - Defines custom tracking link
        should("test trackingLink") {
            // uncomment below to test the property
            //modelInstance.trackingLink shouldBe ("TODO")
        }

        // to test the property `deliveredAt` - Defines the date of delivery
        should("test deliveredAt") {
            // uncomment below to test the property
            //modelInstance.deliveredAt shouldBe ("TODO")
        }

        // to test the property `shipmentProvider` - Defines company name that provide tracking of shipment
        should("test shipmentProvider") {
            // uncomment below to test the property
            //modelInstance.shipmentProvider shouldBe ("TODO")
        }

    }
}
