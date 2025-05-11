# SubscriberApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**subscriberList**](SubscriberApi.md#subscriberList) | **GET** /subscriber.list.json | subscriber.list |


<a id="subscriberList"></a>
# **subscriberList**
> ModelResponseSubscriberList subscriberList(ids, start, count, pageCursor, subscribed, storeId, email, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

subscriber.list

Get subscribers list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriberApi()
val ids : kotlin.String = 24,25 // kotlin.String | Retrieves subscribers specified by ids
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val subscribed : kotlin.Boolean = false // kotlin.Boolean | Filter by subscription status
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val email : kotlin.String = mail@example.com // kotlin.String | Filter subscribers by email
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseSubscriberList = apiInstance.subscriberList(ids, start, count, pageCursor, subscribed, storeId, email, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriberApi#subscriberList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriberApi#subscriberList")
    e.printStackTrace()
}
```

### Parameters
| **ids** | **kotlin.String**| Retrieves subscribers specified by ids | [optional] |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **subscribed** | **kotlin.Boolean**| Filter by subscription status | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **email** | **kotlin.String**| Filter subscribers by email | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseSubscriberList**](ModelResponseSubscriberList.md)

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

