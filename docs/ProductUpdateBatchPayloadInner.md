
# ProductUpdateBatchPayloadInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  |
| **name** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **shortDescription** | **kotlin.String** |  |  [optional] |
| **sku** | **kotlin.String** |  |  [optional] |
| **model** | **kotlin.String** |  |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **spriceCreate** | **kotlin.String** |  |  [optional] |
| **spriceExpire** | **kotlin.String** |  |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **oldPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **fixedCostShippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **advancedPrices** | [**kotlin.collections.List&lt;ProductUpdateBatchPayloadInnerAdvancedPricesInner&gt;**](ProductUpdateBatchPayloadInnerAdvancedPricesInner.md) | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **increaseQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **reduceQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **reserveQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **storeId** | **kotlin.String** |  |  [optional] |
| **langId** | **kotlin.String** |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **condition** | **kotlin.String** |  |  [optional] |
| **conditionDescription** | **kotlin.String** |  |  [optional] |
| **visible** | **kotlin.String** |  |  [optional] |
| **availableForView** | **kotlin.Boolean** |  |  [optional] |
| **availableForSale** | **kotlin.Boolean** |  |  [optional] |
| **availFrom** | **kotlin.String** |  |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **dimensionsUnit** | **kotlin.String** |  |  [optional] |
| **weightUnit** | **kotlin.String** |  |  [optional] |
| **manageStock** | **kotlin.Boolean** |  |  [optional] |
| **inStock** | **kotlin.Boolean** |  |  [optional] |
| **backorderStatus** | **kotlin.String** |  |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** |  |  [optional] |
| **isVirtual** | **kotlin.Boolean** |  |  [optional] |
| **taxable** | **kotlin.Boolean** |  |  [optional] |
| **downloadable** | **kotlin.Boolean** |  |  [optional] |
| **warehouseId** | **kotlin.String** |  |  [optional] |
| **taxClassId** | **kotlin.String** |  |  [optional] |
| **categoriesIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **metaTitle** | **kotlin.String** |  |  [optional] |
| **metaDescription** | **kotlin.String** |  |  [optional] |
| **metaKeywords** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **seoUrl** | **kotlin.String** |  |  [optional] |
| **manufacturer** | **kotlin.String** |  |  [optional] |
| **manufacturerId** | **kotlin.String** |  |  [optional] |
| **mpn** | **kotlin.String** |  |  [optional] |
| **gtin** | **kotlin.String** |  |  [optional] |
| **upc** | **kotlin.String** |  |  [optional] |
| **isbn** | **kotlin.String** |  |  [optional] |
| **ean** | **kotlin.String** |  |  [optional] |
| **barcode** | **kotlin.String** |  |  [optional] |
| **images** | [**kotlin.collections.List&lt;ProductUpdateBatchPayloadInnerImagesInner&gt;**](ProductUpdateBatchPayloadInnerImagesInner.md) | Property &#39;nested_items_update_behaviour&#39; does not apply. Specified items will be added to existing product images |  [optional] |
| **relatedProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **upSellProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **crossSellProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **searchKeywords** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **harmonizedSystemCode** | **kotlin.String** |  |  [optional] |



