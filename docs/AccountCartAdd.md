
# AccountCartAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cartId** | [**inline**](#CartId) | Store’s identifier which you can get from cart_list method |  |
| **storeUrl** | **kotlin.String** | A web address of a store that you would like to connect to API2Cart |  [optional] |
| **bridgeUrl** | **kotlin.String** | This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store) |  [optional] |
| **storeRoot** | **kotlin.String** | Absolute path to the store root directory (used with \&quot;bridge_url\&quot; parameter) |  [optional] |
| **storeKey** | **kotlin.String** | Set this parameter if bridge is already uploaded to store |  [optional] |
| **validateVersion** | **kotlin.Boolean** | Specify if api2cart should validate cart version |  [optional] |
| **verify** | **kotlin.Boolean** | Enables or disables cart&#39;s verification |  [optional] |
| **dbTablesPrefix** | **kotlin.String** | DB tables prefix |  [optional] |
| **userAgent** | **kotlin.String** | This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store&#39;s firewall may block specific values. |  [optional] |
| **ftpHost** | **kotlin.String** | FTP connection host |  [optional] |
| **ftpUser** | **kotlin.String** | FTP User |  [optional] |
| **ftpPassword** | **kotlin.String** | FTP Password |  [optional] |
| **ftpPort** | **kotlin.Int** | FTP Port |  [optional] |
| **ftpStoreDir** | **kotlin.String** | FTP Store dir |  [optional] |
| **&#x60;3dcartPrivateKey&#x60;** | **kotlin.String** | 3DCart Private Key |  [optional] |
| **&#x60;3dcartAccessToken&#x60;** | **kotlin.String** | 3DCart Token |  [optional] |
| **&#x60;3dcartapiApiKey&#x60;** | **kotlin.String** | 3DCart API Key |  [optional] |
| **amazonSpClientId** | **kotlin.String** | Amazon SP API app client id |  [optional] |
| **amazonSpClientSecret** | **kotlin.String** | Amazon SP API app client secret |  [optional] |
| **amazonSpRefreshToken** | **kotlin.String** | Amazon SP API OAuth refresh token |  [optional] |
| **amazonSpAwsRegion** | **kotlin.String** | Amazon AWS Region |  [optional] |
| **amazonSpApiEnvironment** | **kotlin.String** | Amazon SP API environment |  [optional] |
| **amazonSellerId** | **kotlin.String** | Amazon Seller ID (Merchant token) |  [optional] |
| **aspdotnetstorefrontApiUser** | **kotlin.String** | It&#39;s a AspDotNetStorefront account for which API is available |  [optional] |
| **aspdotnetstorefrontApiPass** | **kotlin.String** | AspDotNetStorefront API Password |  [optional] |
| **bigcommerceapiAdminAccount** | **kotlin.String** | It&#39;s a BigCommerce account for which API is enabled |  [optional] |
| **bigcommerceapiApiPath** | **kotlin.String** | BigCommerce API URL |  [optional] |
| **bigcommerceapiApiKey** | **kotlin.String** | Bigcommerce API Key |  [optional] |
| **bigcommerceapiClientId** | **kotlin.String** | Client ID of the requesting app |  [optional] |
| **bigcommerceapiAccessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **bigcommerceapiContext** | **kotlin.String** | API Path section unique to the store |  [optional] |
| **bolApiKey** | **kotlin.String** | Bol API Key |  [optional] |
| **bolApiSecret** | **kotlin.String** | Bol API Secret |  [optional] |
| **bolRetailerId** | **kotlin.Int** | Bol Retailer ID |  [optional] |
| **bigcartelUserName** | **kotlin.String** | Subdomain of store |  [optional] |
| **bigcartelPassword** | **kotlin.String** | BigCartel account password |  [optional] |
| **bricklinkConsumerKey** | **kotlin.String** | Bricklink Consumer Key |  [optional] |
| **bricklinkConsumerSecret** | **kotlin.String** | Bricklink Consumer Secret |  [optional] |
| **bricklinkToken** | **kotlin.String** | Bricklink Access Token |  [optional] |
| **bricklinkTokenSecret** | **kotlin.String** | Bricklink Access Token Secret |  [optional] |
| **demandwareClientId** | **kotlin.String** | Demandware client id |  [optional] |
| **demandwareApiPassword** | **kotlin.String** | Demandware api password |  [optional] |
| **demandwareUserName** | **kotlin.String** | Demandware user name |  [optional] |
| **demandwareUserPassword** | **kotlin.String** | Demandware user password |  [optional] |
| **ebayClientId** | **kotlin.String** | Application ID (AppID). |  [optional] |
| **ebayClientSecret** | **kotlin.String** | Shared Secret from eBay application |  [optional] |
| **ebayRuname** | **kotlin.String** | The RuName value that eBay assigns to your application. |  [optional] |
| **ebayAccessToken** | **kotlin.String** | Used to authenticate API requests. |  [optional] |
| **ebayRefreshToken** | **kotlin.String** | Used to renew the access token. |  [optional] |
| **ebayEnvironment** | **kotlin.String** | eBay environment |  [optional] |
| **ebaySiteId** | **kotlin.Int** | eBay global ID |  [optional] |
| **walmartClientId** | **kotlin.String** | Walmart client ID. For the region &#39;ca&#39; use Consumer ID |  [optional] |
| **walmartClientSecret** | **kotlin.String** | Walmart client secret. For the region &#39;ca&#39; use Private Key |  [optional] |
| **walmartEnvironment** | **kotlin.String** | Walmart environment |  [optional] |
| **walmartChannelType** | **kotlin.String** | Walmart WM_CONSUMER.CHANNEL.TYPE header |  [optional] |
| **walmartRegion** | **kotlin.String** | Walmart region |  [optional] |
| **ecwidAcessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **ecwidStoreId** | **kotlin.String** | Store Id |  [optional] |
| **lazadaAppId** | **kotlin.String** | Lazada App ID |  [optional] |
| **lazadaAppSecret** | **kotlin.String** | Lazada App Secret |  [optional] |
| **lazadaRefreshToken** | **kotlin.String** | Lazada Refresh Token |  [optional] |
| **lazadaRegion** | **kotlin.String** | Lazada API endpoint Region |  [optional] |
| **lightspeedApiKey** | **kotlin.String** | LightSpeed api key |  [optional] |
| **lightspeedApiSecret** | **kotlin.String** | LightSpeed api secret |  [optional] |
| **etsyKeystring** | **kotlin.String** | Etsy keystring |  [optional] |
| **etsySharedSecret** | **kotlin.String** | Etsy shared secret |  [optional] |
| **etsyAccessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **etsyTokenSecret** | **kotlin.String** | Secret token authorizing the app to access resources on behalf of a user |  [optional] |
| **etsyClientId** | **kotlin.String** | Etsy Client Id |  [optional] |
| **etsyRefreshToken** | **kotlin.String** | Etsy Refresh token |  [optional] |
| **facebookAppId** | **kotlin.String** | Facebook App ID |  [optional] |
| **facebookAppSecret** | **kotlin.String** | Facebook App Secret |  [optional] |
| **facebookAccessToken** | **kotlin.String** | Facebook Access Token |  [optional] |
| **facebookBusinessId** | **kotlin.String** | Facebook Business ID |  [optional] |
| **netoApiKey** | **kotlin.String** | Neto API Key |  [optional] |
| **netoApiUsername** | **kotlin.String** | Neto User Name |  [optional] |
| **shoplineAccessToken** | **kotlin.String** | Shopline APP Key |  [optional] |
| **shoplineAppKey** | **kotlin.String** | Shopline APP Key |  [optional] |
| **shoplineAppSecret** | **kotlin.String** | Shopline App Secret |  [optional] |
| **shoplineSharedSecret** | **kotlin.String** | Shopline Shared Secret |  [optional] |
| **shopifyAccessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **shopifyApiKey** | **kotlin.String** | Shopify API Key |  [optional] |
| **shopifyApiPassword** | **kotlin.String** | Shopify API Password |  [optional] |
| **shopifySharedSecret** | **kotlin.String** | Shared secret |  [optional] |
| **shopeePartnerId** | **kotlin.String** | Shopee Partner ID |  [optional] |
| **shopeePartnerKey** | **kotlin.String** | Shopee Partner Key |  [optional] |
| **shopeeShopId** | **kotlin.String** | Shopee SHOP ID |  [optional] |
| **shopeeRefreshToken** | **kotlin.String** | Shopee Refresh Token |  [optional] |
| **shopeeRegion** | **kotlin.String** | Shopee API endpoint Region. Use for Chinese Mainland or Brazil. |  [optional] |
| **shopeeEnvironment** | **kotlin.String** | Shopee Environment |  [optional] |
| **shoplazzaAccessToken** | **kotlin.String** | Access token authorizing the app to access resources on behalf of a user |  [optional] |
| **shoplazzaSharedSecret** | **kotlin.String** | Shared secret |  [optional] |
| **shopwareAccessKey** | **kotlin.String** | Shopware access key |  [optional] |
| **unasApiKey** | **kotlin.String** | UNAS API Key |  [optional] |
| **shopwareApiKey** | **kotlin.String** | Shopware api key |  [optional] |
| **shopwareApiSecret** | **kotlin.String** | Shopware client secret access key |  [optional] |
| **mivaAccessToken** | **kotlin.String** | Miva access token |  [optional] |
| **mivaSignature** | **kotlin.String** | Miva signature |  [optional] |
| **tiendanubeUserId** | **kotlin.Int** | Tiendanube User ID |  [optional] |
| **tiendanubeAccessToken** | **kotlin.String** | Tiendanube Access Token |  [optional] |
| **tiendanubeClientSecret** | **kotlin.String** | Tiendanube Client Secret |  [optional] |
| **volusionLogin** | **kotlin.String** | It&#39;s a Volusion account for which API is enabled |  [optional] |
| **volusionPassword** | **kotlin.String** | Volusion API Password |  [optional] |
| **hybrisClientId** | **kotlin.String** | Omni Commerce Connector Client ID |  [optional] |
| **hybrisClientSecret** | **kotlin.String** | Omni Commerce Connector Client Secret |  [optional] |
| **hybrisUsername** | **kotlin.String** | User Name |  [optional] |
| **hybrisPassword** | **kotlin.String** | User password |  [optional] |
| **hybrisWebsites** | [**kotlin.collections.List&lt;AccountCartAddHybrisWebsitesInner&gt;**](AccountCartAddHybrisWebsitesInner.md) | Websites to stores mapping data |  [optional] |
| **squareClientId** | **kotlin.String** | Square (Weebly) Client ID |  [optional] |
| **squareClientSecret** | **kotlin.String** | Square (Weebly) Client Secret |  [optional] |
| **squareRefreshToken** | **kotlin.String** | Square (Weebly) Refresh Token |  [optional] |
| **squarespaceApiKey** | **kotlin.String** | Squarespace API Key |  [optional] |
| **squarespaceClientId** | **kotlin.String** | Squarespace Connector Client ID |  [optional] |
| **squarespaceClientSecret** | **kotlin.String** | Squarespace Connector Client Secret |  [optional] |
| **squarespaceAccessToken** | **kotlin.String** | Squarespace access token |  [optional] |
| **squarespaceRefreshToken** | **kotlin.String** | Squarespace refresh token |  [optional] |
| **commercehqApiKey** | **kotlin.String** | CommerceHQ api key |  [optional] |
| **commercehqApiPassword** | **kotlin.String** | CommerceHQ api password |  [optional] |
| **wcConsumerKey** | **kotlin.String** | Woocommerce consumer key |  [optional] |
| **wcConsumerSecret** | **kotlin.String** | Woocommerce consumer secret |  [optional] |
| **magentoConsumerKey** | **kotlin.String** | Magento Consumer Key |  [optional] |
| **magentoConsumerSecret** | **kotlin.String** | Magento Consumer Secret |  [optional] |
| **magentoAccessToken** | **kotlin.String** | Magento Access Token |  [optional] |
| **magentoTokenSecret** | **kotlin.String** | Magento Token Secret |  [optional] |
| **prestashopWebserviceKey** | **kotlin.String** | Prestashop webservice key |  [optional] |
| **wixAppId** | **kotlin.String** | Wix App ID |  [optional] |
| **wixAppSecretKey** | **kotlin.String** | Wix App Secret Key |  [optional] |
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
| **zohoClientId** | **kotlin.String** | Zoho Client ID |  [optional] |
| **zohoClientSecret** | **kotlin.String** | Zoho Client Secret |  [optional] |
| **zohoRefreshToken** | **kotlin.String** | Zoho Refresh Token |  [optional] |
| **zohoRegion** | **kotlin.String** | Zoho API endpoint Region |  [optional] |
| **ottoClientId** | **kotlin.String** | Otto Client ID |  [optional] |
| **ottoClientSecret** | **kotlin.String** | Otto Client Secret |  [optional] |
| **ottoAppId** | **kotlin.String** | Otto App ID |  [optional] |
| **ottoRefreshToken** | **kotlin.String** | Otto Refresh Token |  [optional] |
| **ottoEnvironment** | **kotlin.String** | Otto Environment |  [optional] |
| **ottoAccessToken** | **kotlin.String** | Otto Access Token |  [optional] |
| **tiktokshopAppKey** | **kotlin.String** | TikTok Shop App Key |  [optional] |
| **tiktokshopAppSecret** | **kotlin.String** | TikTok Shop App Secret |  [optional] |
| **tiktokshopRefreshToken** | **kotlin.String** | TikTok Shop Refresh Token |  [optional] |
| **tiktokshopAccessToken** | **kotlin.String** | TikTok Shop Access Token |  [optional] |
| **sallaClientId** | **kotlin.String** | Salla Client ID |  [optional] |
| **sallaClientSecret** | **kotlin.String** | Salla Client Secret |  [optional] |
| **sallaRefreshToken** | **kotlin.String** | Salla Refresh Token |  [optional] |
| **sallaAccessToken** | **kotlin.String** | Salla Access Token |  [optional] |
| **temuAppKey** | **kotlin.String** | Temu App Key |  [optional] |
| **temuAppSecret** | **kotlin.String** | Temu App Secret |  [optional] |
| **temuAccessToken** | **kotlin.String** | Temu Access Token |  [optional] |
| **temuRegion** | **kotlin.String** | Temu API endpoint Region. |  [optional] |


<a id="CartId"></a>
## Enum: cart_id
| Name | Value |
| ---- | ----- |
| cartId | 3DCart, 3DCartApi, AceShop, AmazonSP, AspDotNetStorefront, BigCartel, Bricklink, BigcommerceApi, Bol, CommerceHQ, Creloaded, Cscart, Cubecart, Demandware, EBay, Ecwid, EtsyAPIv3, Facebook, Flipkart, Gambio, Hybris, JooCart, Lazada, LightSpeed, Magento1212, Magento2Api, MercadoLibre, MijoShop, Miva, Neto, Opencart14, Oscmax2, Oscommerce22ms2, Otto, Oxid, Pinnacle, Prestashop, PrestashopApi, SSPremium, Salla, Shopify, Shopee, Shoplazza, Shopline, Shopware, ShopwareApi, Square, Squarespace, Temu, Tiendanube, TikTokShop, Tomatocart, Ubercart, Virtuemart, Volusion, WPecommerce, Walmart, WebAsyst, Wix, Woocommerce, WoocommerceApi, Xcart, Xtcommerce, XtcommerceVeyton, Zencart137, Zid, Zoey, Zoho |



