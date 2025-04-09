
# OrderReturnAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **returnStatusId** | **kotlin.String** | Defines return request status |  |
| **returnActionId** | **kotlin.String** | Defines return request action |  |
| **returnReasonId** | **kotlin.String** | Defines return request reason |  |
| **orderProducts** | [**kotlin.collections.List&lt;OrderReturnAddOrderProductsInner&gt;**](OrderReturnAddOrderProductsInner.md) |  |  |
| **orderId** | **kotlin.String** | Defines the order id |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **returnReason** | **kotlin.String** | Defines return request reason |  [optional] |
| **itemRestock** | **kotlin.Boolean** | Boolean, whether or not to add the line items back to the store inventory. |  [optional] |
| **staffNote** | **kotlin.String** | Specifies staff note |  [optional] |
| **comment** | **kotlin.String** | Specifies return comment |  [optional] |
| **sendNotifications** | **kotlin.Boolean** | Send notifications to customer after order was created |  [optional] |
| **rejectReason** | **kotlin.String** | Defines return reject reason |  [optional] |



