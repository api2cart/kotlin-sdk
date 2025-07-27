
# ProductVariantUpdate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Defines variant update specified by variant id |  [optional] |
| **productId** | **kotlin.String** | Defines product&#39;s id where the variant has to be updated |  [optional] |
| **storeId** | **kotlin.String** | Defines store id where the variant should be found |  [optional] |
| **langId** | **kotlin.String** | Language id |  [optional] |
| **options** | [**kotlin.collections.List&lt;ProductVariantUpdateOptionsInner&gt;**](ProductVariantUpdateOptionsInner.md) | Defines variant&#39;s options list |  [optional] |
| **name** | **kotlin.String** | Defines variant&#39;s name that has to be updated |  [optional] |
| **description** | **kotlin.String** | Specifies variant&#39;s description |  [optional] |
| **shortDescription** | **kotlin.String** | Defines short description |  [optional] |
| **model** | **kotlin.String** | Specifies variant&#39;s model that has to be added |  [optional] |
| **sku** | **kotlin.String** | Defines new product&#39;s variant sku |  [optional] |
| **visible** | **kotlin.String** | Set visibility status |  [optional] |
| **status** | **kotlin.String** | Defines product variant&#39;s status |  [optional] |
| **backorderStatus** | **kotlin.String** | Set backorder status |  [optional] |
| **lowStockThreshold** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specify the quantity threshold below which the product is considered low in stock |  [optional] |
| **availableForSale** | **kotlin.Boolean** | Specifies the set of visible/invisible product&#39;s variants for sale |  [optional] |
| **avail** | **kotlin.Boolean** | Defines category&#39;s visibility status |  [optional] |
| **isDefault** | **kotlin.Boolean** | Defines as a default variant |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** | Specifies variant&#39;s free shipping flag that has to be added |  [optional] |
| **taxable** | **kotlin.Boolean** | Specifies whether a tax is charged |  [optional] |
| **taxClassId** | **kotlin.String** | Defines tax classes where entity has to be added |  [optional] |
| **isVirtual** | **kotlin.Boolean** | Defines whether the product is virtual |  [optional] |
| **manageStock** | **kotlin.Boolean** | Defines inventory tracking for product variant |  [optional] |
| **inStock** | **kotlin.Boolean** | Set stock status |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **reserveQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | This parameter allows to reserve/unreserve product variants quantity. |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new products&#39; variants quantity |  [optional] |
| **increaseQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines the incremental changes in product quantity |  [optional] |
| **reduceQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines the decrement changes in product quantity |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s variant price |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s variant special price |  [optional] |
| **retailPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s retail price |  [optional] |
| **oldPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s old price |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines new product&#39;s cost price |  [optional] |
| **fixedCostShippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies fixed cost shipping price |  [optional] |
| **spriceCreate** | **kotlin.String** | Defines the date of special price creation |  [optional] |
| **spriceExpire** | **kotlin.String** | Defines the term of special price offer duration |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight |  [optional] |
| **barcode** | **kotlin.String** | A barcode is a unique code composed of numbers used as a product identifier. |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s width |  [optional] |
| **weightUnit** | **kotlin.String** | Weight Unit |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s height |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines product&#39;s length |  [optional] |
| **gtin** | **kotlin.String** | Global Trade Item Number. An GTIN is an identifier for trade items. |  [optional] |
| **upc** | **kotlin.String** | Universal Product Code. A UPC (UPC-A) is a commonly used identifer for many different products. |  [optional] |
| **mpn** | **kotlin.String** | Manufacturer Part Number. A MPN is an identifier of a particular part design or material used. |  [optional] |
| **ean** | **kotlin.String** | European Article Number. An EAN is a unique 8 or 13-digit identifier that many industries (such as book publishers) use to identify products. |  [optional] |
| **isbn** | **kotlin.String** | International Standard Book Number. An ISBN is a unique identifier for books. |  [optional] |
| **harmonizedSystemCode** | **kotlin.String** | Harmonized System Code. An HSC is a 6-digit identifier that allows participating countries to classify traded goods on a common basis for customs purposes |  [optional] |
| **countryOfOrigin** | **kotlin.String** | The country where the inventory item was made |  [optional] |
| **metaTitle** | **kotlin.String** | Defines unique meta title for each entity |  [optional] |
| **metaDescription** | **kotlin.String** | Defines unique meta description of a entity |  [optional] |
| **metaKeywords** | **kotlin.String** | Defines unique meta keywords for each entity |  [optional] |
| **reindex** | **kotlin.Boolean** | Is reindex required |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |



