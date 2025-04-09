
# Order

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **basketId** | **kotlin.String** |  |  [optional] |
| **channelId** | **kotlin.String** |  |  [optional] |
| **customer** | [**BaseCustomer**](BaseCustomer.md) |  |  [optional] |
| **createAt** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional] |
| **currency** | [**Currency**](Currency.md) |  |  [optional] |
| **shippingAddress** | [**CustomerAddress**](CustomerAddress.md) |  |  [optional] |
| **billingAddress** | [**CustomerAddress**](CustomerAddress.md) |  |  [optional] |
| **paymentMethod** | [**OrderPaymentMethod**](OrderPaymentMethod.md) |  |  [optional] |
| **shippingMethod** | [**OrderShippingMethod**](OrderShippingMethod.md) |  |  [optional] |
| **shippingMethods** | [**kotlin.collections.List&lt;OrderShippingMethod&gt;**](OrderShippingMethod.md) |  |  [optional] |
| **status** | [**OrderStatus**](OrderStatus.md) |  |  [optional] |
| **totals** | [**OrderTotals**](OrderTotals.md) |  |  [optional] |
| **total** | [**OrderTotal**](OrderTotal.md) |  |  [optional] |
| **discounts** | [**kotlin.collections.List&lt;OrderTotalsNewDiscount&gt;**](OrderTotalsNewDiscount.md) |  |  [optional] |
| **orderProducts** | [**kotlin.collections.List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
| **bundles** | [**kotlin.collections.List&lt;OrderItem&gt;**](OrderItem.md) |  |  [optional] |
| **modifiedAt** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional] |
| **finishedTime** | [**A2CDateTime**](A2CDateTime.md) |  |  [optional] |
| **comment** | **kotlin.String** |  |  [optional] |
| **storeId** | **kotlin.String** |  |  [optional] |
| **warehousesIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **refunds** | [**kotlin.collections.List&lt;OrderRefund&gt;**](OrderRefund.md) |  |  [optional] |
| **giftMessage** | **kotlin.String** |  |  [optional] |
| **orderDetailsUrl** | **kotlin.String** |  |  [optional] |
| **additionalFields** | [**kotlin.Any**](.md) |  |  [optional] |
| **customFields** | [**kotlin.Any**](.md) |  |  [optional] |



