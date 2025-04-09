# BatchApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**batchJobList**](BatchApi.md#batchJobList) | **GET** /batch.job.list.json | batch.job.list |
| [**batchJobResult**](BatchApi.md#batchJobResult) | **GET** /batch.job.result.json | batch.job.result |


<a id="batchJobList"></a>
# **batchJobList**
> ModelResponseBatchJobList batchJobList(count, pageCursor, createdFrom, createdTo, processedFrom, processedTo, ids, responseFields)

batch.job.list

Get list of recent jobs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val processedFrom : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities according to their processing datetime
val processedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities according to their processing datetime
val ids : kotlin.String = 24,25 // kotlin.String | Filter batch jobs by ids
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : ModelResponseBatchJobList = apiInstance.batchJobList(count, pageCursor, createdFrom, createdTo, processedFrom, processedTo, ids, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#batchJobList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#batchJobList")
    e.printStackTrace()
}
```

### Parameters
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **processedFrom** | **kotlin.String**| Retrieve entities according to their processing datetime | [optional] |
| **processedTo** | **kotlin.String**| Retrieve entities according to their processing datetime | [optional] |
| **ids** | **kotlin.String**| Filter batch jobs by ids | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;{return_code,return_message,pagination,result}&quot;] |

### Return type

[**ModelResponseBatchJobList**](ModelResponseBatchJobList.md)

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

<a id="batchJobResult"></a>
# **batchJobResult**
> ResponseBatchJobResult batchJobResult(id)

batch.job.result

Get job result data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BatchApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
try {
    val result : ResponseBatchJobResult = apiInstance.batchJobResult(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BatchApi#batchJobResult")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BatchApi#batchJobResult")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Entity id | |

### Return type

[**ResponseBatchJobResult**](ResponseBatchJobResult.md)

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

