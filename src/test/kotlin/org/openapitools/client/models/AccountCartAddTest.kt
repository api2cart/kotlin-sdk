/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.AccountCartAdd
import org.openapitools.client.models.AccountCartAddHybrisWebsitesInner

class AccountCartAddTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AccountCartAdd
        //val modelInstance = AccountCartAdd()

        // to test the property `cartId` - Store’s identifier which you can get from cart_list method
        should("test cartId") {
            // uncomment below to test the property
            //modelInstance.cartId shouldBe ("TODO")
        }

        // to test the property `wixAppId` - Wix App ID
        should("test wixAppId") {
            // uncomment below to test the property
            //modelInstance.wixAppId shouldBe ("TODO")
        }

        // to test the property `wixAppSecretKey` - Wix App Secret Key
        should("test wixAppSecretKey") {
            // uncomment below to test the property
            //modelInstance.wixAppSecretKey shouldBe ("TODO")
        }

        // to test the property `storeUrl` - A web address of a store that you would like to connect to API2Cart
        should("test storeUrl") {
            // uncomment below to test the property
            //modelInstance.storeUrl shouldBe ("TODO")
        }

        // to test the property `bridgeUrl` - This parameter allows to set up store with custom bridge url (also you must use store_root parameter if a bridge folder is not in the root folder of the store)
        should("test bridgeUrl") {
            // uncomment below to test the property
            //modelInstance.bridgeUrl shouldBe ("TODO")
        }

        // to test the property `storeRoot` - Absolute path to the store root directory (used with \"bridge_url\" parameter)
        should("test storeRoot") {
            // uncomment below to test the property
            //modelInstance.storeRoot shouldBe ("TODO")
        }

        // to test the property `storeKey` - Set this parameter if bridge is already uploaded to store
        should("test storeKey") {
            // uncomment below to test the property
            //modelInstance.storeKey shouldBe ("TODO")
        }

        // to test the property `validateVersion` - Specify if api2cart should validate cart version
        should("test validateVersion") {
            // uncomment below to test the property
            //modelInstance.validateVersion shouldBe ("TODO")
        }

        // to test the property `verify` - Enables or disables cart's verification
        should("test verify") {
            // uncomment below to test the property
            //modelInstance.verify shouldBe ("TODO")
        }

        // to test the property `dbTablesPrefix` - DB tables prefix
        should("test dbTablesPrefix") {
            // uncomment below to test the property
            //modelInstance.dbTablesPrefix shouldBe ("TODO")
        }

        // to test the property `userAgent` - This parameter allows you to set your custom user agent, which will be used in requests to the store. Please use it cautiously, as the store's firewall may block specific values.
        should("test userAgent") {
            // uncomment below to test the property
            //modelInstance.userAgent shouldBe ("TODO")
        }

        // to test the property `ftpHost` - FTP connection host
        should("test ftpHost") {
            // uncomment below to test the property
            //modelInstance.ftpHost shouldBe ("TODO")
        }

        // to test the property `ftpUser` - FTP User
        should("test ftpUser") {
            // uncomment below to test the property
            //modelInstance.ftpUser shouldBe ("TODO")
        }

        // to test the property `ftpPassword` - FTP Password
        should("test ftpPassword") {
            // uncomment below to test the property
            //modelInstance.ftpPassword shouldBe ("TODO")
        }

        // to test the property `ftpPort` - FTP Port
        should("test ftpPort") {
            // uncomment below to test the property
            //modelInstance.ftpPort shouldBe ("TODO")
        }

        // to test the property `ftpStoreDir` - FTP Store dir
        should("test ftpStoreDir") {
            // uncomment below to test the property
            //modelInstance.ftpStoreDir shouldBe ("TODO")
        }

        // to test the property ``3dcartPrivateKey`` - 3DCart Private Key
        should("test `3dcartPrivateKey`") {
            // uncomment below to test the property
            //modelInstance.`3dcartPrivateKey` shouldBe ("TODO")
        }

        // to test the property ``3dcartAccessToken`` - 3DCart Token
        should("test `3dcartAccessToken`") {
            // uncomment below to test the property
            //modelInstance.`3dcartAccessToken` shouldBe ("TODO")
        }

        // to test the property ``3dcartapiApiKey`` - 3DCart API Key
        should("test `3dcartapiApiKey`") {
            // uncomment below to test the property
            //modelInstance.`3dcartapiApiKey` shouldBe ("TODO")
        }

        // to test the property `amazonSpClientId` - Amazon SP API app client id
        should("test amazonSpClientId") {
            // uncomment below to test the property
            //modelInstance.amazonSpClientId shouldBe ("TODO")
        }

        // to test the property `amazonSpClientSecret` - Amazon SP API app client secret
        should("test amazonSpClientSecret") {
            // uncomment below to test the property
            //modelInstance.amazonSpClientSecret shouldBe ("TODO")
        }

        // to test the property `amazonSpRefreshToken` - Amazon SP API OAuth refresh token
        should("test amazonSpRefreshToken") {
            // uncomment below to test the property
            //modelInstance.amazonSpRefreshToken shouldBe ("TODO")
        }

        // to test the property `amazonSpAwsRegion` - Amazon AWS Region
        should("test amazonSpAwsRegion") {
            // uncomment below to test the property
            //modelInstance.amazonSpAwsRegion shouldBe ("TODO")
        }

        // to test the property `amazonSpApiEnvironment` - Amazon SP API environment
        should("test amazonSpApiEnvironment") {
            // uncomment below to test the property
            //modelInstance.amazonSpApiEnvironment shouldBe ("TODO")
        }

        // to test the property `amazonSellerId` - Amazon Seller ID (Merchant token)
        should("test amazonSellerId") {
            // uncomment below to test the property
            //modelInstance.amazonSellerId shouldBe ("TODO")
        }

        // to test the property `aspdotnetstorefrontApiUser` - It's a AspDotNetStorefront account for which API is available
        should("test aspdotnetstorefrontApiUser") {
            // uncomment below to test the property
            //modelInstance.aspdotnetstorefrontApiUser shouldBe ("TODO")
        }

        // to test the property `aspdotnetstorefrontApiPass` - AspDotNetStorefront API Password
        should("test aspdotnetstorefrontApiPass") {
            // uncomment below to test the property
            //modelInstance.aspdotnetstorefrontApiPass shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiAdminAccount` - It's a BigCommerce account for which API is enabled
        should("test bigcommerceapiAdminAccount") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiAdminAccount shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiApiPath` - BigCommerce API URL
        should("test bigcommerceapiApiPath") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiApiPath shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiApiKey` - Bigcommerce API Key
        should("test bigcommerceapiApiKey") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiApiKey shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiClientId` - Client ID of the requesting app
        should("test bigcommerceapiClientId") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiClientId shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiAccessToken` - Access token authorizing the app to access resources on behalf of a user
        should("test bigcommerceapiAccessToken") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiAccessToken shouldBe ("TODO")
        }

        // to test the property `bigcommerceapiContext` - API Path section unique to the store
        should("test bigcommerceapiContext") {
            // uncomment below to test the property
            //modelInstance.bigcommerceapiContext shouldBe ("TODO")
        }

        // to test the property `bolApiKey` - Bol API Key
        should("test bolApiKey") {
            // uncomment below to test the property
            //modelInstance.bolApiKey shouldBe ("TODO")
        }

        // to test the property `bolApiSecret` - Bol API Secret
        should("test bolApiSecret") {
            // uncomment below to test the property
            //modelInstance.bolApiSecret shouldBe ("TODO")
        }

        // to test the property `bolRetailerId` - Bol Retailer ID
        should("test bolRetailerId") {
            // uncomment below to test the property
            //modelInstance.bolRetailerId shouldBe ("TODO")
        }

        // to test the property `demandwareClientId` - Demandware client id
        should("test demandwareClientId") {
            // uncomment below to test the property
            //modelInstance.demandwareClientId shouldBe ("TODO")
        }

        // to test the property `demandwareApiPassword` - Demandware api password
        should("test demandwareApiPassword") {
            // uncomment below to test the property
            //modelInstance.demandwareApiPassword shouldBe ("TODO")
        }

        // to test the property `demandwareUserName` - Demandware user name
        should("test demandwareUserName") {
            // uncomment below to test the property
            //modelInstance.demandwareUserName shouldBe ("TODO")
        }

        // to test the property `demandwareUserPassword` - Demandware user password
        should("test demandwareUserPassword") {
            // uncomment below to test the property
            //modelInstance.demandwareUserPassword shouldBe ("TODO")
        }

        // to test the property `ebayClientId` - Application ID (AppID).
        should("test ebayClientId") {
            // uncomment below to test the property
            //modelInstance.ebayClientId shouldBe ("TODO")
        }

        // to test the property `ebayClientSecret` - Shared Secret from eBay application
        should("test ebayClientSecret") {
            // uncomment below to test the property
            //modelInstance.ebayClientSecret shouldBe ("TODO")
        }

        // to test the property `ebayRuname` - The RuName value that eBay assigns to your application.
        should("test ebayRuname") {
            // uncomment below to test the property
            //modelInstance.ebayRuname shouldBe ("TODO")
        }

        // to test the property `ebayAccessToken` - Used to authenticate API requests.
        should("test ebayAccessToken") {
            // uncomment below to test the property
            //modelInstance.ebayAccessToken shouldBe ("TODO")
        }

        // to test the property `ebayRefreshToken` - Used to renew the access token.
        should("test ebayRefreshToken") {
            // uncomment below to test the property
            //modelInstance.ebayRefreshToken shouldBe ("TODO")
        }

        // to test the property `ebayEnvironment` - eBay environment
        should("test ebayEnvironment") {
            // uncomment below to test the property
            //modelInstance.ebayEnvironment shouldBe ("TODO")
        }

        // to test the property `ebaySiteId` - eBay global ID
        should("test ebaySiteId") {
            // uncomment below to test the property
            //modelInstance.ebaySiteId shouldBe ("TODO")
        }

        // to test the property `walmartClientId` - Walmart client ID. For the region 'ca' use Consumer ID
        should("test walmartClientId") {
            // uncomment below to test the property
            //modelInstance.walmartClientId shouldBe ("TODO")
        }

        // to test the property `walmartClientSecret` - Walmart client secret. For the region 'ca' use Private Key
        should("test walmartClientSecret") {
            // uncomment below to test the property
            //modelInstance.walmartClientSecret shouldBe ("TODO")
        }

        // to test the property `walmartEnvironment` - Walmart environment
        should("test walmartEnvironment") {
            // uncomment below to test the property
            //modelInstance.walmartEnvironment shouldBe ("TODO")
        }

        // to test the property `walmartChannelType` - Walmart WM_CONSUMER.CHANNEL.TYPE header
        should("test walmartChannelType") {
            // uncomment below to test the property
            //modelInstance.walmartChannelType shouldBe ("TODO")
        }

        // to test the property `walmartRegion` - Walmart region
        should("test walmartRegion") {
            // uncomment below to test the property
            //modelInstance.walmartRegion shouldBe ("TODO")
        }

        // to test the property `ecwidAcessToken` - Access token authorizing the app to access resources on behalf of a user
        should("test ecwidAcessToken") {
            // uncomment below to test the property
            //modelInstance.ecwidAcessToken shouldBe ("TODO")
        }

        // to test the property `ecwidStoreId` - Store Id
        should("test ecwidStoreId") {
            // uncomment below to test the property
            //modelInstance.ecwidStoreId shouldBe ("TODO")
        }

        // to test the property `lazadaAppId` - Lazada App ID
        should("test lazadaAppId") {
            // uncomment below to test the property
            //modelInstance.lazadaAppId shouldBe ("TODO")
        }

        // to test the property `lazadaAppSecret` - Lazada App Secret
        should("test lazadaAppSecret") {
            // uncomment below to test the property
            //modelInstance.lazadaAppSecret shouldBe ("TODO")
        }

        // to test the property `lazadaRefreshToken` - Lazada Refresh Token
        should("test lazadaRefreshToken") {
            // uncomment below to test the property
            //modelInstance.lazadaRefreshToken shouldBe ("TODO")
        }

        // to test the property `lazadaRegion` - Lazada API endpoint Region
        should("test lazadaRegion") {
            // uncomment below to test the property
            //modelInstance.lazadaRegion shouldBe ("TODO")
        }

        // to test the property `lightspeedApiKey` - LightSpeed api key
        should("test lightspeedApiKey") {
            // uncomment below to test the property
            //modelInstance.lightspeedApiKey shouldBe ("TODO")
        }

        // to test the property `lightspeedApiSecret` - LightSpeed api secret
        should("test lightspeedApiSecret") {
            // uncomment below to test the property
            //modelInstance.lightspeedApiSecret shouldBe ("TODO")
        }

        // to test the property `etsyKeystring` - Etsy keystring
        should("test etsyKeystring") {
            // uncomment below to test the property
            //modelInstance.etsyKeystring shouldBe ("TODO")
        }

        // to test the property `etsySharedSecret` - Etsy shared secret
        should("test etsySharedSecret") {
            // uncomment below to test the property
            //modelInstance.etsySharedSecret shouldBe ("TODO")
        }

        // to test the property `etsyAccessToken` - Access token authorizing the app to access resources on behalf of a user
        should("test etsyAccessToken") {
            // uncomment below to test the property
            //modelInstance.etsyAccessToken shouldBe ("TODO")
        }

        // to test the property `etsyTokenSecret` - Secret token authorizing the app to access resources on behalf of a user
        should("test etsyTokenSecret") {
            // uncomment below to test the property
            //modelInstance.etsyTokenSecret shouldBe ("TODO")
        }

        // to test the property `etsyClientId` - Etsy Client Id
        should("test etsyClientId") {
            // uncomment below to test the property
            //modelInstance.etsyClientId shouldBe ("TODO")
        }

        // to test the property `etsyRefreshToken` - Etsy Refresh token
        should("test etsyRefreshToken") {
            // uncomment below to test the property
            //modelInstance.etsyRefreshToken shouldBe ("TODO")
        }

        // to test the property `facebookAppId` - Facebook App ID
        should("test facebookAppId") {
            // uncomment below to test the property
            //modelInstance.facebookAppId shouldBe ("TODO")
        }

        // to test the property `facebookAppSecret` - Facebook App Secret
        should("test facebookAppSecret") {
            // uncomment below to test the property
            //modelInstance.facebookAppSecret shouldBe ("TODO")
        }

        // to test the property `facebookAccessToken` - Facebook Access Token
        should("test facebookAccessToken") {
            // uncomment below to test the property
            //modelInstance.facebookAccessToken shouldBe ("TODO")
        }

        // to test the property `facebookBusinessId` - Facebook Business ID
        should("test facebookBusinessId") {
            // uncomment below to test the property
            //modelInstance.facebookBusinessId shouldBe ("TODO")
        }

        // to test the property `netoApiKey` - Neto API Key
        should("test netoApiKey") {
            // uncomment below to test the property
            //modelInstance.netoApiKey shouldBe ("TODO")
        }

        // to test the property `netoApiUsername` - Neto User Name
        should("test netoApiUsername") {
            // uncomment below to test the property
            //modelInstance.netoApiUsername shouldBe ("TODO")
        }

        // to test the property `shoplineAccessToken` - Shopline APP Key
        should("test shoplineAccessToken") {
            // uncomment below to test the property
            //modelInstance.shoplineAccessToken shouldBe ("TODO")
        }

        // to test the property `shoplineAppKey` - Shopline APP Key
        should("test shoplineAppKey") {
            // uncomment below to test the property
            //modelInstance.shoplineAppKey shouldBe ("TODO")
        }

        // to test the property `shoplineAppSecret` - Shopline App Secret
        should("test shoplineAppSecret") {
            // uncomment below to test the property
            //modelInstance.shoplineAppSecret shouldBe ("TODO")
        }

        // to test the property `shopifyAccessToken` - Access token authorizing the app to access resources on behalf of a user
        should("test shopifyAccessToken") {
            // uncomment below to test the property
            //modelInstance.shopifyAccessToken shouldBe ("TODO")
        }

        // to test the property `shopifyApiKey` - Shopify API Key
        should("test shopifyApiKey") {
            // uncomment below to test the property
            //modelInstance.shopifyApiKey shouldBe ("TODO")
        }

        // to test the property `shopifyApiPassword` - Shopify API Password
        should("test shopifyApiPassword") {
            // uncomment below to test the property
            //modelInstance.shopifyApiPassword shouldBe ("TODO")
        }

        // to test the property `shopifySharedSecret` - Shared secret
        should("test shopifySharedSecret") {
            // uncomment below to test the property
            //modelInstance.shopifySharedSecret shouldBe ("TODO")
        }

        // to test the property `shoplazzaAccessToken` - Access token authorizing the app to access resources on behalf of a user
        should("test shoplazzaAccessToken") {
            // uncomment below to test the property
            //modelInstance.shoplazzaAccessToken shouldBe ("TODO")
        }

        // to test the property `shoplazzaSharedSecret` - Shared secret
        should("test shoplazzaSharedSecret") {
            // uncomment below to test the property
            //modelInstance.shoplazzaSharedSecret shouldBe ("TODO")
        }

        // to test the property `shopwareAccessKey` - Shopware access key
        should("test shopwareAccessKey") {
            // uncomment below to test the property
            //modelInstance.shopwareAccessKey shouldBe ("TODO")
        }

        // to test the property `shopwareApiKey` - Shopware api key
        should("test shopwareApiKey") {
            // uncomment below to test the property
            //modelInstance.shopwareApiKey shouldBe ("TODO")
        }

        // to test the property `shopwareApiSecret` - Shopware client secret access key
        should("test shopwareApiSecret") {
            // uncomment below to test the property
            //modelInstance.shopwareApiSecret shouldBe ("TODO")
        }

        // to test the property `mivaAccessToken` - Miva access token
        should("test mivaAccessToken") {
            // uncomment below to test the property
            //modelInstance.mivaAccessToken shouldBe ("TODO")
        }

        // to test the property `mivaSignature` - Miva signature
        should("test mivaSignature") {
            // uncomment below to test the property
            //modelInstance.mivaSignature shouldBe ("TODO")
        }

        // to test the property `tiendanubeUserId` - Tiendanube User ID
        should("test tiendanubeUserId") {
            // uncomment below to test the property
            //modelInstance.tiendanubeUserId shouldBe ("TODO")
        }

        // to test the property `tiendanubeAccessToken` - Tiendanube Access Token
        should("test tiendanubeAccessToken") {
            // uncomment below to test the property
            //modelInstance.tiendanubeAccessToken shouldBe ("TODO")
        }

        // to test the property `tiendanubeClientSecret` - Tiendanube Client Secret
        should("test tiendanubeClientSecret") {
            // uncomment below to test the property
            //modelInstance.tiendanubeClientSecret shouldBe ("TODO")
        }

        // to test the property `volusionLogin` - It's a Volusion account for which API is enabled
        should("test volusionLogin") {
            // uncomment below to test the property
            //modelInstance.volusionLogin shouldBe ("TODO")
        }

        // to test the property `volusionPassword` - Volusion API Password
        should("test volusionPassword") {
            // uncomment below to test the property
            //modelInstance.volusionPassword shouldBe ("TODO")
        }

        // to test the property `hybrisClientId` - Omni Commerce Connector Client ID
        should("test hybrisClientId") {
            // uncomment below to test the property
            //modelInstance.hybrisClientId shouldBe ("TODO")
        }

        // to test the property `hybrisClientSecret` - Omni Commerce Connector Client Secret
        should("test hybrisClientSecret") {
            // uncomment below to test the property
            //modelInstance.hybrisClientSecret shouldBe ("TODO")
        }

        // to test the property `hybrisUsername` - User Name
        should("test hybrisUsername") {
            // uncomment below to test the property
            //modelInstance.hybrisUsername shouldBe ("TODO")
        }

        // to test the property `hybrisPassword` - User password
        should("test hybrisPassword") {
            // uncomment below to test the property
            //modelInstance.hybrisPassword shouldBe ("TODO")
        }

        // to test the property `hybrisWebsites` - Websites to stores mapping data
        should("test hybrisWebsites") {
            // uncomment below to test the property
            //modelInstance.hybrisWebsites shouldBe ("TODO")
        }

        // to test the property `squareClientId` - Square (Weebly) Client ID
        should("test squareClientId") {
            // uncomment below to test the property
            //modelInstance.squareClientId shouldBe ("TODO")
        }

        // to test the property `squareClientSecret` - Square (Weebly) Client Secret
        should("test squareClientSecret") {
            // uncomment below to test the property
            //modelInstance.squareClientSecret shouldBe ("TODO")
        }

        // to test the property `squareRefreshToken` - Square (Weebly) Refresh Token
        should("test squareRefreshToken") {
            // uncomment below to test the property
            //modelInstance.squareRefreshToken shouldBe ("TODO")
        }

        // to test the property `squarespaceApiKey` - Squarespace API Key
        should("test squarespaceApiKey") {
            // uncomment below to test the property
            //modelInstance.squarespaceApiKey shouldBe ("TODO")
        }

        // to test the property `squarespaceClientId` - Squarespace Connector Client ID
        should("test squarespaceClientId") {
            // uncomment below to test the property
            //modelInstance.squarespaceClientId shouldBe ("TODO")
        }

        // to test the property `squarespaceClientSecret` - Squarespace Connector Client Secret
        should("test squarespaceClientSecret") {
            // uncomment below to test the property
            //modelInstance.squarespaceClientSecret shouldBe ("TODO")
        }

        // to test the property `squarespaceAccessToken` - Squarespace access token
        should("test squarespaceAccessToken") {
            // uncomment below to test the property
            //modelInstance.squarespaceAccessToken shouldBe ("TODO")
        }

        // to test the property `squarespaceRefreshToken` - Squarespace refresh token
        should("test squarespaceRefreshToken") {
            // uncomment below to test the property
            //modelInstance.squarespaceRefreshToken shouldBe ("TODO")
        }

        // to test the property `commercehqApiKey` - CommerceHQ api key
        should("test commercehqApiKey") {
            // uncomment below to test the property
            //modelInstance.commercehqApiKey shouldBe ("TODO")
        }

        // to test the property `commercehqApiPassword` - CommerceHQ api password
        should("test commercehqApiPassword") {
            // uncomment below to test the property
            //modelInstance.commercehqApiPassword shouldBe ("TODO")
        }

        // to test the property `wcConsumerKey` - Woocommerce consumer key
        should("test wcConsumerKey") {
            // uncomment below to test the property
            //modelInstance.wcConsumerKey shouldBe ("TODO")
        }

        // to test the property `wcConsumerSecret` - Woocommerce consumer secret
        should("test wcConsumerSecret") {
            // uncomment below to test the property
            //modelInstance.wcConsumerSecret shouldBe ("TODO")
        }

        // to test the property `magentoConsumerKey` - Magento Consumer Key
        should("test magentoConsumerKey") {
            // uncomment below to test the property
            //modelInstance.magentoConsumerKey shouldBe ("TODO")
        }

        // to test the property `magentoConsumerSecret` - Magento Consumer Secret
        should("test magentoConsumerSecret") {
            // uncomment below to test the property
            //modelInstance.magentoConsumerSecret shouldBe ("TODO")
        }

        // to test the property `magentoAccessToken` - Magento Access Token
        should("test magentoAccessToken") {
            // uncomment below to test the property
            //modelInstance.magentoAccessToken shouldBe ("TODO")
        }

        // to test the property `magentoTokenSecret` - Magento Token Secret
        should("test magentoTokenSecret") {
            // uncomment below to test the property
            //modelInstance.magentoTokenSecret shouldBe ("TODO")
        }

        // to test the property `prestashopWebserviceKey` - Prestashop webservice key
        should("test prestashopWebserviceKey") {
            // uncomment below to test the property
            //modelInstance.prestashopWebserviceKey shouldBe ("TODO")
        }

        // to test the property `wixInstanceId` - Wix Instance ID
        should("test wixInstanceId") {
            // uncomment below to test the property
            //modelInstance.wixInstanceId shouldBe ("TODO")
        }

        // to test the property `wixRefreshToken` - Wix refresh token
        should("test wixRefreshToken") {
            // uncomment below to test the property
            //modelInstance.wixRefreshToken shouldBe ("TODO")
        }

        // to test the property `mercadoLibreAppId` - Mercado Libre App ID
        should("test mercadoLibreAppId") {
            // uncomment below to test the property
            //modelInstance.mercadoLibreAppId shouldBe ("TODO")
        }

        // to test the property `mercadoLibreAppSecretKey` - Mercado Libre App Secret Key
        should("test mercadoLibreAppSecretKey") {
            // uncomment below to test the property
            //modelInstance.mercadoLibreAppSecretKey shouldBe ("TODO")
        }

        // to test the property `mercadoLibreRefreshToken` - Mercado Libre Refresh Token
        should("test mercadoLibreRefreshToken") {
            // uncomment below to test the property
            //modelInstance.mercadoLibreRefreshToken shouldBe ("TODO")
        }

        // to test the property `zidClientId` - Zid Client ID
        should("test zidClientId") {
            // uncomment below to test the property
            //modelInstance.zidClientId shouldBe ("TODO")
        }

        // to test the property `zidClientSecret` - Zid Client Secret
        should("test zidClientSecret") {
            // uncomment below to test the property
            //modelInstance.zidClientSecret shouldBe ("TODO")
        }

        // to test the property `zidAccessToken` - Zid Access Token
        should("test zidAccessToken") {
            // uncomment below to test the property
            //modelInstance.zidAccessToken shouldBe ("TODO")
        }

        // to test the property `zidAuthorization` - Zid Authorization
        should("test zidAuthorization") {
            // uncomment below to test the property
            //modelInstance.zidAuthorization shouldBe ("TODO")
        }

        // to test the property `zidRefreshToken` - Zid refresh token
        should("test zidRefreshToken") {
            // uncomment below to test the property
            //modelInstance.zidRefreshToken shouldBe ("TODO")
        }

        // to test the property `flipkartClientId` - Flipkart Client ID
        should("test flipkartClientId") {
            // uncomment below to test the property
            //modelInstance.flipkartClientId shouldBe ("TODO")
        }

        // to test the property `flipkartClientSecret` - Flipkart Client Secret
        should("test flipkartClientSecret") {
            // uncomment below to test the property
            //modelInstance.flipkartClientSecret shouldBe ("TODO")
        }

        // to test the property `allegroClientId` - Allegro Client ID
        should("test allegroClientId") {
            // uncomment below to test the property
            //modelInstance.allegroClientId shouldBe ("TODO")
        }

        // to test the property `allegroClientSecret` - Allegro Client Secret
        should("test allegroClientSecret") {
            // uncomment below to test the property
            //modelInstance.allegroClientSecret shouldBe ("TODO")
        }

        // to test the property `allegroAccessToken` - Allegro Access Token
        should("test allegroAccessToken") {
            // uncomment below to test the property
            //modelInstance.allegroAccessToken shouldBe ("TODO")
        }

        // to test the property `allegroRefreshToken` - Allegro Refresh Token
        should("test allegroRefreshToken") {
            // uncomment below to test the property
            //modelInstance.allegroRefreshToken shouldBe ("TODO")
        }

        // to test the property `allegroEnvironment` - Allegro Environment
        should("test allegroEnvironment") {
            // uncomment below to test the property
            //modelInstance.allegroEnvironment shouldBe ("TODO")
        }

        // to test the property `zohoClientId` - Zoho Client ID
        should("test zohoClientId") {
            // uncomment below to test the property
            //modelInstance.zohoClientId shouldBe ("TODO")
        }

        // to test the property `zohoClientSecret` - Zoho Client Secret
        should("test zohoClientSecret") {
            // uncomment below to test the property
            //modelInstance.zohoClientSecret shouldBe ("TODO")
        }

        // to test the property `zohoRefreshToken` - Zoho Refresh Token
        should("test zohoRefreshToken") {
            // uncomment below to test the property
            //modelInstance.zohoRefreshToken shouldBe ("TODO")
        }

        // to test the property `zohoRegion` - Zoho API endpoint Region
        should("test zohoRegion") {
            // uncomment below to test the property
            //modelInstance.zohoRegion shouldBe ("TODO")
        }

        // to test the property `ottoClientId` - Otto Client ID
        should("test ottoClientId") {
            // uncomment below to test the property
            //modelInstance.ottoClientId shouldBe ("TODO")
        }

        // to test the property `ottoClientSecret` - Otto Client Secret
        should("test ottoClientSecret") {
            // uncomment below to test the property
            //modelInstance.ottoClientSecret shouldBe ("TODO")
        }

        // to test the property `ottoAppId` - Otto App ID
        should("test ottoAppId") {
            // uncomment below to test the property
            //modelInstance.ottoAppId shouldBe ("TODO")
        }

        // to test the property `ottoRefreshToken` - Otto Refresh Token
        should("test ottoRefreshToken") {
            // uncomment below to test the property
            //modelInstance.ottoRefreshToken shouldBe ("TODO")
        }

        // to test the property `ottoEnvironment` - Otto Environment
        should("test ottoEnvironment") {
            // uncomment below to test the property
            //modelInstance.ottoEnvironment shouldBe ("TODO")
        }

        // to test the property `ottoAccessToken` - Otto Access Token
        should("test ottoAccessToken") {
            // uncomment below to test the property
            //modelInstance.ottoAccessToken shouldBe ("TODO")
        }

        // to test the property `tiktokshopAppKey` - TikTok Shop App Key
        should("test tiktokshopAppKey") {
            // uncomment below to test the property
            //modelInstance.tiktokshopAppKey shouldBe ("TODO")
        }

        // to test the property `tiktokshopAppSecret` - TikTok Shop App Secret
        should("test tiktokshopAppSecret") {
            // uncomment below to test the property
            //modelInstance.tiktokshopAppSecret shouldBe ("TODO")
        }

        // to test the property `tiktokshopRefreshToken` - TikTok Shop Refresh Token
        should("test tiktokshopRefreshToken") {
            // uncomment below to test the property
            //modelInstance.tiktokshopRefreshToken shouldBe ("TODO")
        }

        // to test the property `tiktokshopAccessToken` - TikTok Shop Access Token
        should("test tiktokshopAccessToken") {
            // uncomment below to test the property
            //modelInstance.tiktokshopAccessToken shouldBe ("TODO")
        }

        // to test the property `sallaClientId` - Salla Client ID
        should("test sallaClientId") {
            // uncomment below to test the property
            //modelInstance.sallaClientId shouldBe ("TODO")
        }

        // to test the property `sallaClientSecret` - Salla Client Secret
        should("test sallaClientSecret") {
            // uncomment below to test the property
            //modelInstance.sallaClientSecret shouldBe ("TODO")
        }

        // to test the property `sallaRefreshToken` - Salla Refresh Token
        should("test sallaRefreshToken") {
            // uncomment below to test the property
            //modelInstance.sallaRefreshToken shouldBe ("TODO")
        }

        // to test the property `sallaAccessToken` - Salla Access Token
        should("test sallaAccessToken") {
            // uncomment below to test the property
            //modelInstance.sallaAccessToken shouldBe ("TODO")
        }

    }
}
