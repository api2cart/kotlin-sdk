
# ProductVariantUpdateBatchPayloadInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  |
| **productId** | **kotlin.String** |  |  |
| **name** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **shortDescription** | **kotlin.String** |  |  [optional] |
| **sku** | **kotlin.String** |  |  [optional] |
| **upc** | **kotlin.String** |  |  [optional] |
| **mpn** | **kotlin.String** |  |  [optional] |
| **gtin** | **kotlin.String** |  |  [optional] |
| **isbn** | **kotlin.String** |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **specialPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **costPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **retailPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **advancedPrices** | [**kotlin.collections.List&lt;ProductUpdateBatchPayloadInnerAdvancedPricesInner&gt;**](ProductUpdateBatchPayloadInnerAdvancedPricesInner.md) | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **quantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **reserveQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **increaseQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **reduceQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **warehouseId** | **kotlin.String** |  |  [optional] |
| **manufacturerId** | **kotlin.String** |  |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **storeId** | **kotlin.String** |  |  [optional] |
| **langId** | **kotlin.String** |  |  [optional] |
| **taxClassId** | **kotlin.String** |  |  [optional] |
| **backorderStatus** | **kotlin.String** |  |  [optional] |
| **visible** | **kotlin.String** |  |  [optional] |
| **isDefault** | **kotlin.Boolean** |  |  [optional] |
| **inStock** | **kotlin.Boolean** |  |  [optional] |
| **isVirtual** | **kotlin.Boolean** |  |  [optional] |
| **downloadable** | **kotlin.Boolean** |  |  [optional] |
| **manageStock** | **kotlin.Boolean** |  |  [optional] |
| **isFreeShipping** | **kotlin.Boolean** |  |  [optional] |
| **seoUrl** | **kotlin.String** |  |  [optional] |
| **metaTitle** | **kotlin.String** |  |  [optional] |
| **metaDescription** | **kotlin.String** |  |  [optional] |
| **metaKeywords** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **categoriesIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **storesIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **images** | [**kotlin.collections.List&lt;ProductAddBatchPayloadInnerImagesInner&gt;**](ProductAddBatchPayloadInnerImagesInner.md) | The passed items will completely replace the original items |  [optional] |
| **productImagesIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **relatedProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **upSellProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |
| **crossSellProductsIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | If an empty array is passed, all entries will be deleted when the &#39;nested_items_update_behaviour&#39; parameter is set to &#39;replace&#39;. |  [optional] |



