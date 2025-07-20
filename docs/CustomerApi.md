# CustomerApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerAdd**](CustomerApi.md#customerAdd) | **POST** /customer.add.json | customer.add |
| [**customerAddressAdd**](CustomerApi.md#customerAddressAdd) | **POST** /customer.address.add.json | customer.address.add |
| [**customerAttributeList**](CustomerApi.md#customerAttributeList) | **GET** /customer.attribute.list.json | customer.attribute.list |
| [**customerCount**](CustomerApi.md#customerCount) | **GET** /customer.count.json | customer.count |
| [**customerDelete**](CustomerApi.md#customerDelete) | **DELETE** /customer.delete.json | customer.delete |
| [**customerFind**](CustomerApi.md#customerFind) | **GET** /customer.find.json | customer.find |
| [**customerGroupAdd**](CustomerApi.md#customerGroupAdd) | **POST** /customer.group.add.json | customer.group.add |
| [**customerGroupList**](CustomerApi.md#customerGroupList) | **GET** /customer.group.list.json | customer.group.list |
| [**customerInfo**](CustomerApi.md#customerInfo) | **GET** /customer.info.json | customer.info |
| [**customerList**](CustomerApi.md#customerList) | **GET** /customer.list.json | customer.list |
| [**customerUpdate**](CustomerApi.md#customerUpdate) | **PUT** /customer.update.json | customer.update |
| [**customerWishlistList**](CustomerApi.md#customerWishlistList) | **GET** /customer.wishlist.list.json | customer.wishlist.list |


<a id="customerAdd"></a>
# **customerAdd**
> CustomerAdd200Response customerAdd(customerAdd)

customer.add

Add customer into store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val customerAdd : CustomerAdd =  // CustomerAdd | 
try {
    val result : CustomerAdd200Response = apiInstance.customerAdd(customerAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerAdd** | [**CustomerAdd**](CustomerAdd.md)|  | |

### Return type

[**CustomerAdd200Response**](CustomerAdd200Response.md)

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

<a id="customerAddressAdd"></a>
# **customerAddressAdd**
> AttributeAdd200Response customerAddressAdd(customerAddressAdd)

customer.address.add

Add customer address.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val customerAddressAdd : CustomerAddressAdd =  // CustomerAddressAdd | 
try {
    val result : AttributeAdd200Response = apiInstance.customerAddressAdd(customerAddressAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerAddressAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerAddressAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerAddressAdd** | [**CustomerAddressAdd**](CustomerAddressAdd.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerAttributeList"></a>
# **customerAttributeList**
> ModelResponseCustomerAttributeList customerAttributeList(customerId, count, pageCursor, storeId, langId, responseFields, params, exclude)

customer.attribute.list

Get attributes for specific customer

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCustomerAttributeList = apiInstance.customerAttributeList(customerId, count, pageCursor, storeId, langId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerAttributeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerAttributeList")
    e.printStackTrace()
}
```

### Parameters
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCustomerAttributeList**](ModelResponseCustomerAttributeList.md)

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

<a id="customerCount"></a>
# **customerCount**
> CustomerCount200Response customerCount(ids, sinceId, customerListId, groupId, storeId, avail, includeGuests, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo)

customer.count

Get number of customers from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val ids : kotlin.String = 24,25 // kotlin.String | Counts customers specified by ids
val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
val customerListId : kotlin.String = exampleListId // kotlin.String | The numeric ID of the customer list in Demandware.
val groupId : kotlin.String = 3 // kotlin.String | Customer group_id
val storeId : kotlin.String = 1 // kotlin.String | Counts customer specified by store id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val includeGuests : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to include guest customers in the total count.
val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = email // kotlin.String | Counts customers that are searched specified by field
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
try {
    val result : CustomerCount200Response = apiInstance.customerCount(ids, sinceId, customerListId, groupId, storeId, avail, includeGuests, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerCount")
    e.printStackTrace()
}
```

### Parameters
| **ids** | **kotlin.String**| Counts customers specified by ids | [optional] |
| **sinceId** | **kotlin.String**| Retrieve entities starting from the specified id. | [optional] |
| **customerListId** | **kotlin.String**| The numeric ID of the customer list in Demandware. | [optional] |
| **groupId** | **kotlin.String**| Customer group_id | [optional] |
| **storeId** | **kotlin.String**| Counts customer specified by store id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **includeGuests** | **kotlin.Boolean**| Indicates whether to include guest customers in the total count. | [optional] [default to false] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Counts customers that are searched specified by field | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |

### Return type

[**CustomerCount200Response**](CustomerCount200Response.md)

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

<a id="customerDelete"></a>
# **customerDelete**
> CustomerDelete200Response customerDelete(id)

customer.delete

Delete customer from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val id : kotlin.String = 10 // kotlin.String | Identifies customer specified by the id
try {
    val result : CustomerDelete200Response = apiInstance.customerDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Identifies customer specified by the id | |

### Return type

[**CustomerDelete200Response**](CustomerDelete200Response.md)

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

<a id="customerFind"></a>
# **customerFind**
> CustomerFind200Response customerFind(findValue, findWhere, findParams, storeId, includeGuests)

customer.find

Find customers in store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = email // kotlin.String | Entity search that is specified by the comma-separated unique fields
val findParams : kotlin.String = regex // kotlin.String | Entity search that is specified by comma-separated parameters
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val includeGuests : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to search among guest customers when looking up a customer.
try {
    val result : CustomerFind200Response = apiInstance.customerFind(findValue, findWhere, findParams, storeId, includeGuests)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerFind")
    e.printStackTrace()
}
```

### Parameters
| **findValue** | **kotlin.String**| Entity search that is specified by some value | |
| **findWhere** | **kotlin.String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to &quot;email&quot;] |
| **findParams** | **kotlin.String**| Entity search that is specified by comma-separated parameters | [optional] [default to &quot;whole_words&quot;] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeGuests** | **kotlin.Boolean**| Indicates whether to search among guest customers when looking up a customer. | [optional] [default to false] |

### Return type

[**CustomerFind200Response**](CustomerFind200Response.md)

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

<a id="customerGroupAdd"></a>
# **customerGroupAdd**
> CustomerGroupAdd200Response customerGroupAdd(name, storeId, storesIds)

customer.group.add

Create customer group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val name : kotlin.String = new_group // kotlin.String | Customer group name
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val storesIds : kotlin.String = 1,2 // kotlin.String | Assign customer group to the stores that is specified by comma-separated stores' id
try {
    val result : CustomerGroupAdd200Response = apiInstance.customerGroupAdd(name, storeId, storesIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerGroupAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerGroupAdd")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Customer group name | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storesIds** | **kotlin.String**| Assign customer group to the stores that is specified by comma-separated stores&#39; id | [optional] |

### Return type

[**CustomerGroupAdd200Response**](CustomerGroupAdd200Response.md)

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

<a id="customerGroupList"></a>
# **customerGroupList**
> ModelResponseCustomerGroupList customerGroupList(start, count, pageCursor, groupIds, storeId, langId, responseFields, params, exclude, disableCache)

customer.group.list

Get list of customers groups.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val groupIds : kotlin.String = 1,2,3 // kotlin.String | Groups that will be assigned to a customer
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val disableCache : kotlin.Boolean = false // kotlin.Boolean | Disable cache for current request
try {
    val result : ModelResponseCustomerGroupList = apiInstance.customerGroupList(start, count, pageCursor, groupIds, storeId, langId, responseFields, params, exclude, disableCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerGroupList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **groupIds** | **kotlin.String**| Groups that will be assigned to a customer | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,additional_fields&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disableCache** | **kotlin.Boolean**| Disable cache for current request | [optional] [default to false] |

### Return type

[**ModelResponseCustomerGroupList**](ModelResponseCustomerGroupList.md)

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

<a id="customerInfo"></a>
# **customerInfo**
> CustomerInfo200Response customerInfo(id, storeId, responseFields, params, exclude)

customer.info

Get customers&#39; details from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val id : kotlin.String = 10 // kotlin.String | Retrieves customer's info specified by customer id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves customer info specified by store id
val responseFields : kotlin.String = {result{id,parent_id,sku,upc,images,combination}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : CustomerInfo200Response = apiInstance.customerInfo(id, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Retrieves customer&#39;s info specified by customer id | |
| **storeId** | **kotlin.String**| Retrieves customer info specified by store id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,email,first_name,last_name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**CustomerInfo200Response**](CustomerInfo200Response.md)

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

<a id="customerList"></a>
# **customerList**
> ModelResponseCustomerList customerList(start, count, pageCursor, ids, sinceId, customerListId, groupId, storeId, avail, includeGuests, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, sortBy, sortDirection, responseFields, params, exclude)

customer.list

Get list of customers from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val ids : kotlin.String = 24,25 // kotlin.String | Retrieves customers specified by ids
val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
val customerListId : kotlin.String = exampleListId // kotlin.String | The numeric ID of the customer list in Demandware.
val groupId : kotlin.String = 3 // kotlin.String | Customer group_id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves customers specified by store id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val includeGuests : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to include guest customers in the list results.
val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = email // kotlin.String | Customer search that is specified by field
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val sortBy : kotlin.String = value_id // kotlin.String | Set field to sort by
val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
val responseFields : kotlin.String = {result{customer}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCustomerList = apiInstance.customerList(start, count, pageCursor, ids, sinceId, customerListId, groupId, storeId, avail, includeGuests, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, sortBy, sortDirection, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **ids** | **kotlin.String**| Retrieves customers specified by ids | [optional] |
| **sinceId** | **kotlin.String**| Retrieve entities starting from the specified id. | [optional] |
| **customerListId** | **kotlin.String**| The numeric ID of the customer list in Demandware. | [optional] |
| **groupId** | **kotlin.String**| Customer group_id | [optional] |
| **storeId** | **kotlin.String**| Retrieves customers specified by store id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **includeGuests** | **kotlin.Boolean**| Indicates whether to include guest customers in the list results. | [optional] [default to false] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Customer search that is specified by field | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **sortBy** | **kotlin.String**| Set field to sort by | [optional] [default to &quot;created_time&quot;] |
| **sortDirection** | **kotlin.String**| Set sorting direction | [optional] [default to &quot;asc&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,email,first_name,last_name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCustomerList**](ModelResponseCustomerList.md)

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

<a id="customerUpdate"></a>
# **customerUpdate**
> AccountConfigUpdate200Response customerUpdate(customerUpdate)

customer.update

Update information of customer in store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val customerUpdate : CustomerUpdate =  // CustomerUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.customerUpdate(customerUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerUpdate** | [**CustomerUpdate**](CustomerUpdate.md)|  | |

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerWishlistList"></a>
# **customerWishlistList**
> ModelResponseCustomerWishlistList customerWishlistList(customerId, start, count, pageCursor, id, storeId, responseFields)

customer.wishlist.list

Get a Wish List of customer from the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerApi()
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : ModelResponseCustomerWishlistList = apiInstance.customerWishlistList(customerId, start, count, pageCursor, id, storeId, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerApi#customerWishlistList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerApi#customerWishlistList")
    e.printStackTrace()
}
```

### Parameters
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **id** | **kotlin.String**| Entity id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;{return_code,return_message,pagination,result}&quot;] |

### Return type

[**ModelResponseCustomerWishlistList**](ModelResponseCustomerWishlistList.md)

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

