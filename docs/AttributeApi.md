# AttributeApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**attributeAdd**](AttributeApi.md#attributeAdd) | **POST** /attribute.add.json | attribute.add |
| [**attributeAssignGroup**](AttributeApi.md#attributeAssignGroup) | **POST** /attribute.assign.group.json | attribute.assign.group |
| [**attributeAssignSet**](AttributeApi.md#attributeAssignSet) | **POST** /attribute.assign.set.json | attribute.assign.set |
| [**attributeAttributesetList**](AttributeApi.md#attributeAttributesetList) | **GET** /attribute.attributeset.list.json | attribute.attributeset.list |
| [**attributeCount**](AttributeApi.md#attributeCount) | **GET** /attribute.count.json | attribute.count |
| [**attributeDelete**](AttributeApi.md#attributeDelete) | **DELETE** /attribute.delete.json | attribute.delete |
| [**attributeGroupList**](AttributeApi.md#attributeGroupList) | **GET** /attribute.group.list.json | attribute.group.list |
| [**attributeInfo**](AttributeApi.md#attributeInfo) | **GET** /attribute.info.json | attribute.info |
| [**attributeList**](AttributeApi.md#attributeList) | **GET** /attribute.list.json | attribute.list |
| [**attributeTypeList**](AttributeApi.md#attributeTypeList) | **GET** /attribute.type.list.json | attribute.type.list |
| [**attributeUnassignGroup**](AttributeApi.md#attributeUnassignGroup) | **POST** /attribute.unassign.group.json | attribute.unassign.group |
| [**attributeUnassignSet**](AttributeApi.md#attributeUnassignSet) | **POST** /attribute.unassign.set.json | attribute.unassign.set |
| [**attributeUpdate**](AttributeApi.md#attributeUpdate) | **PUT** /attribute.update.json | attribute.update |
| [**attributeValueAdd**](AttributeApi.md#attributeValueAdd) | **POST** /attribute.value.add.json | attribute.value.add |
| [**attributeValueDelete**](AttributeApi.md#attributeValueDelete) | **DELETE** /attribute.value.delete.json | attribute.value.delete |
| [**attributeValueUpdate**](AttributeApi.md#attributeValueUpdate) | **PUT** /attribute.value.update.json | attribute.value.update |


<a id="attributeAdd"></a>
# **attributeAdd**
> AttributeAdd200Response attributeAdd(type, name, code, storeId, langId, visible, required, position, attributeGroupId, isGlobal, isSearchable, isFilterable, isComparable, isHtmlAllowedOnFront, isFilterableInSearch, isConfigurable, isVisibleInAdvancedSearch, isUsedForPromoRules, usedInProductListing, usedForSortBy, applyTo)

attribute.add

Add new attribute

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val type : kotlin.String = text // kotlin.String | Defines attribute's type
val name : kotlin.String = Specification // kotlin.String | Defines attributes's name
val code : kotlin.String = code // kotlin.String | Entity code
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val visible : kotlin.Boolean = true // kotlin.Boolean | Set visibility status
val required : kotlin.Boolean = true // kotlin.Boolean | Defines if the option is required
val position : kotlin.Int = 5 // kotlin.Int | Attribute`s position
val attributeGroupId : kotlin.String = 202 // kotlin.String | Filter by attribute_group_id
val isGlobal : kotlin.String = Global // kotlin.String | Attribute saving scope
val isSearchable : kotlin.Boolean = false // kotlin.Boolean | Use attribute in Quick Search
val isFilterable : kotlin.String = No // kotlin.String | Use In Layered Navigation
val isComparable : kotlin.Boolean = true // kotlin.Boolean | Comparable on Front-end
val isHtmlAllowedOnFront : kotlin.Boolean = true // kotlin.Boolean | Allow HTML Tags on Frontend
val isFilterableInSearch : kotlin.Boolean = true // kotlin.Boolean | Use In Search Results Layered Navigation
val isConfigurable : kotlin.Boolean = true // kotlin.Boolean | Use To Create Configurable Product
val isVisibleInAdvancedSearch : kotlin.Boolean = true // kotlin.Boolean | Use in Advanced Search
val isUsedForPromoRules : kotlin.Boolean = true // kotlin.Boolean | Use for Promo Rule Conditions
val usedInProductListing : kotlin.Boolean = true // kotlin.Boolean | Used in Product Listing
val usedForSortBy : kotlin.Boolean = true // kotlin.Boolean | Used for Sorting in Product Listing
val applyTo : kotlin.String = Global // kotlin.String | Types of products which can have this attribute
try {
    val result : AttributeAdd200Response = apiInstance.attributeAdd(type, name, code, storeId, langId, visible, required, position, attributeGroupId, isGlobal, isSearchable, isFilterable, isComparable, isHtmlAllowedOnFront, isFilterableInSearch, isConfigurable, isVisibleInAdvancedSearch, isUsedForPromoRules, usedInProductListing, usedForSortBy, applyTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeAdd")
    e.printStackTrace()
}
```

### Parameters
| **type** | **kotlin.String**| Defines attribute&#39;s type | [enum: text, select, textarea, date, price, multiselect, boolean] |
| **name** | **kotlin.String**| Defines attributes&#39;s name | |
| **code** | **kotlin.String**| Entity code | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **visible** | **kotlin.Boolean**| Set visibility status | [optional] [default to false] |
| **required** | **kotlin.Boolean**| Defines if the option is required | [optional] [default to false] |
| **position** | **kotlin.Int**| Attribute&#x60;s position | [optional] [default to 0] |
| **attributeGroupId** | **kotlin.String**| Filter by attribute_group_id | [optional] |
| **isGlobal** | **kotlin.String**| Attribute saving scope | [optional] [default to &quot;Store&quot;] |
| **isSearchable** | **kotlin.Boolean**| Use attribute in Quick Search | [optional] [default to false] |
| **isFilterable** | **kotlin.String**| Use In Layered Navigation | [optional] [default to &quot;No&quot;] |
| **isComparable** | **kotlin.Boolean**| Comparable on Front-end | [optional] [default to false] |
| **isHtmlAllowedOnFront** | **kotlin.Boolean**| Allow HTML Tags on Frontend | [optional] [default to false] |
| **isFilterableInSearch** | **kotlin.Boolean**| Use In Search Results Layered Navigation | [optional] [default to false] |
| **isConfigurable** | **kotlin.Boolean**| Use To Create Configurable Product | [optional] [default to false] |
| **isVisibleInAdvancedSearch** | **kotlin.Boolean**| Use in Advanced Search | [optional] [default to false] |
| **isUsedForPromoRules** | **kotlin.Boolean**| Use for Promo Rule Conditions | [optional] [default to false] |
| **usedInProductListing** | **kotlin.Boolean**| Used in Product Listing | [optional] [default to false] |
| **usedForSortBy** | **kotlin.Boolean**| Used for Sorting in Product Listing | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **applyTo** | **kotlin.String**| Types of products which can have this attribute | [optional] [default to &quot;all_types&quot;] |

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

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

<a id="attributeAssignGroup"></a>
# **attributeAssignGroup**
> AttributeAssignGroup200Response attributeAssignGroup(id, groupId, attributeSetId)

attribute.assign.group

Assign attribute to the group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val groupId : kotlin.String = 3 // kotlin.String | Attribute group_id
val attributeSetId : kotlin.String = 4 // kotlin.String | Attribute set id
try {
    val result : AttributeAssignGroup200Response = apiInstance.attributeAssignGroup(id, groupId, attributeSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeAssignGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeAssignGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **groupId** | **kotlin.String**| Attribute group_id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeSetId** | **kotlin.String**| Attribute set id | [optional] |

### Return type

[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)

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

<a id="attributeAssignSet"></a>
# **attributeAssignSet**
> AttributeAssignGroup200Response attributeAssignSet(id, attributeSetId, groupId)

attribute.assign.set

Assign attribute to the attribute set

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val attributeSetId : kotlin.String = 4 // kotlin.String | Attribute set id
val groupId : kotlin.String = 3 // kotlin.String | Attribute group_id
try {
    val result : AttributeAssignGroup200Response = apiInstance.attributeAssignSet(id, attributeSetId, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeAssignSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeAssignSet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **attributeSetId** | **kotlin.String**| Attribute set id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.String**| Attribute group_id | [optional] |

### Return type

[**AttributeAssignGroup200Response**](AttributeAssignGroup200Response.md)

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

<a id="attributeAttributesetList"></a>
# **attributeAttributesetList**
> ModelResponseAttributeAttributesetList attributeAttributesetList(start, count, responseFields, params, exclude)

attribute.attributeset.list

Get attribute_set list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseAttributeAttributesetList = apiInstance.attributeAttributesetList(start, count, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeAttributesetList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeAttributesetList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseAttributeAttributesetList**](ModelResponseAttributeAttributesetList.md)

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

<a id="attributeCount"></a>
# **attributeCount**
> AttributeCount200Response attributeCount(type, attributeSetId, storeId, langId, visible, required, system)

attribute.count

Get attributes count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val type : kotlin.String = text // kotlin.String | Defines attribute's type
val attributeSetId : kotlin.String = 4 // kotlin.String | Filter items by attribute set id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val visible : kotlin.Boolean = true // kotlin.Boolean | Filter items by visibility status
val required : kotlin.Boolean = true // kotlin.Boolean | Defines if the option is required
val system : kotlin.Boolean = false // kotlin.Boolean | True if attribute is system
try {
    val result : AttributeCount200Response = apiInstance.attributeCount(type, attributeSetId, storeId, langId, visible, required, system)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeCount")
    e.printStackTrace()
}
```

### Parameters
| **type** | **kotlin.String**| Defines attribute&#39;s type | [optional] |
| **attributeSetId** | **kotlin.String**| Filter items by attribute set id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **visible** | **kotlin.Boolean**| Filter items by visibility status | [optional] |
| **required** | **kotlin.Boolean**| Defines if the option is required | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **system** | **kotlin.Boolean**| True if attribute is system | [optional] |

### Return type

[**AttributeCount200Response**](AttributeCount200Response.md)

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

<a id="attributeDelete"></a>
# **attributeDelete**
> AttributeDelete200Response attributeDelete(id, storeId)

attribute.delete

Delete attribute from store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.attributeDelete(id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
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

<a id="attributeGroupList"></a>
# **attributeGroupList**
> ModelResponseAttributeGroupList attributeGroupList(start, count, attributeSetId, langId, responseFields, params, exclude)

attribute.group.list

Get attribute group list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val attributeSetId : kotlin.String = 4 // kotlin.String | Attribute set id
val langId : kotlin.String = 3 // kotlin.String | Language id
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseAttributeGroupList = apiInstance.attributeGroupList(start, count, attributeSetId, langId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeGroupList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **attributeSetId** | **kotlin.String**| Attribute set id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseAttributeGroupList**](ModelResponseAttributeGroupList.md)

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

<a id="attributeInfo"></a>
# **attributeInfo**
> AttributeInfo200Response attributeInfo(id, attributeSetId, storeId, langId, responseFields, params, exclude)

attribute.info

Get information about a specific global attribute by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val attributeSetId : kotlin.String = 4 // kotlin.String | Attribute set id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = force_all // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : AttributeInfo200Response = apiInstance.attributeInfo(id, attributeSetId, storeId, langId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **attributeSetId** | **kotlin.String**| Attribute set id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**AttributeInfo200Response**](AttributeInfo200Response.md)

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

<a id="attributeList"></a>
# **attributeList**
> ModelResponseAttributeList attributeList(start, count, attributeIds, attributeSetId, storeId, langId, type, visible, required, system, responseFields, params, exclude)

attribute.list

Get a list of global attributes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val attributeIds : kotlin.String = 1,2,3 // kotlin.String | Filter attributes by ids
val attributeSetId : kotlin.String = 4 // kotlin.String | Filter items by attribute set id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Retrieves attributes on specified language id
val type : kotlin.String = text // kotlin.String | Defines attribute's type
val visible : kotlin.Boolean = true // kotlin.Boolean | Filter items by visibility status
val required : kotlin.Boolean = true // kotlin.Boolean | Defines if the option is required
val system : kotlin.Boolean = false // kotlin.Boolean | True if attribute is system
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseAttributeList = apiInstance.attributeList(start, count, attributeIds, attributeSetId, storeId, langId, type, visible, required, system, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **attributeIds** | **kotlin.String**| Filter attributes by ids | [optional] |
| **attributeSetId** | **kotlin.String**| Filter items by attribute set id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Retrieves attributes on specified language id | [optional] |
| **type** | **kotlin.String**| Defines attribute&#39;s type | [optional] |
| **visible** | **kotlin.Boolean**| Filter items by visibility status | [optional] |
| **required** | **kotlin.Boolean**| Defines if the option is required | [optional] |
| **system** | **kotlin.Boolean**| True if attribute is system | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,code,type&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseAttributeList**](ModelResponseAttributeList.md)

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

<a id="attributeTypeList"></a>
# **attributeTypeList**
> AttributeTypeList200Response attributeTypeList()

attribute.type.list

Get list of supported attributes types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
try {
    val result : AttributeTypeList200Response = apiInstance.attributeTypeList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeTypeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeTypeList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AttributeTypeList200Response**](AttributeTypeList200Response.md)

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

<a id="attributeUnassignGroup"></a>
# **attributeUnassignGroup**
> AttributeUnassignGroup200Response attributeUnassignGroup(id, groupId)

attribute.unassign.group

Unassign attribute from group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val groupId : kotlin.String = 3 // kotlin.String | Customer group_id
try {
    val result : AttributeUnassignGroup200Response = apiInstance.attributeUnassignGroup(id, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeUnassignGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeUnassignGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.String**| Customer group_id | |

### Return type

[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)

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

<a id="attributeUnassignSet"></a>
# **attributeUnassignSet**
> AttributeUnassignGroup200Response attributeUnassignSet(id, attributeSetId)

attribute.unassign.set

Unassign attribute from attribute set

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val attributeSetId : kotlin.String = 4 // kotlin.String | Attribute set id
try {
    val result : AttributeUnassignGroup200Response = apiInstance.attributeUnassignSet(id, attributeSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeUnassignSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeUnassignSet")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **attributeSetId** | **kotlin.String**| Attribute set id | |

### Return type

[**AttributeUnassignGroup200Response**](AttributeUnassignGroup200Response.md)

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

<a id="attributeUpdate"></a>
# **attributeUpdate**
> AttributeUpdate200Response attributeUpdate(id, name, storeId, langId)

attribute.update

Update attribute data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val name : kotlin.String = Test name // kotlin.String | Defines new attributes's name
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : AttributeUpdate200Response = apiInstance.attributeUpdate(id, name, storeId, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeUpdate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **name** | **kotlin.String**| Defines new attributes&#39;s name | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

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

<a id="attributeValueAdd"></a>
# **attributeValueAdd**
> AttributeAdd200Response attributeValueAdd(attributeId, name, code, description, storeId, langId)

attribute.value.add

Add new value to attribute.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val attributeId : kotlin.String = 156 // kotlin.String | Attribute Id
val name : kotlin.String = Test name // kotlin.String | Defines attribute value's name
val code : kotlin.String = code // kotlin.String | Entity code
val description : kotlin.String = Test value // kotlin.String | Defines attribute value's description
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : AttributeAdd200Response = apiInstance.attributeValueAdd(attributeId, name, code, description, storeId, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeValueAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeValueAdd")
    e.printStackTrace()
}
```

### Parameters
| **attributeId** | **kotlin.String**| Attribute Id | |
| **name** | **kotlin.String**| Defines attribute value&#39;s name | |
| **code** | **kotlin.String**| Entity code | [optional] |
| **description** | **kotlin.String**| Defines attribute value&#39;s description | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

### Return type

[**AttributeAdd200Response**](AttributeAdd200Response.md)

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

<a id="attributeValueDelete"></a>
# **attributeValueDelete**
> AttributeValueDelete200Response attributeValueDelete(id, attributeId, storeId)

attribute.value.delete

Delete attribute value.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val attributeId : kotlin.String = 156 // kotlin.String | Attribute Id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeValueDelete200Response = apiInstance.attributeValueDelete(id, attributeId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeValueDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeValueDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **attributeId** | **kotlin.String**| Attribute Id | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

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

<a id="attributeValueUpdate"></a>
# **attributeValueUpdate**
> AttributeUpdate200Response attributeValueUpdate(id, attributeId, name, description, code, storeId, langId)

attribute.value.update

Update attribute value.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AttributeApi()
val id : kotlin.String = 10 // kotlin.String | Defines attribute value's id
val attributeId : kotlin.String = 156 // kotlin.String | Attribute Id
val name : kotlin.String = Test name // kotlin.String | Defines attribute value's name
val description : kotlin.String = Test value // kotlin.String | Defines new attribute value's description
val code : kotlin.String = code // kotlin.String | Entity code
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : AttributeUpdate200Response = apiInstance.attributeValueUpdate(id, attributeId, name, description, code, storeId, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttributeApi#attributeValueUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttributeApi#attributeValueUpdate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Defines attribute value&#39;s id | |
| **attributeId** | **kotlin.String**| Attribute Id | |
| **name** | **kotlin.String**| Defines attribute value&#39;s name | [optional] |
| **description** | **kotlin.String**| Defines new attribute value&#39;s description | [optional] |
| **code** | **kotlin.String**| Entity code | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

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

