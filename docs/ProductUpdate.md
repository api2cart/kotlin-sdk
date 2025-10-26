
# ProductUpdate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Defines product id that has to be updated |  [optional] |
| **model** | **kotlin.String** | Defines product model that has to be updated |  [optional] |
| **sku** | **kotlin.String** | Defines new product&#39;s sku |  [optional] |
| **name** | **kotlin.String** | Defines product&#39;s name that has to be updated |  [optional] |
| **description** | **kotlin.String** | Defines new product&#39;s description |  [optional] |
| **shortDescription** | **kotlin.String** | Defines short description |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s price |  [optional] |
| **oldPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s old price |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s special price |  [optional] |
| **spriceCreate** | **kotlin.String** | Defines the date of special price creation |  [optional] |
| **spriceExpire** | **kotlin.String** | Defines the term of special price offer duration |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s cost price |  [optional] |
| **fixedCostShippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies product&#39;s fixed cost shipping price |  [optional] |
| **retailPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s retail price |  [optional] |
| **tierPrices** | [**kotlin.collections.List&lt;ProductAddTierPricesInner&gt;**](ProductAddTierPricesInner.md) | Defines product&#39;s tier prices |  [optional] |
| **reservePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines reserve price value |  [optional] |
| **buyitnowPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines buy it now value |  [optional] |
| **taxable** | **kotlin.Boolean** | Specifies whether a tax is charged |  [optional] |
| **taxClassId** | **kotlin.String** | Defines tax classes where entity has to be added |  [optional] |
| **type** | **kotlin.String** | Defines product&#39;s type |  [optional] |
| **status** | **kotlin.String** | Defines product&#39;s status |  [optional] |
| **condition** | **kotlin.String** | The human-readable label for the condition (e.g., \&quot;New\&quot;). |  [optional] |
| **visible** | **kotlin.String** | Set visibility status |  [optional] |
| **inStock** | **kotlin.Boolean** | Set stock status |  [optional] |
| **avail** | **kotlin.Boolean** | Defines category&#39;s visibility status |  [optional] |
| **availFrom** | **kotlin.String** | Allows to schedule a time in the future that the item becomes available. The value should be greater than the current date and time. |  [optional] |
| **productClass** | **kotlin.String** | A categorization for the product |  [optional] |
| **brandName** | **kotlin.String** | Retrieves brands specified by brand name |  [optional] |
| **availableForView** | **kotlin.Boolean** | Specifies the set of visible/invisible products for users |  [optional] |
| **storesIds** | **kotlin.String** | Assign product to the stores that is specified by comma-separated stores&#39; id |  [optional] |
| **storeId** | **kotlin.String** | Defines store id where the product should be found |  [optional] |
| **langId** | **kotlin.String** | Language id |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s quantity |  [optional] |
| **reserveQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | This parameter allows to reserve/unreserve product quantity. |  [optional] |
| **manageStock** | **kotlin.Boolean** | Defines inventory tracking for product |  [optional] |
| **backorderStatus** | **kotlin.String** | Set backorder status |  [optional] |
| **increaseQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines the incremental changes in product quantity |  [optional] |
| **reduceQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines the decrement changes in product quantity |  [optional] |
| **lowStockThreshold** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specify the quantity threshold below which the product is considered low in stock |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight |  [optional] |
| **weightUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s height |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s length |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s width |  [optional] |
| **dimensionsUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **isVirtual** | **kotlin.Boolean** | Defines whether the product is virtual |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** | Specifies product free shipping flag that has to be updated |  [optional] |
| **gtin** | **kotlin.String** | Global Trade Item Number. An GTIN is an identifier for trade items. |  [optional] |
| **upc** | **kotlin.String** | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. |  [optional] |
| **mpn** | **kotlin.String** | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. |  [optional] |
| **ean** | **kotlin.String** | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. |  [optional] |
| **isbn** | **kotlin.String** | International Standard Book Number. An ISBN is a unique identifier for books. |  [optional] |
| **barcode** | **kotlin.String** | A barcode is a unique code composed of numbers used as a product identifier. |  [optional] |
| **manufacturer** | **kotlin.String** | Defines product&#39;s manufacturer |  [optional] |
| **manufacturerId** | **kotlin.String** | Defines product&#39;s manufacturer by manufacturer_id |  [optional] |
| **categoriesIds** | **kotlin.String** | Defines product add that is specified by comma-separated categories id |  [optional] |
| **relatedProductsIds** | **kotlin.String** | Defines product related products ids that has to be updated |  [optional] |
| **upSellProductsIds** | **kotlin.String** | Defines product up-sell products ids that has to be updated |  [optional] |
| **crossSellProductsIds** | **kotlin.String** | Defines product cross-sells products ids that has to be updated |  [optional] |
| **metaTitle** | **kotlin.String** | Defines unique meta title for each entity |  [optional] |
| **metaKeywords** | **kotlin.String** | Defines unique meta keywords for each entity |  [optional] |
| **metaDescription** | **kotlin.String** | Defines unique meta description of a entity |  [optional] |
| **seoUrl** | **kotlin.String** | Defines unique URL for SEO |  [optional] |
| **searchKeywords** | **kotlin.String** | Defines unique search keywords |  [optional] |
| **tags** | **kotlin.String** | Product tags |  [optional] |
| **deliveryCode** | **kotlin.String** | The delivery promise that applies to offer |  [optional] |
| **packageDetails** | [**ProductAddPackageDetails**](ProductAddPackageDetails.md) |  |  [optional] |
| **countryOfOrigin** | **kotlin.String** | The country where the inventory item was made |  [optional] |
| **harmonizedSystemCode** | **kotlin.String** | Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes |  [optional] |
| **shippingTemplateId** | **kotlin.Int** | The numeric ID of the shipping template associated with the products in Etsy. You can find possible values in the \&quot;cart.info\&quot; API method response, in the field shipping_zones[]-&gt;id. |  [optional] |
| **processingProfileId** | **kotlin.Int** | The numeric ID of the processing profile (readiness state) for physical products in Etsy. You can find possible values in the \&quot;cart.info\&quot; API method response, in the field processing_profiles[]-&gt;readiness_state_id. |  [optional] |
| **whenMade** | **kotlin.String** | An enumerated string for the era in which the maker made the product. |  [optional] |
| **isSupply** | **kotlin.Boolean** | If true, it indicates the product as a supply, otherwise it indicates that it is a finished product. |  [optional] |
| **downloadable** | **kotlin.Boolean** | Defines whether the product is downloadable |  [optional] |
| **materials** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of material strings for materials used in the product. |  [optional] |
| **autoRenew** | **kotlin.Boolean** | When true, automatically renews a listing upon its expiration. |  [optional] |
| **onSale** | **kotlin.Boolean** | Set whether the product on sale |  [optional] |
| **productionPartnerIds** | **kotlin.String** | Defines product production partner ids that has to be updated |  [optional] |
| **manufacturerInfo** | [**ProductAddManufacturerInfo**](ProductAddManufacturerInfo.md) |  |  [optional] |
| **reportRequestId** | **kotlin.String** | Report request id |  [optional] |
| **disableReportCache** | **kotlin.Boolean** | Disable report cache for current request |  [optional] |
| **reindex** | **kotlin.Boolean** | Is reindex required |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |
| **checkProcessStatus** | **kotlin.Boolean** | Disable or enable check process status. Please note that the response will be slower due to additional requests to the store. |  [optional] |
| **specifics** | [**kotlin.collections.List&lt;ProductAddSpecificsInner&gt;**](ProductAddSpecificsInner.md) | An array of Item Specific Name/Value pairs used by the seller to provide descriptive details of an item in a structured manner.         The list of possible specifications can be obtained using the category.info method (additional_fields-&gt;product_specifics).         &lt;b&gt;The structure of the parameter is different for specific platforms.&lt;/b&gt; |  [optional] |
| **shopSectionId** | **kotlin.Int** | Add Shop Section Id |  [optional] |
| **personalizationDetails** | [**ProductAddPersonalizationDetails**](ProductAddPersonalizationDetails.md) |  |  [optional] |
| **externalProductLink** | **kotlin.String** | External product link |  [optional] |
| **marketplaceItemProperties** | **kotlin.String** | String containing the JSON representation of the supplied data |  [optional] |
| **minOrderQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The minimum quantity an order must contain, to be eligible to purchase this product. |  [optional] |



