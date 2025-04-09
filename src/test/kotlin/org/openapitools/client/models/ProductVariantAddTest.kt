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

import org.openapitools.client.models.ProductVariantAdd
import org.openapitools.client.models.ProductAddTierPricesInner
import org.openapitools.client.models.ProductVariantAddAttributesInner

class ProductVariantAddTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProductVariantAdd
        //val modelInstance = ProductVariantAdd()

        // to test the property `model` - Specifies variant's model that has to be added
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property `productId` - Defines product's id where the variant has to be added
        should("test productId") {
            // uncomment below to test the property
            //modelInstance.productId shouldBe ("TODO")
        }

        // to test the property `name` - Defines variant's name that has to be added
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `sku` - Defines variant's sku that has to be added
        should("test sku") {
            // uncomment below to test the property
            //modelInstance.sku shouldBe ("TODO")
        }

        // to test the property `barcode` - A barcode is a unique code composed of numbers used as a product identifier.
        should("test barcode") {
            // uncomment below to test the property
            //modelInstance.barcode shouldBe ("TODO")
        }

        // to test the property `gtin` - Global Trade Item Number. An GTIN is an identifier for trade items.
        should("test gtin") {
            // uncomment below to test the property
            //modelInstance.gtin shouldBe ("TODO")
        }

        // to test the property `price` - Defines new product's variant price
        should("test price") {
            // uncomment below to test the property
            //modelInstance.price shouldBe ("TODO")
        }

        // to test the property `oldPrice` - Defines product's old price
        should("test oldPrice") {
            // uncomment below to test the property
            //modelInstance.oldPrice shouldBe ("TODO")
        }

        // to test the property `costPrice` - Defines new product's cost price
        should("test costPrice") {
            // uncomment below to test the property
            //modelInstance.costPrice shouldBe ("TODO")
        }

        // to test the property `fixedCostShippingPrice` - Specifies fixed cost shipping price
        should("test fixedCostShippingPrice") {
            // uncomment below to test the property
            //modelInstance.fixedCostShippingPrice shouldBe ("TODO")
        }

        // to test the property `attributes` - Defines variant's attributes list
        should("test attributes") {
            // uncomment below to test the property
            //modelInstance.attributes shouldBe ("TODO")
        }

        // to test the property `description` - Specifies variant's description
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `specialPrice` - Specifies variant's model that has to be added
        should("test specialPrice") {
            // uncomment below to test the property
            //modelInstance.specialPrice shouldBe ("TODO")
        }

        // to test the property `spriceCreate` - Defines the date of special price creation
        should("test spriceCreate") {
            // uncomment below to test the property
            //modelInstance.spriceCreate shouldBe ("TODO")
        }

        // to test the property `spriceModified` - Defines the date of special price modification
        should("test spriceModified") {
            // uncomment below to test the property
            //modelInstance.spriceModified shouldBe ("TODO")
        }

        // to test the property `spriceExpire` - Defines the term of special price offer duration
        should("test spriceExpire") {
            // uncomment below to test the property
            //modelInstance.spriceExpire shouldBe ("TODO")
        }

        // to test the property `availableForView` - Specifies the set of visible/invisible product's variants for users
        should("test availableForView") {
            // uncomment below to test the property
            //modelInstance.availableForView shouldBe ("TODO")
        }

        // to test the property `availableForSale` - Specifies the set of visible/invisible product's variants for sale
        should("test availableForSale") {
            // uncomment below to test the property
            //modelInstance.availableForSale shouldBe ("TODO")
        }

        // to test the property `weight` - Weight
        should("test weight") {
            // uncomment below to test the property
            //modelInstance.weight shouldBe ("TODO")
        }

        // to test the property `width` - Defines product's width
        should("test width") {
            // uncomment below to test the property
            //modelInstance.width shouldBe ("TODO")
        }

        // to test the property `height` - Defines product's height
        should("test height") {
            // uncomment below to test the property
            //modelInstance.height shouldBe ("TODO")
        }

        // to test the property `length` - Defines product's length
        should("test length") {
            // uncomment below to test the property
            //modelInstance.length shouldBe ("TODO")
        }

        // to test the property `weightUnit` - Weight Unit
        should("test weightUnit") {
            // uncomment below to test the property
            //modelInstance.weightUnit shouldBe ("TODO")
        }

        // to test the property `shortDescription` - Defines short description
        should("test shortDescription") {
            // uncomment below to test the property
            //modelInstance.shortDescription shouldBe ("TODO")
        }

        // to test the property `warehouseId` - This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
        should("test warehouseId") {
            // uncomment below to test the property
            //modelInstance.warehouseId shouldBe ("TODO")
        }

        // to test the property `quantity` - Defines product variant's quantity that has to be added
        should("test quantity") {
            // uncomment below to test the property
            //modelInstance.quantity shouldBe ("TODO")
        }

        // to test the property `createdAt` - Defines the date of entity creation
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `manufacturer` - Specifies the product variant's manufacturer
        should("test manufacturer") {
            // uncomment below to test the property
            //modelInstance.manufacturer shouldBe ("TODO")
        }

        // to test the property `taxClassId` - Defines tax classes where entity has to be added
        should("test taxClassId") {
            // uncomment below to test the property
            //modelInstance.taxClassId shouldBe ("TODO")
        }

        // to test the property `metaTitle` - Defines unique meta title for each entity
        should("test metaTitle") {
            // uncomment below to test the property
            //modelInstance.metaTitle shouldBe ("TODO")
        }

        // to test the property `metaKeywords` - Defines unique meta keywords for each entity
        should("test metaKeywords") {
            // uncomment below to test the property
            //modelInstance.metaKeywords shouldBe ("TODO")
        }

        // to test the property `metaDescription` - Defines unique meta description of a entity
        should("test metaDescription") {
            // uncomment below to test the property
            //modelInstance.metaDescription shouldBe ("TODO")
        }

        // to test the property `url` - Defines unique product variant's URL
        should("test url") {
            // uncomment below to test the property
            //modelInstance.url shouldBe ("TODO")
        }

        // to test the property `storeId` - Add variants specified by store id
        should("test storeId") {
            // uncomment below to test the property
            //modelInstance.storeId shouldBe ("TODO")
        }

        // to test the property `langId` - Language id
        should("test langId") {
            // uncomment below to test the property
            //modelInstance.langId shouldBe ("TODO")
        }

        // to test the property `clearCache` - Is cache clear required
        should("test clearCache") {
            // uncomment below to test the property
            //modelInstance.clearCache shouldBe ("TODO")
        }

        // to test the property `taxable` - Specifies whether a tax is charged
        should("test taxable") {
            // uncomment below to test the property
            //modelInstance.taxable shouldBe ("TODO")
        }

        // to test the property `harmonizedSystemCode` - Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes
        should("test harmonizedSystemCode") {
            // uncomment below to test the property
            //modelInstance.harmonizedSystemCode shouldBe ("TODO")
        }

        // to test the property `countryOfOrigin` - The country where the inventory item was made
        should("test countryOfOrigin") {
            // uncomment below to test the property
            //modelInstance.countryOfOrigin shouldBe ("TODO")
        }

        // to test the property `manageStock` - Defines inventory tracking for product variant
        should("test manageStock") {
            // uncomment below to test the property
            //modelInstance.manageStock shouldBe ("TODO")
        }

        // to test the property `upc` - Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
        should("test upc") {
            // uncomment below to test the property
            //modelInstance.upc shouldBe ("TODO")
        }

        // to test the property `mpn` - Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
        should("test mpn") {
            // uncomment below to test the property
            //modelInstance.mpn shouldBe ("TODO")
        }

        // to test the property `ean` - European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
        should("test ean") {
            // uncomment below to test the property
            //modelInstance.ean shouldBe ("TODO")
        }

        // to test the property `isbn` - International Standard Book Number. An ISBN is a unique identifier for books.
        should("test isbn") {
            // uncomment below to test the property
            //modelInstance.isbn shouldBe ("TODO")
        }

        // to test the property `storesIds` - Assign variant to the stores that is specified by comma-separated stores' id
        should("test storesIds") {
            // uncomment below to test the property
            //modelInstance.storesIds shouldBe ("TODO")
        }

        // to test the property `isDefault` - Defines as a default variant
        should("test isDefault") {
            // uncomment below to test the property
            //modelInstance.isDefault shouldBe ("TODO")
        }

        // to test the property `isFreeShipping` - Specifies variant's free shipping flag that has to be added
        should("test isFreeShipping") {
            // uncomment below to test the property
            //modelInstance.isFreeShipping shouldBe ("TODO")
        }

        // to test the property `marketplaceItemProperties` - String containing the JSON representation of the supplied data
        should("test marketplaceItemProperties") {
            // uncomment below to test the property
            //modelInstance.marketplaceItemProperties shouldBe ("TODO")
        }

        // to test the property `inStock` - Set stock status
        should("test inStock") {
            // uncomment below to test the property
            //modelInstance.inStock shouldBe ("TODO")
        }

        // to test the property `backorderStatus` - Set backorder status
        should("test backorderStatus") {
            // uncomment below to test the property
            //modelInstance.backorderStatus shouldBe ("TODO")
        }

        // to test the property `tierPrices` - Defines product's tier prices
        should("test tierPrices") {
            // uncomment below to test the property
            //modelInstance.tierPrices shouldBe ("TODO")
        }

        // to test the property `isVirtual` - Defines whether the product is virtual
        should("test isVirtual") {
            // uncomment below to test the property
            //modelInstance.isVirtual shouldBe ("TODO")
        }

    }
}
