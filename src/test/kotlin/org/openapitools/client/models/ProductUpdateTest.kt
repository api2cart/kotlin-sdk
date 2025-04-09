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

import org.openapitools.client.models.ProductUpdate
import org.openapitools.client.models.ProductAddManufacturerInfo
import org.openapitools.client.models.ProductAddPackageDetails

class ProductUpdateTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProductUpdate
        //val modelInstance = ProductUpdate()

        // to test the property `id` - Defines product id that has to be updated
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `model` - Defines product model that has to be updated
        should("test model") {
            // uncomment below to test the property
            //modelInstance.model shouldBe ("TODO")
        }

        // to test the property `oldPrice` - Defines product's old price
        should("test oldPrice") {
            // uncomment below to test the property
            //modelInstance.oldPrice shouldBe ("TODO")
        }

        // to test the property `price` - Defines new product's price
        should("test price") {
            // uncomment below to test the property
            //modelInstance.price shouldBe ("TODO")
        }

        // to test the property `specialPrice` - Defines new product's special price
        should("test specialPrice") {
            // uncomment below to test the property
            //modelInstance.specialPrice shouldBe ("TODO")
        }

        // to test the property `spriceCreate` - Defines the date of special price creation
        should("test spriceCreate") {
            // uncomment below to test the property
            //modelInstance.spriceCreate shouldBe ("TODO")
        }

        // to test the property `spriceExpire` - Defines the term of special price offer duration
        should("test spriceExpire") {
            // uncomment below to test the property
            //modelInstance.spriceExpire shouldBe ("TODO")
        }

        // to test the property `costPrice` - Defines new product's cost price
        should("test costPrice") {
            // uncomment below to test the property
            //modelInstance.costPrice shouldBe ("TODO")
        }

        // to test the property `fixedCostShippingPrice` - Specifies product's fixed cost shipping price
        should("test fixedCostShippingPrice") {
            // uncomment below to test the property
            //modelInstance.fixedCostShippingPrice shouldBe ("TODO")
        }

        // to test the property `retailPrice` - Defines new product's retail price
        should("test retailPrice") {
            // uncomment below to test the property
            //modelInstance.retailPrice shouldBe ("TODO")
        }

        // to test the property `quantity` - Defines new product's quantity
        should("test quantity") {
            // uncomment below to test the property
            //modelInstance.quantity shouldBe ("TODO")
        }

        // to test the property `availableForView` - Specifies the set of visible/invisible products for users
        should("test availableForView") {
            // uncomment below to test the property
            //modelInstance.availableForView shouldBe ("TODO")
        }

        // to test the property `weight` - Weight
        should("test weight") {
            // uncomment below to test the property
            //modelInstance.weight shouldBe ("TODO")
        }

        // to test the property `weightUnit` - Weight Unit
        should("test weightUnit") {
            // uncomment below to test the property
            //modelInstance.weightUnit shouldBe ("TODO")
        }

        // to test the property `dimensionsUnit` - Weight Unit
        should("test dimensionsUnit") {
            // uncomment below to test the property
            //modelInstance.dimensionsUnit shouldBe ("TODO")
        }

        // to test the property `increaseQuantity` - Defines the incremental changes in product quantity
        should("test increaseQuantity") {
            // uncomment below to test the property
            //modelInstance.increaseQuantity shouldBe ("TODO")
        }

        // to test the property `reduceQuantity` - Defines the decrement changes in product quantity
        should("test reduceQuantity") {
            // uncomment below to test the property
            //modelInstance.reduceQuantity shouldBe ("TODO")
        }

        // to test the property `warehouseId` - This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
        should("test warehouseId") {
            // uncomment below to test the property
            //modelInstance.warehouseId shouldBe ("TODO")
        }

        // to test the property `reserveQuantity` - This parameter allows to reserve/unreserve product quantity.
        should("test reserveQuantity") {
            // uncomment below to test the property
            //modelInstance.reserveQuantity shouldBe ("TODO")
        }

        // to test the property `manageStock` - Defines inventory tracking for product
        should("test manageStock") {
            // uncomment below to test the property
            //modelInstance.manageStock shouldBe ("TODO")
        }

        // to test the property `backorderStatus` - Set backorder status
        should("test backorderStatus") {
            // uncomment below to test the property
            //modelInstance.backorderStatus shouldBe ("TODO")
        }

        // to test the property `name` - Defines product's name that has to be updated
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `sku` - Defines new product's sku
        should("test sku") {
            // uncomment below to test the property
            //modelInstance.sku shouldBe ("TODO")
        }

        // to test the property `visible` - Set visibility status
        should("test visible") {
            // uncomment below to test the property
            //modelInstance.visible shouldBe ("TODO")
        }

        // to test the property `manufacturer` - Defines product's manufacturer
        should("test manufacturer") {
            // uncomment below to test the property
            //modelInstance.manufacturer shouldBe ("TODO")
        }

        // to test the property `manufacturerId` - Defines product's manufacturer by manufacturer_id
        should("test manufacturerId") {
            // uncomment below to test the property
            //modelInstance.manufacturerId shouldBe ("TODO")
        }

        // to test the property `categoriesIds` - Defines product add that is specified by comma-separated categories id
        should("test categoriesIds") {
            // uncomment below to test the property
            //modelInstance.categoriesIds shouldBe ("TODO")
        }

        // to test the property `relatedProductsIds` - Defines product related products ids that has to be updated
        should("test relatedProductsIds") {
            // uncomment below to test the property
            //modelInstance.relatedProductsIds shouldBe ("TODO")
        }

        // to test the property `upSellProductsIds` - Defines product up-sell products ids that has to be updated
        should("test upSellProductsIds") {
            // uncomment below to test the property
            //modelInstance.upSellProductsIds shouldBe ("TODO")
        }

        // to test the property `crossSellProductsIds` - Defines product cross-sells products ids that has to be updated
        should("test crossSellProductsIds") {
            // uncomment below to test the property
            //modelInstance.crossSellProductsIds shouldBe ("TODO")
        }

        // to test the property `description` - Defines new product's description
        should("test description") {
            // uncomment below to test the property
            //modelInstance.description shouldBe ("TODO")
        }

        // to test the property `shortDescription` - Defines short description
        should("test shortDescription") {
            // uncomment below to test the property
            //modelInstance.shortDescription shouldBe ("TODO")
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

        // to test the property `storeId` - Defines store id where the product should be found
        should("test storeId") {
            // uncomment below to test the property
            //modelInstance.storeId shouldBe ("TODO")
        }

        // to test the property `langId` - Language id
        should("test langId") {
            // uncomment below to test the property
            //modelInstance.langId shouldBe ("TODO")
        }

        // to test the property `inStock` - Set stock status
        should("test inStock") {
            // uncomment below to test the property
            //modelInstance.inStock shouldBe ("TODO")
        }

        // to test the property `status` - Defines product's status
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `seoUrl` - Defines unique URL for SEO
        should("test seoUrl") {
            // uncomment below to test the property
            //modelInstance.seoUrl shouldBe ("TODO")
        }

        // to test the property `reportRequestId` - Report request id
        should("test reportRequestId") {
            // uncomment below to test the property
            //modelInstance.reportRequestId shouldBe ("TODO")
        }

        // to test the property `disableReportCache` - Disable report cache for current request
        should("test disableReportCache") {
            // uncomment below to test the property
            //modelInstance.disableReportCache shouldBe ("TODO")
        }

        // to test the property `reindex` - Is reindex required
        should("test reindex") {
            // uncomment below to test the property
            //modelInstance.reindex shouldBe ("TODO")
        }

        // to test the property `tags` - Product tags
        should("test tags") {
            // uncomment below to test the property
            //modelInstance.tags shouldBe ("TODO")
        }

        // to test the property `clearCache` - Is cache clear required
        should("test clearCache") {
            // uncomment below to test the property
            //modelInstance.clearCache shouldBe ("TODO")
        }

        // to test the property `gtin` - Global Trade Item Number. An GTIN is an identifier for trade items.
        should("test gtin") {
            // uncomment below to test the property
            //modelInstance.gtin shouldBe ("TODO")
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

        // to test the property `taxable` - Specifies whether a tax is charged
        should("test taxable") {
            // uncomment below to test the property
            //modelInstance.taxable shouldBe ("TODO")
        }

        // to test the property `productClass` - A categorization for the product
        should("test productClass") {
            // uncomment below to test the property
            //modelInstance.productClass shouldBe ("TODO")
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

        // to test the property `width` - Defines product's width
        should("test width") {
            // uncomment below to test the property
            //modelInstance.width shouldBe ("TODO")
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

        // to test the property `searchKeywords` - Defines unique search keywords
        should("test searchKeywords") {
            // uncomment below to test the property
            //modelInstance.searchKeywords shouldBe ("TODO")
        }

        // to test the property `barcode` - A barcode is a unique code composed of numbers used as a product identifier.
        should("test barcode") {
            // uncomment below to test the property
            //modelInstance.barcode shouldBe ("TODO")
        }

        // to test the property `isVirtual` - Defines whether the product is virtual
        should("test isVirtual") {
            // uncomment below to test the property
            //modelInstance.isVirtual shouldBe ("TODO")
        }

        // to test the property `isFreeShipping` - Specifies product free shipping flag that has to be updated
        should("test isFreeShipping") {
            // uncomment below to test the property
            //modelInstance.isFreeShipping shouldBe ("TODO")
        }

        // to test the property `reservePrice` - Defines reserve price value
        should("test reservePrice") {
            // uncomment below to test the property
            //modelInstance.reservePrice shouldBe ("TODO")
        }

        // to test the property `buyitnowPrice` - Defines buy it now value
        should("test buyitnowPrice") {
            // uncomment below to test the property
            //modelInstance.buyitnowPrice shouldBe ("TODO")
        }

        // to test the property `availFrom` - Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time.
        should("test availFrom") {
            // uncomment below to test the property
            //modelInstance.availFrom shouldBe ("TODO")
        }

        // to test the property `taxClassId` - Defines tax classes where entity has to be added
        should("test taxClassId") {
            // uncomment below to test the property
            //modelInstance.taxClassId shouldBe ("TODO")
        }

        // to test the property `type` - Defines product's type
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `avail` - Defines category's visibility status
        should("test avail") {
            // uncomment below to test the property
            //modelInstance.avail shouldBe ("TODO")
        }

        // to test the property `deliveryCode` - The delivery promise that applies to offer
        should("test deliveryCode") {
            // uncomment below to test the property
            //modelInstance.deliveryCode shouldBe ("TODO")
        }

        // to test the property `checkProcessStatus` - Disable or enable check process status. Please note that the response will be slower due to additional requests to the store.
        should("test checkProcessStatus") {
            // uncomment below to test the property
            //modelInstance.checkProcessStatus shouldBe ("TODO")
        }

        // to test the property `packageDetails`
        should("test packageDetails") {
            // uncomment below to test the property
            //modelInstance.packageDetails shouldBe ("TODO")
        }

        // to test the property `storesIds` - Assign product to the stores that is specified by comma-separated stores' id
        should("test storesIds") {
            // uncomment below to test the property
            //modelInstance.storesIds shouldBe ("TODO")
        }

        // to test the property `manufacturerInfo`
        should("test manufacturerInfo") {
            // uncomment below to test the property
            //modelInstance.manufacturerInfo shouldBe ("TODO")
        }

        // to test the property `productionPartnerIds` - Defines product production partner ids that has to be updated
        should("test productionPartnerIds") {
            // uncomment below to test the property
            //modelInstance.productionPartnerIds shouldBe ("TODO")
        }

        // to test the property `shippingTemplateId` - The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \"cart.info\" API method response, in the field shipping_zones[]->id.
        should("test shippingTemplateId") {
            // uncomment below to test the property
            //modelInstance.shippingTemplateId shouldBe ("TODO")
        }

        // to test the property `whenMade` - An enumerated string for the era in which the maker made the product.
        should("test whenMade") {
            // uncomment below to test the property
            //modelInstance.whenMade shouldBe ("TODO")
        }

        // to test the property `isSupply` - If true, it indicates the product as a supply, otherwise it indicates that it is a finished product.
        should("test isSupply") {
            // uncomment below to test the property
            //modelInstance.isSupply shouldBe ("TODO")
        }

        // to test the property `downloadable` - Defines whether the product is downloadable
        should("test downloadable") {
            // uncomment below to test the property
            //modelInstance.downloadable shouldBe ("TODO")
        }

        // to test the property `materials` - A list of material strings for materials used in the product.
        should("test materials") {
            // uncomment below to test the property
            //modelInstance.materials shouldBe ("TODO")
        }

        // to test the property `autoRenew` - When true, automatically renews a listing upon its expiration.
        should("test autoRenew") {
            // uncomment below to test the property
            //modelInstance.autoRenew shouldBe ("TODO")
        }

    }
}
