# ReturnApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**returnActionList**](ReturnApi.md#returnActionList) | **GET** /return.action.list.json | return.action.list |
| [**returnCount**](ReturnApi.md#returnCount) | **GET** /return.count.json | return.count |
| [**returnInfo**](ReturnApi.md#returnInfo) | **GET** /return.info.json | return.info |
| [**returnList**](ReturnApi.md#returnList) | **GET** /return.list.json | return.list |
| [**returnReasonList**](ReturnApi.md#returnReasonList) | **GET** /return.reason.list.json | return.reason.list |
| [**returnStatusList**](ReturnApi.md#returnStatusList) | **GET** /return.status.list.json | return.status.list |


<a id="returnActionList"></a>
# **returnActionList**
> ReturnActionList200Response returnActionList()

return.action.list

Retrieve list of return actions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
try {
    val result : ReturnActionList200Response = apiInstance.returnActionList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnActionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnActionList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReturnActionList200Response**](ReturnActionList200Response.md)

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

<a id="returnCount"></a>
# **returnCount**
> ReturnCount200Response returnCount(orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache)

return.count

Count returns in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
val orderIds : kotlin.String = 24,25 // kotlin.String | Counts return requests specified by order ids
val customerId : kotlin.String = 5 // kotlin.String | Counts return requests quantity specified by customer id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val status : kotlin.String = disabled // kotlin.String | Defines status
val returnType : kotlin.String = FBA // kotlin.String | Retrieves returns specified by return type
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
try {
    val result : ReturnCount200Response = apiInstance.returnCount(orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, reportRequestId, disableReportCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnCount")
    e.printStackTrace()
}
```

### Parameters
| **orderIds** | **kotlin.String**| Counts return requests specified by order ids | [optional] |
| **customerId** | **kotlin.String**| Counts return requests quantity specified by customer id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **status** | **kotlin.String**| Defines status | [optional] |
| **returnType** | **kotlin.String**| Retrieves returns specified by return type | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |

### Return type

[**ReturnCount200Response**](ReturnCount200Response.md)

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

<a id="returnInfo"></a>
# **returnInfo**
> ReturnInfo200Response returnInfo(id, orderId, storeId, responseFields, params, exclude)

return.info

Retrieve return information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val orderId : kotlin.String = 25 // kotlin.String | Defines the order id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {return_code,return_message,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,order_products // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,order_id // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ReturnInfo200Response = apiInstance.returnInfo(id, orderId, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **orderId** | **kotlin.String**| Defines the order id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,order_products&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ReturnInfo200Response**](ReturnInfo200Response.md)

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

<a id="returnList"></a>
# **returnList**
> ModelResponseReturnList returnList(start, count, pageCursor, orderId, orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude, reportRequestId, disableReportCache)

return.list

Get list of return requests from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val orderId : kotlin.String = 25 // kotlin.String | Defines the order id
val orderIds : kotlin.String = 24,25 // kotlin.String | Retrieves return requests specified by order ids
val customerId : kotlin.String = 5 // kotlin.String | Retrieves return requests specified by customer id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val status : kotlin.String = disabled // kotlin.String | Defines status
val returnType : kotlin.String = FBA // kotlin.String | Retrieves returns specified by return type
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,order_products // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,order_id // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
try {
    val result : ModelResponseReturnList = apiInstance.returnList(start, count, pageCursor, orderId, orderIds, customerId, storeId, status, returnType, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude, reportRequestId, disableReportCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **orderId** | **kotlin.String**| Defines the order id | [optional] |
| **orderIds** | **kotlin.String**| Retrieves return requests specified by order ids | [optional] |
| **customerId** | **kotlin.String**| Retrieves return requests specified by customer id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **status** | **kotlin.String**| Defines status | [optional] |
| **returnType** | **kotlin.String**| Retrieves returns specified by return type | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,order_products&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |

### Return type

[**ModelResponseReturnList**](ModelResponseReturnList.md)

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

<a id="returnReasonList"></a>
# **returnReasonList**
> ReturnReasonList200Response returnReasonList(storeId)

return.reason.list

Retrieve list of return reasons

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : ReturnReasonList200Response = apiInstance.returnReasonList(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnReasonList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnReasonList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**ReturnReasonList200Response**](ReturnReasonList200Response.md)

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

<a id="returnStatusList"></a>
# **returnStatusList**
> ReturnStatusList200Response returnStatusList()

return.status.list

Retrieve list of statuses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnApi()
try {
    val result : ReturnStatusList200Response = apiInstance.returnStatusList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnApi#returnStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnApi#returnStatusList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReturnStatusList200Response**](ReturnStatusList200Response.md)

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

