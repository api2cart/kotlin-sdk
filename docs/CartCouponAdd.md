
# CartCouponAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | **kotlin.String** | Coupon code |  |
| **actionType** | [**inline**](#ActionType) | Coupon discount type |  |
| **actionApplyTo** | [**inline**](#ActionApplyTo) | Defines where discount should be applied |  |
| **actionScope** | [**inline**](#ActionScope) | Specify how discount should be applied. If scope&#x3D;matching_items, then discount will be applied to each of the items that match action conditions. Scope order means that discount will be applied once. |  |
| **actionAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines the discount amount value. |  |
| **codes** | **kotlin.collections.List&lt;kotlin.String&gt;** | Entity codes |  [optional] |
| **name** | **kotlin.String** | Coupon name |  [optional] |
| **dateStart** | **kotlin.String** | Date start |  [optional] |
| **dateEnd** | **kotlin.String** | Defines when discount code will be expired. |  [optional] |
| **usageLimit** | **kotlin.Int** | Usage limit for coupon. |  [optional] |
| **usageLimitPerCustomer** | **kotlin.Int** | Usage limit per customer. |  [optional] |
| **actionConditionEntity** | **kotlin.String** | Defines entity for action condition. |  [optional] |
| **actionConditionKey** | **kotlin.String** | Defines entity attribute code for action condition. |  [optional] |
| **actionConditionOperator** | **kotlin.String** | Defines condition operator. |  [optional] |
| **actionConditionValue** | **kotlin.String** | Defines condition attribute value/s. Can be comma separated string. |  [optional] |
| **includeTax** | **kotlin.Boolean** | Indicates whether to apply a discount for taxes. |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **freeCashOnDelivery** | **kotlin.Boolean** | Defines whether the coupon provides free cash on delivery |  [optional] |


<a id="ActionType"></a>
## Enum: action_type
| Name | Value |
| ---- | ----- |
| actionType | percent, fixed |


<a id="ActionApplyTo"></a>
## Enum: action_apply_to
| Name | Value |
| ---- | ----- |
| actionApplyTo | order_total, item_price, shipping |


<a id="ActionScope"></a>
## Enum: action_scope
| Name | Value |
| ---- | ----- |
| actionScope | order, matching_items |



