# ProductApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productAdd**](ProductApi.md#productAdd) | **POST** /product.add.json | product.add |
| [**productAddBatch**](ProductApi.md#productAddBatch) | **POST** /product.add.batch.json | product.add.batch |
| [**productAttributeList**](ProductApi.md#productAttributeList) | **GET** /product.attribute.list.json | product.attribute.list |
| [**productAttributeValueSet**](ProductApi.md#productAttributeValueSet) | **POST** /product.attribute.value.set.json | product.attribute.value.set |
| [**productAttributeValueUnset**](ProductApi.md#productAttributeValueUnset) | **POST** /product.attribute.value.unset.json | product.attribute.value.unset |
| [**productBrandList**](ProductApi.md#productBrandList) | **GET** /product.brand.list.json | product.brand.list |
| [**productChildItemFind**](ProductApi.md#productChildItemFind) | **GET** /product.child_item.find.json | product.child_item.find |
| [**productChildItemInfo**](ProductApi.md#productChildItemInfo) | **GET** /product.child_item.info.json | product.child_item.info |
| [**productChildItemList**](ProductApi.md#productChildItemList) | **GET** /product.child_item.list.json | product.child_item.list |
| [**productCount**](ProductApi.md#productCount) | **GET** /product.count.json | product.count |
| [**productCurrencyAdd**](ProductApi.md#productCurrencyAdd) | **POST** /product.currency.add.json | product.currency.add |
| [**productCurrencyList**](ProductApi.md#productCurrencyList) | **GET** /product.currency.list.json | product.currency.list |
| [**productDelete**](ProductApi.md#productDelete) | **DELETE** /product.delete.json | product.delete |
| [**productDeleteBatch**](ProductApi.md#productDeleteBatch) | **POST** /product.delete.batch.json | product.delete.batch |
| [**productFind**](ProductApi.md#productFind) | **GET** /product.find.json | product.find |
| [**productImageAdd**](ProductApi.md#productImageAdd) | **POST** /product.image.add.json | product.image.add |
| [**productImageDelete**](ProductApi.md#productImageDelete) | **DELETE** /product.image.delete.json | product.image.delete |
| [**productImageUpdate**](ProductApi.md#productImageUpdate) | **PUT** /product.image.update.json | product.image.update |
| [**productInfo**](ProductApi.md#productInfo) | **GET** /product.info.json | product.info |
| [**productList**](ProductApi.md#productList) | **GET** /product.list.json | product.list |
| [**productManufacturerAdd**](ProductApi.md#productManufacturerAdd) | **POST** /product.manufacturer.add.json | product.manufacturer.add |
| [**productOptionAdd**](ProductApi.md#productOptionAdd) | **POST** /product.option.add.json | product.option.add |
| [**productOptionAssign**](ProductApi.md#productOptionAssign) | **POST** /product.option.assign.json | product.option.assign |
| [**productOptionDelete**](ProductApi.md#productOptionDelete) | **DELETE** /product.option.delete.json | product.option.delete |
| [**productOptionList**](ProductApi.md#productOptionList) | **GET** /product.option.list.json | product.option.list |
| [**productOptionValueAdd**](ProductApi.md#productOptionValueAdd) | **POST** /product.option.value.add.json | product.option.value.add |
| [**productOptionValueAssign**](ProductApi.md#productOptionValueAssign) | **POST** /product.option.value.assign.json | product.option.value.assign |
| [**productOptionValueDelete**](ProductApi.md#productOptionValueDelete) | **DELETE** /product.option.value.delete.json | product.option.value.delete |
| [**productOptionValueUpdate**](ProductApi.md#productOptionValueUpdate) | **PUT** /product.option.value.update.json | product.option.value.update |
| [**productPriceAdd**](ProductApi.md#productPriceAdd) | **POST** /product.price.add.json | product.price.add |
| [**productPriceDelete**](ProductApi.md#productPriceDelete) | **DELETE** /product.price.delete.json | product.price.delete |
| [**productPriceUpdate**](ProductApi.md#productPriceUpdate) | **PUT** /product.price.update.json | product.price.update |
| [**productReviewList**](ProductApi.md#productReviewList) | **GET** /product.review.list.json | product.review.list |
| [**productStoreAssign**](ProductApi.md#productStoreAssign) | **POST** /product.store.assign.json | product.store.assign |
| [**productTaxAdd**](ProductApi.md#productTaxAdd) | **POST** /product.tax.add.json | product.tax.add |
| [**productUpdate**](ProductApi.md#productUpdate) | **PUT** /product.update.json | product.update |
| [**productUpdateBatch**](ProductApi.md#productUpdateBatch) | **POST** /product.update.batch.json | product.update.batch |
| [**productVariantAdd**](ProductApi.md#productVariantAdd) | **POST** /product.variant.add.json | product.variant.add |
| [**productVariantAddBatch**](ProductApi.md#productVariantAddBatch) | **POST** /product.variant.add.batch.json | product.variant.add.batch |
| [**productVariantDelete**](ProductApi.md#productVariantDelete) | **DELETE** /product.variant.delete.json | product.variant.delete |
| [**productVariantDeleteBatch**](ProductApi.md#productVariantDeleteBatch) | **POST** /product.variant.delete.batch.json | product.variant.delete.batch |
| [**productVariantImageAdd**](ProductApi.md#productVariantImageAdd) | **POST** /product.variant.image.add.json | product.variant.image.add |
| [**productVariantImageDelete**](ProductApi.md#productVariantImageDelete) | **DELETE** /product.variant.image.delete.json | product.variant.image.delete |
| [**productVariantPriceAdd**](ProductApi.md#productVariantPriceAdd) | **POST** /product.variant.price.add.json | product.variant.price.add |
| [**productVariantPriceDelete**](ProductApi.md#productVariantPriceDelete) | **DELETE** /product.variant.price.delete.json | product.variant.price.delete |
| [**productVariantPriceUpdate**](ProductApi.md#productVariantPriceUpdate) | **PUT** /product.variant.price.update.json | product.variant.price.update |
| [**productVariantUpdate**](ProductApi.md#productVariantUpdate) | **PUT** /product.variant.update.json | product.variant.update |
| [**productVariantUpdateBatch**](ProductApi.md#productVariantUpdateBatch) | **POST** /product.variant.update.batch.json | product.variant.update.batch |


<a id="productAdd"></a>
# **productAdd**
> ProductAdd200Response productAdd(productAdd)

product.add

Add new product to store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productAdd : ProductAdd =  // ProductAdd | 
try {
    val result : ProductAdd200Response = apiInstance.productAdd(productAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productAdd** | [**ProductAdd**](ProductAdd.md)|  | |

### Return type

[**ProductAdd200Response**](ProductAdd200Response.md)

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

<a id="productAddBatch"></a>
# **productAddBatch**
> CategoryAddBatch200Response productAddBatch(productAddBatch)

product.add.batch

Add new products to the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productAddBatch : ProductAddBatch =  // ProductAddBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productAddBatch(productAddBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAddBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAddBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productAddBatch** | [**ProductAddBatch**](ProductAddBatch.md)|  | |

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

<a id="productAttributeList"></a>
# **productAttributeList**
> ModelResponseProductAttributeList productAttributeList(productId, start, count, pageCursor, attributeId, variantId, attributeGroupId, langId, storeId, setName, sortBy, sortDirection, responseFields, params, exclude)

product.attribute.list

Get list of attributes and values.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Retrieves attributes specified by product id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val attributeId : kotlin.String = 156 // kotlin.String | Retrieves info for specified attribute_id
val variantId : kotlin.String = 45 // kotlin.String | Defines product's variants specified by variant id
val attributeGroupId : kotlin.String = 202 // kotlin.String | Filter by attribute_group_id
val langId : kotlin.String = 3 // kotlin.String | Retrieves attributes specified by language id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves attributes specified by store id
val setName : kotlin.String = Shoes // kotlin.String | Retrieves attributes specified by set_name in Magento
val sortBy : kotlin.String = value // kotlin.String | Set field to sort by
val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
val responseFields : kotlin.String = {pagination,result{attribute}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = attribute_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = attribute_id,name // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseProductAttributeList = apiInstance.productAttributeList(productId, start, count, pageCursor, attributeId, variantId, attributeGroupId, langId, storeId, setName, sortBy, sortDirection, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAttributeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAttributeList")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Retrieves attributes specified by product id | |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **attributeId** | **kotlin.String**| Retrieves info for specified attribute_id | [optional] |
| **variantId** | **kotlin.String**| Defines product&#39;s variants specified by variant id | [optional] |
| **attributeGroupId** | **kotlin.String**| Filter by attribute_group_id | [optional] |
| **langId** | **kotlin.String**| Retrieves attributes specified by language id | [optional] |
| **storeId** | **kotlin.String**| Retrieves attributes specified by store id | [optional] |
| **setName** | **kotlin.String**| Retrieves attributes specified by set_name in Magento | [optional] |
| **sortBy** | **kotlin.String**| Set field to sort by | [optional] [default to &quot;attribute_id&quot;] |
| **sortDirection** | **kotlin.String**| Set sorting direction | [optional] [default to &quot;asc&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;attribute_id,name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseProductAttributeList**](ModelResponseProductAttributeList.md)

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

<a id="productAttributeValueSet"></a>
# **productAttributeValueSet**
> ProductAttributeValueSet200Response productAttributeValueSet(productId, attributeId, attributeGroupId, attributeName, `value`, valueId, langId, storeId)

product.attribute.value.set

Set attribute value to product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the attribute should be added
val attributeId : kotlin.String = 156 // kotlin.String | Filter by attribute_id
val attributeGroupId : kotlin.String = 202 // kotlin.String | Filter by attribute_group_id
val attributeName : kotlin.String = Color // kotlin.String | Define attribute name
val `value` : kotlin.String = Red // kotlin.String | Define attribute value
val valueId : kotlin.Int = 22 // kotlin.Int | Define attribute value id
val langId : kotlin.String = 3 // kotlin.String | Language id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : ProductAttributeValueSet200Response = apiInstance.productAttributeValueSet(productId, attributeId, attributeGroupId, attributeName, `value`, valueId, langId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAttributeValueSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAttributeValueSet")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the attribute should be added | |
| **attributeId** | **kotlin.String**| Filter by attribute_id | [optional] |
| **attributeGroupId** | **kotlin.String**| Filter by attribute_group_id | [optional] |
| **attributeName** | **kotlin.String**| Define attribute name | [optional] |
| **&#x60;value&#x60;** | **kotlin.String**| Define attribute value | [optional] |
| **valueId** | **kotlin.Int**| Define attribute value id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**ProductAttributeValueSet200Response**](ProductAttributeValueSet200Response.md)

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

<a id="productAttributeValueUnset"></a>
# **productAttributeValueUnset**
> ProductAttributeValueUnset200Response productAttributeValueUnset(productId, attributeId, storeId, includeDefault, reindex, clearCache)

product.attribute.value.unset

Removes attribute value for a product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Product id
val attributeId : kotlin.String = 156 // kotlin.String | Attribute Id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val includeDefault : kotlin.Boolean = true // kotlin.Boolean | Boolean, whether or not to unset default value of the attribute, if applicable
val reindex : kotlin.Boolean = false // kotlin.Boolean | Is reindex required
val clearCache : kotlin.Boolean = false // kotlin.Boolean | Is cache clear required
try {
    val result : ProductAttributeValueUnset200Response = apiInstance.productAttributeValueUnset(productId, attributeId, storeId, includeDefault, reindex, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productAttributeValueUnset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productAttributeValueUnset")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Product id | |
| **attributeId** | **kotlin.String**| Attribute Id | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **includeDefault** | **kotlin.Boolean**| Boolean, whether or not to unset default value of the attribute, if applicable | [optional] [default to false] |
| **reindex** | **kotlin.Boolean**| Is reindex required | [optional] [default to true] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clearCache** | **kotlin.Boolean**| Is cache clear required | [optional] [default to true] |

### Return type

[**ProductAttributeValueUnset200Response**](ProductAttributeValueUnset200Response.md)

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

<a id="productBrandList"></a>
# **productBrandList**
> ModelResponseProductBrandList productBrandList(start, count, pageCursor, brandIds, categoryId, parentId, storeId, langId, findWhere, findValue, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

product.brand.list

Get list of brands from your store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val brandIds : kotlin.String = 4,5 // kotlin.String | Retrieves brands specified by brand ids
val categoryId : kotlin.String = 6 // kotlin.String | Retrieves product brands specified by category id
val parentId : kotlin.String = 6 // kotlin.String | Retrieves brands specified by parent id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val findWhere : kotlin.String = name // kotlin.String | Entity search that is specified by the comma-separated unique fields
val findValue : kotlin.String = Phone // kotlin.String | Entity search that is specified by some value
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseProductBrandList = apiInstance.productBrandList(start, count, pageCursor, brandIds, categoryId, parentId, storeId, langId, findWhere, findValue, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productBrandList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productBrandList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **brandIds** | **kotlin.String**| Retrieves brands specified by brand ids | [optional] |
| **categoryId** | **kotlin.String**| Retrieves product brands specified by category id | [optional] |
| **parentId** | **kotlin.String**| Retrieves brands specified by parent id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **findWhere** | **kotlin.String**| Entity search that is specified by the comma-separated unique fields | [optional] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,short_description,active,url&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseProductBrandList**](ModelResponseProductBrandList.md)

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

<a id="productChildItemFind"></a>
# **productChildItemFind**
> ProductChildItemFind200Response productChildItemFind(findValue, findWhere, findParams, storeId)

product.child_item.find

Search product child item (bundled item or configurable product variant) in store catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val findValue : kotlin.String = bundled-item-123- // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = sku // kotlin.String | Entity search that is specified by the comma-separated unique fields
val findParams : kotlin.String = regex // kotlin.String | Entity search that is specified by comma-separated parameters
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : ProductChildItemFind200Response = apiInstance.productChildItemFind(findValue, findWhere, findParams, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productChildItemFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productChildItemFind")
    e.printStackTrace()
}
```

### Parameters
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Entity search that is specified by the comma-separated unique fields | [optional] |
| **findParams** | **kotlin.String**| Entity search that is specified by comma-separated parameters | [optional] [default to &quot;whole_words&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**ProductChildItemFind200Response**](ProductChildItemFind200Response.md)

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

<a id="productChildItemInfo"></a>
# **productChildItemInfo**
> ProductChildItemInfo200Response productChildItemInfo(productId, id, storeId, langId, currencyId, responseFields, params, exclude, useLatestApiVersion)

product.child_item.info

Get child for specific product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Filter by parent product id
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val currencyId : kotlin.String = usd // kotlin.String | Currency Id
val responseFields : kotlin.String = {result{id,parent_id,sku,upc,images,combination}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : ProductChildItemInfo200Response = apiInstance.productChildItemInfo(productId, id, storeId, langId, currencyId, responseFields, params, exclude, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productChildItemInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productChildItemInfo")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Filter by parent product id | |
| **id** | **kotlin.String**| Entity id | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **currencyId** | **kotlin.String**| Currency Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**ProductChildItemInfo200Response**](ProductChildItemInfo200Response.md)

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

<a id="productChildItemList"></a>
# **productChildItemList**
> ModelResponseProductChildItemList productChildItemList(start, count, pageCursor, productId, productIds, sku, storeId, langId, currencyId, availSale, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, returnGlobal, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)

product.child_item.list

Get a list of a product&#39;s child items, such as variants or bundle components. The total_count field in the response indicates the total number of items in the context of the current filter.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve products child items via cursor-based pagination (it can't be used with any other filtering parameter)
val productId : kotlin.String = 10 // kotlin.String | Filter by parent product id
val productIds : kotlin.String = 4,5 // kotlin.String | Filter by parent product ids
val sku : kotlin.String = bag_01 // kotlin.String | Filter by products variant's sku
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val currencyId : kotlin.String = usd // kotlin.String | Currency Id
val availSale : kotlin.Boolean = false // kotlin.Boolean | Specifies the set of available/not available products for sale
val findValue : kotlin.String = bundled-item-123- // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = sku // kotlin.String | Child products search that is specified by field
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val returnGlobal : kotlin.Boolean = false // kotlin.Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
val responseFields : kotlin.String = {result{children{id,parent_id,sku,upc,images,combination}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : ModelResponseProductChildItemList = apiInstance.productChildItemList(start, count, pageCursor, productId, productIds, sku, storeId, langId, currencyId, availSale, findValue, findWhere, createdFrom, createdTo, modifiedFrom, modifiedTo, returnGlobal, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productChildItemList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productChildItemList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve products child items via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **productId** | **kotlin.String**| Filter by parent product id | [optional] |
| **productIds** | **kotlin.String**| Filter by parent product ids | [optional] |
| **sku** | **kotlin.String**| Filter by products variant&#39;s sku | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **currencyId** | **kotlin.String**| Currency Id | [optional] |
| **availSale** | **kotlin.Boolean**| Specifies the set of available/not available products for sale | [optional] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Child products search that is specified by field | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **returnGlobal** | **kotlin.Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**ModelResponseProductChildItemList**](ModelResponseProductChildItemList.md)

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

<a id="productCount"></a>
# **productCount**
> ProductCount200Response productCount(sku, productIds, sinceId, categoriesIds, categoryId, storeId, langId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, brandName, manufacturerId, productAttributes, status, type, visible, findValue, findWhere, reportRequestId, returnGlobal, disableReportCache, useLatestApiVersion)

product.count

Count products in store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val sku : kotlin.String = bag_01 // kotlin.String | Filter by product's sku
val productIds : kotlin.String = 4,5 // kotlin.String | Counts products specified by product ids
val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
val categoriesIds : kotlin.String = 23,56 // kotlin.String | Defines product add that is specified by comma-separated categories id
val categoryId : kotlin.String = 6 // kotlin.String | Counts products specified by category id
val storeId : kotlin.String = 1 // kotlin.String | Counts products specified by store id
val langId : kotlin.String = 3 // kotlin.String | Counts products specified by language id
val availView : kotlin.Boolean = true // kotlin.Boolean | Specifies the set of visible/invisible products
val availSale : kotlin.Boolean = false // kotlin.Boolean | Specifies the set of available/not available products for sale
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val brandName : kotlin.String = Abidas // kotlin.String | Retrieves brands specified by brand name
val manufacturerId : kotlin.String = 1 // kotlin.String | Defines product's manufacturer by manufacturer_id
val productAttributes : kotlin.collections.List<kotlin.String> = product_attributes[0][attribute_id]=132&product_attributes[0][values][0]=custom value 1&product_attributes[0][values][1]=custom value 2 // kotlin.collections.List<kotlin.String> | Defines product attributes
val status : kotlin.String = disabled // kotlin.String | Defines product's status
val type : kotlin.String = simple // kotlin.String | Defines products's type
val visible : kotlin.String = everywhere // kotlin.String | Filter items by visibility status
val findValue : kotlin.String = Phone // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Counts products that are searched specified by field
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val returnGlobal : kotlin.Boolean = false // kotlin.Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : ProductCount200Response = apiInstance.productCount(sku, productIds, sinceId, categoriesIds, categoryId, storeId, langId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, brandName, manufacturerId, productAttributes, status, type, visible, findValue, findWhere, reportRequestId, returnGlobal, disableReportCache, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productCount")
    e.printStackTrace()
}
```

### Parameters
| **sku** | **kotlin.String**| Filter by product&#39;s sku | [optional] |
| **productIds** | **kotlin.String**| Counts products specified by product ids | [optional] |
| **sinceId** | **kotlin.String**| Retrieve entities starting from the specified id. | [optional] |
| **categoriesIds** | **kotlin.String**| Defines product add that is specified by comma-separated categories id | [optional] |
| **categoryId** | **kotlin.String**| Counts products specified by category id | [optional] |
| **storeId** | **kotlin.String**| Counts products specified by store id | [optional] |
| **langId** | **kotlin.String**| Counts products specified by language id | [optional] |
| **availView** | **kotlin.Boolean**| Specifies the set of visible/invisible products | [optional] |
| **availSale** | **kotlin.Boolean**| Specifies the set of available/not available products for sale | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **brandName** | **kotlin.String**| Retrieves brands specified by brand name | [optional] |
| **manufacturerId** | **kotlin.String**| Defines product&#39;s manufacturer by manufacturer_id | [optional] |
| **productAttributes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Defines product attributes | [optional] |
| **status** | **kotlin.String**| Defines product&#39;s status | [optional] |
| **type** | **kotlin.String**| Defines products&#39;s type | [optional] |
| **visible** | **kotlin.String**| Filter items by visibility status | [optional] [default to &quot;everywhere&quot;] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Counts products that are searched specified by field | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| **returnGlobal** | **kotlin.Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false] |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**ProductCount200Response**](ProductCount200Response.md)

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

<a id="productCurrencyAdd"></a>
# **productCurrencyAdd**
> ProductCurrencyAdd200Response productCurrencyAdd(iso3, rate, name, avail, symbolLeft, symbolRight, default)

product.currency.add

Add currency and/or set default in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val iso3 : kotlin.String = USD // kotlin.String | Specifies standardized currency code
val rate : java.math.BigDecimal = 1 // java.math.BigDecimal | Defines the numerical identifier against to the major currency
val name : kotlin.String = US Dollar // kotlin.String | Defines currency's name
val avail : kotlin.Boolean = false // kotlin.Boolean | Specifies whether the currency is available
val symbolLeft : kotlin.String = $ // kotlin.String | Defines the symbol that is located before the currency
val symbolRight : kotlin.String = грн // kotlin.String | Defines the symbol that is located after the currency
val default : kotlin.Boolean = true // kotlin.Boolean | Specifies currency's default meaning
try {
    val result : ProductCurrencyAdd200Response = apiInstance.productCurrencyAdd(iso3, rate, name, avail, symbolLeft, symbolRight, default)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productCurrencyAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productCurrencyAdd")
    e.printStackTrace()
}
```

### Parameters
| **iso3** | **kotlin.String**| Specifies standardized currency code | |
| **rate** | **java.math.BigDecimal**| Defines the numerical identifier against to the major currency | |
| **name** | **kotlin.String**| Defines currency&#39;s name | [optional] |
| **avail** | **kotlin.Boolean**| Specifies whether the currency is available | [optional] [default to true] |
| **symbolLeft** | **kotlin.String**| Defines the symbol that is located before the currency | [optional] |
| **symbolRight** | **kotlin.String**| Defines the symbol that is located after the currency | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **default** | **kotlin.Boolean**| Specifies currency&#39;s default meaning | [optional] [default to false] |

### Return type

[**ProductCurrencyAdd200Response**](ProductCurrencyAdd200Response.md)

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

<a id="productCurrencyList"></a>
# **productCurrencyList**
> ModelResponseProductCurrencyList productCurrencyList(start, count, pageCursor, default, avail, responseFields, params, exclude)

product.currency.list

Get list of currencies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val default : kotlin.Boolean = true // kotlin.Boolean | Specifies the set of default/not default currencies
val avail : kotlin.Boolean = false // kotlin.Boolean | Specifies the set of available/not available currencies
val responseFields : kotlin.String = {return_message,pagination,result{currency}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = name,iso3,default,avail // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = name,iso3,default,avail // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseProductCurrencyList = apiInstance.productCurrencyList(start, count, pageCursor, default, avail, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productCurrencyList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productCurrencyList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **default** | **kotlin.Boolean**| Specifies the set of default/not default currencies | [optional] |
| **avail** | **kotlin.Boolean**| Specifies the set of available/not available currencies | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;name,iso3,default,avail&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseProductCurrencyList**](ModelResponseProductCurrencyList.md)

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

<a id="productDelete"></a>
# **productDelete**
> CustomerDelete200Response productDelete(id, storeId)

product.delete

Product delete

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val id : kotlin.String = 10 // kotlin.String | Product id that will be removed
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CustomerDelete200Response = apiInstance.productDelete(id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Product id that will be removed | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

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

<a id="productDeleteBatch"></a>
# **productDeleteBatch**
> CategoryAddBatch200Response productDeleteBatch(productDeleteBatch)

product.delete.batch

Remove product from the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productDeleteBatch : ProductDeleteBatch =  // ProductDeleteBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productDeleteBatch(productDeleteBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productDeleteBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productDeleteBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productDeleteBatch** | [**ProductDeleteBatch**](ProductDeleteBatch.md)|  | |

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

<a id="productFind"></a>
# **productFind**
> ProductFind200Response productFind(findValue, findWhere, findParams, findWhat, langId, storeId)

product.find

Search product in store catalog. \&quot;Apple\&quot; is specified here by default.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val findValue : kotlin.String = Simple // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Entity search that is specified by the comma-separated unique fields
val findParams : kotlin.String = regex // kotlin.String | Entity search that is specified by comma-separated parameters
val findWhat : kotlin.String = each // kotlin.String | Parameter's value specifies the entity that has to be found
val langId : kotlin.String = 3 // kotlin.String | Search products specified by language id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : ProductFind200Response = apiInstance.productFind(findValue, findWhere, findParams, findWhat, langId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productFind")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productFind")
    e.printStackTrace()
}
```

### Parameters
| **findValue** | **kotlin.String**| Entity search that is specified by some value | |
| **findWhere** | **kotlin.String**| Entity search that is specified by the comma-separated unique fields | [optional] [default to &quot;name&quot;] |
| **findParams** | **kotlin.String**| Entity search that is specified by comma-separated parameters | [optional] [default to &quot;whole_words&quot;] |
| **findWhat** | **kotlin.String**| Parameter&#39;s value specifies the entity that has to be found | [optional] [default to &quot;product&quot;] |
| **langId** | **kotlin.String**| Search products specified by language id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**ProductFind200Response**](ProductFind200Response.md)

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

<a id="productImageAdd"></a>
# **productImageAdd**
> ProductImageAdd200Response productImageAdd(productImageAdd)

product.image.add

Add image to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productImageAdd : ProductImageAdd =  // ProductImageAdd | 
try {
    val result : ProductImageAdd200Response = apiInstance.productImageAdd(productImageAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productImageAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productImageAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productImageAdd** | [**ProductImageAdd**](ProductImageAdd.md)|  | |

### Return type

[**ProductImageAdd200Response**](ProductImageAdd200Response.md)

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

<a id="productImageDelete"></a>
# **productImageDelete**
> AttributeDelete200Response productImageDelete(productId, id, storeId)

product.image.delete

Delete image

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the image should be deleted
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productImageDelete(productId, id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productImageDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productImageDelete")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the image should be deleted | |
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

<a id="productImageUpdate"></a>
# **productImageUpdate**
> ProductImageUpdate200Response productImageUpdate(productId, id, variantIds, storeId, langId, imageName, type, label, position, hidden)

product.image.update

Update details of image

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the image should be updated
val id : kotlin.String = 10 // kotlin.String | Defines image update specified by image id
val variantIds : kotlin.String = 1,2,3,4,5 // kotlin.String | Defines product's variants ids
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val imageName : kotlin.String = data/product/main/product_69_bag-gray.png // kotlin.String | Defines image's name
val type : kotlin.String = thumbnail // kotlin.String | Defines image's types that are specified by comma-separated list
val label : kotlin.String = This cool image // kotlin.String | Defines alternative text that has to be attached to the picture
val position : kotlin.Int = 5 // kotlin.Int | Defines image’s position in the list
val hidden : kotlin.Boolean = true // kotlin.Boolean | Define is hide image
try {
    val result : ProductImageUpdate200Response = apiInstance.productImageUpdate(productId, id, variantIds, storeId, langId, imageName, type, label, position, hidden)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productImageUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productImageUpdate")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the image should be updated | |
| **id** | **kotlin.String**| Defines image update specified by image id | |
| **variantIds** | **kotlin.String**| Defines product&#39;s variants ids | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **imageName** | **kotlin.String**| Defines image&#39;s name | [optional] |
| **type** | **kotlin.String**| Defines image&#39;s types that are specified by comma-separated list | [optional] [default to &quot;additional&quot;] |
| **label** | **kotlin.String**| Defines alternative text that has to be attached to the picture | [optional] |
| **position** | **kotlin.Int**| Defines image’s position in the list | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hidden** | **kotlin.Boolean**| Define is hide image | [optional] |

### Return type

[**ProductImageUpdate200Response**](ProductImageUpdate200Response.md)

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

<a id="productInfo"></a>
# **productInfo**
> ProductInfo200Response productInfo(id, storeId, langId, currencyId, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)

product.info

Get information about a specific product by its ID. In the case of a multistore configuration, use the store_id filter to get a response in the context of a specific store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val id : kotlin.String = 10 // kotlin.String | Retrieves product's info specified by product id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves product info specified by store id
val langId : kotlin.String = 3 // kotlin.String | Retrieves product info specified by language id
val currencyId : kotlin.String = usd // kotlin.String | Currency Id
val responseFields : kotlin.String = {result{id,name,price,images}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : ProductInfo200Response = apiInstance.productInfo(id, storeId, langId, currencyId, responseFields, params, exclude, reportRequestId, disableReportCache, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Retrieves product&#39;s info specified by product id | |
| **storeId** | **kotlin.String**| Retrieves product info specified by store id | [optional] |
| **langId** | **kotlin.String**| Retrieves product info specified by language id | [optional] |
| **currencyId** | **kotlin.String**| Currency Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,description,price,categories_ids&quot;] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**ProductInfo200Response**](ProductInfo200Response.md)

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

<a id="productList"></a>
# **productList**
> ModelResponseProductList productList(start, count, pageCursor, productIds, sinceId, categoriesIds, categoryId, storeId, langId, currencyId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, sku, brandName, productAttributes, manufacturerId, status, type, visible, findValue, findWhere, returnGlobal, params, responseFields, exclude, sortBy, sortDirection, reportRequestId, disableCache, disableReportCache, useLatestApiVersion, productType)

product.list

Get list of products from your store. Returns 10 products by default.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve products via cursor-based pagination (it can't be used with any other filtering parameter)
val productIds : kotlin.String = 4,5 // kotlin.String | Retrieves products specified by product ids
val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
val categoriesIds : kotlin.String = 23,56 // kotlin.String | Retrieves products specified by categories ids
val categoryId : kotlin.String = 6 // kotlin.String | Retrieves products specified by category id
val storeId : kotlin.String = 1 // kotlin.String | Retrieves products specified by store id
val langId : kotlin.String = 3 // kotlin.String | Retrieves products specified by language id
val currencyId : kotlin.String = usd // kotlin.String | Currency Id
val availView : kotlin.Boolean = true // kotlin.Boolean | Specifies the set of visible/invisible products
val availSale : kotlin.Boolean = false // kotlin.Boolean | Specifies the set of available/not available products for sale
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val sku : kotlin.String = bag_01 // kotlin.String | Filter by product's sku
val brandName : kotlin.String = Abidas // kotlin.String | Retrieves brands specified by brand name
val productAttributes : kotlin.collections.List<kotlin.String> = product_attributes[0][attribute_id]=132&product_attributes[0][values][0]=custom value 1&product_attributes[0][values][1]=custom value 2 // kotlin.collections.List<kotlin.String> | Defines product attributes
val manufacturerId : kotlin.String = 1 // kotlin.String | Defines product's manufacturer by manufacturer_id
val status : kotlin.String = disabled // kotlin.String | Defines product's status
val type : kotlin.String = simple // kotlin.String | Defines products's type
val visible : kotlin.String = everywhere // kotlin.String | Filter items by visibility status
val findValue : kotlin.String = Phone // kotlin.String | Entity search that is specified by some value
val findWhere : kotlin.String = name // kotlin.String | Product search that is specified by field
val returnGlobal : kotlin.Boolean = false // kotlin.Boolean | Determines the type of products to be returned. If set to 'true', only global products will be returned; if set to 'false', only local products will be returned.
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val responseFields : kotlin.String = {return_code,pagination,result{product{id,name,price,images}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val sortBy : kotlin.String = value_id // kotlin.String | Set field to sort by
val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
val reportRequestId : kotlin.String = 105245017661 // kotlin.String | Report request id
val disableCache : kotlin.Boolean = false // kotlin.Boolean | Disable cache for current request
val disableReportCache : kotlin.Boolean = false // kotlin.Boolean | Disable report cache for current request
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
val productType : kotlin.String = BICYCLE // kotlin.String | A categorization for the product
try {
    val result : ModelResponseProductList = apiInstance.productList(start, count, pageCursor, productIds, sinceId, categoriesIds, categoryId, storeId, langId, currencyId, availView, availSale, createdFrom, createdTo, modifiedFrom, modifiedTo, sku, brandName, productAttributes, manufacturerId, status, type, visible, findValue, findWhere, returnGlobal, params, responseFields, exclude, sortBy, sortDirection, reportRequestId, disableCache, disableReportCache, useLatestApiVersion, productType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve products via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **productIds** | **kotlin.String**| Retrieves products specified by product ids | [optional] |
| **sinceId** | **kotlin.String**| Retrieve entities starting from the specified id. | [optional] |
| **categoriesIds** | **kotlin.String**| Retrieves products specified by categories ids | [optional] |
| **categoryId** | **kotlin.String**| Retrieves products specified by category id | [optional] |
| **storeId** | **kotlin.String**| Retrieves products specified by store id | [optional] |
| **langId** | **kotlin.String**| Retrieves products specified by language id | [optional] |
| **currencyId** | **kotlin.String**| Currency Id | [optional] |
| **availView** | **kotlin.Boolean**| Specifies the set of visible/invisible products | [optional] |
| **availSale** | **kotlin.Boolean**| Specifies the set of available/not available products for sale | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **sku** | **kotlin.String**| Filter by product&#39;s sku | [optional] |
| **brandName** | **kotlin.String**| Retrieves brands specified by brand name | [optional] |
| **productAttributes** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Defines product attributes | [optional] |
| **manufacturerId** | **kotlin.String**| Defines product&#39;s manufacturer by manufacturer_id | [optional] |
| **status** | **kotlin.String**| Defines product&#39;s status | [optional] |
| **type** | **kotlin.String**| Defines products&#39;s type | [optional] |
| **visible** | **kotlin.String**| Filter items by visibility status | [optional] [default to &quot;everywhere&quot;] |
| **findValue** | **kotlin.String**| Entity search that is specified by some value | [optional] |
| **findWhere** | **kotlin.String**| Product search that is specified by field | [optional] |
| **returnGlobal** | **kotlin.Boolean**| Determines the type of products to be returned. If set to &#39;true&#39;, only global products will be returned; if set to &#39;false&#39;, only local products will be returned. | [optional] [default to false] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,description,price,categories_ids&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **sortBy** | **kotlin.String**| Set field to sort by | [optional] [default to &quot;id&quot;] |
| **sortDirection** | **kotlin.String**| Set sorting direction | [optional] [default to &quot;asc&quot;] |
| **reportRequestId** | **kotlin.String**| Report request id | [optional] |
| **disableCache** | **kotlin.Boolean**| Disable cache for current request | [optional] [default to false] |
| **disableReportCache** | **kotlin.Boolean**| Disable report cache for current request | [optional] [default to false] |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productType** | **kotlin.String**| A categorization for the product | [optional] |

### Return type

[**ModelResponseProductList**](ModelResponseProductList.md)

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

<a id="productManufacturerAdd"></a>
# **productManufacturerAdd**
> ProductManufacturerAdd200Response productManufacturerAdd(productId, manufacturer, storeId, metaTitle, metaKeywords, metaDescription, searchKeywords, imageUrl, seoUrl)

product.manufacturer.add

Add manufacturer to store and assign to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines products specified by product id
val manufacturer : kotlin.String = Samsung // kotlin.String | Defines product’s manufacturer's name
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val metaTitle : kotlin.String = category,test // kotlin.String | Defines unique meta title for each entity
val metaKeywords : kotlin.String = category,test // kotlin.String | Defines unique meta keywords for each entity
val metaDescription : kotlin.String = category,test // kotlin.String | Defines unique meta description of a entity
val searchKeywords : kotlin.String = key1,key2,key3 // kotlin.String | Defines unique search keywords
val imageUrl : kotlin.String = https://docs.api2cart.com/img/logo.png // kotlin.String | Image Url
val seoUrl : kotlin.String = some seo url // kotlin.String | Defines unique URL for SEO
try {
    val result : ProductManufacturerAdd200Response = apiInstance.productManufacturerAdd(productId, manufacturer, storeId, metaTitle, metaKeywords, metaDescription, searchKeywords, imageUrl, seoUrl)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productManufacturerAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productManufacturerAdd")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines products specified by product id | |
| **manufacturer** | **kotlin.String**| Defines product’s manufacturer&#39;s name | |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **metaTitle** | **kotlin.String**| Defines unique meta title for each entity | [optional] |
| **metaKeywords** | **kotlin.String**| Defines unique meta keywords for each entity | [optional] |
| **metaDescription** | **kotlin.String**| Defines unique meta description of a entity | [optional] |
| **searchKeywords** | **kotlin.String**| Defines unique search keywords | [optional] |
| **imageUrl** | **kotlin.String**| Image Url | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **seoUrl** | **kotlin.String**| Defines unique URL for SEO | [optional] |

### Return type

[**ProductManufacturerAdd200Response**](ProductManufacturerAdd200Response.md)

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

<a id="productOptionAdd"></a>
# **productOptionAdd**
> ProductOptionAdd200Response productOptionAdd(productOptionAdd)

product.option.add

Add product option from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productOptionAdd : ProductOptionAdd =  // ProductOptionAdd | 
try {
    val result : ProductOptionAdd200Response = apiInstance.productOptionAdd(productOptionAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productOptionAdd** | [**ProductOptionAdd**](ProductOptionAdd.md)|  | |

### Return type

[**ProductOptionAdd200Response**](ProductOptionAdd200Response.md)

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

<a id="productOptionAssign"></a>
# **productOptionAssign**
> ProductOptionAssign200Response productOptionAssign(productId, optionId, required, sortOrder, optionValues, clearCache)

product.option.assign

Assign option from product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the option should be assigned
val optionId : kotlin.String = 5 // kotlin.String | Defines option id which has to be assigned
val required : kotlin.Boolean = true // kotlin.Boolean | Defines if the option is required
val sortOrder : kotlin.Int = 2 // kotlin.Int | Sort number in the list
val optionValues : kotlin.String = green,black,yellow // kotlin.String | Defines option values that has to be assigned
val clearCache : kotlin.Boolean = false // kotlin.Boolean | Is cache clear required
try {
    val result : ProductOptionAssign200Response = apiInstance.productOptionAssign(productId, optionId, required, sortOrder, optionValues, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionAssign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionAssign")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the option should be assigned | |
| **optionId** | **kotlin.String**| Defines option id which has to be assigned | |
| **required** | **kotlin.Boolean**| Defines if the option is required | [optional] [default to false] |
| **sortOrder** | **kotlin.Int**| Sort number in the list | [optional] [default to 0] |
| **optionValues** | **kotlin.String**| Defines option values that has to be assigned | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clearCache** | **kotlin.Boolean**| Is cache clear required | [optional] [default to true] |

### Return type

[**ProductOptionAssign200Response**](ProductOptionAssign200Response.md)

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

<a id="productOptionDelete"></a>
# **productOptionDelete**
> AttributeDelete200Response productOptionDelete(optionId, productId, storeId)

product.option.delete

Product option delete.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val optionId : kotlin.String = 5 // kotlin.String | Defines option id that should be deleted
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the option should be deleted
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productOptionDelete(optionId, productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionDelete")
    e.printStackTrace()
}
```

### Parameters
| **optionId** | **kotlin.String**| Defines option id that should be deleted | |
| **productId** | **kotlin.String**| Defines product id where the option should be deleted | |
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

<a id="productOptionList"></a>
# **productOptionList**
> ModelResponseProductOptionList productOptionList(start, count, productId, langId, storeId, responseFields, params, exclude)

product.option.list

Get list of options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val productId : kotlin.String = 10 // kotlin.String | Retrieves products' options specified by product id
val langId : kotlin.String = 3 // kotlin.String | Language id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,name,sort_order // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = id,name,sort_order // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseProductOptionList = apiInstance.productOptionList(start, count, productId, langId, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **productId** | **kotlin.String**| Retrieves products&#39; options specified by product id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,description&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseProductOptionList**](ModelResponseProductOptionList.md)

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

<a id="productOptionValueAdd"></a>
# **productOptionValueAdd**
> ProductOptionValueAdd200Response productOptionValueAdd(productId, optionId, optionValue, sortOrder, displayValue, isDefault, clearCache)

product.option.value.add

Add product option item from option.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the option value should be added
val optionId : kotlin.String = 5 // kotlin.String | Defines option id where the value has to be added
val optionValue : kotlin.String = green // kotlin.String | Defines option value that has to be added
val sortOrder : kotlin.Int = 2 // kotlin.Int | Sort number in the list
val displayValue : kotlin.String = value // kotlin.String | Defines the value that will be displayed for the option value
val isDefault : kotlin.Boolean = true // kotlin.Boolean | Defines as a default
val clearCache : kotlin.Boolean = false // kotlin.Boolean | Is cache clear required
try {
    val result : ProductOptionValueAdd200Response = apiInstance.productOptionValueAdd(productId, optionId, optionValue, sortOrder, displayValue, isDefault, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionValueAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionValueAdd")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the option value should be added | |
| **optionId** | **kotlin.String**| Defines option id where the value has to be added | |
| **optionValue** | **kotlin.String**| Defines option value that has to be added | [optional] |
| **sortOrder** | **kotlin.Int**| Sort number in the list | [optional] [default to 0] |
| **displayValue** | **kotlin.String**| Defines the value that will be displayed for the option value | [optional] |
| **isDefault** | **kotlin.Boolean**| Defines as a default | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clearCache** | **kotlin.Boolean**| Is cache clear required | [optional] [default to true] |

### Return type

[**ProductOptionValueAdd200Response**](ProductOptionValueAdd200Response.md)

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

<a id="productOptionValueAssign"></a>
# **productOptionValueAssign**
> ProductOptionValueAssign200Response productOptionValueAssign(productOptionId, optionValueId, clearCache)

product.option.value.assign

Assign product option item from product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productOptionId : kotlin.Int = 5 // kotlin.Int | Defines product's option id where the value has to be assigned
val optionValueId : kotlin.String = 45 // kotlin.String | Defines value id that has to be assigned
val clearCache : kotlin.Boolean = false // kotlin.Boolean | Is cache clear required
try {
    val result : ProductOptionValueAssign200Response = apiInstance.productOptionValueAssign(productOptionId, optionValueId, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionValueAssign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionValueAssign")
    e.printStackTrace()
}
```

### Parameters
| **productOptionId** | **kotlin.Int**| Defines product&#39;s option id where the value has to be assigned | |
| **optionValueId** | **kotlin.String**| Defines value id that has to be assigned | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clearCache** | **kotlin.Boolean**| Is cache clear required | [optional] [default to true] |

### Return type

[**ProductOptionValueAssign200Response**](ProductOptionValueAssign200Response.md)

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

<a id="productOptionValueDelete"></a>
# **productOptionValueDelete**
> AttributeDelete200Response productOptionValueDelete(optionId, optionValueId, productId, storeId)

product.option.value.delete

Product option value delete.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val optionId : kotlin.String = 5 // kotlin.String | Defines option id where the value should be deleted
val optionValueId : kotlin.String = 45 // kotlin.String | Defines option value id that should be deleted
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the option value should be deleted
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productOptionValueDelete(optionId, optionValueId, productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionValueDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionValueDelete")
    e.printStackTrace()
}
```

### Parameters
| **optionId** | **kotlin.String**| Defines option id where the value should be deleted | |
| **optionValueId** | **kotlin.String**| Defines option value id that should be deleted | |
| **productId** | **kotlin.String**| Defines product id where the option value should be deleted | |
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

<a id="productOptionValueUpdate"></a>
# **productOptionValueUpdate**
> AccountConfigUpdate200Response productOptionValueUpdate(productId, optionId, optionValueId, optionValue, price, quantity, displayValue, clearCache)

product.option.value.update

Update product option item from option.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the option value should be updated
val optionId : kotlin.String = 5 // kotlin.String | Defines option id where the value has to be updated
val optionValueId : kotlin.String = 45 // kotlin.String | Defines value id that has to be assigned
val optionValue : kotlin.String = green // kotlin.String | Defines option value that has to be added
val price : java.math.BigDecimal = 99.9 // java.math.BigDecimal | Defines new product option price
val quantity : java.math.BigDecimal = 6 // java.math.BigDecimal | Defines new products' options quantity
val displayValue : kotlin.String = value // kotlin.String | Defines the value that will be displayed for the option value
val clearCache : kotlin.Boolean = false // kotlin.Boolean | Is cache clear required
try {
    val result : AccountConfigUpdate200Response = apiInstance.productOptionValueUpdate(productId, optionId, optionValueId, optionValue, price, quantity, displayValue, clearCache)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productOptionValueUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productOptionValueUpdate")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the option value should be updated | |
| **optionId** | **kotlin.String**| Defines option id where the value has to be updated | |
| **optionValueId** | **kotlin.String**| Defines value id that has to be assigned | |
| **optionValue** | **kotlin.String**| Defines option value that has to be added | [optional] |
| **price** | **java.math.BigDecimal**| Defines new product option price | [optional] |
| **quantity** | **java.math.BigDecimal**| Defines new products&#39; options quantity | [optional] |
| **displayValue** | **kotlin.String**| Defines the value that will be displayed for the option value | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clearCache** | **kotlin.Boolean**| Is cache clear required | [optional] [default to true] |

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

<a id="productPriceAdd"></a>
# **productPriceAdd**
> CartValidate200Response productPriceAdd(productPriceAdd)

product.price.add

Add some prices to the product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productPriceAdd : ProductPriceAdd =  // ProductPriceAdd | 
try {
    val result : CartValidate200Response = apiInstance.productPriceAdd(productPriceAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productPriceAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productPriceAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productPriceAdd** | [**ProductPriceAdd**](ProductPriceAdd.md)|  | |

### Return type

[**CartValidate200Response**](CartValidate200Response.md)

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

<a id="productPriceDelete"></a>
# **productPriceDelete**
> AttributeDelete200Response productPriceDelete(productId, groupPrices, storeId)

product.price.delete

Delete some prices of the product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines the product where the price has to be deleted
val groupPrices : kotlin.String = group_prices=5,8,9 // kotlin.String | Defines product's group prices
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productPriceDelete(productId, groupPrices, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productPriceDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productPriceDelete")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines the product where the price has to be deleted | |
| **groupPrices** | **kotlin.String**| Defines product&#39;s group prices | [optional] |
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

<a id="productPriceUpdate"></a>
# **productPriceUpdate**
> AccountConfigUpdate200Response productPriceUpdate(productPriceUpdate)

product.price.update

Update some prices of the product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productPriceUpdate : ProductPriceUpdate =  // ProductPriceUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.productPriceUpdate(productPriceUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productPriceUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productPriceUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productPriceUpdate** | [**ProductPriceUpdate**](ProductPriceUpdate.md)|  | |

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

<a id="productReviewList"></a>
# **productReviewList**
> ModelResponseProductReviewList productReviewList(productId, start, count, pageCursor, ids, storeId, langId, status, createdFrom, createdTo, customerId, sortBy, sortDirection, responseFields, params, exclude)

product.review.list

Get reviews of a specific product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Product id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val ids : kotlin.String = 24,25 // kotlin.String | Retrieves reviews specified by ids
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val status : kotlin.String = disabled // kotlin.String | Defines status
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val sortBy : kotlin.String = value_id // kotlin.String | Set field to sort by
val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseProductReviewList = apiInstance.productReviewList(productId, start, count, pageCursor, ids, storeId, langId, status, createdFrom, createdTo, customerId, sortBy, sortDirection, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productReviewList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productReviewList")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Product id | |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **ids** | **kotlin.String**| Retrieves reviews specified by ids | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **status** | **kotlin.String**| Defines status | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | [optional] |
| **sortBy** | **kotlin.String**| Set field to sort by | [optional] [default to &quot;id&quot;] |
| **sortDirection** | **kotlin.String**| Set sorting direction | [optional] [default to &quot;asc&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,customer_id,email,message,status,product_id,nick_name,summary,rating,ratings,status,created_time&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseProductReviewList**](ModelResponseProductReviewList.md)

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

<a id="productStoreAssign"></a>
# **productStoreAssign**
> AccountConfigUpdate200Response productStoreAssign(productId, storeId)

product.store.assign

Assign product to store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines id of the product which should be assigned to a store
val storeId : kotlin.String = 1 // kotlin.String | Defines id of the store product should be assigned to
try {
    val result : AccountConfigUpdate200Response = apiInstance.productStoreAssign(productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productStoreAssign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productStoreAssign")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines id of the product which should be assigned to a store | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Defines id of the store product should be assigned to | |

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

<a id="productTaxAdd"></a>
# **productTaxAdd**
> ProductTaxAdd200Response productTaxAdd(productTaxAdd)

product.tax.add

Add tax class and tax rate to store and assign to product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productTaxAdd : ProductTaxAdd =  // ProductTaxAdd | 
try {
    val result : ProductTaxAdd200Response = apiInstance.productTaxAdd(productTaxAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productTaxAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productTaxAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productTaxAdd** | [**ProductTaxAdd**](ProductTaxAdd.md)|  | |

### Return type

[**ProductTaxAdd200Response**](ProductTaxAdd200Response.md)

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

<a id="productUpdate"></a>
# **productUpdate**
> AccountConfigUpdate200Response productUpdate(productUpdate)

product.update

This method can be used to update certain product data. The list of supported parameters depends on the specific platform. Please transmit only those parameters that are supported by the particular platform. Please note that to update the product quantity, it is recommended to use relative parameters (increase_quantity or reduce_quantity) to avoid unexpected overwrites on heavily loaded stores.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productUpdate : ProductUpdate =  // ProductUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.productUpdate(productUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productUpdate** | [**ProductUpdate**](ProductUpdate.md)|  | |

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

<a id="productUpdateBatch"></a>
# **productUpdateBatch**
> CategoryAddBatch200Response productUpdateBatch(productUpdateBatch)

product.update.batch

Update products on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productUpdateBatch : ProductUpdateBatch =  // ProductUpdateBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productUpdateBatch(productUpdateBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productUpdateBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productUpdateBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productUpdateBatch** | [**ProductUpdateBatch**](ProductUpdateBatch.md)|  | |

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

<a id="productVariantAdd"></a>
# **productVariantAdd**
> ProductVariantAdd200Response productVariantAdd(productVariantAdd)

product.variant.add

Add variant to product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantAdd : ProductVariantAdd =  // ProductVariantAdd | 
try {
    val result : ProductVariantAdd200Response = apiInstance.productVariantAdd(productVariantAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantAdd** | [**ProductVariantAdd**](ProductVariantAdd.md)|  | |

### Return type

[**ProductVariantAdd200Response**](ProductVariantAdd200Response.md)

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

<a id="productVariantAddBatch"></a>
# **productVariantAddBatch**
> CategoryAddBatch200Response productVariantAddBatch(productVariantAddBatch)

product.variant.add.batch

Add new product variants to the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantAddBatch : ProductVariantAddBatch =  // ProductVariantAddBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productVariantAddBatch(productVariantAddBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantAddBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantAddBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantAddBatch** | [**ProductVariantAddBatch**](ProductVariantAddBatch.md)|  | |

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

<a id="productVariantDelete"></a>
# **productVariantDelete**
> AttributeValueDelete200Response productVariantDelete(id, productId, storeId)

product.variant.delete

Delete variant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val id : kotlin.String = 10 // kotlin.String | Defines variant removal, specified by variant id
val productId : kotlin.String = 10 // kotlin.String | Defines product's id where the variant has to be deleted
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeValueDelete200Response = apiInstance.productVariantDelete(id, productId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Defines variant removal, specified by variant id | |
| **productId** | **kotlin.String**| Defines product&#39;s id where the variant has to be deleted | |
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

<a id="productVariantDeleteBatch"></a>
# **productVariantDeleteBatch**
> CategoryAddBatch200Response productVariantDeleteBatch(productVariantDeleteBatch)

product.variant.delete.batch

Remove product variants from the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantDeleteBatch : ProductVariantDeleteBatch =  // ProductVariantDeleteBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productVariantDeleteBatch(productVariantDeleteBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantDeleteBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantDeleteBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantDeleteBatch** | [**ProductVariantDeleteBatch**](ProductVariantDeleteBatch.md)|  | |

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

<a id="productVariantImageAdd"></a>
# **productVariantImageAdd**
> ProductVariantImageAdd200Response productVariantImageAdd(productVariantImageAdd)

product.variant.image.add

Add image to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantImageAdd : ProductVariantImageAdd =  // ProductVariantImageAdd | 
try {
    val result : ProductVariantImageAdd200Response = apiInstance.productVariantImageAdd(productVariantImageAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantImageAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantImageAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantImageAdd** | [**ProductVariantImageAdd**](ProductVariantImageAdd.md)|  | |

### Return type

[**ProductVariantImageAdd200Response**](ProductVariantImageAdd200Response.md)

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

<a id="productVariantImageDelete"></a>
# **productVariantImageDelete**
> AttributeDelete200Response productVariantImageDelete(productId, productVariantId, id, storeId)

product.variant.image.delete

Delete  image to product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productId : kotlin.String = 10 // kotlin.String | Defines product id where the variant image should be deleted
val productVariantId : kotlin.String = 45 // kotlin.String | Defines product's variants specified by variant id
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productVariantImageDelete(productId, productVariantId, id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantImageDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantImageDelete")
    e.printStackTrace()
}
```

### Parameters
| **productId** | **kotlin.String**| Defines product id where the variant image should be deleted | |
| **productVariantId** | **kotlin.String**| Defines product&#39;s variants specified by variant id | |
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

<a id="productVariantPriceAdd"></a>
# **productVariantPriceAdd**
> CartValidate200Response productVariantPriceAdd(productVariantPriceAdd)

product.variant.price.add

Add some prices to the product variant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantPriceAdd : ProductVariantPriceAdd =  // ProductVariantPriceAdd | 
try {
    val result : CartValidate200Response = apiInstance.productVariantPriceAdd(productVariantPriceAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantPriceAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantPriceAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantPriceAdd** | [**ProductVariantPriceAdd**](ProductVariantPriceAdd.md)|  | |

### Return type

[**CartValidate200Response**](CartValidate200Response.md)

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

<a id="productVariantPriceDelete"></a>
# **productVariantPriceDelete**
> AttributeDelete200Response productVariantPriceDelete(id, productId, groupPrices, storeId)

product.variant.price.delete

Delete some prices of the product variant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val id : kotlin.String = 10 // kotlin.String | Defines the variant where the price has to be deleted
val productId : kotlin.String = 10 // kotlin.String | Product id
val groupPrices : kotlin.String = group_prices=6,8,9 // kotlin.String | Defines variants's group prices
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.productVariantPriceDelete(id, productId, groupPrices, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantPriceDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantPriceDelete")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Defines the variant where the price has to be deleted | |
| **productId** | **kotlin.String**| Product id | |
| **groupPrices** | **kotlin.String**| Defines variants&#39;s group prices | |
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

<a id="productVariantPriceUpdate"></a>
# **productVariantPriceUpdate**
> AccountConfigUpdate200Response productVariantPriceUpdate(productVariantPriceUpdate)

product.variant.price.update

Update some prices of the product variant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantPriceUpdate : ProductVariantPriceUpdate =  // ProductVariantPriceUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.productVariantPriceUpdate(productVariantPriceUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantPriceUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantPriceUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantPriceUpdate** | [**ProductVariantPriceUpdate**](ProductVariantPriceUpdate.md)|  | |

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

<a id="productVariantUpdate"></a>
# **productVariantUpdate**
> AccountConfigUpdate200Response productVariantUpdate(productVariantUpdate)

product.variant.update

Update variant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantUpdate : ProductVariantUpdate =  // ProductVariantUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.productVariantUpdate(productVariantUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantUpdate** | [**ProductVariantUpdate**](ProductVariantUpdate.md)|  | |

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

<a id="productVariantUpdateBatch"></a>
# **productVariantUpdateBatch**
> CategoryAddBatch200Response productVariantUpdateBatch(productVariantUpdateBatch)

product.variant.update.batch

Update products variants on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductApi()
val productVariantUpdateBatch : ProductVariantUpdateBatch =  // ProductVariantUpdateBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.productVariantUpdateBatch(productVariantUpdateBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductApi#productVariantUpdateBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductApi#productVariantUpdateBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productVariantUpdateBatch** | [**ProductVariantUpdateBatch**](ProductVariantUpdateBatch.md)|  | |

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

