# OrderApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**orderAbandonedList**](OrderApi.md#orderAbandonedList) | **GET** /order.abandoned.list.json | order.abandoned.list |
| [**orderAdd**](OrderApi.md#orderAdd) | **POST** /order.add.json | order.add |
| [**orderCount**](OrderApi.md#orderCount) | **GET** /order.count.json | order.count |
| [**orderFinancialStatusList**](OrderApi.md#orderFinancialStatusList) | **GET** /order.financial_status.list.json | order.financial_status.list |
| [**orderFulfillmentStatusList**](OrderApi.md#orderFulfillmentStatusList) | **GET** /order.fulfillment_status.list.json | order.fulfillment_status.list |
| [**orderInfo**](OrderApi.md#orderInfo) | **GET** /order.info.json | order.info |
| [**orderList**](OrderApi.md#orderList) | **GET** /order.list.json | order.list |
| [**orderPreestimateShippingList**](OrderApi.md#orderPreestimateShippingList) | **POST** /order.preestimate_shipping.list.json | order.preestimate_shipping.list |
| [**orderRefundAdd**](OrderApi.md#orderRefundAdd) | **POST** /order.refund.add.json | order.refund.add |
| [**orderReturnAdd**](OrderApi.md#orderReturnAdd) | **POST** /order.return.add.json | order.return.add |
| [**orderReturnDelete**](OrderApi.md#orderReturnDelete) | **DELETE** /order.return.delete.json | order.return.delete |
| [**orderReturnUpdate**](OrderApi.md#orderReturnUpdate) | **PUT** /order.return.update.json | order.return.update |
| [**orderShipmentAdd**](OrderApi.md#orderShipmentAdd) | **POST** /order.shipment.add.json | order.shipment.add |
| [**orderShipmentAddBatch**](OrderApi.md#orderShipmentAddBatch) | **POST** /order.shipment.add.batch.json | order.shipment.add.batch |
| [**orderShipmentDelete**](OrderApi.md#orderShipmentDelete) | **DELETE** /order.shipment.delete.json | order.shipment.delete |
| [**orderShipmentInfo**](OrderApi.md#orderShipmentInfo) | **GET** /order.shipment.info.json | order.shipment.info |
| [**orderShipmentList**](OrderApi.md#orderShipmentList) | **GET** /order.shipment.list.json | order.shipment.list |
| [**orderShipmentTrackingAdd**](OrderApi.md#orderShipmentTrackingAdd) | **POST** /order.shipment.tracking.add.json | order.shipment.tracking.add |
| [**orderShipmentUpdate**](OrderApi.md#orderShipmentUpdate) | **PUT** /order.shipment.update.json | order.shipment.update |
| [**orderStatusList**](OrderApi.md#orderStatusList) | **GET** /order.status.list.json | order.status.list |
| [**orderTransactionList**](OrderApi.md#orderTransactionList) | **GET** /order.transaction.list.json | order.transaction.list |
| [**orderUpdate**](OrderApi.md#orderUpdate) | **PUT** /order.update.json | order.update |


<a id="orderAbandonedList"></a>
# **orderAbandonedList**
> ModelResponseOrderAbandonedList orderAbandonedList(start, count, pageCursor, customerId, customerEmail, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, skipEmptyEmail, responseFields, params, exclude)

order.abandoned.list

Get list of orders that were left by customers before completing the order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val customerEmail : kotlin.String = jubari@hannsgroup.com // kotlin.String | Retrieves orders specified by customer email
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val skipEmptyEmail : kotlin.Boolean = true // kotlin.Boolean | Filter empty emails
val responseFields : kotlin.String = {return_code,pagination,result{order{id,customer{email},created_at,totals{total},order_products}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = force_all // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = customer // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseOrderAbandonedList = apiInstance.orderAbandonedList(start, count, pageCursor, customerId, customerEmail, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, skipEmptyEmail, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderAbandonedList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderAbandonedList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | [optional] |
| **customerEmail** | **kotlin.String**| Retrieves orders specified by customer email | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **skipEmptyEmail** | **kotlin.Boolean**| Filter empty emails | [optional] [default to false] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;customer,totals,items&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseOrderAbandonedList**](ModelResponseOrderAbandonedList.md)

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

<a id="orderAdd"></a>
# **orderAdd**
> OrderAdd200Response orderAdd(orderAdd)

order.add

Add a new order to the cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderAdd : OrderAdd =  // OrderAdd | 
try {
    val result : OrderAdd200Response = apiInstance.orderAdd(orderAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderAdd** | [**OrderAdd**](OrderAdd.md)|  | |

### Return type

[**OrderAdd200Response**](OrderAdd200Response.md)

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

<a id="orderCount"></a>
# **orderCount**
> OrderCount200Response orderCount(orderIds, ids, customerId, storeId, customerEmail, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentChannel, fulfillmentStatus, shippingMethod, deliveryMethod, tags, shipNodeType, createdFrom, createdTo, modifiedFrom, modifiedTo)

order.count

Count orders in store

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderIds : kotlin.String = 24,25 // kotlin.String | Counts orders specified by order ids
val ids : kotlin.String = 24,25 // kotlin.String | Counts orders specified by ids
val customerId : kotlin.String = 5 // kotlin.String | Counts orders quantity specified by customer id
val storeId : kotlin.String = 1 // kotlin.String | Counts orders quantity specified by store id
val customerEmail : kotlin.String = jubari@hannsgroup.com // kotlin.String | Counts orders quantity specified by customer email
val orderStatus : kotlin.String = Completed // kotlin.String | Counts orders quantity specified by order status
val orderStatusIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Retrieves orders specified by order statuses
val ebayOrderStatus : kotlin.String = Active // kotlin.String | Counts orders quantity specified by order status
val financialStatus : kotlin.String = paid // kotlin.String | Counts orders quantity specified by financial status
val financialStatusIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Retrieves orders count specified by financial status ids
val fulfillmentChannel : kotlin.String = local // kotlin.String | Retrieves order with a fulfillment channel
val fulfillmentStatus : kotlin.String = fulfilled // kotlin.String | Create order with fulfillment status
val shippingMethod : kotlin.String = flatrate_flatrate // kotlin.String | Retrieve entities according to shipping method
val deliveryMethod : kotlin.String = local // kotlin.String | Retrieves order with delivery method
val tags : kotlin.String = tag1,tag2 // kotlin.String | Order tags
val shipNodeType : kotlin.String = SellerFulfilled // kotlin.String | Retrieves order with ship node type
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
try {
    val result : OrderCount200Response = apiInstance.orderCount(orderIds, ids, customerId, storeId, customerEmail, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentChannel, fulfillmentStatus, shippingMethod, deliveryMethod, tags, shipNodeType, createdFrom, createdTo, modifiedFrom, modifiedTo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderCount")
    e.printStackTrace()
}
```

### Parameters
| **orderIds** | **kotlin.String**| Counts orders specified by order ids | [optional] |
| **ids** | **kotlin.String**| Counts orders specified by ids | [optional] |
| **customerId** | **kotlin.String**| Counts orders quantity specified by customer id | [optional] |
| **storeId** | **kotlin.String**| Counts orders quantity specified by store id | [optional] |
| **customerEmail** | **kotlin.String**| Counts orders quantity specified by customer email | [optional] |
| **orderStatus** | **kotlin.String**| Counts orders quantity specified by order status | [optional] |
| **orderStatusIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Retrieves orders specified by order statuses | [optional] |
| **ebayOrderStatus** | **kotlin.String**| Counts orders quantity specified by order status | [optional] |
| **financialStatus** | **kotlin.String**| Counts orders quantity specified by financial status | [optional] |
| **financialStatusIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Retrieves orders count specified by financial status ids | [optional] |
| **fulfillmentChannel** | **kotlin.String**| Retrieves order with a fulfillment channel | [optional] |
| **fulfillmentStatus** | **kotlin.String**| Create order with fulfillment status | [optional] |
| **shippingMethod** | **kotlin.String**| Retrieve entities according to shipping method | [optional] |
| **deliveryMethod** | **kotlin.String**| Retrieves order with delivery method | [optional] |
| **tags** | **kotlin.String**| Order tags | [optional] |
| **shipNodeType** | **kotlin.String**| Retrieves order with ship node type | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |

### Return type

[**OrderCount200Response**](OrderCount200Response.md)

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

<a id="orderFinancialStatusList"></a>
# **orderFinancialStatusList**
> OrderFinancialStatusList200Response orderFinancialStatusList()

order.financial_status.list

Retrieve list of financial statuses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
try {
    val result : OrderFinancialStatusList200Response = apiInstance.orderFinancialStatusList()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderFinancialStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderFinancialStatusList")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrderFinancialStatusList200Response**](OrderFinancialStatusList200Response.md)

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

<a id="orderFulfillmentStatusList"></a>
# **orderFulfillmentStatusList**
> OrderFulfillmentStatusList200Response orderFulfillmentStatusList(action)

order.fulfillment_status.list

Retrieve list of fulfillment statuses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val action : kotlin.String = add // kotlin.String | Available statuses for the specified action.
try {
    val result : OrderFulfillmentStatusList200Response = apiInstance.orderFulfillmentStatusList(action)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderFulfillmentStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderFulfillmentStatusList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **action** | **kotlin.String**| Available statuses for the specified action. | [optional] |

### Return type

[**OrderFulfillmentStatusList200Response**](OrderFulfillmentStatusList200Response.md)

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

<a id="orderInfo"></a>
# **orderInfo**
> OrderInfo200Response orderInfo(id, orderId, storeId, params, responseFields, exclude, enableCache, useLatestApiVersion)

order.info

Info about a specific order by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val id : kotlin.String = 10 // kotlin.String | Retrieves order info specified by id
val orderId : kotlin.String = 25 // kotlin.String | Retrieves order’s info specified by order id
val storeId : kotlin.String = 1 // kotlin.String | Defines store id where the order should be found
val params : kotlin.String = order_id,totals,status // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val responseFields : kotlin.String = {result{order_id,customer,totals,address,items,bundles,status}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = order_id,totals,status // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val enableCache : kotlin.Boolean = true // kotlin.Boolean | If the value is 'true' and order exist in our cache, we will return order.info response from cache
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : OrderInfo200Response = apiInstance.orderInfo(id, orderId, storeId, params, responseFields, exclude, enableCache, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Retrieves order info specified by id | [optional] |
| **orderId** | **kotlin.String**| Retrieves order’s info specified by order id | [optional] |
| **storeId** | **kotlin.String**| Defines store id where the order should be found | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;order_id,customer,totals,address,items,bundles,status&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **enableCache** | **kotlin.Boolean**| If the value is &#39;true&#39; and order exist in our cache, we will return order.info response from cache | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**OrderInfo200Response**](OrderInfo200Response.md)

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

<a id="orderList"></a>
# **orderList**
> ModelResponseOrderList orderList(start, count, pageCursor, ids, orderIds, sinceId, storeId, customerId, customerEmail, basketId, currencyId, phone, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentStatus, returnStatus, fulfillmentChannel, shippingMethod, skipOrderIds, isDeleted, shippingCountryIso3, deliveryMethod, shipNodeType, createdTo, createdFrom, modifiedTo, modifiedFrom, tags, sortBy, sortDirection, params, responseFields, exclude, enableCache, useLatestApiVersion)

order.list

Get list of orders from store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve orders via cursor-based pagination (it can't be used with any other filtering parameter)
val ids : kotlin.String = 24,25 // kotlin.String | Retrieves orders specified by ids
val orderIds : kotlin.String = 24,25 // kotlin.String | Retrieves orders specified by order ids
val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
val customerEmail : kotlin.String = jubari@hannsgroup.com // kotlin.String | Retrieves orders specified by customer email
val basketId : kotlin.String = 1 // kotlin.String | Retrieves order’s info specified by basket id.
val currencyId : kotlin.String = usd // kotlin.String | Currency Id
val phone : kotlin.String = 56686868654 // kotlin.String | Filter orders by customer's phone number
val orderStatus : kotlin.String = Completed // kotlin.String | Retrieves orders specified by order status
val orderStatusIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Retrieves orders specified by order statuses
val ebayOrderStatus : kotlin.String = Active // kotlin.String | Retrieves orders specified by order status
val financialStatus : kotlin.String = paid // kotlin.String | Retrieves orders specified by financial status
val financialStatusIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Retrieves orders specified by financial status ids
val fulfillmentStatus : kotlin.String = fulfilled // kotlin.String | Create order with fulfillment status
val returnStatus : kotlin.String = RETURNED // kotlin.String | Retrieves orders specified by return status
val fulfillmentChannel : kotlin.String = local // kotlin.String | Retrieves order with a fulfillment channel
val shippingMethod : kotlin.String = flatrate_flatrate // kotlin.String | Retrieve entities according to shipping method
val skipOrderIds : kotlin.String = 24,25 // kotlin.String | Skipped orders by ids
val isDeleted : kotlin.Boolean = true // kotlin.Boolean | Filter deleted orders
val shippingCountryIso3 : kotlin.String = DEU // kotlin.String | Retrieve entities according to shipping country
val deliveryMethod : kotlin.String = local // kotlin.String | Retrieves order with delivery method
val shipNodeType : kotlin.String = SellerFulfilled // kotlin.String | Retrieves order with ship node type
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val tags : kotlin.String = tag1,tag2 // kotlin.String | Order tags
val sortBy : kotlin.String = modified_at // kotlin.String | Set field to sort by
val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
val params : kotlin.String = order_id,totals,status // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val responseFields : kotlin.String = {return_code,pagination,result{order{order_id,customer,totals,address,items,bundles,status}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = order_id,totals,status // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
val enableCache : kotlin.Boolean = true // kotlin.Boolean | If the value is 'true', we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add)
val useLatestApiVersion : kotlin.Boolean = true // kotlin.Boolean | Use the latest platform API version
try {
    val result : ModelResponseOrderList = apiInstance.orderList(start, count, pageCursor, ids, orderIds, sinceId, storeId, customerId, customerEmail, basketId, currencyId, phone, orderStatus, orderStatusIds, ebayOrderStatus, financialStatus, financialStatusIds, fulfillmentStatus, returnStatus, fulfillmentChannel, shippingMethod, skipOrderIds, isDeleted, shippingCountryIso3, deliveryMethod, shipNodeType, createdTo, createdFrom, modifiedTo, modifiedFrom, tags, sortBy, sortDirection, params, responseFields, exclude, enableCache, useLatestApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve orders via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **ids** | **kotlin.String**| Retrieves orders specified by ids | [optional] |
| **orderIds** | **kotlin.String**| Retrieves orders specified by order ids | [optional] |
| **sinceId** | **kotlin.String**| Retrieve entities starting from the specified id. | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **customerId** | **kotlin.String**| Retrieves orders specified by customer id | [optional] |
| **customerEmail** | **kotlin.String**| Retrieves orders specified by customer email | [optional] |
| **basketId** | **kotlin.String**| Retrieves order’s info specified by basket id. | [optional] |
| **currencyId** | **kotlin.String**| Currency Id | [optional] |
| **phone** | **kotlin.String**| Filter orders by customer&#39;s phone number | [optional] |
| **orderStatus** | **kotlin.String**| Retrieves orders specified by order status | [optional] |
| **orderStatusIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Retrieves orders specified by order statuses | [optional] |
| **ebayOrderStatus** | **kotlin.String**| Retrieves orders specified by order status | [optional] |
| **financialStatus** | **kotlin.String**| Retrieves orders specified by financial status | [optional] |
| **financialStatusIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Retrieves orders specified by financial status ids | [optional] |
| **fulfillmentStatus** | **kotlin.String**| Create order with fulfillment status | [optional] |
| **returnStatus** | **kotlin.String**| Retrieves orders specified by return status | [optional] |
| **fulfillmentChannel** | **kotlin.String**| Retrieves order with a fulfillment channel | [optional] |
| **shippingMethod** | **kotlin.String**| Retrieve entities according to shipping method | [optional] |
| **skipOrderIds** | **kotlin.String**| Skipped orders by ids | [optional] |
| **isDeleted** | **kotlin.Boolean**| Filter deleted orders | [optional] |
| **shippingCountryIso3** | **kotlin.String**| Retrieve entities according to shipping country | [optional] |
| **deliveryMethod** | **kotlin.String**| Retrieves order with delivery method | [optional] |
| **shipNodeType** | **kotlin.String**| Retrieves order with ship node type | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **tags** | **kotlin.String**| Order tags | [optional] |
| **sortBy** | **kotlin.String**| Set field to sort by | [optional] [default to &quot;order_id&quot;] |
| **sortDirection** | **kotlin.String**| Set sorting direction | [optional] [default to &quot;asc&quot;] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;order_id,customer,totals,address,items,bundles,status&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |
| **enableCache** | **kotlin.Boolean**| If the value is &#39;true&#39;, we will cache orders for a 15 minutes in order to increase speed and reduce requests throttling for some methods and shoping platforms (for example order.shipment.add) | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useLatestApiVersion** | **kotlin.Boolean**| Use the latest platform API version | [optional] [default to false] |

### Return type

[**ModelResponseOrderList**](ModelResponseOrderList.md)

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

<a id="orderPreestimateShippingList"></a>
# **orderPreestimateShippingList**
> ModelResponseOrderPreestimateShippingList orderPreestimateShippingList(orderPreestimateShippingList)

order.preestimate_shipping.list

Retrieve list of order preestimated shipping methods

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderPreestimateShippingList : OrderPreestimateShippingList =  // OrderPreestimateShippingList | 
try {
    val result : ModelResponseOrderPreestimateShippingList = apiInstance.orderPreestimateShippingList(orderPreestimateShippingList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderPreestimateShippingList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderPreestimateShippingList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderPreestimateShippingList** | [**OrderPreestimateShippingList**](OrderPreestimateShippingList.md)|  | |

### Return type

[**ModelResponseOrderPreestimateShippingList**](ModelResponseOrderPreestimateShippingList.md)

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

<a id="orderRefundAdd"></a>
# **orderRefundAdd**
> OrderRefundAdd200Response orderRefundAdd(orderRefundAdd)

order.refund.add

Add a refund to the order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderRefundAdd : OrderRefundAdd =  // OrderRefundAdd | 
try {
    val result : OrderRefundAdd200Response = apiInstance.orderRefundAdd(orderRefundAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderRefundAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderRefundAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderRefundAdd** | [**OrderRefundAdd**](OrderRefundAdd.md)|  | |

### Return type

[**OrderRefundAdd200Response**](OrderRefundAdd200Response.md)

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

<a id="orderReturnAdd"></a>
# **orderReturnAdd**
> OrderReturnAdd200Response orderReturnAdd(orderReturnAdd)

order.return.add

Create new return request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderReturnAdd : OrderReturnAdd =  // OrderReturnAdd | 
try {
    val result : OrderReturnAdd200Response = apiInstance.orderReturnAdd(orderReturnAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderReturnAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderReturnAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderReturnAdd** | [**OrderReturnAdd**](OrderReturnAdd.md)|  | |

### Return type

[**OrderReturnAdd200Response**](OrderReturnAdd200Response.md)

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

<a id="orderReturnDelete"></a>
# **orderReturnDelete**
> AttributeValueDelete200Response orderReturnDelete(returnId, orderId, storeId)

order.return.delete

Delete return.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val returnId : kotlin.String = 200000002 // kotlin.String | Return ID
val orderId : kotlin.String = 25 // kotlin.String | Defines the order id
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : AttributeValueDelete200Response = apiInstance.orderReturnDelete(returnId, orderId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderReturnDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderReturnDelete")
    e.printStackTrace()
}
```

### Parameters
| **returnId** | **kotlin.String**| Return ID | |
| **orderId** | **kotlin.String**| Defines the order id | |
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

<a id="orderReturnUpdate"></a>
# **orderReturnUpdate**
> AccountConfigUpdate200Response orderReturnUpdate(orderReturnUpdate)

order.return.update

Update order&#39;s shipment information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderReturnUpdate : OrderReturnUpdate =  // OrderReturnUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.orderReturnUpdate(orderReturnUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderReturnUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderReturnUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderReturnUpdate** | [**OrderReturnUpdate**](OrderReturnUpdate.md)|  | |

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

<a id="orderShipmentAdd"></a>
# **orderShipmentAdd**
> OrderShipmentAdd200Response orderShipmentAdd(orderShipmentAdd)

order.shipment.add

Add a shipment to the order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderShipmentAdd : OrderShipmentAdd =  // OrderShipmentAdd | 
try {
    val result : OrderShipmentAdd200Response = apiInstance.orderShipmentAdd(orderShipmentAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderShipmentAdd** | [**OrderShipmentAdd**](OrderShipmentAdd.md)|  | |

### Return type

[**OrderShipmentAdd200Response**](OrderShipmentAdd200Response.md)

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

<a id="orderShipmentAddBatch"></a>
# **orderShipmentAddBatch**
> CategoryAddBatch200Response orderShipmentAddBatch(orderShipmentAddBatch)

order.shipment.add.batch

Add a shipments to the orders.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderShipmentAddBatch : OrderShipmentAddBatch =  // OrderShipmentAddBatch | 
try {
    val result : CategoryAddBatch200Response = apiInstance.orderShipmentAddBatch(orderShipmentAddBatch)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentAddBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentAddBatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderShipmentAddBatch** | [**OrderShipmentAddBatch**](OrderShipmentAddBatch.md)|  | |

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

<a id="orderShipmentDelete"></a>
# **orderShipmentDelete**
> OrderShipmentDelete200Response orderShipmentDelete(shipmentId, orderId, storeId)

order.shipment.delete

Delete order&#39;s shipment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val shipmentId : kotlin.String = 200000002 // kotlin.String | Shipment id indicates the number of delivery
val orderId : kotlin.String = 25 // kotlin.String | Defines the order for which the shipment will be deleted
val storeId : kotlin.String = 1 // kotlin.String | Store Id
try {
    val result : OrderShipmentDelete200Response = apiInstance.orderShipmentDelete(shipmentId, orderId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentDelete")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **kotlin.String**| Shipment id indicates the number of delivery | |
| **orderId** | **kotlin.String**| Defines the order for which the shipment will be deleted | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Store Id | [optional] |

### Return type

[**OrderShipmentDelete200Response**](OrderShipmentDelete200Response.md)

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

<a id="orderShipmentInfo"></a>
# **orderShipmentInfo**
> OrderShipmentInfo200Response orderShipmentInfo(id, orderId, start, storeId, responseFields, params, exclude)

order.shipment.info

Get information of shipment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val id : kotlin.String = 10 // kotlin.String | Entity id
val orderId : kotlin.String = 25 // kotlin.String | Defines the order id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val responseFields : kotlin.String = {result{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : OrderShipmentInfo200Response = apiInstance.orderShipmentInfo(id, orderId, start, storeId, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentInfo")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Entity id | |
| **orderId** | **kotlin.String**| Defines the order id | |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,order_id,items,tracking_numbers&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**OrderShipmentInfo200Response**](OrderShipmentInfo200Response.md)

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

<a id="orderShipmentList"></a>
# **orderShipmentList**
> ModelResponseOrderShipmentList orderShipmentList(orderId, start, count, pageCursor, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)

order.shipment.list

Get list of shipments per order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderId : kotlin.String = 25 // kotlin.String | Retrieves shipments specified by order id
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
val responseFields : kotlin.String = {status_code,pagination,result{shipment{id,order_id,shipment_provider,tracking_numbers{tracking_number},items{product_id,quantity}}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseOrderShipmentList = apiInstance.orderShipmentList(orderId, start, count, pageCursor, storeId, createdFrom, createdTo, modifiedFrom, modifiedTo, responseFields, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentList")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **kotlin.String**| Retrieves shipments specified by order id | |
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **createdFrom** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **createdTo** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **modifiedFrom** | **kotlin.String**| Retrieve entities from their modification date | [optional] |
| **modifiedTo** | **kotlin.String**| Retrieve entities to their modification date | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,order_id,items,tracking_numbers&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseOrderShipmentList**](ModelResponseOrderShipmentList.md)

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

<a id="orderShipmentTrackingAdd"></a>
# **orderShipmentTrackingAdd**
> OrderShipmentTrackingAdd200Response orderShipmentTrackingAdd(orderShipmentTrackingAdd)

order.shipment.tracking.add

Add order shipment&#39;s tracking info.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderShipmentTrackingAdd : OrderShipmentTrackingAdd =  // OrderShipmentTrackingAdd | 
try {
    val result : OrderShipmentTrackingAdd200Response = apiInstance.orderShipmentTrackingAdd(orderShipmentTrackingAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentTrackingAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentTrackingAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderShipmentTrackingAdd** | [**OrderShipmentTrackingAdd**](OrderShipmentTrackingAdd.md)|  | |

### Return type

[**OrderShipmentTrackingAdd200Response**](OrderShipmentTrackingAdd200Response.md)

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

<a id="orderShipmentUpdate"></a>
# **orderShipmentUpdate**
> AccountConfigUpdate200Response orderShipmentUpdate(orderShipmentUpdate)

order.shipment.update

Update order&#39;s shipment information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderShipmentUpdate : OrderShipmentUpdate =  // OrderShipmentUpdate | 
try {
    val result : AccountConfigUpdate200Response = apiInstance.orderShipmentUpdate(orderShipmentUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderShipmentUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderShipmentUpdate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderShipmentUpdate** | [**OrderShipmentUpdate**](OrderShipmentUpdate.md)|  | |

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

<a id="orderStatusList"></a>
# **orderStatusList**
> ModelResponseOrderStatusList orderStatusList(storeId, action, responseFields)

order.status.list

Retrieve list of statuses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val action : kotlin.String = add // kotlin.String | Available statuses for the specified action.
val responseFields : kotlin.String = {return_code,return_message,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : ModelResponseOrderStatusList = apiInstance.orderStatusList(storeId, action, responseFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderStatusList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderStatusList")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **action** | **kotlin.String**| Available statuses for the specified action. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |

### Return type

[**ModelResponseOrderStatusList**](ModelResponseOrderStatusList.md)

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

<a id="orderTransactionList"></a>
# **orderTransactionList**
> ModelResponseOrderTransactionList orderTransactionList(orderIds, count, pageCursor, storeId, params, responseFields, exclude)

order.transaction.list

Retrieve list of order transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderIds : kotlin.String = 24,25 // kotlin.String | Retrieves order transactions specified by order ids
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
val storeId : kotlin.String = 1 // kotlin.String | Store Id
val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val responseFields : kotlin.String = {return_code,pagination,result{transactions_count,transactions{id,transaction_id,status,description,settlement_amount,gateway,card_brand,card_last_four}}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : ModelResponseOrderTransactionList = apiInstance.orderTransactionList(orderIds, count, pageCursor, storeId, params, responseFields, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderTransactionList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderTransactionList")
    e.printStackTrace()
}
```

### Parameters
| **orderIds** | **kotlin.String**| Retrieves order transactions specified by order ids | |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **pageCursor** | **kotlin.String**| Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) | [optional] |
| **storeId** | **kotlin.String**| Store Id | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,order_id,amount,description&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**ModelResponseOrderTransactionList**](ModelResponseOrderTransactionList.md)

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

<a id="orderUpdate"></a>
# **orderUpdate**
> AccountConfigUpdate200Response orderUpdate(orderId, storeId, orderStatus, financialStatus, fulfillmentStatus, cancellationReason, orderPaymentMethod, comment, adminComment, adminPrivateComment, invoiceAdminComment, dateModified, dateFinished, sendNotifications, createInvoice, origin, tags)

order.update

Update existing order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrderApi()
val orderId : kotlin.String = 25 // kotlin.String | Defines the orders specified by order id
val storeId : kotlin.String = 1 // kotlin.String | Defines store id where the order should be found
val orderStatus : kotlin.String = Completed // kotlin.String | Defines new order's status
val financialStatus : kotlin.String = paid // kotlin.String | Update order financial status to specified
val fulfillmentStatus : kotlin.String = fulfilled // kotlin.String | Create order with fulfillment status
val cancellationReason : kotlin.String = ORDER_UNPAID // kotlin.String | Defines the cancellation reason when the order will be canceled
val orderPaymentMethod : kotlin.String = PayPal // kotlin.String | Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid'
val comment : kotlin.String = This coole order // kotlin.String | Specifies order comment
val adminComment : kotlin.String = Test admin comment // kotlin.String | Specifies admin's order comment
val adminPrivateComment : kotlin.String = Test admin private comment // kotlin.String | Specifies private admin's order comment
val invoiceAdminComment : kotlin.String = Test admin comment // kotlin.String | Specifies admin's order invoice comment
val dateModified : kotlin.String = 2014-05-05 05:05:00 // kotlin.String | Specifies order's  modification date
val dateFinished : kotlin.String = 2014-06-05 05:05:00 // kotlin.String | Specifies order's  finished date
val sendNotifications : kotlin.Boolean = true // kotlin.Boolean | Send notifications to customer after order was created
val createInvoice : kotlin.Boolean = true // kotlin.Boolean | Determines whether an invoice should be created if it has not already been created
val origin : kotlin.String = newsletter // kotlin.String | The source of the order
val tags : kotlin.String = tag1,tag2 // kotlin.String | Order tags
try {
    val result : AccountConfigUpdate200Response = apiInstance.orderUpdate(orderId, storeId, orderStatus, financialStatus, fulfillmentStatus, cancellationReason, orderPaymentMethod, comment, adminComment, adminPrivateComment, invoiceAdminComment, dateModified, dateFinished, sendNotifications, createInvoice, origin, tags)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrderApi#orderUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrderApi#orderUpdate")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **kotlin.String**| Defines the orders specified by order id | |
| **storeId** | **kotlin.String**| Defines store id where the order should be found | [optional] |
| **orderStatus** | **kotlin.String**| Defines new order&#39;s status | [optional] |
| **financialStatus** | **kotlin.String**| Update order financial status to specified | [optional] |
| **fulfillmentStatus** | **kotlin.String**| Create order with fulfillment status | [optional] |
| **cancellationReason** | **kotlin.String**| Defines the cancellation reason when the order will be canceled | [optional] |
| **orderPaymentMethod** | **kotlin.String**| Defines order payment method.&lt;br/&gt;Setting order_payment_method on Shopify will also change financial_status field value to &#39;paid&#39; | [optional] |
| **comment** | **kotlin.String**| Specifies order comment | [optional] |
| **adminComment** | **kotlin.String**| Specifies admin&#39;s order comment | [optional] |
| **adminPrivateComment** | **kotlin.String**| Specifies private admin&#39;s order comment | [optional] |
| **invoiceAdminComment** | **kotlin.String**| Specifies admin&#39;s order invoice comment | [optional] |
| **dateModified** | **kotlin.String**| Specifies order&#39;s  modification date | [optional] |
| **dateFinished** | **kotlin.String**| Specifies order&#39;s  finished date | [optional] |
| **sendNotifications** | **kotlin.Boolean**| Send notifications to customer after order was created | [optional] [default to false] |
| **createInvoice** | **kotlin.Boolean**| Determines whether an invoice should be created if it has not already been created | [optional] |
| **origin** | **kotlin.String**| The source of the order | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tags** | **kotlin.String**| Order tags | [optional] |

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

