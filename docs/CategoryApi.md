# CategoryApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**categoryAdd**](CategoryApi.md#categoryAdd) | **POST** /category.add.json | category.add |
| [**categoryAddBatch**](CategoryApi.md#categoryAddBatch) | **POST** /category.add.batch.json | category.add.batch |
| [**categoryAssign**](CategoryApi.md#categoryAssign) | **POST** /category.assign.json | category.assign |
| [**categoryCount**](CategoryApi.md#categoryCount) | **GET** /category.count.json | category.count |
| [**categoryDelete**](CategoryApi.md#categoryDelete) | **DELETE** /category.delete.json | category.delete |
| [**categoryFind**](CategoryApi.md#categoryFind) | **GET** /category.find.json | category.find |
| [**categoryImageAdd**](CategoryApi.md#categoryImageAdd) | **POST** /category.image.add.json | category.image.add |
| [**categoryImageDelete**](CategoryApi.md#categoryImageDelete) | **DELETE** /category.image.delete.json | category.image.delete |
| [**categoryInfo**](CategoryApi.md#categoryInfo) | **GET** /category.info.json | category.info |
| [**categoryList**](CategoryApi.md#categoryList) | **GET** /category.list.json | category.list |
| [**categoryUnassign**](CategoryApi.md#categoryUnassign) | **POST** /category.unassign.json | category.unassign |
| [**categoryUpdate**](CategoryApi.md#categoryUpdate) | **PUT** /category.update.json | category.update |


<a id="categoryAdd"></a>
# **categoryAdd**
> CategoryAdd200Response categoryAdd(name, description, shortDescription, parentId, avail, createdTime, modifiedTime, sortOrder, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)

category.add

Add new category in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val name : kotlin.String = Shoes // kotlin.String | Defines category's name that has to be added
val description : kotlin.String = Test category // kotlin.String | Defines category's description
val shortDescription : kotlin.String = Short description. This is very short description // kotlin.String | Defines short description
val parentId : kotlin.String = 6 // kotlin.String | Adds categories specified by parent id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val createdTime : kotlin.String = 2014-01-30 15:58:41 // kotlin.String | Entity's date creation
val modifiedTime : kotlin.String = 2014-07-30 15:58:41 // kotlin.String | Entity's date modification
val sortOrder : kotlin.Int = 2 // kotlin.Int | Sort number in the list
val metaTitle : kotlin.String = category,test // kotlin.String | Defines unique meta title for each entity
val metaDescription : kotlin.String = category,test // kotlin.String | Defines unique meta description of a entity
val metaKeywords : kotlin.String = category,test // kotlin.String | Defines unique meta keywords for each entity
val seoUrl : kotlin.String = category,test // kotlin.String | Defines unique category's URL for SEO
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val storesIds : kotlin.String = 1,2 // kotlin.String | Create category in the stores that is specified by comma-separated stores' id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : CategoryAdd200Response = apiInstance.categoryAdd(name, description, shortDescription, parentId, avail, createdTime, modifiedTime, sortOrder, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryAdd")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Defines category&#39;s name that has to be added | |
| **description** | **kotlin.String**| Defines category&#39;s description | [optional] |
| **shortDescription** | **kotlin.String**| Defines short description | [optional] |
| **parentId** | **kotlin.String**| Adds categories specified by parent id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **createdTime** | **kotlin.String**| Entity&#39;s date creation | [optional] |
| **modifiedTime** | **kotlin.String**| Entity&#39;s date modification | [optional] |
| **sortOrder** | **kotlin.Int**| Sort number in the list | [optional] [default to 0] |
| **metaTitle** | **kotlin.String**| Defines unique meta title for each entity | [optional] |
| **metaDescription** | **kotlin.String**| Defines unique meta description of a entity | [optional] |
| **metaKeywords** | **kotlin.String**| Defines unique meta keywords for each entity | [optional] |
| **seoUrl** | **kotlin.String**| Defines unique category&#39;s URL for SEO | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **storesIds** | **kotlin.String**| Create category in the stores that is specified by comma-separated stores&#39; id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

### Return type

[**CategoryAdd200Response**](CategoryAdd200Response.md)

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

<a id="categoryAddBatch"></a>
# **categoryAddBatch**
> CategoryAddBatch200Response categoryAddBatch(categoryAddBatch)

category.add.batch

Add new categories to the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val categoryAddBatch : CategoryAddBatch =  // CategoryAddBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.categoryAddBatch(categoryAddBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryAddBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryAddBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryAddBatch** | [**CategoryAddBatch**](CategoryAddBatch.md)|  | |

### Return type

[**CategoryAddBatch200Response**](CategoryAddBatch200Response.md)

### Authorization


Configure StoreKeyAuth:
    ApiClient.apiKey["x-store-key"] = ""
    ApiClient.apiKeyPrefix["x-store-key"] = ""
Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="categoryAssign"></a>
# **categoryAssign**
> CategoryAssign200Response categoryAssign(categoryId, productId, storeId)

category.assign

Assign category to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val categoryId : kotlin.String = 6 // kotlin.String | Defines category assign, specified by category id
val productId : kotlin.String = 10 // kotlin.String | Defines category assign to the product, specified by product id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CategoryAssign200Response = apiInstance.categoryAssign(categoryId, productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryAssign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryAssign")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Defines category assign, specified by category id | |
| **productId** | **kotlin.String**| Defines category assign to the product, specified by product id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CategoryAssign200Response**](CategoryAssign200Response.md)

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

<a id="categoryCount"></a>
# **categoryCount**
> CategoryCount200Response categoryCount(parentId, storeId, langId, avail, createdFrom, createdTo, modifiedFrom, modifiedTo, productType, findValue, findWhere, reportRequestId, disableReportCache)

category.count

Count categories in store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val parentId : kotlin.String = 6 // kotlin.String | Counts categories specified by parent id
val storeId : kotlin.String = 1 // kotlin.String | Counts category specified by store id
val langId : kotlin.String = 3 // kotlin.String | Counts category specified by language id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val productType : kotlin.String = BICYCLE // kotlin.String | A categorization for the product
val findValue : kotlin.String = Demo category 1 // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = email // kotlin.String | Counts categories that are searched specified by field
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
try {
    val result : CategoryCount200Response = apiInstance.categoryCount(parentId, storeId, langId, avail, createdFrom, createdTo, modifiedFrom, modifiedTo, productType, findValue, findWhere, reportRequestId, disableReportCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryCount")
    e.printStackTrace()
}
```

### Parameters
| **parentId** | **kotlin.String**| Counts categories specified by parent id | [optional] |
| **storeId** | **kotlin.String**| Counts category specified by store id | [optional] |
| **langId** | **kotlin.String**| Counts category specified by language id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **productType** | **kotlin.String**| A categorization for the product | [optional] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Counts categories that are searched specified by field | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |

### Return type

[**CategoryCount200Response**](CategoryCount200Response.md)

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

<a id="categoryDelete"></a>
# **categoryDelete**
> CategoryDelete200Response categoryDelete(id, storeId)

category.delete

Delete category in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val id : kotlin.String = 10 // kotlin.String | Defines category removal, specified by category id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CategoryDelete200Response = apiInstance.categoryDelete(id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Defines category removal, specified by category id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CategoryDelete200Response**](CategoryDelete200Response.md)

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

<a id="categoryFind"></a>
# **categoryFind**
> CategoryFind200Response categoryFind(findValue, findWhere, findParams, storeId, langId)

category.find

Search category in store. \&quot;Laptop\&quot; is specified here by default.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val findValue : kotlin.String = Demo category 1 // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Entity search that is specified by the comma-separated unique fields
val findParams : kotlin.String = regex // kotlin.String | Entity search that is specified by comma-separated parameters
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : CategoryFind200Response = apiInstance.categoryFind(findValue, findWhere, findParams, storeId, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryFind")
    e.printStackTrace()
}
```

### Parameters
| **findValue** | **kotlin.String**| Entity search that is specified by some value | |
| **findWhere** | **kotlin.String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to &quot;name&quot;] |
| **findParams** | **kotlin.String**| Entity search that is specified by comma-separated parameters | [optional] [default to &quot;whole_words&quot;] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

### Return type

[**CategoryFind200Response**](CategoryFind200Response.md)

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

<a id="categoryImageAdd"></a>
# **categoryImageAdd**
> CategoryImageAdd200Response categoryImageAdd(categoryId, imageName, url, type, storeId, label, mime, position)

category.image.add

Add image to category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val categoryId : kotlin.String = 6 // kotlin.String | Defines category id where the image should be added
val imageName : kotlin.String = bag-gray.png // kotlin.String | Defines image's name
val url : kotlin.String = http://docs.api2cart.com/img/logo.png // kotlin.String | Defines URL of the image that has to be added
val type : kotlin.String = base // kotlin.String | Defines image's types that are specified by comma-separated list
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val label : kotlin.String = This cool image // kotlin.String | Defines alternative text that has to be attached to the picture
val mime : kotlin.String = image/jpeg // kotlin.String | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type.
val position : kotlin.Int = 5 // kotlin.Int | Defines image’s position in the list
try {
    val result : CategoryImageAdd200Response = apiInstance.categoryImageAdd(categoryId, imageName, url, type, storeId, label, mime, position)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryImageAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryImageAdd")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Defines category id where the image should be added | |
| **imageName** | **kotlin.String**| Defines image&#39;s name | |
| **url** | **kotlin.String**| Defines URL of the image that has to be added | |
| **type** | **kotlin.String**| Defines image&#39;s types that are specified by comma-separated list | [enum: base, thumbnail] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **label** | **kotlin.String**| Defines alternative text that has to be attached to the picture | [optional] |
| **mime** | **kotlin.String**| Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **position** | **kotlin.Int**| Defines image’s position in the list | [optional] [default to 0] |

### Return type

[**CategoryImageAdd200Response**](CategoryImageAdd200Response.md)

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

<a id="categoryImageDelete"></a>
# **categoryImageDelete**
> AttributeDelete200Response categoryImageDelete(categoryId, imageId, storeId)

category.image.delete

Delete image

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val categoryId : kotlin.String = 6 // kotlin.String | Defines category id where the image should be deleted
val imageId : kotlin.String = 82950b84f468edff480680f99cedbe0d // kotlin.String | Define image id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.categoryImageDelete(categoryId, imageId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryImageDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryImageDelete")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Defines category id where the image should be deleted | |
| **imageId** | **kotlin.String**| Define image id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**AttributeDelete200Response**](AttributeDelete200Response.md)

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

<a id="categoryInfo"></a>
# **categoryInfo**
> CategoryInfo200Response categoryInfo(id, storeId, langId, schemaType, responseFields, params, exclude, reportRequestId, disableReportCache)

category.info

Get category info about category ID*** or specify other category ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val id : kotlin.String = 10 // kotlin.String | Retrieves category's info specified by category id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves category info  specified by store id
val langId : kotlin.String = 3 // kotlin.String | Retrieves category info  specified by language id
val schemaType : kotlin.String = LISTING // kotlin.String | The name of the requirements set for the provided schema.
val responseFields : kotlin.String = {result{id,name,parent_id,modified_at{value},images}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,parent_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,parent_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
try {
    val result : CategoryInfo200Response = apiInstance.categoryInfo(id, storeId, langId, schemaType, responseFields, params, exclude, reportRequestId, disableReportCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Retrieves category&#39;s info specified by category id | |
| **storeId** | **kotlin.String**| Retrieves category info  specified by store id | [optional] |
| **langId** | **kotlin.String**| Retrieves category info  specified by language id | [optional] |
| **schemaType** | **kotlin.String**| The name of the requirements set for the provided schema. | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,parent_id,name,description&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |

### Return type

[**CategoryInfo200Response**](CategoryInfo200Response.md)

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

<a id="categoryList"></a>
# **categoryList**
> ModelResponseCategoryList categoryList(start, count, pageCursor, storeId, langId, parentId, avail, productType, createdFrom, createdTo, modifiedFrom, modifiedTo, findValue, findWhere, responseFields, params, exclude, reportRequestId, disableReportCache, disableCache)

category.list

Get list of categories from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Retrieves categories specified by store id
val langId : kotlin.String = 3 // kotlin.String | Retrieves categorys specified by language id
val parentId : kotlin.String = 6 // kotlin.String | Retrieves categories specified by parent id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val productType : kotlin.String = BICYCLE // kotlin.String | A categorization for the product
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val findValue : kotlin.String = Demo category 1 // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Category search that is specified by field
val responseFields : kotlin.String = {result{categories_count,category{id,parent_id,modified_at{value},images}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,parent_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,parent_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
val disableCache : kotlin.Boolean = false // kotlin.Boolean | Disable cache for current request
try {
    val result : ModelResponseCategoryList = apiInstance.categoryList(start, count, pageCursor, storeId, langId, parentId, avail, productType, createdFrom, createdTo, modifiedFrom, modifiedTo, findValue, findWhere, responseFields, params, exclude, reportRequestId, disableReportCache, disableCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Retrieves categories specified by store id | [optional] |
| **langId** | **kotlin.String**| Retrieves categorys specified by language id | [optional] |
| **parentId** | **kotlin.String**| Retrieves categories specified by parent id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **productType** | **kotlin.String**| A categorization for the product | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Category search that is specified by field | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,parent_id,name,description&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableCache** | **kotlin.Boolean**| Disable cache for current request | [optional] [default to false] |

### Return type

[**ModelResponseCategoryList**](ModelResponseCategoryList.md)

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

<a id="categoryUnassign"></a>
# **categoryUnassign**
> CategoryAssign200Response categoryUnassign(categoryId, productId, storeId)

category.unassign

Unassign category to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val categoryId : kotlin.String = 6 // kotlin.String | Defines category unassign, specified by category id
val productId : kotlin.String = 10 // kotlin.String | Defines category unassign to the product, specified by product id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CategoryAssign200Response = apiInstance.categoryUnassign(categoryId, productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryUnassign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryUnassign")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**| Defines category unassign, specified by category id | |
| **productId** | **kotlin.String**| Defines category unassign to the product, specified by product id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CategoryAssign200Response**](CategoryAssign200Response.md)

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

<a id="categoryUpdate"></a>
# **categoryUpdate**
> AccountConfigUpdate200Response categoryUpdate(id, name, description, shortDescription, parentId, avail, sortOrder, modifiedTime, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)

category.update

Update category in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CategoryApi()
val id : kotlin.String = 10 // kotlin.String | Defines category update specified by category id
val name : kotlin.String = NEW Shoes // kotlin.String | Defines new category’s name
val description : kotlin.String = New test category // kotlin.String | Defines new category's description
val shortDescription : kotlin.String = Short description. This is very short description // kotlin.String | Defines short description
val parentId : kotlin.String = 6 // kotlin.String | Defines new parent category id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val sortOrder : kotlin.Int = 2 // kotlin.Int | Sort number in the list
val modifiedTime : kotlin.String = 2014-07-30 15:58:41 // kotlin.String | Entity's date modification
val metaTitle : kotlin.String = category,test // kotlin.String | Defines unique meta title for each entity
val metaDescription : kotlin.String = category,test // kotlin.String | Defines unique meta description of a entity
val metaKeywords : kotlin.String = category,test // kotlin.String | Defines unique meta keywords for each entity
val seoUrl : kotlin.String = category,test // kotlin.String | Defines unique category's URL for SEO
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val storesIds : kotlin.String = 1,2 // kotlin.String | Update category in the stores that is specified by comma-separated stores' id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : AccountConfigUpdate200Response = apiInstance.categoryUpdate(id, name, description, shortDescription, parentId, avail, sortOrder, modifiedTime, metaTitle, metaDescription, metaKeywords, seoUrl, storeId, storesIds, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoryApi#categoryUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoryApi#categoryUpdate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Defines category update specified by category id | |
| **name** | **kotlin.String**| Defines new category’s name | [optional] |
| **description** | **kotlin.String**| Defines new category&#39;s description | [optional] |
| **shortDescription** | **kotlin.String**| Defines short description | [optional] |
| **parentId** | **kotlin.String**| Defines new parent category id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] |
| **sortOrder** | **kotlin.Int**| Sort number in the list | [optional] |
| **modifiedTime** | **kotlin.String**| Entity&#39;s date modification | [optional] |
| **metaTitle** | **kotlin.String**| Defines unique meta title for each entity | [optional] |
| **metaDescription** | **kotlin.String**| Defines unique meta description of a entity | [optional] |
| **metaKeywords** | **kotlin.String**| Defines unique meta keywords for each entity | [optional] |
| **seoUrl** | **kotlin.String**| Defines unique category&#39;s URL for SEO | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **storesIds** | **kotlin.String**| Update category in the stores that is specified by comma-separated stores&#39; id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

### Return type

[**AccountConfigUpdate200Response**](AccountConfigUpdate200Response.md)

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

