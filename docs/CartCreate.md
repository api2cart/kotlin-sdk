
# CartCreate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cartId** | [**inline**](#CartId) | Store’s identifier which you can get from cart_list method |  |
| **storeId** | **kotlin.String** | Store Id |  |
| **wixAppId** | **kotlin.String** | Wix App ID |  |
| **wixAppSecretKey** | **kotlin.String** | Wix App Secret Key |  |
| **storeUrl** | **kotlin.String** | A web address of a store that you would like to connect to API2Cart |  [optional] |
| **bridgeUrl** | **kotlin.String** | This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) |  [optional] |
| **storeRoot** | **kotlin.String** | Absolute path to the store root directory (used with \&quot;bridge_url\&quot; parameter) |  [optional] |
| **storeKey** | **kotlin.String** | Set this parameter if bridge is already uploaded to store |  [optional] |
| **sharedSecret** | **kotlin.String** | Shared secret |  [optional] |
| **validateVersion** | **kotlin.Boolean** | Specify if api2cart should validate cart version |  [optional] |
| **verify** | **kotlin.Boolean** | Enables or disables cart&#39;s verification |  [optional] |
| **dbTablesPrefix** | **kotlin.String** | DB tables prefix |  [optional] |
| **userAgent** | **kotlin.String** | This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store&#39;s firewall may block specific values. |  [optional] |
| **ftpHost** | **kotlin.String** | FTP connection host |  [optional] |
| **ftpUser** | **kotlin.String** | FTP User |  [optional] |
| **ftpPassword** | **kotlin.String** | FTP Password |  [optional] |
| **ftpPort** | **kotlin.Int** | FTP Port |  [optional] |
| **ftpStoreDir** | **kotlin.String** | FTP Store dir |  [optional] |
| **apiKey3dcart** | **kotlin.String** | 3DCart API Key |  [optional] |
| **adminAccount** | **kotlin.String** | It&#39;s a BigCommerce account for which API is enabled |  [optional] |
| **apiPath** | **kotlin.String** | BigCommerce API URL |  [optional] |
| **apiKeyBigcommerce** | **kotlin.String** | Bigcommerce API Key |  [optional] |
| **clientId** | **kotlin.String** | Client ID of the requesting app |  [optional] |
| **accessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **context** | **kotlin.String** | API Path section unique to the store |  [optional] |
| **accessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **apiKeyShopify** | **kotlin.String** | Shopify API Key |  [optional] |
| **apiPassword** | **kotlin.String** | Shopify API Password |  [optional] |
| **accessTokenShopify** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **apiKey** | **kotlin.String** | Neto API Key |  [optional] |
| **apiUsername** | **kotlin.String** | Neto User Name |  [optional] |
| **encryptedPassword** | **kotlin.String** | Volusion API Password |  [optional] |
| **login** | **kotlin.String** | It&#39;s a Volusion account for which API is enabled |  [optional] |
| **apiUserAdnsf** | **kotlin.String** | It&#39;s a AspDotNetStorefront account for which API is available |  [optional] |
| **apiPass** | **kotlin.String** | AspDotNetStorefront API Password |  [optional] |
| **privateKey** | **kotlin.String** | 3DCart Application Private Key |  [optional] |
| **appToken** | **kotlin.String** | 3DCart Token from Application |  [optional] |
| **etsyKeystring** | **kotlin.String** | Etsy keystring |  [optional] |
| **etsySharedSecret** | **kotlin.String** | Etsy shared secret |  [optional] |
| **tokenSecret** | **kotlin.String** | Secret token authorizing the app to access resources on behalf of a user |  [optional] |
| **etsyClientId** | **kotlin.String** | Etsy Client Id |  [optional] |
| **etsyRefreshToken** | **kotlin.String** | Etsy Refresh token |  [optional] |
| **ebayClientId** | **kotlin.String** | Application ID (AppID). |  [optional] |
| **ebayClientSecret** | **kotlin.String** | Shared Secret from eBay application |  [optional] |
| **ebayRuname** | **kotlin.String** | The RuName value that eBay assigns to your application. |  [optional] |
| **ebayAccessToken** | **kotlin.String** | Used to authenticate API requests. |  [optional] |
| **ebayRefreshToken** | **kotlin.String** | Used to renew the access token. |  [optional] |
| **ebayEnvironment** | **kotlin.String** | eBay environment |  [optional] |
| **ebaySiteId** | **kotlin.Int** | eBay global ID |  [optional] |
| **dwClientId** | **kotlin.String** | Demandware client id |  [optional] |
| **dwApiPass** | **kotlin.String** | Demandware api password |  [optional] |
| **demandwareUserName** | **kotlin.String** | Demandware user name |  [optional] |
| **demandwareUserPassword** | **kotlin.String** | Demandware user password |  [optional] |
| **sellerId** | **kotlin.String** | Seller Id |  [optional] |
| **environment** | **kotlin.String** |  |  [optional] |
| **hybrisClientId** | **kotlin.String** | Omni Commerce Connector Client ID |  [optional] |
| **hybrisClientSecret** | **kotlin.String** | Omni Commerce Connector Client Secret |  [optional] |
| **hybrisUsername** | **kotlin.String** | User Name |  [optional] |
| **hybrisPassword** | **kotlin.String** | User password |  [optional] |
| **hybrisWebsites** | [**kotlin.collections.List&lt;AccountCartAddHybrisWebsitesInner&gt;**](AccountCartAddHybrisWebsitesInner.md) | Websites to stores mapping data |  [optional] |
| **walmartClientId** | **kotlin.String** | Walmart client ID. For the region &#39;ca&#39; use Consumer ID |  [optional] |
| **walmartClientSecret** | **kotlin.String** | Walmart client secret. For the region &#39;ca&#39; use Private Key |  [optional] |
| **walmartEnvironment** | **kotlin.String** | Walmart environment |  [optional] |
| **walmartChannelType** | **kotlin.String** | Walmart WM_CONSUMER.CHANNEL.TYPE header |  [optional] |
| **walmartRegion** | **kotlin.String** | Walmart region |  [optional] |
| **lightspeedApiKey** | **kotlin.String** | LightSpeed api key |  [optional] |
| **lightspeedApiSecret** | **kotlin.String** | LightSpeed api secret |  [optional] |
| **shoplazzaAccessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **shoplazzaSharedSecret** | **kotlin.String** | Shared secret |  [optional] |
| **shopwareAccessKey** | **kotlin.String** | Shopware access key |  [optional] |
| **shopwareApiKey** | **kotlin.String** | Shopware api key |  [optional] |
| **shopwareApiSecret** | **kotlin.String** | Shopware client secret access key |  [optional] |
| **commercehqApiKey** | **kotlin.String** | CommerceHQ api key |  [optional] |
| **commercehqApiPassword** | **kotlin.String** | CommerceHQ api password |  [optional] |
| **&#x60;3dcartPrivateKey&#x60;** | **kotlin.String** | 3DCart Private Key |  [optional] |
| **&#x60;3dcartAccessToken&#x60;** | **kotlin.String** | 3DCart Token |  [optional] |
| **wcConsumerKey** | **kotlin.String** | Woocommerce consumer key |  [optional] |
| **wcConsumerSecret** | **kotlin.String** | Woocommerce consumer secret |  [optional] |
| **magentoConsumerKey** | **kotlin.String** | Magento Consumer Key |  [optional] |
| **magentoConsumerSecret** | **kotlin.String** | Magento Consumer Secret |  [optional] |
| **magentoAccessToken** | **kotlin.String** | Magento Access Token |  [optional] |
| **magentoTokenSecret** | **kotlin.String** | Magento Token Secret |  [optional] |
| **prestashopWebserviceKey** | **kotlin.String** | Prestashop webservice key |  [optional] |
| **wixInstanceId** | **kotlin.String** | Wix Instance ID |  [optional] |
| **wixRefreshToken** | **kotlin.String** | Wix refresh token |  [optional] |
| **mercadoLibreAppId** | **kotlin.String** | Mercado Libre App ID |  [optional] |
| **mercadoLibreAppSecretKey** | **kotlin.String** | Mercado Libre App Secret Key |  [optional] |
| **mercadoLibreRefreshToken** | **kotlin.String** | Mercado Libre Refresh Token |  [optional] |
| **zidClientId** | **kotlin.Int** | Zid Client ID |  [optional] |
| **zidClientSecret** | **kotlin.String** | Zid Client Secret |  [optional] |
| **zidAccessToken** | **kotlin.String** | Zid Access Token |  [optional] |
| **zidAuthorization** | **kotlin.String** | Zid Authorization |  [optional] |
| **zidRefreshToken** | **kotlin.String** | Zid refresh token |  [optional] |
| **flipkartClientId** | **kotlin.String** | Flipkart Client ID |  [optional] |
| **flipkartClientSecret** | **kotlin.String** | Flipkart Client Secret |  [optional] |
| **allegroClientId** | **kotlin.String** | Allegro Client ID |  [optional] |
| **allegroClientSecret** | **kotlin.String** | Allegro Client Secret |  [optional] |
| **allegroAccessToken** | **kotlin.String** | Allegro Access Token |  [optional] |
| **allegroRefreshToken** | **kotlin.String** | Allegro Refresh Token |  [optional] |
| **allegroEnvironment** | **kotlin.String** | Allegro Environment |  [optional] |


<a id="CartId"></a>
## Enum: cart_id
| Name | Value |
| ---- | ----- |
| cartId | 3DCart, 3DCartApi, AceShop, AmazonSP, AspDotNetStorefront, BigcommerceApi, Bol, CommerceHQ, Creloaded, Cscart, Cubecart, Demandware, EBay, Ecwid, EtsyAPIv3, Flipkart, Gambio, Hybris, JooCart, Lazada, LightSpeed, Magento1212, Magento2Api, MercadoLibre, MijoShop, Miva, Neto, Opencart14, Oscmax2, Oscommerce22ms2, Otto, Oxid, Pinnacle, Prestashop, PrestashopApi, SSPremium, Salla, Shopify, Shoplazza, Shopline, Shopware, ShopwareApi, Square, Squarespace, Tiendanube, TikTokShop, Tomatocart, Ubercart, Virtuemart, Volusion, WPecommerce, Walmart, WebAsyst, Wix, Woocommerce, WoocommerceApi, Xcart, Xtcommerce, XtcommerceVeyton, Zencart137, Zid, Zoey, Zoho |



