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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.MarketplaceApi
import org.openapitools.client.models.ModelResponseMarketplaceProductFind

class MarketplaceApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MarketplaceApi
        //val apiInstance = MarketplaceApi()

        // to test marketplaceProductFind
        should("test marketplaceProductFind") {
            // uncomment below to test marketplaceProductFind
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val categoriesIds : kotlin.String = 23,56 // kotlin.String | Defines product add that is specified by comma-separated categories id
            //val keyword : kotlin.String = T-shirt // kotlin.String | Defines search keyword
            //val asin : kotlin.String = 97703178470 // kotlin.String | Amazon Standard Identification Number.
            //val ean : kotlin.String = 5901234123457 // kotlin.String | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
            //val gtin : kotlin.String = 12345678912345 // kotlin.String | Global Trade Item Number. An GTIN is an identifier for trade items.
            //val upc : kotlin.String = 9770317847001 // kotlin.String | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
            //val mpn : kotlin.String = 9770317847001 // kotlin.String | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
            //val isbn : kotlin.String = 9783161484100 // kotlin.String | International Standard Book Number. An ISBN is a unique identifier for books.
            //val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : ModelResponseMarketplaceProductFind = apiInstance.marketplaceProductFind(storeId, count, pageCursor, categoriesIds, keyword, asin, ean, gtin, upc, mpn, isbn, params, exclude, responseFields)
            //result shouldBe ("TODO")
        }

    }
}
