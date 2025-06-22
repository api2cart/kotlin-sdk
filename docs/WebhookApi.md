# WebhookApi

All URIs are relative to *https://api.api2cart.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**webhookCount**](WebhookApi.md#webhookCount) | **GET** /webhook.count.json | webhook.count |
| [**webhookCreate**](WebhookApi.md#webhookCreate) | **POST** /webhook.create.json | webhook.create |
| [**webhookDelete**](WebhookApi.md#webhookDelete) | **DELETE** /webhook.delete.json | webhook.delete |
| [**webhookEvents**](WebhookApi.md#webhookEvents) | **GET** /webhook.events.json | webhook.events |
| [**webhookList**](WebhookApi.md#webhookList) | **GET** /webhook.list.json | webhook.list |
| [**webhookUpdate**](WebhookApi.md#webhookUpdate) | **PUT** /webhook.update.json | webhook.update |


<a id="webhookCount"></a>
# **webhookCount**
> WebhookCount200Response webhookCount(entity, action, active)

webhook.count

Count registered webhooks on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
val entity : kotlin.String = product // kotlin.String | The entity you want to filter webhooks by (e.g. order or product)
val action : kotlin.String = add // kotlin.String | The action you want to filter webhooks by (e.g. order or product)
val active : kotlin.Boolean = true // kotlin.Boolean | The webhook status you want to filter webhooks by
try {
    val result : WebhookCount200Response = apiInstance.webhookCount(entity, action, active)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookCount")
    e.printStackTrace()
}
```

### Parameters
| **entity** | **kotlin.String**| The entity you want to filter webhooks by (e.g. order or product) | [optional] |
| **action** | **kotlin.String**| The action you want to filter webhooks by (e.g. order or product) | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean**| The webhook status you want to filter webhooks by | [optional] |

### Return type

[**WebhookCount200Response**](WebhookCount200Response.md)

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

<a id="webhookCreate"></a>
# **webhookCreate**
> BasketLiveShippingServiceCreate200Response webhookCreate(entity, action, paramCallback, label, fields, responseFields, active, langId, storeId)

webhook.create

Create webhook on the store and subscribe to it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
val entity : kotlin.String = product // kotlin.String | Specify the entity that you want to enable webhooks for (e.g product, order, customer, category)
val action : kotlin.String = add // kotlin.String | Specify what action (event) will trigger the webhook (e.g add, delete, or update)
val paramCallback : kotlin.String = https://example.com/callback // kotlin.String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
val label : kotlin.String = Super webhook // kotlin.String | The name you give to the webhook
val fields : kotlin.String = id, name, description // kotlin.String | Fields the webhook should send
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val active : kotlin.Boolean = true // kotlin.Boolean | Webhook status
val langId : kotlin.String = 3 // kotlin.String | Language id
val storeId : kotlin.String = 1 // kotlin.String | Defines store id where the webhook should be assigned
try {
    val result : BasketLiveShippingServiceCreate200Response = apiInstance.webhookCreate(entity, action, paramCallback, label, fields, responseFields, active, langId, storeId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookCreate")
    e.printStackTrace()
}
```

### Parameters
| **entity** | **kotlin.String**| Specify the entity that you want to enable webhooks for (e.g product, order, customer, category) | |
| **action** | **kotlin.String**| Specify what action (event) will trigger the webhook (e.g add, delete, or update) | |
| **paramCallback** | **kotlin.String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional] |
| **label** | **kotlin.String**| The name you give to the webhook | [optional] |
| **fields** | **kotlin.String**| Fields the webhook should send | [optional] [default to &quot;force_all&quot;] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **active** | **kotlin.Boolean**| Webhook status | [optional] [default to true] |
| **langId** | **kotlin.String**| Language id | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeId** | **kotlin.String**| Defines store id where the webhook should be assigned | [optional] |

### Return type

[**BasketLiveShippingServiceCreate200Response**](BasketLiveShippingServiceCreate200Response.md)

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

<a id="webhookDelete"></a>
# **webhookDelete**
> AttributeDelete200Response webhookDelete(id)

webhook.delete

Delete registered webhook on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
val id : kotlin.String = 25 // kotlin.String | Webhook id
try {
    val result : AttributeDelete200Response = apiInstance.webhookDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| Webhook id | |

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

<a id="webhookEvents"></a>
# **webhookEvents**
> WebhookEvents200Response webhookEvents()

webhook.events

List all Webhooks that are available on this store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
try {
    val result : WebhookEvents200Response = apiInstance.webhookEvents()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookEvents")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookEvents200Response**](WebhookEvents200Response.md)

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

<a id="webhookList"></a>
# **webhookList**
> WebhookList200Response webhookList(start, count, entity, action, active, ids, params)

webhook.list

List registered webhook on the store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val entity : kotlin.String = product // kotlin.String | The entity you want to filter webhooks by (e.g. order or product)
val action : kotlin.String = add // kotlin.String | The action you want to filter webhooks by (e.g. add, update, or delete)
val active : kotlin.Boolean = true // kotlin.Boolean | The webhook status you want to filter webhooks by
val ids : kotlin.String = 3,14,25 // kotlin.String | List of сomma-separated webhook ids
val params : kotlin.String = id,entity,callback,fields // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
try {
    val result : WebhookList200Response = apiInstance.webhookList(start, count, entity, action, active, ids, params)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookList")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| **entity** | **kotlin.String**| The entity you want to filter webhooks by (e.g. order or product) | [optional] |
| **action** | **kotlin.String**| The action you want to filter webhooks by (e.g. add, update, or delete) | [optional] |
| **active** | **kotlin.Boolean**| The webhook status you want to filter webhooks by | [optional] |
| **ids** | **kotlin.String**| List of сomma-separated webhook ids | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;id,entity,action,callback&quot;] |

### Return type

[**WebhookList200Response**](WebhookList200Response.md)

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

<a id="webhookUpdate"></a>
# **webhookUpdate**
> ProductImageUpdate200Response webhookUpdate(id, paramCallback, label, fields, responseFields, active, langId)

webhook.update

Update Webhooks parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhookApi()
val id : kotlin.String = 25 // kotlin.String | Webhook id
val paramCallback : kotlin.String = https://example.com/callback // kotlin.String | Callback url that returns shipping rates. It should be able to accept POST requests with json data.
val label : kotlin.String = Super webhook // kotlin.String | The name you give to the webhook
val fields : kotlin.String = id, name, description // kotlin.String | Fields the webhook should send
val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val active : kotlin.Boolean = true // kotlin.Boolean | Webhook status
val langId : kotlin.String = 3 // kotlin.String | Language id
try {
    val result : ProductImageUpdate200Response = apiInstance.webhookUpdate(id, paramCallback, label, fields, responseFields, active, langId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhookApi#webhookUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhookApi#webhookUpdate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Webhook id | |
| **paramCallback** | **kotlin.String**| Callback url that returns shipping rates. It should be able to accept POST requests with json data. | [optional] |
| **label** | **kotlin.String**| The name you give to the webhook | [optional] |
| **fields** | **kotlin.String**| Fields the webhook should send | [optional] |
| **responseFields** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] |
| **active** | **kotlin.Boolean**| Webhook status | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **langId** | **kotlin.String**| Language id | [optional] |

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

