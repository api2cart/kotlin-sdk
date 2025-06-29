
# OrderAddOrderItemInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderItemId** | **kotlin.String** | Defines orders specified by order item id |  |
| **orderItemName** | **kotlin.String** | Defines orders specified by order item name |  |
| **orderItemPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines orders specified by order item price |  |
| **orderItemQuantity** | **kotlin.Int** | Defines orders specified by order item quantity |  |
| **orderItemModel** | **kotlin.String** | Defines orders specified by order item model |  [optional] |
| **orderItemWeight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines orders specified by order item weight |  [optional] |
| **orderItemVariantId** | **kotlin.String** | Ordered product variant. Where x is order item ID |  [optional] |
| **orderItemTax** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Percentage of tax for product order |  [optional] |
| **orderItemTaxClass** | **kotlin.String** | Id of the tax class of product. |  [optional] |
| **orderItemPriceIncludesTax** | **kotlin.Boolean** | Defines if item price includes tax |  [optional] |
| **orderItemParent** | **kotlin.Int** | Index of the parent grouped/bundle product |  [optional] |
| **orderItemParentOptionName** | **kotlin.String** | Option name of the parent grouped/bundle product |  [optional] |
| **orderItemAllowRefundItemsSeparately** | **kotlin.Boolean** | Indicates whether subitems of the grouped/bundle product can be refunded separately |  [optional] |
| **orderItemAllowShipItemsSeparately** | **kotlin.Boolean** | Indicates whether subitems of the grouped/bundle product can be shipped separately |  [optional] |
| **orderItemOption** | [**kotlin.collections.List&lt;OrderAddOrderItemInnerOrderItemOptionInner&gt;**](OrderAddOrderItemInnerOrderItemOptionInner.md) |  |  [optional] |
| **orderItemProperty** | [**kotlin.collections.List&lt;OrderAddOrderItemInnerOrderItemPropertyInner&gt;**](OrderAddOrderItemInnerOrderItemPropertyInner.md) |  |  [optional] |



