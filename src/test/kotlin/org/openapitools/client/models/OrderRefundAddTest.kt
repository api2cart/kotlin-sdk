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

import org.openapitools.client.models.OrderRefundAdd
import org.openapitools.client.models.OrderRefundAddItemsInner

class OrderRefundAddTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OrderRefundAdd
        //val modelInstance = OrderRefundAdd()

        // to test the property `orderId` - Defines the order for which the refund will be created.
        should("test orderId") {
            // uncomment below to test the property
            //modelInstance.orderId shouldBe ("TODO")
        }

        // to test the property `items` - Defines items in the order that will be refunded
        should("test items") {
            // uncomment below to test the property
            //modelInstance.items shouldBe ("TODO")
        }

        // to test the property `totalPrice` - Defines order refund amount.
        should("test totalPrice") {
            // uncomment below to test the property
            //modelInstance.totalPrice shouldBe ("TODO")
        }

        // to test the property `shippingPrice` - Defines refund shipping amount.
        should("test shippingPrice") {
            // uncomment below to test the property
            //modelInstance.shippingPrice shouldBe ("TODO")
        }

        // to test the property `feePrice` - Specifies refund's fee price
        should("test feePrice") {
            // uncomment below to test the property
            //modelInstance.feePrice shouldBe ("TODO")
        }

        // to test the property `message` - Refund reason, or some else message which assigned to refund.
        should("test message") {
            // uncomment below to test the property
            //modelInstance.message shouldBe ("TODO")
        }

        // to test the property `itemRestock` - Boolean, whether or not to add the line items back to the store inventory.
        should("test itemRestock") {
            // uncomment below to test the property
            //modelInstance.itemRestock shouldBe ("TODO")
        }

        // to test the property `sendNotifications` - Send notifications to customer after refund was created
        should("test sendNotifications") {
            // uncomment below to test the property
            //modelInstance.sendNotifications shouldBe ("TODO")
        }

        // to test the property `date` - Specifies an order creation date in format Y-m-d H:i:s
        should("test date") {
            // uncomment below to test the property
            //modelInstance.date shouldBe ("TODO")
        }

        // to test the property `isOnline` - Indicates whether refund type is online
        should("test isOnline") {
            // uncomment below to test the property
            //modelInstance.isOnline shouldBe ("TODO")
        }

    }
}
