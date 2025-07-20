# BridgeApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bridgeDelete**](BridgeApi.md#bridgeDelete) | **POST** /bridge.delete.json | bridge.delete |
| [**bridgeDownload**](BridgeApi.md#bridgeDownload) | **GET** /bridge.download.file | bridge.download |
| [**bridgeUpdate**](BridgeApi.md#bridgeUpdate) | **POST** /bridge.update.json | bridge.update |


<a id="bridgeDelete"></a>
# **bridgeDelete**
> AttributeValueDelete200Response bridgeDelete()

bridge.delete

Delete bridge from the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BridgeApi()
try {
    val result : AttributeValueDelete200Response = apiInstance.bridgeDelete()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BridgeApi#bridgeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BridgeApi#bridgeDelete")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttributeValueDelete200Response**](AttributeValueDelete200Response.md)

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

<a id="bridgeDownload"></a>
# **bridgeDownload**
> java.io.File bridgeDownload(whitelabel)

bridge.download

Download bridge for store.&lt;/br&gt;Please note that the method would not work if you call it from Swagger UI.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BridgeApi()
val whitelabel : kotlin.Boolean = true // kotlin.Boolean | Identifies if there is a necessity to download whitelabel bridge.
try {
    val result : java.io.File = apiInstance.bridgeDownload(whitelabel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BridgeApi#bridgeDownload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BridgeApi#bridgeDownload")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **whitelabel** | **kotlin.Boolean**| Identifies if there is a necessity to download whitelabel bridge. | [optional] [default to false] |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="bridgeUpdate"></a>
# **bridgeUpdate**
> AttributeUpdate200Response bridgeUpdate()

bridge.update

Update bridge in the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BridgeApi()
try {
    val result : AttributeUpdate200Response = apiInstance.bridgeUpdate()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BridgeApi#bridgeUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BridgeApi#bridgeUpdate")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttributeUpdate200Response**](AttributeUpdate200Response.md)

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

