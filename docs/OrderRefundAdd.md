
# OrderRefundAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.String** | Defines the order for which the refund will be created. |  [optional] |
| **items** | [**kotlin.collections.List&lt;OrderRefundAddItemsInner&gt;**](OrderRefundAddItemsInner.md) | Defines items in the order that will be refunded |  [optional] |
| **totalPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines order refund amount. |  [optional] |
| **shippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines refund shipping amount. |  [optional] |
| **feePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies refund&#39;s fee price |  [optional] |
| **message** | **kotlin.String** | Refund reason, or some else message which assigned to refund. |  [optional] |
| **itemRestock** | **kotlin.Boolean** | Boolean, whether or not to add the line items back to the store inventory. |  [optional] |
| **sendNotifications** | **kotlin.Boolean** | Send notifications to customer after refund was created |  [optional] |
| **date** | **kotlin.String** | Specifies an order creation date in format Y-m-d H:i:s |  [optional] |
| **isOnline** | **kotlin.Boolean** | Indicates whether refund type is online |  [optional] |



