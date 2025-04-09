# BasketApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**basketInfo**](BasketApi.md#basketInfo) | **GET** /basket.info.json | basket.info |
| [**basketItemAdd**](BasketApi.md#basketItemAdd) | **POST** /basket.item.add.json | basket.item.add |
| [**basketLiveShippingServiceCreate**](BasketApi.md#basketLiveShippingServiceCreate) | **POST** /basket.live_shipping_service.create.json | basket.live_shipping_service.create |
| [**basketLiveShippingServiceDelete**](BasketApi.md#basketLiveShippingServiceDelete) | **DELETE** /basket.live_shipping_service.delete.json | basket.live_shipping_service.delete |
| [**basketLiveShippingServiceList**](BasketApi.md#basketLiveShippingServiceList) | **GET** /basket.live_shipping_service.list.json | basket.live_shipping_service.list |


<a id="basketInfo"></a>
# **basketInfo**
> BasketInfo200Response basketInfo(id, storeId, params, exclude, responseFields)

basket.info

Retrieve basket information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BasketApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : BasketInfo200Response = apiInstance.basketInfo(id, storeId, params, exclude, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasketApi#basketInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasketApi#basketInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |

### Return type

[**BasketInfo200Response**](BasketInfo200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="basketItemAdd"></a>
# **basketItemAdd**
> BasketItemAdd200Response basketItemAdd(customerId, productId, variantId, quantity, storeId)

basket.item.add

Add item to basket

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BasketApi()
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val productId : kotlin.String = 10 // kotlin.String | Defines id of the product which should be added to the basket
val variantId : kotlin.String = 45 // kotlin.String | Defines product's variants specified by variant id
val quantity : java.math.BigDecimal = 6 // java.math.BigDecimal | Defines new items quantity
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : BasketItemAdd200Response = apiInstance.basketItemAdd(customerId, productId, variantId, quantity, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasketApi#basketItemAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasketApi#basketItemAdd")
    e.printStackTrace()
}
```

### Parameters
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | |
| **productId** | **kotlin.String**| Defines id of the product which should be added to the basket | |
| **variantId** | **kotlin.String**| Defines product&#39;s variants specified by variant id | [optional] |
| **quantity** | **java.math.BigDecimal**| Defines new items quantity | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**BasketItemAdd200Response**](BasketItemAdd200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="basketLiveShippingServiceCreate"></a>
# **basketLiveShippingServiceCreate**
> BasketLiveShippingServiceCreate200Response basketLiveShippingServiceCreate(name, paramCallback, storeId)

basket.live_shipping_service.create

Create live shipping rate service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BasketApi()
val name : kotlin.String = BestDelivery // kotlin.String | Shipping Service Name
val paramCallback : kotlin.String = https://example.com/callback // kotlin.String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : BasketLiveShippingServiceCreate200Response = apiInstance.basketLiveShippingServiceCreate(name, paramCallback, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasketApi#basketLiveShippingServiceCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasketApi#basketLiveShippingServiceCreate")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Shipping Service Name | |
| **paramCallback** | **kotlin.String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**BasketLiveShippingServiceCreate200Response**](BasketLiveShippingServiceCreate200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="basketLiveShippingServiceDelete"></a>
# **basketLiveShippingServiceDelete**
> BasketLiveShippingServiceDelete200Response basketLiveShippingServiceDelete(id)

basket.live_shipping_service.delete

Delete live shipping rate service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BasketApi()
val id : kotlin.Int = 5 // kotlin.Int | Entity id
try {
    val result : BasketLiveShippingServiceDelete200Response = apiInstance.basketLiveShippingServiceDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasketApi#basketLiveShippingServiceDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasketApi#basketLiveShippingServiceDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| Entity id | |

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="basketLiveShippingServiceList"></a>
# **basketLiveShippingServiceList**
> BasketLiveShippingServiceList200Response basketLiveShippingServiceList(storeId, start, count)

basket.live_shipping_service.list

Retrieve a list of live shipping rate services.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BasketApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
try {
    val result : BasketLiveShippingServiceList200Response = apiInstance.basketLiveShippingServiceList(storeId, start, count)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BasketApi#basketLiveShippingServiceList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BasketApi#basketLiveShippingServiceList")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |

### Return type

[**BasketLiveShippingServiceList200Response**](BasketLiveShippingServiceList200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

