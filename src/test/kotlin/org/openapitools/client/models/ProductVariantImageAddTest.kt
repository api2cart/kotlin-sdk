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

import org.openapitools.client.models.ProductVariantImageAdd

class ProductVariantImageAddTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProductVariantImageAdd
        //val modelInstance = ProductVariantImageAdd()

        // to test the property `productVariantId` - Defines product's variants specified by variant id
        should("test productVariantId") {
            // uncomment below to test the property
            //modelInstance.productVariantId shouldBe ("TODO")
        }

        // to test the property `imageName` - Defines image's name
        should("test imageName") {
            // uncomment below to test the property
            //modelInstance.imageName shouldBe ("TODO")
        }

        // to test the property `type` - Defines image's types that are specified by comma-separated list
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `productId` - Defines product id where the variant image has to be added
        should("test productId") {
            // uncomment below to test the property
            //modelInstance.productId shouldBe ("TODO")
        }

        // to test the property `url` - Defines URL of the image that has to be added
        should("test url") {
            // uncomment below to test the property
            //modelInstance.url shouldBe ("TODO")
        }

        // to test the property `content` - Content(body) encoded in base64 of image file
        should("test content") {
            // uncomment below to test the property
            //modelInstance.content shouldBe ("TODO")
        }

        // to test the property `label` - Defines alternative text that has to be attached to the picture
        should("test label") {
            // uncomment below to test the property
            //modelInstance.label shouldBe ("TODO")
        }

        // to test the property `mime` - Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.
        should("test mime") {
            // uncomment below to test the property
            //modelInstance.mime shouldBe ("TODO")
        }

        // to test the property `position` - Defines image’s position in the list
        should("test position") {
            // uncomment below to test the property
            //modelInstance.position shouldBe ("TODO")
        }

        // to test the property `storeId` - Store Id
        should("test storeId") {
            // uncomment below to test the property
            //modelInstance.storeId shouldBe ("TODO")
        }

        // to test the property `optionId` - Defines option id of the product variant for which the image will be added
        should("test optionId") {
            // uncomment below to test the property
            //modelInstance.optionId shouldBe ("TODO")
        }

    }
}
