# CartApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cartBridge**](CartApi.md#cartBridge) | **GET** /cart.bridge.json | cart.bridge |
| [**cartCatalogPriceRulesCount**](CartApi.md#cartCatalogPriceRulesCount) | **GET** /cart.catalog_price_rules.count.json | cart.catalog_price_rules.count |
| [**cartCatalogPriceRulesList**](CartApi.md#cartCatalogPriceRulesList) | **GET** /cart.catalog_price_rules.list.json | cart.catalog_price_rules.list |
| [**cartClearCache**](CartApi.md#cartClearCache) | **POST** /cart.clear_cache.json | cart.clear_cache |
| [**cartConfig**](CartApi.md#cartConfig) | **GET** /cart.config.json | cart.config |
| [**cartConfigUpdate**](CartApi.md#cartConfigUpdate) | **PUT** /cart.config.update.json | cart.config.update |
| [**cartCouponAdd**](CartApi.md#cartCouponAdd) | **POST** /cart.coupon.add.json | cart.coupon.add |
| [**cartCouponConditionAdd**](CartApi.md#cartCouponConditionAdd) | **POST** /cart.coupon.condition.add.json | cart.coupon.condition.add |
| [**cartCouponCount**](CartApi.md#cartCouponCount) | **GET** /cart.coupon.count.json | cart.coupon.count |
| [**cartCouponDelete**](CartApi.md#cartCouponDelete) | **DELETE** /cart.coupon.delete.json | cart.coupon.delete |
| [**cartCouponList**](CartApi.md#cartCouponList) | **GET** /cart.coupon.list.json | cart.coupon.list |
| [**cartCreate**](CartApi.md#cartCreate) | **POST** /cart.create.json | cart.create |
| [**cartDelete**](CartApi.md#cartDelete) | **DELETE** /cart.delete.json | cart.delete |
| [**cartDisconnect**](CartApi.md#cartDisconnect) | **GET** /cart.disconnect.json | cart.disconnect |
| [**cartGiftcardAdd**](CartApi.md#cartGiftcardAdd) | **POST** /cart.giftcard.add.json | cart.giftcard.add |
| [**cartGiftcardCount**](CartApi.md#cartGiftcardCount) | **GET** /cart.giftcard.count.json | cart.giftcard.count |
| [**cartGiftcardDelete**](CartApi.md#cartGiftcardDelete) | **DELETE** /cart.giftcard.delete.json | cart.giftcard.delete |
| [**cartGiftcardList**](CartApi.md#cartGiftcardList) | **GET** /cart.giftcard.list.json | cart.giftcard.list |
| [**cartInfo**](CartApi.md#cartInfo) | **GET** /cart.info.json | cart.info |
| [**cartList**](CartApi.md#cartList) | **GET** /cart.list.json | cart.list |
| [**cartMetaDataList**](CartApi.md#cartMetaDataList) | **GET** /cart.meta_data.list.json | cart.meta_data.list |
| [**cartMetaDataSet**](CartApi.md#cartMetaDataSet) | **POST** /cart.meta_data.set.json | cart.meta_data.set |
| [**cartMetaDataUnset**](CartApi.md#cartMetaDataUnset) | **DELETE** /cart.meta_data.unset.json | cart.meta_data.unset |
| [**cartMethods**](CartApi.md#cartMethods) | **GET** /cart.methods.json | cart.methods |
| [**cartPluginList**](CartApi.md#cartPluginList) | **GET** /cart.plugin.list.json | cart.plugin.list |
| [**cartScriptAdd**](CartApi.md#cartScriptAdd) | **POST** /cart.script.add.json | cart.script.add |
| [**cartScriptDelete**](CartApi.md#cartScriptDelete) | **DELETE** /cart.script.delete.json | cart.script.delete |
| [**cartScriptList**](CartApi.md#cartScriptList) | **GET** /cart.script.list.json | cart.script.list |
| [**cartShippingZonesList**](CartApi.md#cartShippingZonesList) | **GET** /cart.shipping_zones.list.json | cart.shipping_zones.list |
| [**cartValidate**](CartApi.md#cartValidate) | **GET** /cart.validate.json | cart.validate |


<a id="cartBridge"></a>
# **cartBridge**
> CartBridge200Response cartBridge()

cart.bridge

Get bridge key and store key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
try {
    val result : CartBridge200Response = apiInstance.cartBridge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartBridge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartBridge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CartBridge200Response**](CartBridge200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="cartCatalogPriceRulesCount"></a>
# **cartCatalogPriceRulesCount**
> CartCatalogPriceRulesCount200Response cartCatalogPriceRulesCount()

cart.catalog_price_rules.count

Get count of cart catalog price rules discounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
try {
    val result : CartCatalogPriceRulesCount200Response = apiInstance.cartCatalogPriceRulesCount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCatalogPriceRulesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCatalogPriceRulesCount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CartCatalogPriceRulesCount200Response**](CartCatalogPriceRulesCount200Response.md)

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

<a id="cartCatalogPriceRulesList"></a>
# **cartCatalogPriceRulesList**
> ModelResponseCartCatalogPriceRulesList cartCatalogPriceRulesList(start, count, pageCursor, ids, responseFields, params, exclude)

cart.catalog_price_rules.list

Get cart catalog price rules discounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val ids : kotlin.String = 24,25 // kotlin.String | Retrieves  catalog_price_rules by ids
val responseFields : kotlin.String = {result{catalog_price_rules_count,catalog_price_rules{id,type,name,avail,usage_count,actions,conditions}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartCatalogPriceRulesList = apiInstance.cartCatalogPriceRulesList(start, count, pageCursor, ids, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCatalogPriceRulesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCatalogPriceRulesList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **ids** | **kotlin.String**| Retrieves  catalog_price_rules by ids | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,description&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartCatalogPriceRulesList**](ModelResponseCartCatalogPriceRulesList.md)

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

<a id="cartClearCache"></a>
# **cartClearCache**
> CartClearCache200Response cartClearCache(cacheType)

cart.clear_cache

Clear cache on store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val cacheType : kotlin.String = storage_cache // kotlin.String | Defines which cache should be cleared.
try {
    val result : CartClearCache200Response = apiInstance.cartClearCache(cacheType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartClearCache")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartClearCache")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cacheType** | **kotlin.String**| Defines which cache should be cleared. | |

### Return type

[**CartClearCache200Response**](CartClearCache200Response.md)

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

<a id="cartConfig"></a>
# **cartConfig**
> CartConfig200Response cartConfig(params, exclude)

cart.config

Get list of cart configs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val params : kotlin.String = store_name,store_url,db_prefix // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = store_name,store_url,db_prefix // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : CartConfig200Response = apiInstance.cartConfig(params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartConfig")
    e.printStackTrace()
}
```

### Parameters
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;store_name,store_url,db_prefix&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**CartConfig200Response**](CartConfig200Response.md)

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

<a id="cartConfigUpdate"></a>
# **cartConfigUpdate**
> CartConfigUpdate200Response cartConfigUpdate(cartConfigUpdate)

cart.config.update

Use this API method to update custom data in client database.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val cartConfigUpdate : CartConfigUpdate =  // CartConfigUpdate | 
try {
    val result : CartConfigUpdate200Response = apiInstance.cartConfigUpdate(cartConfigUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartConfigUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartConfigUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartConfigUpdate** | [**CartConfigUpdate**](CartConfigUpdate.md)|  | |

### Return type

[**CartConfigUpdate200Response**](CartConfigUpdate200Response.md)

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

<a id="cartCouponAdd"></a>
# **cartCouponAdd**
> CartCouponAdd200Response cartCouponAdd(cartCouponAdd)

cart.coupon.add

Use this method to create a coupon with specified conditions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val cartCouponAdd : CartCouponAdd =  // CartCouponAdd | 
try {
    val result : CartCouponAdd200Response = apiInstance.cartCouponAdd(cartCouponAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCouponAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCouponAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartCouponAdd** | [**CartCouponAdd**](CartCouponAdd.md)|  | |

### Return type

[**CartCouponAdd200Response**](CartCouponAdd200Response.md)

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

<a id="cartCouponConditionAdd"></a>
# **cartCouponConditionAdd**
> BasketLiveShippingServiceDelete200Response cartCouponConditionAdd(couponId, entity, key, `operator`, `value`, target, includeTax, includeShipping, storeId)

cart.coupon.condition.add

Use this method to add additional conditions for coupon application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val couponId : kotlin.String = 45845 // kotlin.String | Coupon Id
val entity : kotlin.String = order // kotlin.String | Defines condition entity type
val key : kotlin.String = subtotal // kotlin.String | Defines condition entity attribute key
val `operator` : kotlin.String = == // kotlin.String | Defines condition operator
val `value` : kotlin.String = 2 // kotlin.String | Defines condition value, can be comma separated according to the operator.
val target : kotlin.String = coupon_action // kotlin.String | Defines condition operator
val includeTax : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to apply a discount for taxes.
val includeShipping : kotlin.Boolean = true // kotlin.Boolean | Indicates whether to apply a discount for shipping.
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : BasketLiveShippingServiceDelete200Response = apiInstance.cartCouponConditionAdd(couponId, entity, key, `operator`, `value`, target, includeTax, includeShipping, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCouponConditionAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCouponConditionAdd")
    e.printStackTrace()
}
```

### Parameters
| **couponId** | **kotlin.String**| Coupon Id | |
| **entity** | **kotlin.String**| Defines condition entity type | [enum: order, order_shipping_address, product, customer] |
| **key** | **kotlin.String**| Defines condition entity attribute key | [enum: total, subtotal, shipping_total, total_quantity, total_weight, country, product_id, variant_id, category_id, customer_id, item_price, item_total_price, item_quantity, carrier_id] |
| **&#x60;operator&#x60;** | **kotlin.String**| Defines condition operator | |
| **&#x60;value&#x60;** | **kotlin.String**| Defines condition value, can be comma separated according to the operator. | |
| **target** | **kotlin.String**| Defines condition operator | [optional] [default to &quot;coupon_prerequisite&quot;] |
| **includeTax** | **kotlin.Boolean**| Indicates whether to apply a discount for taxes. | [optional] [default to false] |
| **includeShipping** | **kotlin.Boolean**| Indicates whether to apply a discount for shipping. | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

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

<a id="cartCouponCount"></a>
# **cartCouponCount**
> CartCouponCount200Response cartCouponCount(storeId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo)

cart.coupon.count

This method allows you to get the number of coupons. On some platforms, you can filter the coupons by the date they were active.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
val dateStartFrom : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_start (greater or equal)
val dateStartTo : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_start (less or equal)
val dateEndFrom : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_end (greater or equal)
val dateEndTo : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_end (less or equal)
try {
    val result : CartCouponCount200Response = apiInstance.cartCouponCount(storeId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCouponCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCouponCount")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **avail** | **kotlin.Boolean**| Defines category&#39;s visibility status | [optional] [default to true] |
| **dateStartFrom** | **kotlin.String**| Filter entity by date_start (greater or equal) | [optional] |
| **dateStartTo** | **kotlin.String**| Filter entity by date_start (less or equal) | [optional] |
| **dateEndFrom** | **kotlin.String**| Filter entity by date_end (greater or equal) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateEndTo** | **kotlin.String**| Filter entity by date_end (less or equal) | [optional] |

### Return type

[**CartCouponCount200Response**](CartCouponCount200Response.md)

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

<a id="cartCouponDelete"></a>
# **cartCouponDelete**
> AttributeDelete200Response cartCouponDelete(id, storeId)

cart.coupon.delete

Delete coupon

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.cartCouponDelete(id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCouponDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCouponDelete")
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

<a id="cartCouponList"></a>
# **cartCouponList**
> ModelResponseCartCouponList cartCouponList(start, count, pageCursor, couponsIds, storeId, langId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo, responseFields, params, exclude)

cart.coupon.list

Get cart coupon discounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val couponsIds : kotlin.String = 1,2,3 // kotlin.String | Filter coupons by ids
val storeId : kotlin.String = 1 // kotlin.String | Filter coupons by store id
val langId : kotlin.String = 3 // kotlin.String | Language id
val avail : kotlin.Boolean = false // kotlin.Boolean | Filter coupons by avail status
val dateStartFrom : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_start (greater or equal)
val dateStartTo : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_start (less or equal)
val dateEndFrom : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_end (greater or equal)
val dateEndTo : kotlin.String = 2016-12-29 16:44:30 // kotlin.String | Filter entity by date_end (less or equal)
val responseFields : kotlin.String = {pagination,result{coupon_count,coupon{id,code,name,conditions,actions{scope,amount,conditions{id,value,sub-conditions}},date_start,avail}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,code,type,amount // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = usage_history,type // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartCouponList = apiInstance.cartCouponList(start, count, pageCursor, couponsIds, storeId, langId, avail, dateStartFrom, dateStartTo, dateEndFrom, dateEndTo, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCouponList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCouponList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **couponsIds** | **kotlin.String**| Filter coupons by ids | [optional] |
| **storeId** | **kotlin.String**| Filter coupons by store id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **avail** | **kotlin.Boolean**| Filter coupons by avail status | [optional] |
| **dateStartFrom** | **kotlin.String**| Filter entity by date_start (greater or equal) | [optional] |
| **dateStartTo** | **kotlin.String**| Filter entity by date_start (less or equal) | [optional] |
| **dateEndFrom** | **kotlin.String**| Filter entity by date_end (greater or equal) | [optional] |
| **dateEndTo** | **kotlin.String**| Filter entity by date_end (less or equal) | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,code,name,description&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartCouponList**](ModelResponseCartCouponList.md)

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

<a id="cartCreate"></a>
# **cartCreate**
> AccountCartAdd200Response cartCreate(cartCreate)

cart.create

Add store to the account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val cartCreate : CartCreate =  // CartCreate | 
try {
    val result : AccountCartAdd200Response = apiInstance.cartCreate(cartCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartCreate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartCreate** | [**CartCreate**](CartCreate.md)|  | |

### Return type

[**AccountCartAdd200Response**](AccountCartAdd200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="cartDelete"></a>
# **cartDelete**
> CartDelete200Response cartDelete(deleteBridge)

cart.delete

Remove store from API2Cart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val deleteBridge : kotlin.Boolean = true // kotlin.Boolean | Identifies if there is a necessity to delete bridge
try {
    val result : CartDelete200Response = apiInstance.cartDelete(deleteBridge)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteBridge** | **kotlin.Boolean**| Identifies if there is a necessity to delete bridge | [optional] [default to true] |

### Return type

[**CartDelete200Response**](CartDelete200Response.md)

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

<a id="cartDisconnect"></a>
# **cartDisconnect**
> CartDisconnect200Response cartDisconnect(deleteBridge)

cart.disconnect

Disconnect with the store and clear store session data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val deleteBridge : kotlin.Boolean = true // kotlin.Boolean | Identifies if there is a necessity to delete bridge
try {
    val result : CartDisconnect200Response = apiInstance.cartDisconnect(deleteBridge)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartDisconnect")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartDisconnect")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteBridge** | **kotlin.Boolean**| Identifies if there is a necessity to delete bridge | [optional] [default to false] |

### Return type

[**CartDisconnect200Response**](CartDisconnect200Response.md)

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

<a id="cartGiftcardAdd"></a>
# **cartGiftcardAdd**
> CartGiftcardAdd200Response cartGiftcardAdd(amount, code, ownerEmail, recipientEmail, recipientName, ownerName)

cart.giftcard.add

Use this method to create a gift card for a specified amount.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val amount : java.math.BigDecimal = 15.5 // java.math.BigDecimal | Defines the gift card amount value.
val code : kotlin.String = GFT1 A4S5 AA11 RD61 // kotlin.String | Gift card code
val ownerEmail : kotlin.String = jubari@hannsgroup.com // kotlin.String | Gift card owner email
val recipientEmail : kotlin.String = jubari@hannsgroup.com // kotlin.String | Gift card recipient email
val recipientName : kotlin.String = John Doe // kotlin.String | Gift card recipient name
val ownerName : kotlin.String = John Doe // kotlin.String | Gift card owner name
try {
    val result : CartGiftcardAdd200Response = apiInstance.cartGiftcardAdd(amount, code, ownerEmail, recipientEmail, recipientName, ownerName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartGiftcardAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartGiftcardAdd")
    e.printStackTrace()
}
```

### Parameters
| **amount** | **java.math.BigDecimal**| Defines the gift card amount value. | |
| **code** | **kotlin.String**| Gift card code | [optional] |
| **ownerEmail** | **kotlin.String**| Gift card owner email | [optional] |
| **recipientEmail** | **kotlin.String**| Gift card recipient email | [optional] |
| **recipientName** | **kotlin.String**| Gift card recipient name | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ownerName** | **kotlin.String**| Gift card owner name | [optional] |

### Return type

[**CartGiftcardAdd200Response**](CartGiftcardAdd200Response.md)

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

<a id="cartGiftcardCount"></a>
# **cartGiftcardCount**
> CartGiftcardCount200Response cartGiftcardCount(storeId)

cart.giftcard.count

Get gift cards count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CartGiftcardCount200Response = apiInstance.cartGiftcardCount(storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartGiftcardCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartGiftcardCount")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CartGiftcardCount200Response**](CartGiftcardCount200Response.md)

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

<a id="cartGiftcardDelete"></a>
# **cartGiftcardDelete**
> AttributeDelete200Response cartGiftcardDelete(id)

cart.giftcard.delete

Delete giftcard

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
try {
    val result : AttributeDelete200Response = apiInstance.cartGiftcardDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartGiftcardDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartGiftcardDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Entity id | |

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

<a id="cartGiftcardList"></a>
# **cartGiftcardList**
> ModelResponseCartGiftCardList cartGiftcardList(start, count, pageCursor, storeId, responseFields, params, exclude)

cart.giftcard.list

Get gift cards list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {pagination,result{gift_card{id,code,amount,status}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartGiftCardList = apiInstance.cartGiftcardList(start, count, pageCursor, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartGiftcardList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartGiftcardList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,code,name&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartGiftCardList**](ModelResponseCartGiftCardList.md)

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

<a id="cartInfo"></a>
# **cartInfo**
> CartInfo200Response cartInfo(storeId, responseFields, params, exclude)

cart.info

This method allows you to get various information about the store, including a list of stores (in the case of a multistore configuration), a list of supported languages, currencies, carriers, warehouses, and many other information. This information contains data that is relatively stable and rarely changes, so API2Cart can cache certain data to reduce the load on the store and speed up the execution of the request. We also recommend that you cache the response of this method on your side to save requests. If you need to clear the cache for a specific store, then use the cart.validate method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {result{name,url,stores_info{store_id,name,currency{id,iso3},store_owner_info}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = name,url // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = name,url // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : CartInfo200Response = apiInstance.cartInfo(storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartInfo")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;store_name,store_url,db_prefix&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**CartInfo200Response**](CartInfo200Response.md)

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

<a id="cartList"></a>
# **cartList**
> CartList200Response cartList()

cart.list

Get list of supported carts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
try {
    val result : CartList200Response = apiInstance.cartList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CartList200Response**](CartList200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="cartMetaDataList"></a>
# **cartMetaDataList**
> ModelResponseCartMetaDataList cartMetaDataList(entityId, count, pageCursor, entity, storeId, langId, key, responseFields, params, exclude)

cart.meta_data.list

Using this method, you can get a list of metadata for various entities (products, options, customers, orders). Usually this is data created by third-party plugins.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val entityId : kotlin.String = 1 // kotlin.String | Entity Id
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val entity : kotlin.String = order // kotlin.String | Entity
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
val key : kotlin.String = subtotal // kotlin.String | Key
val responseFields : kotlin.String = {result{items{key,value}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartMetaDataList = apiInstance.cartMetaDataList(entityId, count, pageCursor, entity, storeId, langId, key, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartMetaDataList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartMetaDataList")
    e.printStackTrace()
}
```

### Parameters
| **entityId** | **kotlin.String**| Entity Id | |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **entity** | **kotlin.String**| Entity | [optional] [default to &quot;product&quot;] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **langId** | **kotlin.String**| Language id | [optional] |
| **key** | **kotlin.String**| Key | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;key,value&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartMetaDataList**](ModelResponseCartMetaDataList.md)

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

<a id="cartMetaDataSet"></a>
# **cartMetaDataSet**
> AttributeAdd200Response cartMetaDataSet(entityId, key, `value`, namespace, entity, storeId, langId)

cart.meta_data.set

Set meta data for a specific entity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val entityId : kotlin.String = 1 // kotlin.String | Entity Id
val key : kotlin.String = subtotal // kotlin.String | Key
val `value` : kotlin.String = 2 // kotlin.String | Value
val namespace : kotlin.String = order // kotlin.String | Metafield namespace
val entity : kotlin.String = order // kotlin.String | Entity
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : AttributeAdd200Response = apiInstance.cartMetaDataSet(entityId, key, `value`, namespace, entity, storeId, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartMetaDataSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartMetaDataSet")
    e.printStackTrace()
}
```

### Parameters
| **entityId** | **kotlin.String**| Entity Id | |
| **key** | **kotlin.String**| Key | |
| **&#x60;value&#x60;** | **kotlin.String**| Value | |
| **namespace** | **kotlin.String**| Metafield namespace | |
| **entity** | **kotlin.String**| Entity | [optional] [default to &quot;product&quot;] |
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

<a id="cartMetaDataUnset"></a>
# **cartMetaDataUnset**
> BasketLiveShippingServiceDelete200Response cartMetaDataUnset(entityId, key, id, entity, storeId)

cart.meta_data.unset

Unset meta data for a specific entity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val entityId : kotlin.String = 1 // kotlin.String | Entity Id
val key : kotlin.String = subtotal // kotlin.String | Key
val id : kotlin.String = 10 // kotlin.String | Entity id
val entity : kotlin.String = order // kotlin.String | Entity
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : BasketLiveShippingServiceDelete200Response = apiInstance.cartMetaDataUnset(entityId, key, id, entity, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartMetaDataUnset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartMetaDataUnset")
    e.printStackTrace()
}
```

### Parameters
| **entityId** | **kotlin.String**| Entity Id | |
| **key** | **kotlin.String**| Key | |
| **id** | **kotlin.String**| Entity id | |
| **entity** | **kotlin.String**| Entity | [optional] [default to &quot;product&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**BasketLiveShippingServiceDelete200Response**](BasketLiveShippingServiceDelete200Response.md)

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

<a id="cartMethods"></a>
# **cartMethods**
> CartMethods200Response cartMethods()

cart.methods

Returns a list of supported API methods.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
try {
    val result : CartMethods200Response = apiInstance.cartMethods()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartMethods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartMethods")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CartMethods200Response**](CartMethods200Response.md)

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

<a id="cartPluginList"></a>
# **cartPluginList**
> CartPluginList200Response cartPluginList(start, count, storeId)

cart.plugin.list

Get a list of third-party plugins installed on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CartPluginList200Response = apiInstance.cartPluginList(start, count, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartPluginList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartPluginList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CartPluginList200Response**](CartPluginList200Response.md)

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

<a id="cartScriptAdd"></a>
# **cartScriptAdd**
> CartScriptAdd200Response cartScriptAdd(name, description, html, src, loadMethod, scope, events, storeId)

cart.script.add

Add new script to the storefront

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val name : kotlin.String = jQuery Minimized // kotlin.String | The user-friendly script name
val description : kotlin.String = The Write Less, Do More, JavaScript Library // kotlin.String | The user-friendly description
val html : kotlin.String = &#x3C;script&#x3E;alert(&#x27;foo&#x27;)&#x3C;/script&#x3E; // kotlin.String | An html string containing exactly one `script` tag.
val src : kotlin.String = https://js-aplenty.com/foo.js // kotlin.String | The URL of the remote script
val loadMethod : kotlin.String = async // kotlin.String | The load method to use for the script
val scope : kotlin.String = all // kotlin.String | The page or pages on the online store where the script should be included
val events : kotlin.String = purchase_event // kotlin.String | Event for run scripts
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : CartScriptAdd200Response = apiInstance.cartScriptAdd(name, description, html, src, loadMethod, scope, events, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartScriptAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartScriptAdd")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| The user-friendly script name | [optional] |
| **description** | **kotlin.String**| The user-friendly description | [optional] |
| **html** | **kotlin.String**| An html string containing exactly one &#x60;script&#x60; tag. | [optional] |
| **src** | **kotlin.String**| The URL of the remote script | [optional] |
| **loadMethod** | **kotlin.String**| The load method to use for the script | [optional] |
| **scope** | **kotlin.String**| The page or pages on the online store where the script should be included | [optional] [default to &quot;storefront&quot;] |
| **events** | **kotlin.String**| Event for run scripts | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**CartScriptAdd200Response**](CartScriptAdd200Response.md)

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

<a id="cartScriptDelete"></a>
# **cartScriptDelete**
> AttributeDelete200Response cartScriptDelete(id, storeId)

cart.script.delete

Remove script from the storefront

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeDelete200Response = apiInstance.cartScriptDelete(id, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartScriptDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartScriptDelete")
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

<a id="cartScriptList"></a>
# **cartScriptList**
> ModelResponseCartScriptList cartScriptList(start, count, pageCursor, scriptIds, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

cart.script.list

Get scripts installed to the storefront

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val scriptIds : kotlin.String = 34023324,34024032 // kotlin.String | Retrieves only scripts with specific ids
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val responseFields : kotlin.String = {pagination,result{total_count,scripts{id,name,src,created_time{value}}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartScriptList = apiInstance.cartScriptList(start, count, pageCursor, scriptIds, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartScriptList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartScriptList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **scriptIds** | **kotlin.String**| Retrieves only scripts with specific ids | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,description&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartScriptList**](ModelResponseCartScriptList.md)

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

<a id="cartShippingZonesList"></a>
# **cartShippingZonesList**
> ModelResponseCartShippingZonesList cartShippingZonesList(start, count, storeId, responseFields, params, exclude)

cart.shipping_zones.list

Get list of shipping zones

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {result{id,name,enabled,countries,shipping_methods{name,rates}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseCartShippingZonesList = apiInstance.cartShippingZonesList(start, count, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartShippingZonesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartShippingZonesList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,name,enabled&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseCartShippingZonesList**](ModelResponseCartShippingZonesList.md)

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

<a id="cartValidate"></a>
# **cartValidate**
> CartValidate200Response cartValidate(validateVersion)

cart.validate

This method clears the cache in API2Cart for a particular store and checks whether the connection to the store is available. Use this method if there have been any changes in the settings on the storе, for example, if a new plugin has been installed or removed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartApi()
val validateVersion : kotlin.Boolean = true // kotlin.Boolean | Specify if api2cart should validate cart version
try {
    val result : CartValidate200Response = apiInstance.cartValidate(validateVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartApi#cartValidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartApi#cartValidate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **validateVersion** | **kotlin.Boolean**| Specify if api2cart should validate cart version | [optional] [default to false] |

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

 - **Content-Type**: Not defined
 - **Accept**: application/json

