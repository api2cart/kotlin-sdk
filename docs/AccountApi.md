# AccountApi

All URIs are relative to *https://api.api2cart.local.com/v1.1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountCartAdd**](AccountApi.md#accountCartAdd) | **POST** /account.cart.add.json | account.cart.add |
| [**accountCartList**](AccountApi.md#accountCartList) | **GET** /account.cart.list.json | account.cart.list |
| [**accountConfigUpdate**](AccountApi.md#accountConfigUpdate) | **PUT** /account.config.update.json | account.config.update |
| [**accountFailedWebhooks**](AccountApi.md#accountFailedWebhooks) | **GET** /account.failed_webhooks.json | account.failed_webhooks |
| [**accountSupportedPlatforms**](AccountApi.md#accountSupportedPlatforms) | **GET** /account.supported_platforms.json | account.supported_platforms |


<a id="accountCartAdd"></a>
# **accountCartAdd**
> AccountCartAdd200Response accountCartAdd(accountCartAdd)

account.cart.add

Use this method to automate the process of connecting stores to API2Cart. The list of parameters will vary depending on the platform. To get a list of parameters that are specific to a particular shopping platform, you need to execute the account.supported_platforms.json method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val accountCartAdd : AccountCartAdd =  // AccountCartAdd | 
try {
    val result : AccountCartAdd200Response = apiInstance.accountCartAdd(accountCartAdd)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountCartAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountCartAdd")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountCartAdd** | [**AccountCartAdd**](AccountCartAdd.md)|  | |

### Return type

[**AccountCartAdd200Response**](AccountCartAdd200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="accountCartList"></a>
# **accountCartList**
> AccountCartList200Response accountCartList(storeUrl, storeKey, requestFromDate, requestToDate, params, exclude)

account.cart.list

This method lets you get a list of online stores connected to your API2Cart account. You can get the number of API requests to each store if you specify a period using parameters (request_from_date, request_to_date). The total_calls field is displayed only if there are parameters (request_from_date, request_to_date).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val storeUrl : kotlin.String = http://mystore.com // kotlin.String | A web address of a store
val storeKey : kotlin.String = ab37fc230bc5df63a5be1b11220949be // kotlin.String | Find store by store key
val requestFromDate : kotlin.String = 2010-07-29 // kotlin.String | Retrieve entities from their creation date
val requestToDate : kotlin.String = 2100-08-29 // kotlin.String | Retrieve entities to their creation date
val params : kotlin.String = url,store_key // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
val exclude : kotlin.String = url,store_key // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
try {
    val result : AccountCartList200Response = apiInstance.accountCartList(storeUrl, storeKey, requestFromDate, requestToDate, params, exclude)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountCartList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountCartList")
    e.printStackTrace()
}
```

### Parameters
| **storeUrl** | **kotlin.String**| A web address of a store | [optional] |
| **storeKey** | **kotlin.String**| Find store by store key | [optional] |
| **requestFromDate** | **kotlin.String**| Retrieve entities from their creation date | [optional] |
| **requestToDate** | **kotlin.String**| Retrieve entities to their creation date | [optional] |
| **params** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to retrieve | [optional] [default to &quot;force_all&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **exclude** | **kotlin.String**| Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all | [optional] |

### Return type

[**AccountCartList200Response**](AccountCartList200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="accountConfigUpdate"></a>
# **accountConfigUpdate**
> AccountConfigUpdate200Response accountConfigUpdate(replaceParameters, newStoreUrl, newStoreKey, bridgeUrl, storeRoot, dbTablesPrefix, userAgent, `3dcartPrivateKey`, `3dcartAccessToken`, `3dcartapiApiKey`, amazonSpClientId, amazonSpClientSecret, amazonSpRefreshToken, amazonSpAwsRegion, amazonSpApiEnvironment, amazonSellerId, aspdotnetstorefrontApiUser, aspdotnetstorefrontApiPass, bigcommerceapiAdminAccount, bigcommerceapiApiPath, bigcommerceapiApiKey, bigcommerceapiClientId, bigcommerceapiAccessToken, bigcommerceapiContext, bolApiKey, bolApiSecret, bolRetailerId, demandwareClientId, demandwareApiPassword, demandwareUserName, demandwareUserPassword, ebayClientId, ebayClientSecret, ebayRuname, ebayAccessToken, ebayRefreshToken, ebayEnvironment, ebaySiteId, ecwidAcessToken, ecwidStoreId, lazadaAppId, lazadaAppSecret, lazadaRefreshToken, lazadaRegion, etsyKeystring, etsySharedSecret, etsyAccessToken, etsyTokenSecret, etsyClientId, etsyRefreshToken, facebookAppId, facebookAppSecret, facebookAccessToken, facebookBusinessId, netoApiKey, netoApiUsername, shoplineAccessToken, shoplineAppKey, shoplineAppSecret, shoplineSharedSecret, shopifyAccessToken, shopifyApiKey, shopifyApiPassword, shopifySharedSecret, shopeePartnerId, shopeePartnerKey, shopeeShopId, shopeeRefreshToken, shopeeRegion, shopeeEnvironment, shoplazzaAccessToken, shoplazzaSharedSecret, mivaAccessToken, mivaSignature, shopwareAccessKey, shopwareApiKey, shopwareApiSecret, bigcartelUserName, bigcartelPassword, bricklinkConsumerKey, bricklinkConsumerSecret, bricklinkToken, bricklinkTokenSecret, volusionLogin, volusionPassword, walmartClientId, walmartClientSecret, walmartEnvironment, walmartChannelType, walmartRegion, squareClientId, squareClientSecret, squareRefreshToken, squarespaceApiKey, squarespaceClientId, squarespaceClientSecret, squarespaceAccessToken, squarespaceRefreshToken, hybrisClientId, hybrisClientSecret, hybrisUsername, hybrisPassword, hybrisWebsites, lightspeedApiKey, lightspeedApiSecret, commercehqApiKey, commercehqApiPassword, wcConsumerKey, wcConsumerSecret, magentoConsumerKey, magentoConsumerSecret, magentoAccessToken, magentoTokenSecret, prestashopWebserviceKey, wixAppId, wixAppSecretKey, wixInstanceId, wixRefreshToken, mercadoLibreAppId, mercadoLibreAppSecretKey, mercadoLibreRefreshToken, zidClientId, zidClientSecret, zidAccessToken, zidAuthorization, zidRefreshToken, flipkartClientId, flipkartClientSecret, allegroClientId, allegroClientSecret, allegroAccessToken, allegroRefreshToken, allegroEnvironment, zohoClientId, zohoClientSecret, zohoRefreshToken, zohoRegion, tiendanubeUserId, tiendanubeAccessToken, tiendanubeClientSecret, ottoClientId, ottoClientSecret, ottoAppId, ottoRefreshToken, ottoEnvironment, ottoAccessToken, tiktokshopAppKey, tiktokshopAppSecret, tiktokshopRefreshToken, tiktokshopAccessToken, sallaClientId, sallaClientSecret, sallaRefreshToken, sallaAccessToken, temuAppKey, temuAppSecret, temuAccessToken, temuRegion)

account.config.update

Use this method to automate the change of credentials used to connect online stores. The list of supported parameters differs depending on the platform.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val replaceParameters : kotlin.Boolean = true // kotlin.Boolean | Identifies if there is a necessity to replace parameters
val newStoreUrl : kotlin.String = http://mystore.com // kotlin.String | The web address of the store you want to update to connect to API2Cart
val newStoreKey : kotlin.String = b636495648de3086f6f57b1bd4be548f // kotlin.String | Update store key
val bridgeUrl : kotlin.String = https://your-store.com/custom/bridge/path/bridge.php // kotlin.String | This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store)
val storeRoot : kotlin.String = /home/www/stores/magento1922 // kotlin.String | Absolute path to the store root directory (used with \"bridge_url\" parameter)
val dbTablesPrefix : kotlin.String = oc_ // kotlin.String | DB tables prefix
val userAgent : kotlin.String = Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0 // kotlin.String | This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store's firewall may block specific values.
val `3dcartPrivateKey` : kotlin.String = 7dba81f90bdbe25e7000e73214ca51b // kotlin.String | 3DCart Private Key
val `3dcartAccessToken` : kotlin.String = 4Grr_ZCLNNoSUuhAjesKuchxo9SL // kotlin.String | 3DCart Token
val `3dcartapiApiKey` : kotlin.String = 82cc921c6a5c67082cc921c6a5c6707e1d6e6862ba3201a // kotlin.String | 3DCart API Key
val amazonSpClientId : kotlin.String = amzn1.application-oa2-client.11e000e1f47d4998aca3733716d3b5a4 // kotlin.String | Amazon SP API app client id
val amazonSpClientSecret : kotlin.String = 2c987428209f235443221255bde064f4bdf8a65165a80f5d22760a83cb // kotlin.String | Amazon SP API app client secret
val amazonSpRefreshToken : kotlin.String = Atzr|IwEBIPUI-bwRTdDgKNQ_g56C30wGqymtx30c9MdDC7Emwmojhs20k5BBG2hHtJiGZ_7OfG7khd1RuQr6KEst4qyWbo_eXi5S_T_VOxzJUuksG1cFOGFpFK-cnhReNzAeZIpZeJT7_ROy1csEFlQfC8FJS3bsbSkkbTz2ZcTN7_7ey0HVlhyfFizgROeSeOI24Wjs9l_KKzZW0jvi_oC2cxlIcyknnHLK6KMNz2rTXqQJWRtlK9xPJDdbcUa5STA8MQru91cxNBpSkZN_cq9OOELhbsIGKD75y7nZ3yJU4uHQC_9iBQQoFm0biKgi-kEQwOhwws8 // kotlin.String | Amazon SP API OAuth refresh token
val amazonSpAwsRegion : kotlin.String = us-east-1 // kotlin.String | Amazon AWS Region
val amazonSpApiEnvironment : kotlin.String = sandbox // kotlin.String | Amazon SP API environment
val amazonSellerId : kotlin.String = 13P636B2M1N4WR // kotlin.String | Amazon Seller ID (Merchant token)
val aspdotnetstorefrontApiUser : kotlin.String = admin // kotlin.String | It's a AspDotNetStorefront account for which API is available
val aspdotnetstorefrontApiPass : kotlin.String = f6471ef78f72b41849a8b8b67791b0b5 // kotlin.String | AspDotNetStorefront API Password
val bigcommerceapiAdminAccount : kotlin.String = admin // kotlin.String | It's a BigCommerce account for which API is enabled
val bigcommerceapiApiPath : kotlin.String = http://mystore.bigcommerce.com/api/v1 // kotlin.String | BigCommerce API URL
val bigcommerceapiApiKey : kotlin.String = 6b89704cd75738cb0f9f6468d5462aba // kotlin.String | Bigcommerce API Key
val bigcommerceapiClientId : kotlin.String = p1r37bt131z86675nofv9xmhietoe4t // kotlin.String | Client ID of the requesting app
val bigcommerceapiAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Access token authorizing the app to access resources on behalf of a user
val bigcommerceapiContext : kotlin.String = stores/etplnf8o8v // kotlin.String | API Path section unique to the store
val bolApiKey : kotlin.String = 51369628-feee-11ed-be56-0242ac120002 // kotlin.String | Bol API Key
val bolApiSecret : kotlin.String = 8fGzEsbEP5z2MNZubmIil87m-sWzTkj?KDQKrmzmU!fA6aAUNMdKRp7LMWHwE!G37UMfnWByHBGSXJHkAG?QcuYTO2uklv4idIHwUMLHK!OO1yfRlWh! // kotlin.String | Bol API Secret
val bolRetailerId : kotlin.Int = 145001 // kotlin.Int | Bol Retailer ID
val demandwareClientId : kotlin.String = b849eb85-v8b9-1dw8-9fe2-97e1d6ffc7b0 // kotlin.String | Demandware client id
val demandwareApiPassword : kotlin.String = testpassword // kotlin.String | Demandware api password
val demandwareUserName : kotlin.String = admin // kotlin.String | Demandware user name
val demandwareUserPassword : kotlin.String = 12345 // kotlin.String | Demandware user password
val ebayClientId : kotlin.String = a9psel85v1wy5faeyjw03y0r // kotlin.String | Application ID (AppID).
val ebayClientSecret : kotlin.String = gmz3iz45x2 // kotlin.String | Shared Secret from eBay application
val ebayRuname : kotlin.String = gmz3iz45x2 // kotlin.String | The RuName value that eBay assigns to your application.
val ebayAccessToken : kotlin.String = v^1.1#i ... AjRV4yNjA= // kotlin.String | Used to authenticate API requests.
val ebayRefreshToken : kotlin.String = v^1.1#i ... rAewqVasdA= // kotlin.String | Used to renew the access token.
val ebayEnvironment : kotlin.String = sandbox // kotlin.String | eBay environment
val ebaySiteId : kotlin.Int = 101 // kotlin.Int | eBay global ID
val ecwidAcessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Access token authorizing the app to access resources on behalf of a user
val ecwidStoreId : kotlin.String = 1 // kotlin.String | Store Id
val lazadaAppId : kotlin.String = 112577 // kotlin.String | Lazada App ID
val lazadaAppSecret : kotlin.String = er33raICJ79Q5b0EsR9stmRnjE9XQ2WH // kotlin.String | Lazada App Secret
val lazadaRefreshToken : kotlin.String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUkcxw4zewU337mVVb5br // kotlin.String | Lazada Refresh Token
val lazadaRegion : kotlin.String = Malaysia // kotlin.String | Lazada API endpoint Region
val etsyKeystring : kotlin.String = a9psel85v1wy5faeyjw03y0r // kotlin.String | Etsy keystring
val etsySharedSecret : kotlin.String = gmz3iz45x2 // kotlin.String | Etsy shared secret
val etsyAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Access token authorizing the app to access resources on behalf of a user
val etsyTokenSecret : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Secret token authorizing the app to access resources on behalf of a user
val etsyClientId : kotlin.String = w0fi0igk2w29bjcd7ydr2s35 // kotlin.String | Etsy Client Id
val etsyRefreshToken : kotlin.String = 223577551.L07_RE-y7unmKf2dox4djsHkVxwpUfs1ikG_uQmHhF-aASEReNn_Qns1Wqn3dDa0ZMxrt9CIael3dgudeDZb31ZUdS // kotlin.String | Etsy Refresh token
val facebookAppId : kotlin.String = 6516912365277570 // kotlin.String | Facebook App ID
val facebookAppSecret : kotlin.String = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b // kotlin.String | Facebook App Secret
val facebookAccessToken : kotlin.String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUAhqbS58clzJwyp1rYRMpP31QJGziqtYbKypdVx3Cs0RpuufoUeLsbfX195XIB8VTlkcxw4zewU337mVVb5br // kotlin.String | Facebook Access Token
val facebookBusinessId : kotlin.String = 294042786906655 // kotlin.String | Facebook Business ID
val netoApiKey : kotlin.String = bbca57d8ff3c3677128112c15556d9e3 // kotlin.String | Neto API Key
val netoApiUsername : kotlin.String = mylogin // kotlin.String | Neto User Name
val shoplineAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Shopline APP Key
val shoplineAppKey : kotlin.String = 737cf6bd2879cb6c7e5a8ff9cd63f3d46b0b5b7b // kotlin.String | Shopline APP Key
val shoplineAppSecret : kotlin.String = 1701d123bb5cc14cd2732dcaed90638316c0a09 // kotlin.String | Shopline App Secret
val shoplineSharedSecret : kotlin.String = 1701d123bb5cc14cd2732dcaed90638316c0a09 // kotlin.String | Shopline Shared Secret
val shopifyAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Access token authorizing the app to access resources on behalf of a user
val shopifyApiKey : kotlin.String = bbca57d8ff3c3677128112c15556d9e3 // kotlin.String | Shopify API Key
val shopifyApiPassword : kotlin.String = 860f3a6fc87632301a42cd88e4b5ab3d // kotlin.String | Shopify API Password
val shopifySharedSecret : kotlin.String = gmz3iz45x2 // kotlin.String | Shared secret
val shopeePartnerId : kotlin.String = 1276777 // kotlin.String | Shopee Partner ID
val shopeePartnerKey : kotlin.String = 6a46494b4d746576554646626775617a577542774850636375464d6a736d5598 // kotlin.String | Shopee Partner Key
val shopeeShopId : kotlin.String = 137968 // kotlin.String | Shopee SHOP ID
val shopeeRefreshToken : kotlin.String = EAAPP06rM2n8BO4mZBuMPnu9zS0MaMbN7ue8aUkcxw4zewU987mVVb5br // kotlin.String | Shopee Refresh Token
val shopeeRegion : kotlin.String = CN // kotlin.String | Shopee API endpoint Region. Use for Chinese Mainland or Brazil.
val shopeeEnvironment : kotlin.String = sandbox // kotlin.String | Shopee Environment
val shoplazzaAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Access token authorizing the app to access resources on behalf of a user
val shoplazzaSharedSecret : kotlin.String = gmz3iz45x2 // kotlin.String | Shared secret
val mivaAccessToken : kotlin.String = 227cbe434a1e358d72db0de993x9d9fd // kotlin.String | Miva access token
val mivaSignature : kotlin.String = 1hpkrebfdsObGTor/0Gk9XcNBUQohrxrw67Sg9AM9ps= // kotlin.String | Miva signature
val shopwareAccessKey : kotlin.String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // kotlin.String | Shopware access key
val shopwareApiKey : kotlin.String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // kotlin.String | Shopware api key
val shopwareApiSecret : kotlin.String = V3NYNWg2b1dZdHBUWDN1cmdKdGhnenp5enVJYlJ0WlJvOFF2bnQ // kotlin.String | Shopware client secret access key
val bigcartelUserName : kotlin.String = subdomain // kotlin.String | Subdomain of store
val bigcartelPassword : kotlin.String = 4GrrZCLNNoSUuhAjesKuchxo9SL // kotlin.String | BigCartel account password
val bricklinkConsumerKey : kotlin.String = 26F6CDA087D9444EAA71AC09E7A1D39A // kotlin.String | Bricklink Consumer Key
val bricklinkConsumerSecret : kotlin.String = a46abc3kxyinlbggy06i9g975xqo6gjq // kotlin.String | Bricklink Consumer Secret
val bricklinkToken : kotlin.String = ktv4n9rgrj0evjuy2t6p2xlb1f8u5pmy // kotlin.String | Bricklink Access Token
val bricklinkTokenSecret : kotlin.String = a46abc3kxyinlbggy06i9g975xqo6gjq // kotlin.String | Bricklink Access Token Secret
val volusionLogin : kotlin.String = admin // kotlin.String | It's a Volusion account for which API is enabled
val volusionPassword : kotlin.String = 7943CA5F3990E00D9A4CCF0BD998211F // kotlin.String | Volusion API Password
val walmartClientId : kotlin.String = 423f6A24-123z-8654-989u-6fa96478289 // kotlin.String | Walmart client ID. For the region 'ca' use Consumer ID
val walmartClientSecret : kotlin.String = 1gf85fea-8974-2648-w12w-rt54284tdf54 // kotlin.String | Walmart client secret. For the region 'ca' use Private Key
val walmartEnvironment : kotlin.String = production // kotlin.String | Walmart environment
val walmartChannelType : kotlin.String = 0f3e4dd4-0514-4346-b39d-af0e00ea066d // kotlin.String | Walmart WM_CONSUMER.CHANNEL.TYPE header
val walmartRegion : kotlin.String = us // kotlin.String | Walmart region
val squareClientId : kotlin.String = sq0idp-qwer_1pvuTYe9cAf1lmxyQ // kotlin.String | Square (Weebly) Client ID
val squareClientSecret : kotlin.String = c8d7077fce7b2b111111111898170695a01473a2ad // kotlin.String | Square (Weebly) Client Secret
val squareRefreshToken : kotlin.String = EQAAlquVXMr6xIcPu7qPkIEAZ0thqChhQuowrvZIqOlwhOwhtmyh4ZRfesdRc434 // kotlin.String | Square (Weebly) Refresh Token
val squarespaceApiKey : kotlin.String = 8f7849d5-1411-47f2-9722-aa81c2a48d95 // kotlin.String | Squarespace API Key
val squarespaceClientId : kotlin.String = 9UGbUtS2V96BxRGmfOjsGAhTdsr9Vxxx // kotlin.String | Squarespace Connector Client ID
val squarespaceClientSecret : kotlin.String = GPZkUFkIKWg0KLE6rajsFMMYA9ma0udaaq2bYwBDXXX= // kotlin.String | Squarespace Connector Client Secret
val squarespaceAccessToken : kotlin.String = SWSCS3O1RJBSRNBYQLFIYJN2ZQ // kotlin.String | Squarespace access token
val squarespaceRefreshToken : kotlin.String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // kotlin.String | Squarespace refresh token
val hybrisClientId : kotlin.String = api_client_1 // kotlin.String | Omni Commerce Connector Client ID
val hybrisClientSecret : kotlin.String = secret_phrase_1 // kotlin.String | Omni Commerce Connector Client Secret
val hybrisUsername : kotlin.String = admin // kotlin.String | User Name
val hybrisPassword : kotlin.String = nimda // kotlin.String | User password
val hybrisWebsites : kotlin.collections.List<kotlin.String> = hybris_websites[0][uid]=apparel-website&hybris_websites[0][url]=https://apparel.local/yacceleratorstorefront&hybris_websites[0][storeIds][0]=apparel-de&hybris_websites[0][storeIds][1]=apparel-uk // kotlin.collections.List<kotlin.String> | Websites to stores mapping data
val lightspeedApiKey : kotlin.String = cf5444729c2abd6b6a5d983691767cb5 // kotlin.String | LightSpeed api key
val lightspeedApiSecret : kotlin.String = 2620ee52a8bc942f9d5d3a575f4d363e // kotlin.String | LightSpeed api secret
val commercehqApiKey : kotlin.String = sJrD-LM0eddhe63rfgfva0dDydXfre4 // kotlin.String | CommerceHQ api key
val commercehqApiPassword : kotlin.String = 4Grr_ZCLNNoSUuhAjesKuchxo9SL // kotlin.String | CommerceHQ api password
val wcConsumerKey : kotlin.String = ck_26d8e2ad604f3917e429df6961722282bdcf109d // kotlin.String | Woocommerce consumer key
val wcConsumerSecret : kotlin.String = cs_931ced666118a15c5f7b4a33a15gf5589cbeba55 // kotlin.String | Woocommerce consumer secret
val magentoConsumerKey : kotlin.String = ktv4n9rgrj0evjuy2t6p2xlb1f8u5pmy // kotlin.String | Magento Consumer Key
val magentoConsumerSecret : kotlin.String = a46abc3kxyinlbggy06i9g975xqo6gjq // kotlin.String | Magento Consumer Secret
val magentoAccessToken : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Magento Access Token
val magentoTokenSecret : kotlin.String = igse8e4rdmzkxdi937qe69d59en1imw // kotlin.String | Magento Token Secret
val prestashopWebserviceKey : kotlin.String = CKJ1ZEWRJWRLTPVBQJ9FGGRORD4AGS96 // kotlin.String | Prestashop webservice key
val wixAppId : kotlin.String = 6b0b5b7b-7d87-45b5-bf34-ac6b438e63da // kotlin.String | Wix App ID
val wixAppSecretKey : kotlin.String = 316c0a09-f195-42be-74f6-a02cebb9cae6 // kotlin.String | Wix App Secret Key
val wixInstanceId : kotlin.String = 58b893a4-6b16-5c2f-qt78-qa3r61t32rt8 // kotlin.String | Wix Instance ID
val wixRefreshToken : kotlin.String = 
        OAUTH2.eyJraWQiOiJkZ0x3cjNRMCIsImFsZyI6IkhTMjU2In0.
        eyJkYXRhIjoie1wiaWRcIjpcImJlZjM3MmRmLTUyNGItNDI3NS05M2RkL
        Tg4NDBlOTU3ZWU2OFwifSIsImlhdCI6MTY0ODA0NTEyNiwiZXhwIjoxNzExMTE3MTI2fQ.
        VRR2lGSbcTVmaArtmyyhy6o4WRDwTn-nlDCQpZ97eYw
       // kotlin.String | Wix refresh token
val mercadoLibreAppId : kotlin.String = 211188015100135 // kotlin.String | Mercado Libre App ID
val mercadoLibreAppSecretKey : kotlin.String = e2qoG2zklLlfP7cEngEJ94YjhkejkjAm // kotlin.String | Mercado Libre App Secret Key
val mercadoLibreRefreshToken : kotlin.String = TG-63h13529vb5464110188d2x9-703754376 // kotlin.String | Mercado Libre Refresh Token
val zidClientId : kotlin.Int = 1234 // kotlin.Int | Zid Client ID
val zidClientSecret : kotlin.String = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs // kotlin.String | Zid Client Secret
val zidAccessToken : kotlin.String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // kotlin.String | Zid Access Token
val zidAuthorization : kotlin.String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // kotlin.String | Zid Authorization
val zidRefreshToken : kotlin.String = def50eyfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe657e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65d7e64a0cfe9fe65de64a0c865d // kotlin.String | Zid refresh token
val flipkartClientId : kotlin.String = 19414773883a13a850b6a52350b7246499a24 // kotlin.String | Flipkart Client ID
val flipkartClientSecret : kotlin.String = nl5l1lE0vxgv6cV111fHsdlOOIfb0Ms5IR7l4Igs // kotlin.String | Flipkart Client Secret
val allegroClientId : kotlin.String = 2915e189ce3d23d23d2327d204ae6a0bd // kotlin.String | Allegro Client ID
val allegroClientSecret : kotlin.String = DNHtqdL2WPIefeUhQWYgtXPS23fgbfgasdsGHHJGhg3RTFDQWFGZmVoFRT5IfkQj1E7eR5 // kotlin.String | Allegro Client Secret
val allegroAccessToken : kotlin.String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // kotlin.String | Allegro Access Token
val allegroRefreshToken : kotlin.String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // kotlin.String | Allegro Refresh Token
val allegroEnvironment : kotlin.String = sandbox // kotlin.String | Allegro Environment
val zohoClientId : kotlin.String = 1000.FLCHGI2LS1111111TOR4OGB697W4IX // kotlin.String | Zoho Client ID
val zohoClientSecret : kotlin.String = c8d7077fce7b2b111111111898170695a01473a2ad // kotlin.String | Zoho Client Secret
val zohoRefreshToken : kotlin.String = 1000.11111111111111111111111111111111.1b3ca6f054341a111118abf928beb33b // kotlin.String | Zoho Refresh Token
val zohoRegion : kotlin.String = Europe // kotlin.String | Zoho API endpoint Region
val tiendanubeUserId : kotlin.Int = 1234 // kotlin.Int | Tiendanube User ID
val tiendanubeAccessToken : kotlin.String = 75bde7bb0b437475423e7e87c142c06052f80199 // kotlin.String | Tiendanube Access Token
val tiendanubeClientSecret : kotlin.String = 5e3588f514a5ae0d0fa063d1b556531e25c83fa7e47472ed // kotlin.String | Tiendanube Client Secret
val ottoClientId : kotlin.String = 911a3dbf-d261-4763-cc81-052876465b55 // kotlin.String | Otto Client ID
val ottoClientSecret : kotlin.String = 9887a82a-2879-421e-a6wc-54e986b3458c // kotlin.String | Otto Client Secret
val ottoAppId : kotlin.String = 6eaef6a3-822e-425b-8mc9-53750063e34d // kotlin.String | Otto App ID
val ottoRefreshToken : kotlin.String = eyJhbGciOiJSUzI1NiIsInR5cCI6IsfddfdfdeyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // kotlin.String | Otto Refresh Token
val ottoEnvironment : kotlin.String = sandbox // kotlin.String | Otto Environment
val ottoAccessToken : kotlin.String = eyJhbGciOiJS34535f45f54f5656deyJ1c2VyX25hbWUiOiI5NDUxMzE1MSIsInNjb3BlIjpbImFsbGVncm86YXBpOm9yZGVyczpyZWFkIiwiYWxsZWdybzphcGk6cHJvZmlsZTp3cml0ZSIsImFsbGVncm86YXBpOnNhbGU6b2ZmZXJzOndyaXRlIiwiYWxsZWdybzphcGk6YmlsbGluZzpyZWFkIiwiYWxsZWdybzphcGk6Y2FtcGFpZ25zIiwiYWxsZWdybzphcGk6ZGlzcHV0ZXMiLCJhbGxlZ3JvOmFwaTpzYWxlOm9mZmVyczpyZWFkIiwiYWxsZWdybzphcGk6YmlkcyIsImFsbGVncm86YXBpOm9yZGVyczp3cml0ZSIsImFsbGVncm86YXBpOnBheW1lbnRzOndyaXRlIiwiYWxsZWdybzphcGk6c2FsZTpzZXR0aW5nczp3cml0ZSIsImFsbGVncm86YXBpOnByb2ZpbGU6cmVhZCIsImFsbGVncm86YXBpOnJhdGluZ3MiLCJhbGxlZ3JvOmFwaTpzYWxlOnNldHRpbmdzOnJlYWQiLCJhbGxlZ3JvOmFwaTpwYXltZW50czpyZWFkIiwiYWxsZWdybzphcGk6bWVzc2FnaW5nIl0sI // kotlin.String | Otto Access Token
val tiktokshopAppKey : kotlin.String = 6arbhkzno8nbv // kotlin.String | TikTok Shop App Key
val tiktokshopAppSecret : kotlin.String = d95820a05a0cd54fb394fcd26fgat63999b183bc // kotlin.String | TikTok Shop App Secret
val tiktokshopRefreshToken : kotlin.String = TTP_NTUxZTNhYTQ2ZDk2YmRmZWNmYWY2YWY12345NGYwNjQ3YjkzYTllYjA0YmNlMw // kotlin.String | TikTok Shop Refresh Token
val tiktokshopAccessToken : kotlin.String = TTP_Fw8r12345kW03FYd09DG-9INtpw361hWthei12345iPJ5AUv99fLSCYD9-Uu12345TgNRzKZxi5-tfFMtdWqglEt5_iCk // kotlin.String | TikTok Shop Access Token
val sallaClientId : kotlin.String = 1bxxxcf9-5xx4-xxx-bxxf-929b8xxxxe11 // kotlin.String | Salla Client ID
val sallaClientSecret : kotlin.String = 8x88axxxc25e1fxxxa1c06fxxx150xx5 // kotlin.String | Salla Client Secret
val sallaRefreshToken : kotlin.String = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc // kotlin.String | Salla Refresh Token
val sallaAccessToken : kotlin.String = oxy_rt_zxxxxiY2xxZWWxxxxlU-tROxxxxx2JzS2fwzxxxxxkU.p3xxxkCIyFexxxxP50WwZYfhw5_wg1xxxxV5F-8xxXc // kotlin.String | Salla Access Token
val temuAppKey : kotlin.String = 4ebbc9190ae410443d65b4c2faca9811 // kotlin.String | Temu App Key
val temuAppSecret : kotlin.String = 4782d2d827276688bf4758bed55dbdd4bbe79a78 // kotlin.String | Temu App Secret
val temuAccessToken : kotlin.String = uplv3hfyt5kcwoymrgnajnbl1ow5qxlz4sqhev6hl3xosz5dejrtyl2jre6 // kotlin.String | Temu Access Token
val temuRegion : kotlin.String = US // kotlin.String | Temu API endpoint Region.
try {
    val result : AccountConfigUpdate200Response = apiInstance.accountConfigUpdate(replaceParameters, newStoreUrl, newStoreKey, bridgeUrl, storeRoot, dbTablesPrefix, userAgent, `3dcartPrivateKey`, `3dcartAccessToken`, `3dcartapiApiKey`, amazonSpClientId, amazonSpClientSecret, amazonSpRefreshToken, amazonSpAwsRegion, amazonSpApiEnvironment, amazonSellerId, aspdotnetstorefrontApiUser, aspdotnetstorefrontApiPass, bigcommerceapiAdminAccount, bigcommerceapiApiPath, bigcommerceapiApiKey, bigcommerceapiClientId, bigcommerceapiAccessToken, bigcommerceapiContext, bolApiKey, bolApiSecret, bolRetailerId, demandwareClientId, demandwareApiPassword, demandwareUserName, demandwareUserPassword, ebayClientId, ebayClientSecret, ebayRuname, ebayAccessToken, ebayRefreshToken, ebayEnvironment, ebaySiteId, ecwidAcessToken, ecwidStoreId, lazadaAppId, lazadaAppSecret, lazadaRefreshToken, lazadaRegion, etsyKeystring, etsySharedSecret, etsyAccessToken, etsyTokenSecret, etsyClientId, etsyRefreshToken, facebookAppId, facebookAppSecret, facebookAccessToken, facebookBusinessId, netoApiKey, netoApiUsername, shoplineAccessToken, shoplineAppKey, shoplineAppSecret, shoplineSharedSecret, shopifyAccessToken, shopifyApiKey, shopifyApiPassword, shopifySharedSecret, shopeePartnerId, shopeePartnerKey, shopeeShopId, shopeeRefreshToken, shopeeRegion, shopeeEnvironment, shoplazzaAccessToken, shoplazzaSharedSecret, mivaAccessToken, mivaSignature, shopwareAccessKey, shopwareApiKey, shopwareApiSecret, bigcartelUserName, bigcartelPassword, bricklinkConsumerKey, bricklinkConsumerSecret, bricklinkToken, bricklinkTokenSecret, volusionLogin, volusionPassword, walmartClientId, walmartClientSecret, walmartEnvironment, walmartChannelType, walmartRegion, squareClientId, squareClientSecret, squareRefreshToken, squarespaceApiKey, squarespaceClientId, squarespaceClientSecret, squarespaceAccessToken, squarespaceRefreshToken, hybrisClientId, hybrisClientSecret, hybrisUsername, hybrisPassword, hybrisWebsites, lightspeedApiKey, lightspeedApiSecret, commercehqApiKey, commercehqApiPassword, wcConsumerKey, wcConsumerSecret, magentoConsumerKey, magentoConsumerSecret, magentoAccessToken, magentoTokenSecret, prestashopWebserviceKey, wixAppId, wixAppSecretKey, wixInstanceId, wixRefreshToken, mercadoLibreAppId, mercadoLibreAppSecretKey, mercadoLibreRefreshToken, zidClientId, zidClientSecret, zidAccessToken, zidAuthorization, zidRefreshToken, flipkartClientId, flipkartClientSecret, allegroClientId, allegroClientSecret, allegroAccessToken, allegroRefreshToken, allegroEnvironment, zohoClientId, zohoClientSecret, zohoRefreshToken, zohoRegion, tiendanubeUserId, tiendanubeAccessToken, tiendanubeClientSecret, ottoClientId, ottoClientSecret, ottoAppId, ottoRefreshToken, ottoEnvironment, ottoAccessToken, tiktokshopAppKey, tiktokshopAppSecret, tiktokshopRefreshToken, tiktokshopAccessToken, sallaClientId, sallaClientSecret, sallaRefreshToken, sallaAccessToken, temuAppKey, temuAppSecret, temuAccessToken, temuRegion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountConfigUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountConfigUpdate")
    e.printStackTrace()
}
```

### Parameters
| **replaceParameters** | **kotlin.Boolean**| Identifies if there is a necessity to replace parameters | [optional] |
| **newStoreUrl** | **kotlin.String**| The web address of the store you want to update to connect to API2Cart | [optional] |
| **newStoreKey** | **kotlin.String**| Update store key | [optional] |
| **bridgeUrl** | **kotlin.String**| This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) | [optional] |
| **storeRoot** | **kotlin.String**| Absolute path to the store root directory (used with \&quot;bridge_url\&quot; parameter) | [optional] |
| **dbTablesPrefix** | **kotlin.String**| DB tables prefix | [optional] |
| **userAgent** | **kotlin.String**| This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store&#39;s firewall may block specific values. | [optional] |
| **&#x60;3dcartPrivateKey&#x60;** | **kotlin.String**| 3DCart Private Key | [optional] |
| **&#x60;3dcartAccessToken&#x60;** | **kotlin.String**| 3DCart Token | [optional] |
| **&#x60;3dcartapiApiKey&#x60;** | **kotlin.String**| 3DCart API Key | [optional] |
| **amazonSpClientId** | **kotlin.String**| Amazon SP API app client id | [optional] |
| **amazonSpClientSecret** | **kotlin.String**| Amazon SP API app client secret | [optional] |
| **amazonSpRefreshToken** | **kotlin.String**| Amazon SP API OAuth refresh token | [optional] |
| **amazonSpAwsRegion** | **kotlin.String**| Amazon AWS Region | [optional] |
| **amazonSpApiEnvironment** | **kotlin.String**| Amazon SP API environment | [optional] [default to &quot;production&quot;] |
| **amazonSellerId** | **kotlin.String**| Amazon Seller ID (Merchant token) | [optional] |
| **aspdotnetstorefrontApiUser** | **kotlin.String**| It&#39;s a AspDotNetStorefront account for which API is available | [optional] |
| **aspdotnetstorefrontApiPass** | **kotlin.String**| AspDotNetStorefront API Password | [optional] |
| **bigcommerceapiAdminAccount** | **kotlin.String**| It&#39;s a BigCommerce account for which API is enabled | [optional] |
| **bigcommerceapiApiPath** | **kotlin.String**| BigCommerce API URL | [optional] |
| **bigcommerceapiApiKey** | **kotlin.String**| Bigcommerce API Key | [optional] |
| **bigcommerceapiClientId** | **kotlin.String**| Client ID of the requesting app | [optional] |
| **bigcommerceapiAccessToken** | **kotlin.String**| Access token authorizing the app to access resources on behalf of a user | [optional] |
| **bigcommerceapiContext** | **kotlin.String**| API Path section unique to the store | [optional] |
| **bolApiKey** | **kotlin.String**| Bol API Key | [optional] |
| **bolApiSecret** | **kotlin.String**| Bol API Secret | [optional] |
| **bolRetailerId** | **kotlin.Int**| Bol Retailer ID | [optional] |
| **demandwareClientId** | **kotlin.String**| Demandware client id | [optional] |
| **demandwareApiPassword** | **kotlin.String**| Demandware api password | [optional] |
| **demandwareUserName** | **kotlin.String**| Demandware user name | [optional] |
| **demandwareUserPassword** | **kotlin.String**| Demandware user password | [optional] |
| **ebayClientId** | **kotlin.String**| Application ID (AppID). | [optional] |
| **ebayClientSecret** | **kotlin.String**| Shared Secret from eBay application | [optional] |
| **ebayRuname** | **kotlin.String**| The RuName value that eBay assigns to your application. | [optional] |
| **ebayAccessToken** | **kotlin.String**| Used to authenticate API requests. | [optional] |
| **ebayRefreshToken** | **kotlin.String**| Used to renew the access token. | [optional] |
| **ebayEnvironment** | **kotlin.String**| eBay environment | [optional] |
| **ebaySiteId** | **kotlin.Int**| eBay global ID | [optional] [default to 0] |
| **ecwidAcessToken** | **kotlin.String**| Access token authorizing the app to access resources on behalf of a user | [optional] |
| **ecwidStoreId** | **kotlin.String**| Store Id | [optional] |
| **lazadaAppId** | **kotlin.String**| Lazada App ID | [optional] |
| **lazadaAppSecret** | **kotlin.String**| Lazada App Secret | [optional] |
| **lazadaRefreshToken** | **kotlin.String**| Lazada Refresh Token | [optional] |
| **lazadaRegion** | **kotlin.String**| Lazada API endpoint Region | [optional] |
| **etsyKeystring** | **kotlin.String**| Etsy keystring | [optional] |
| **etsySharedSecret** | **kotlin.String**| Etsy shared secret | [optional] |
| **etsyAccessToken** | **kotlin.String**| Access token authorizing the app to access resources on behalf of a user | [optional] |
| **etsyTokenSecret** | **kotlin.String**| Secret token authorizing the app to access resources on behalf of a user | [optional] |
| **etsyClientId** | **kotlin.String**| Etsy Client Id | [optional] |
| **etsyRefreshToken** | **kotlin.String**| Etsy Refresh token | [optional] |
| **facebookAppId** | **kotlin.String**| Facebook App ID | [optional] |
| **facebookAppSecret** | **kotlin.String**| Facebook App Secret | [optional] |
| **facebookAccessToken** | **kotlin.String**| Facebook Access Token | [optional] |
| **facebookBusinessId** | **kotlin.String**| Facebook Business ID | [optional] |
| **netoApiKey** | **kotlin.String**| Neto API Key | [optional] |
| **netoApiUsername** | **kotlin.String**| Neto User Name | [optional] |
| **shoplineAccessToken** | **kotlin.String**| Shopline APP Key | [optional] |
| **shoplineAppKey** | **kotlin.String**| Shopline APP Key | [optional] |
| **shoplineAppSecret** | **kotlin.String**| Shopline App Secret | [optional] |
| **shoplineSharedSecret** | **kotlin.String**| Shopline Shared Secret | [optional] |
| **shopifyAccessToken** | **kotlin.String**| Access token authorizing the app to access resources on behalf of a user | [optional] |
| **shopifyApiKey** | **kotlin.String**| Shopify API Key | [optional] |
| **shopifyApiPassword** | **kotlin.String**| Shopify API Password | [optional] |
| **shopifySharedSecret** | **kotlin.String**| Shared secret | [optional] |
| **shopeePartnerId** | **kotlin.String**| Shopee Partner ID | [optional] |
| **shopeePartnerKey** | **kotlin.String**| Shopee Partner Key | [optional] |
| **shopeeShopId** | **kotlin.String**| Shopee SHOP ID | [optional] |
| **shopeeRefreshToken** | **kotlin.String**| Shopee Refresh Token | [optional] |
| **shopeeRegion** | **kotlin.String**| Shopee API endpoint Region. Use for Chinese Mainland or Brazil. | [optional] |
| **shopeeEnvironment** | **kotlin.String**| Shopee Environment | [optional] |
| **shoplazzaAccessToken** | **kotlin.String**| Access token authorizing the app to access resources on behalf of a user | [optional] |
| **shoplazzaSharedSecret** | **kotlin.String**| Shared secret | [optional] |
| **mivaAccessToken** | **kotlin.String**| Miva access token | [optional] |
| **mivaSignature** | **kotlin.String**| Miva signature | [optional] |
| **shopwareAccessKey** | **kotlin.String**| Shopware access key | [optional] |
| **shopwareApiKey** | **kotlin.String**| Shopware api key | [optional] |
| **shopwareApiSecret** | **kotlin.String**| Shopware client secret access key | [optional] |
| **bigcartelUserName** | **kotlin.String**| Subdomain of store | [optional] |
| **bigcartelPassword** | **kotlin.String**| BigCartel account password | [optional] |
| **bricklinkConsumerKey** | **kotlin.String**| Bricklink Consumer Key | [optional] |
| **bricklinkConsumerSecret** | **kotlin.String**| Bricklink Consumer Secret | [optional] |
| **bricklinkToken** | **kotlin.String**| Bricklink Access Token | [optional] |
| **bricklinkTokenSecret** | **kotlin.String**| Bricklink Access Token Secret | [optional] |
| **volusionLogin** | **kotlin.String**| It&#39;s a Volusion account for which API is enabled | [optional] |
| **volusionPassword** | **kotlin.String**| Volusion API Password | [optional] |
| **walmartClientId** | **kotlin.String**| Walmart client ID. For the region &#39;ca&#39; use Consumer ID | [optional] |
| **walmartClientSecret** | **kotlin.String**| Walmart client secret. For the region &#39;ca&#39; use Private Key | [optional] |
| **walmartEnvironment** | **kotlin.String**| Walmart environment | [optional] [default to &quot;production&quot;] |
| **walmartChannelType** | **kotlin.String**| Walmart WM_CONSUMER.CHANNEL.TYPE header | [optional] |
| **walmartRegion** | **kotlin.String**| Walmart region | [optional] [default to &quot;us&quot;] |
| **squareClientId** | **kotlin.String**| Square (Weebly) Client ID | [optional] |
| **squareClientSecret** | **kotlin.String**| Square (Weebly) Client Secret | [optional] |
| **squareRefreshToken** | **kotlin.String**| Square (Weebly) Refresh Token | [optional] |
| **squarespaceApiKey** | **kotlin.String**| Squarespace API Key | [optional] |
| **squarespaceClientId** | **kotlin.String**| Squarespace Connector Client ID | [optional] |
| **squarespaceClientSecret** | **kotlin.String**| Squarespace Connector Client Secret | [optional] |
| **squarespaceAccessToken** | **kotlin.String**| Squarespace access token | [optional] |
| **squarespaceRefreshToken** | **kotlin.String**| Squarespace refresh token | [optional] |
| **hybrisClientId** | **kotlin.String**| Omni Commerce Connector Client ID | [optional] |
| **hybrisClientSecret** | **kotlin.String**| Omni Commerce Connector Client Secret | [optional] |
| **hybrisUsername** | **kotlin.String**| User Name | [optional] |
| **hybrisPassword** | **kotlin.String**| User password | [optional] |
| **hybrisWebsites** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Websites to stores mapping data | [optional] |
| **lightspeedApiKey** | **kotlin.String**| LightSpeed api key | [optional] |
| **lightspeedApiSecret** | **kotlin.String**| LightSpeed api secret | [optional] |
| **commercehqApiKey** | **kotlin.String**| CommerceHQ api key | [optional] |
| **commercehqApiPassword** | **kotlin.String**| CommerceHQ api password | [optional] |
| **wcConsumerKey** | **kotlin.String**| Woocommerce consumer key | [optional] |
| **wcConsumerSecret** | **kotlin.String**| Woocommerce consumer secret | [optional] |
| **magentoConsumerKey** | **kotlin.String**| Magento Consumer Key | [optional] |
| **magentoConsumerSecret** | **kotlin.String**| Magento Consumer Secret | [optional] |
| **magentoAccessToken** | **kotlin.String**| Magento Access Token | [optional] |
| **magentoTokenSecret** | **kotlin.String**| Magento Token Secret | [optional] |
| **prestashopWebserviceKey** | **kotlin.String**| Prestashop webservice key | [optional] |
| **wixAppId** | **kotlin.String**| Wix App ID | [optional] |
| **wixAppSecretKey** | **kotlin.String**| Wix App Secret Key | [optional] |
| **wixInstanceId** | **kotlin.String**| Wix Instance ID | [optional] |
| **wixRefreshToken** | **kotlin.String**| Wix refresh token | [optional] |
| **mercadoLibreAppId** | **kotlin.String**| Mercado Libre App ID | [optional] |
| **mercadoLibreAppSecretKey** | **kotlin.String**| Mercado Libre App Secret Key | [optional] |
| **mercadoLibreRefreshToken** | **kotlin.String**| Mercado Libre Refresh Token | [optional] |
| **zidClientId** | **kotlin.Int**| Zid Client ID | [optional] |
| **zidClientSecret** | **kotlin.String**| Zid Client Secret | [optional] |
| **zidAccessToken** | **kotlin.String**| Zid Access Token | [optional] |
| **zidAuthorization** | **kotlin.String**| Zid Authorization | [optional] |
| **zidRefreshToken** | **kotlin.String**| Zid refresh token | [optional] |
| **flipkartClientId** | **kotlin.String**| Flipkart Client ID | [optional] |
| **flipkartClientSecret** | **kotlin.String**| Flipkart Client Secret | [optional] |
| **allegroClientId** | **kotlin.String**| Allegro Client ID | [optional] |
| **allegroClientSecret** | **kotlin.String**| Allegro Client Secret | [optional] |
| **allegroAccessToken** | **kotlin.String**| Allegro Access Token | [optional] |
| **allegroRefreshToken** | **kotlin.String**| Allegro Refresh Token | [optional] |
| **allegroEnvironment** | **kotlin.String**| Allegro Environment | [optional] [default to &quot;production&quot;] |
| **zohoClientId** | **kotlin.String**| Zoho Client ID | [optional] |
| **zohoClientSecret** | **kotlin.String**| Zoho Client Secret | [optional] |
| **zohoRefreshToken** | **kotlin.String**| Zoho Refresh Token | [optional] |
| **zohoRegion** | **kotlin.String**| Zoho API endpoint Region | [optional] |
| **tiendanubeUserId** | **kotlin.Int**| Tiendanube User ID | [optional] |
| **tiendanubeAccessToken** | **kotlin.String**| Tiendanube Access Token | [optional] |
| **tiendanubeClientSecret** | **kotlin.String**| Tiendanube Client Secret | [optional] |
| **ottoClientId** | **kotlin.String**| Otto Client ID | [optional] |
| **ottoClientSecret** | **kotlin.String**| Otto Client Secret | [optional] |
| **ottoAppId** | **kotlin.String**| Otto App ID | [optional] |
| **ottoRefreshToken** | **kotlin.String**| Otto Refresh Token | [optional] |
| **ottoEnvironment** | **kotlin.String**| Otto Environment | [optional] |
| **ottoAccessToken** | **kotlin.String**| Otto Access Token | [optional] |
| **tiktokshopAppKey** | **kotlin.String**| TikTok Shop App Key | [optional] |
| **tiktokshopAppSecret** | **kotlin.String**| TikTok Shop App Secret | [optional] |
| **tiktokshopRefreshToken** | **kotlin.String**| TikTok Shop Refresh Token | [optional] |
| **tiktokshopAccessToken** | **kotlin.String**| TikTok Shop Access Token | [optional] |
| **sallaClientId** | **kotlin.String**| Salla Client ID | [optional] |
| **sallaClientSecret** | **kotlin.String**| Salla Client Secret | [optional] |
| **sallaRefreshToken** | **kotlin.String**| Salla Refresh Token | [optional] |
| **sallaAccessToken** | **kotlin.String**| Salla Access Token | [optional] |
| **temuAppKey** | **kotlin.String**| Temu App Key | [optional] |
| **temuAppSecret** | **kotlin.String**| Temu App Secret | [optional] |
| **temuAccessToken** | **kotlin.String**| Temu Access Token | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **temuRegion** | **kotlin.String**| Temu API endpoint Region. | [optional] |

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

<a id="accountFailedWebhooks"></a>
# **accountFailedWebhooks**
> AccountFailedWebhooks200Response accountFailedWebhooks(start, count, ids)

account.failed_webhooks

If the callback of your service for some reason could not accept webhooks from API2Cart, then with the help of this method you can get a list of missed webhooks to perform synchronization again using entity_id. Please note that we keep such records for 24 hours.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
val ids : kotlin.String = 3,14,25 // kotlin.String | List of сomma-separated webhook ids
try {
    val result : AccountFailedWebhooks200Response = apiInstance.accountFailedWebhooks(start, count, ids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountFailedWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountFailedWebhooks")
    e.printStackTrace()
}
```

### Parameters
| **start** | **kotlin.Int**| This parameter sets the number from which you want to get entities | [optional] [default to 0] |
| **count** | **kotlin.Int**| This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | **kotlin.String**| List of сomma-separated webhook ids | [optional] |

### Return type

[**AccountFailedWebhooks200Response**](AccountFailedWebhooks200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="accountSupportedPlatforms"></a>
# **accountSupportedPlatforms**
> AccountSupportedPlatforms200Response accountSupportedPlatforms()

account.supported_platforms

Use this method to retrieve a list of supported platforms and the sets of parameters required for connecting to each of them. Note: some platforms may have multiple connection methods so that the response will contain multiple sets of parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountApi()
try {
    val result : AccountSupportedPlatforms200Response = apiInstance.accountSupportedPlatforms()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#accountSupportedPlatforms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#accountSupportedPlatforms")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSupportedPlatforms200Response**](AccountSupportedPlatforms200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

