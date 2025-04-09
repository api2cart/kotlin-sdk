
# ProductVariantAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **model** | **kotlin.String** | Specifies variant&#39;s model that has to be added |  |
| **productId** | **kotlin.String** | Defines product&#39;s id where the variant has to be added |  [optional] |
| **name** | **kotlin.String** | Defines variant&#39;s name that has to be added |  [optional] |
| **sku** | **kotlin.String** | Defines variant&#39;s sku that has to be added |  [optional] |
| **barcode** | **kotlin.String** | A barcode is a unique code composed of numbers used as a product identifier. |  [optional] |
| **gtin** | **kotlin.String** | Global Trade Item Number. An GTIN is an identifier for trade items. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s variant price |  [optional] |
| **oldPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s old price |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s cost price |  [optional] |
| **fixedCostShippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies fixed cost shipping price |  [optional] |
| **attributes** | [**kotlin.collections.List&lt;ProductVariantAddAttributesInner&gt;**](ProductVariantAddAttributesInner.md) | Defines variant&#39;s attributes list |  [optional] |
| **description** | **kotlin.String** | Specifies variant&#39;s description |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies variant&#39;s model that has to be added |  [optional] |
| **spriceCreate** | **kotlin.String** | Defines the date of special price creation |  [optional] |
| **spriceModified** | **kotlin.String** | Defines the date of special price modification |  [optional] |
| **spriceExpire** | **kotlin.String** | Defines the term of special price offer duration |  [optional] |
| **availableForView** | **kotlin.Boolean** | Specifies the set of visible/invisible product&#39;s variants for users |  [optional] |
| **availableForSale** | **kotlin.Boolean** | Specifies the set of visible/invisible product&#39;s variants for sale |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s width |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s height |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s length |  [optional] |
| **weightUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **shortDescription** | **kotlin.String** | Defines short description |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product variant&#39;s quantity that has to be added |  [optional] |
| **createdAt** | **kotlin.String** | Defines the date of entity creation |  [optional] |
| **manufacturer** | **kotlin.String** | Specifies the product variant&#39;s manufacturer |  [optional] |
| **taxClassId** | **kotlin.String** | Defines tax classes where entity has to be added |  [optional] |
| **metaTitle** | **kotlin.String** | Defines unique meta title for each entity |  [optional] |
| **metaKeywords** | **kotlin.String** | Defines unique meta keywords for each entity |  [optional] |
| **metaDescription** | **kotlin.String** | Defines unique meta description of a entity |  [optional] |
| **url** | **kotlin.String** | Defines unique product variant&#39;s URL |  [optional] |
| **storeId** | **kotlin.String** | Add variants specified by store id |  [optional] |
| **langId** | **kotlin.String** | Language id |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |
| **taxable** | **kotlin.Boolean** | Specifies whether a tax is charged |  [optional] |
| **harmonizedSystemCode** | **kotlin.String** | Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes |  [optional] |
| **countryOfOrigin** | **kotlin.String** | The country where the inventory item was made |  [optional] |
| **manageStock** | **kotlin.Boolean** | Defines inventory tracking for product variant |  [optional] |
| **upc** | **kotlin.String** | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. |  [optional] |
| **mpn** | **kotlin.String** | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. |  [optional] |
| **ean** | **kotlin.String** | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. |  [optional] |
| **isbn** | **kotlin.String** | International Standard Book Number. An ISBN is a unique identifier for books. |  [optional] |
| **storesIds** | **kotlin.String** | Assign variant to the stores that is specified by comma-separated stores&#39; id |  [optional] |
| **isDefault** | **kotlin.Boolean** | Defines as a default variant |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** | Specifies variant&#39;s free shipping flag that has to be added |  [optional] |
| **marketplaceItemProperties** | **kotlin.String** | String containing the JSON representation of the supplied data |  [optional] |
| **inStock** | **kotlin.Boolean** | Set stock status |  [optional] |
| **backorderStatus** | **kotlin.String** | Set backorder status |  [optional] |
| **tierPrices** | [**kotlin.collections.List&lt;ProductAddTierPricesInner&gt;**](ProductAddTierPricesInner.md) | Defines product&#39;s tier prices |  [optional] |
| **isVirtual** | **kotlin.Boolean** | Defines whether the product is virtual |  [optional] |



