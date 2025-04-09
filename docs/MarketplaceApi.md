# MarketplaceApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**marketplaceProductFind**](MarketplaceApi.md#marketplaceProductFind) | **GET** /marketplace.product.find.json | marketplace.product.find |


<a id="marketplaceProductFind"></a>
# **marketplaceProductFind**
> ModelResponseMarketplaceProductFind marketplaceProductFind(storeId, count, pageCursor, categoriesIds, keyword, asin, ean, gtin, upc, mpn, isbn, params, exclude, responseFields)

marketplace.product.find

Search product in global catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketplaceApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val categoriesIds : kotlin.String = 23,56 // kotlin.String | Defines product add that is specified by comma-separated categories id
val keyword : kotlin.String = T-shirt // kotlin.String | Defines search keyword
val asin : kotlin.String = 97703178470 // kotlin.String | Amazon Standard Identification Number.
val ean : kotlin.String = 5901234123457 // kotlin.String | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products.
val gtin : kotlin.String = 12345678912345 // kotlin.String | Global Trade Item Number. An GTIN is an identifier for trade items.
val upc : kotlin.String = 9770317847001 // kotlin.String | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products.
val mpn : kotlin.String = 9770317847001 // kotlin.String | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used.
val isbn : kotlin.String = 9783161484100 // kotlin.String | International Standard Book Number. An ISBN is a unique identifier for books.
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : ModelResponseMarketplaceProductFind = apiInstance.marketplaceProductFind(storeId, count, pageCursor, categoriesIds, keyword, asin, ean, gtin, upc, mpn, isbn, params, exclude, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketplaceApi#marketplaceProductFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketplaceApi#marketplaceProductFind")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **categoriesIds** | **kotlin.String**| Defines product add that is specified by comma-separated categories id | [optional] |
| **keyword** | **kotlin.String**| Defines search keyword | [optional] |
| **asin** | **kotlin.String**| Amazon Standard Identification Number. | [optional] |
| **ean** | **kotlin.String**| European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. | [optional] |
| **gtin** | **kotlin.String**| Global Trade Item Number. An GTIN is an identifier for trade items. | [optional] |
| **upc** | **kotlin.String**| Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. | [optional] |
| **mpn** | **kotlin.String**| Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. | [optional] |
| **isbn** | **kotlin.String**| International Standard Book Number. An ISBN is a unique identifier for books. | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |

### Return type

[**ModelResponseMarketplaceProductFind**](ModelResponseMarketplaceProductFind.md)

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

