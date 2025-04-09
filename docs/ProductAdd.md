
# ProductAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Defines product&#39;s name that has to be added |  |
| **model** | **kotlin.String** | Defines product&#39;s model that has to be added |  |
| **description** | **kotlin.String** | Defines product&#39;s description that has to be added |  |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s price that has to be added |  |
| **sku** | **kotlin.String** | Defines product&#39;s sku that has to be added |  [optional] |
| **oldPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s old price |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s model that has to be added |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s cost price |  [optional] |
| **fixedCostShippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies product&#39;s fixed cost shipping price |  [optional] |
| **spriceCreate** | **kotlin.String** | Defines the date of special price creation |  [optional] |
| **spriceModified** | **kotlin.String** | Defines the date of special price modification |  [optional] |
| **spriceExpire** | **kotlin.String** | Defines the term of special price offer duration |  [optional] |
| **tierPrices** | [**kotlin.collections.List&lt;ProductAddTierPricesInner&gt;**](ProductAddTierPricesInner.md) | Defines product&#39;s tier prices |  [optional] |
| **groupPrices** | [**kotlin.collections.List&lt;ProductAddGroupPricesInner&gt;**](ProductAddGroupPricesInner.md) | Defines product&#39;s group prices |  [optional] |
| **availableForView** | **kotlin.Boolean** | Specifies the set of visible/invisible products for users |  [optional] |
| **availableForSale** | **kotlin.Boolean** | Specifies the set of visible/invisible products for sale |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s width |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s height |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s length |  [optional] |
| **weightUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **dimensionsUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **shortDescription** | **kotlin.String** | Defines short description |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **backorderStatus** | **kotlin.String** | Set backorder status |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s quantity that has to be added |  [optional] |
| **downloadable** | **kotlin.Boolean** | Defines whether the product is downloadable |  [optional] |
| **wholesalePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s sale price |  [optional] |
| **createdAt** | **kotlin.String** | Defines the date of entity creation |  [optional] |
| **manufacturer** | **kotlin.String** | Defines product&#39;s manufacturer |  [optional] |
| **manufacturerId** | **kotlin.String** | Defines product&#39;s manufacturer by manufacturer_id |  [optional] |
| **categoriesIds** | **kotlin.String** | Defines product add that is specified by comma-separated categories id |  [optional] |
| **relatedProductsIds** | **kotlin.String** | Defines product&#39;s related products ids that has to be added |  [optional] |
| **upSellProductsIds** | **kotlin.String** | Defines product&#39;s up-sell products ids that has to be added |  [optional] |
| **crossSellProductsIds** | **kotlin.String** | Defines product&#39;s cross-sell products ids that has to be added |  [optional] |
| **taxClassId** | **kotlin.String** | Defines tax classes where entity has to be added |  [optional] |
| **type** | **kotlin.String** | Defines product&#39;s type |  [optional] |
| **metaTitle** | **kotlin.String** | Defines unique meta title for each entity |  [optional] |
| **metaKeywords** | **kotlin.String** | Defines unique meta keywords for each entity |  [optional] |
| **metaDescription** | **kotlin.String** | Defines unique meta description of a entity |  [optional] |
| **url** | **kotlin.String** | Defines unique product&#39;s URL |  [optional] |
| **langId** | **kotlin.String** | Language id |  [optional] |
| **storesIds** | **kotlin.String** | Assign product to the stores that is specified by comma-separated stores&#39; id |  [optional] |
| **categoryId** | **kotlin.String** | Defines product add that is specified by category id |  [optional] |
| **viewedCount** | **kotlin.Int** | Specifies the number of product&#39;s reviews |  [optional] |
| **orderedCount** | **kotlin.Int** | Defines how many times the product was ordered |  [optional] |
| **attributeSetName** | **kotlin.String** | Defines product’s attribute set name in Magento |  [optional] |
| **attributeName** | **kotlin.String** | Defines product’s attribute name separated with a comma in Magento |  [optional] |
| **shippingTemplateId** | **kotlin.Int** | The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \&quot;cart.info\&quot; API method response, in the field shipping_zones[]-&gt;id. |  [optional] |
| **productionPartnerIds** | **kotlin.String** | Defines product&#39;s production partner ids that has to be added |  [optional] |
| **condition** | **kotlin.String** | The human-readable label for the condition (e.g., \&quot;New\&quot;). |  [optional] |
| **listingDuration** | **kotlin.String** | Describes the number of days the seller wants the listing to be active. Look at cart.info method response for allowed values. |  [optional] |
| **listingType** | **kotlin.String** | Indicates the selling format of the marketplace listing. |  [optional] |
| **paymentMethods** | **kotlin.collections.List&lt;kotlin.String&gt;** | Identifies the payment method (such as PayPal) that the seller will accept when the buyer pays for the item. Look at cart.info method response for allowed values.&lt;hr&gt;&lt;div style&#x3D;\&quot;font-style:normal\&quot;&gt;Param structure:&lt;div style&#x3D;\&quot;margin-left: 2%;\&quot;&gt;&lt;code style&#x3D;\&quot;padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\&quot;&gt;payment_methods[0] &#x3D; string&lt;/br&gt;payment_methods[1] &#x3D; string&lt;/br&gt;&lt;/code&gt;&lt;/div&gt;&lt;/div&gt; |  [optional] |
| **returnAccepted** | **kotlin.Boolean** | Indicates whether the seller allows the buyer to return the item. |  [optional] |
| **shippingDetails** | [**kotlin.collections.List&lt;ProductAddShippingDetailsInner&gt;**](ProductAddShippingDetailsInner.md) | The shipping details, including flat and calculated shipping costs and shipping insurance costs. Look at cart.info method response for allowed values.&lt;hr&gt;&lt;div style&#x3D;\&quot;font-style:normal\&quot;&gt;Param structure:&lt;div style&#x3D;\&quot;margin-left: 2%;\&quot;&gt;&lt;code style&#x3D;\&quot;padding:0; background-color:#ffffff;font-size:85%;font-family:monospace;\&quot;&gt;shipping_details[0][&lt;b&gt;shipping_type&lt;/b&gt;] &#x3D; string &lt;/br&gt;shipping_details[0][&lt;b&gt;shipping_service&lt;/b&gt;] &#x3D; string&lt;/br&gt;shipping_details[0][&lt;b&gt;shipping_cost&lt;/b&gt;] &#x3D; decimal&lt;/br&gt;shipping_details[1][&lt;b&gt;shipping_type&lt;/b&gt;] &#x3D; string &lt;/br&gt;shipping_details[1][&lt;b&gt;shipping_service&lt;/b&gt;] &#x3D; string&lt;/br&gt;shipping_details[1][&lt;b&gt;shipping_cost&lt;/b&gt;] &#x3D; decimal&lt;/br&gt;&lt;/code&gt;&lt;/div&gt;&lt;/div&gt; |  [optional] |
| **paypalEmail** | **kotlin.String** | Valid PayPal email address for the PayPal account that the seller will use if they offer PayPal as a payment method for the listing. |  [optional] |
| **sellerProfiles** | [**ProductAddSellerProfiles**](ProductAddSellerProfiles.md) |  |  [optional] |
| **packageDetails** | [**ProductAddPackageDetails**](ProductAddPackageDetails.md) |  |  [optional] |
| **bestOffer** | [**ProductAddBestOffer**](ProductAddBestOffer.md) |  |  [optional] |
| **salesTax** | [**ProductAddSalesTax**](ProductAddSalesTax.md) |  |  [optional] |
| **barcode** | **kotlin.String** | A barcode is a unique code composed of numbers used as a product identifier. |  [optional] |
| **upc** | **kotlin.String** | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. |  [optional] |
| **ean** | **kotlin.String** | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. |  [optional] |
| **isbn** | **kotlin.String** | International Standard Book Number. An ISBN is a unique identifier for books. |  [optional] |
| **specifics** | [**kotlin.collections.List&lt;ProductAddSpecificsInner&gt;**](ProductAddSpecificsInner.md) | An array of Item Specific Name/Value pairs used by the seller to provide descriptive details of an item in a structured manner.         The list of possible specifications can be obtained using the category.info method (additional_fields-&gt;product_specifics).         &lt;b&gt;The structure of the parameter is different for specific platforms.&lt;/b&gt; |  [optional] |
| **imageUrl** | **kotlin.String** | Image Url |  [optional] |
| **imageName** | **kotlin.String** | Defines image&#39;s name |  [optional] |
| **reservePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines reserve price value |  [optional] |
| **buyitnowPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines buy it now value |  [optional] |
| **conditionDescription** | **kotlin.String** | Detailed description of the product condition. |  [optional] |
| **auctionConfidentialityLevel** | **kotlin.String** | This allows buyers to remain anonymous when the bid or buy an item. |  [optional] |
| **availFrom** | **kotlin.String** | Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time. |  [optional] |
| **tags** | **kotlin.String** | Product tags |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |
| **asin** | **kotlin.String** | Amazon Standard Identification Number. |  [optional] |
| **gtin** | **kotlin.String** | Global Trade Item Number. An GTIN is an identifier for trade items. |  [optional] |
| **mpn** | **kotlin.String** | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. |  [optional] |
| **taxable** | **kotlin.Boolean** | Specifies whether a tax is charged |  [optional] |
| **visible** | **kotlin.String** | Set visibility status |  [optional] |
| **status** | **kotlin.String** | Defines product&#39;s status |  [optional] |
| **seoUrl** | **kotlin.String** | Defines unique URL for SEO |  [optional] |
| **productClass** | **kotlin.String** | A categorization for the product |  [optional] |
| **productType** | **kotlin.String** | A categorization for the product |  [optional] |
| **marketplaceItemProperties** | **kotlin.String** | String containing the JSON representation of the supplied data |  [optional] |
| **manageStock** | **kotlin.Boolean** | Defines inventory tracking for product |  [optional] |
| **harmonizedSystemCode** | **kotlin.String** | Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes |  [optional] |
| **countryOfOrigin** | **kotlin.String** | The country where the inventory item was made |  [optional] |
| **files** | [**kotlin.collections.List&lt;ProductAddFilesInner&gt;**](ProductAddFilesInner.md) | File Url |  [optional] |
| **searchKeywords** | **kotlin.String** | Defines unique search keywords |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **brandName** | **kotlin.String** | Defines product brand name |  [optional] |
| **isVirtual** | **kotlin.Boolean** | Defines whether the product is virtual |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** | Specifies product&#39;s free shipping flag that has to be added |  [optional] |
| **inStock** | **kotlin.Boolean** | Set stock status |  [optional] |
| **deliveryCode** | **kotlin.String** | The delivery promise that applies to offer |  [optional] |
| **productReference** | **kotlin.String** | Groups all variations, that you want to combine into one product. |  [optional] |
| **deliveryType** | **kotlin.String** | Defines the type of the delivery. |  [optional] |
| **deliveryTime** | **kotlin.Int** | Defines delivery time in days. |  [optional] |
| **sizeChart** | [**ProductAddSizeChart**](ProductAddSizeChart.md) |  |  [optional] |
| **certifications** | [**kotlin.collections.List&lt;ProductAddCertificationsInner&gt;**](ProductAddCertificationsInner.md) | An array of product certifications. The list of possible certifications can be obtained using the \&quot;&lt;i&gt;category.info&lt;/i&gt;\&quot; method (&lt;i&gt;additional_fields-&gt;rules-&gt;product_certifications&lt;/i&gt;). |  [optional] |
| **deliveryOptionIds** | **kotlin.String** | Defines delivery options for product by ids. |  [optional] |
| **manufacturerInfo** | [**ProductAddManufacturerInfo**](ProductAddManufacturerInfo.md) |  |  [optional] |
| **whenMade** | **kotlin.String** | An enumerated string for the era in which the maker made the product. |  [optional] |
| **isSupply** | **kotlin.Boolean** | If true, it indicates the product as a supply, otherwise it indicates that it is a finished product. |  [optional] |
| **materials** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of material strings for materials used in the product. |  [optional] |
| **autoRenew** | **kotlin.Boolean** | When true, automatically renews a listing upon its expiration. |  [optional] |
| **allowDisplayCondition** | **kotlin.Boolean** | Flag used to determine whether the product condition is shown to the customer on the product page. |  [optional] |
| **minOrderQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The minimum quantity an order must contain, to be eligible to purchase this product. |  [optional] |
| **maxOrderQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The maximum quantity an order can contain when purchasing the product. |  [optional] |



