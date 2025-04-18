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

import org.openapitools.client.models.ProductVariantPriceAdd
import org.openapitools.client.models.ProductAddGroupPricesInner

class ProductVariantPriceAddTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProductVariantPriceAdd
        //val modelInstance = ProductVariantPriceAdd()

        // to test the property `groupPrices` - Defines variants's group prices
        should("test groupPrices") {
            // uncomment below to test the property
            //modelInstance.groupPrices shouldBe ("TODO")
        }

        // to test the property `id` - Defines the variant to which the price has to be added
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `productId` - Product id
        should("test productId") {
            // uncomment below to test the property
            //modelInstance.productId shouldBe ("TODO")
        }

        // to test the property `storeId` - Store Id
        should("test storeId") {
            // uncomment below to test the property
            //modelInstance.storeId shouldBe ("TODO")
        }

    }
}
