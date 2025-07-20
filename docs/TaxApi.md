# TaxApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**taxClassInfo**](TaxApi.md#taxClassInfo) | **GET** /tax.class.info.json | tax.class.info |
| [**taxClassList**](TaxApi.md#taxClassList) | **GET** /tax.class.list.json | tax.class.list |


<a id="taxClassInfo"></a>
# **taxClassInfo**
> ModelResponseTaxClassInfo taxClassInfo(taxClassId, storeId, langId, responseFields, params, exclude)

tax.class.info

Use this method to get information about a tax class and its rates. It allows you to calculate the tax percentage for a specific customer&#39;s address. This information contains relatively static data that rarely changes, so API2Cart may cache certain data to reduce the load on the store and speed up request execution. We also recommend that you cache the response of this method on your side to save requests. If you need to clear the cache for a specific store, use the cart.validate method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxApi()
val taxClassId : kotlin.String = 9 // kotlin.String | Retrieves taxes specified by class id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val responseFields : kotlin.String = {result{id,name,tax,tax_rates{id,countries{id,name,states},cities,address,zip_codes{is_range,range,fields}}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = tax_class_id,tax // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = tax_class_id,tax // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseTaxClassInfo = apiInstance.taxClassInfo(taxClassId, storeId, langId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#taxClassInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#taxClassInfo")
    e.printStackTrace()
}
```

### Parameters
| **taxClassId** | **kotlin.String**| Retrieves taxes specified by class id | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;tax_class_id,name,avail&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseTaxClassInfo**](ModelResponseTaxClassInfo.md)

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

<a id="taxClassList"></a>
# **taxClassList**
> ModelResponseTaxClassList taxClassList(count, pageCursor, storeId, findValue, findWhere, createdTo, createdFrom, modifiedTo, modifiedFrom, responseFields)

tax.class.list

Get list of tax classes from your store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxApi()
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val findValue : kotlin.String = tax // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Tax class search that is specified by field
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : ModelResponseTaxClassList = apiInstance.taxClassList(count, pageCursor, storeId, findValue, findWhere, createdTo, createdFrom, modifiedTo, modifiedFrom, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxApi#taxClassList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxApi#taxClassList")
    e.printStackTrace()
}
```

### Parameters
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Tax class search that is specified by field | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;{return_code,return_message,pagination,result}&quot;] |

### Return type

[**ModelResponseTaxClassList**](ModelResponseTaxClassList.md)

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

