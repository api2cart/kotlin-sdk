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

import org.openapitools.client.apis.BasketApi
import org.openapitools.client.models.BasketInfo200Response
import org.openapitools.client.models.BasketItemAdd200Response
import org.openapitools.client.models.BasketLiveShippingServiceCreate200Response
import org.openapitools.client.models.BasketLiveShippingServiceDelete200Response
import org.openapitools.client.models.BasketLiveShippingServiceList200Response

class BasketApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BasketApi
        //val apiInstance = BasketApi()

        // to test basketInfo
        should("test basketInfo") {
            // uncomment below to test basketInfo
            //val id : kotlin.String = 10 // kotlin.String | Entity id
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : BasketInfo200Response = apiInstance.basketInfo(id, storeId, params, exclude, responseFields)
            //result shouldBe ("TODO")
        }

        // to test basketItemAdd
        should("test basketItemAdd") {
            // uncomment below to test basketItemAdd
            //val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
            //val productId : kotlin.String = 10 // kotlin.String | Defines id of the product which should be added to the basket
            //val variantId : kotlin.String = 45 // kotlin.String | Defines product's variants specified by variant id
            //val quantity : java.math.BigDecimal = 6 // java.math.BigDecimal | Defines new items quantity
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val result : BasketItemAdd200Response = apiInstance.basketItemAdd(customerId, productId, variantId, quantity, storeId)
            //result shouldBe ("TODO")
        }

        // to test basketLiveShippingServiceCreate
        should("test basketLiveShippingServiceCreate") {
            // uncomment below to test basketLiveShippingServiceCreate
            //val name : kotlin.String = BestDelivery // kotlin.String | Shipping Service Name
            //val paramCallback : kotlin.String = https://example.com/callback // kotlin.String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val result : BasketLiveShippingServiceCreate200Response = apiInstance.basketLiveShippingServiceCreate(name, paramCallback, storeId)
            //result shouldBe ("TODO")
        }

        // to test basketLiveShippingServiceDelete
        should("test basketLiveShippingServiceDelete") {
            // uncomment below to test basketLiveShippingServiceDelete
            //val id : kotlin.Int = 5 // kotlin.Int | Entity id
            //val result : BasketLiveShippingServiceDelete200Response = apiInstance.basketLiveShippingServiceDelete(id)
            //result shouldBe ("TODO")
        }

        // to test basketLiveShippingServiceList
        should("test basketLiveShippingServiceList") {
            // uncomment below to test basketLiveShippingServiceList
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val result : BasketLiveShippingServiceList200Response = apiInstance.basketLiveShippingServiceList(storeId, start, count)
            //result shouldBe ("TODO")
        }

    }
}
