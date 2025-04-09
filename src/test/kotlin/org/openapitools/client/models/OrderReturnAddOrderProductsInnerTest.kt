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

import org.openapitools.client.models.OrderReturnAddOrderProductsInner

class OrderReturnAddOrderProductsInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OrderReturnAddOrderProductsInner
        //val modelInstance = OrderReturnAddOrderProductsInner()

        // to test the property `orderProductId` - Defines which products from the order should be returned
        should("test orderProductId") {
            // uncomment below to test the property
            //modelInstance.orderProductId shouldBe ("TODO")
        }

        // to test the property `orderProductQuantity` - Defines how many product units from the order should be returned
        should("test orderProductQuantity") {
            // uncomment below to test the property
            //modelInstance.orderProductQuantity shouldBe ("TODO")
        }

        // to test the property `orderProductReasonId` - Defines the ID of the return reason
        should("test orderProductReasonId") {
            // uncomment below to test the property
            //modelInstance.orderProductReasonId shouldBe ("TODO")
        }

        // to test the property `orderProductActionId` - Defines the ID of the return action
        should("test orderProductActionId") {
            // uncomment below to test the property
            //modelInstance.orderProductActionId shouldBe ("TODO")
        }

        // to test the property `orderProductCustomerComment` - Defines the customer's comment for return
        should("test orderProductCustomerComment") {
            // uncomment below to test the property
            //modelInstance.orderProductCustomerComment shouldBe ("TODO")
        }

        // to test the property `orderProductHandlingStatus` - Defines handling status
        should("test orderProductHandlingStatus") {
            // uncomment below to test the property
            //modelInstance.orderProductHandlingStatus shouldBe ("TODO")
        }

        // to test the property `orderProductCondition` - Defines the product condition
        should("test orderProductCondition") {
            // uncomment below to test the property
            //modelInstance.orderProductCondition shouldBe ("TODO")
        }

        // to test the property `orderProductReason` - Defines return reason
        should("test orderProductReason") {
            // uncomment below to test the property
            //modelInstance.orderProductReason shouldBe ("TODO")
        }

        // to test the property `orderProductStatus` - Defines product return status
        should("test orderProductStatus") {
            // uncomment below to test the property
            //modelInstance.orderProductStatus shouldBe ("TODO")
        }

    }
}
