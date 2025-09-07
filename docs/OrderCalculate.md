
# OrderCalculate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **customerEmail** | **kotlin.String** | Defines the customer specified by email for whom the order needs to be calculated |  |
| **shippFirstName** | **kotlin.String** | Specifies shipping first name |  |
| **shippLastName** | **kotlin.String** | Specifies shipping last name |  |
| **shippAddress1** | **kotlin.String** | Specifies first shipping address |  |
| **shippCity** | **kotlin.String** | Specifies shipping city |  |
| **shippPostcode** | **kotlin.String** | Specifies shipping postcode |  |
| **shippCountry** | **kotlin.String** | Specifies shipping country code |  |
| **orderItem** | [**kotlin.collections.List&lt;OrderCalculateOrderItemInner&gt;**](OrderCalculateOrderItemInner.md) |  |  |
| **currencyId** | **kotlin.String** | Currency Id |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **coupons** | **kotlin.collections.List&lt;kotlin.String&gt;** | Coupons that will be applied to order. If the order isn&#39;t eligible for any given discount code or there is no discount with such a code it will be skipped during calculation |  [optional] |
| **shippAddress2** | **kotlin.String** | Specifies second address line of a shipping street address |  [optional] |
| **shippState** | **kotlin.String** | Specifies shipping state code |  [optional] |
| **shippCompany** | **kotlin.String** | Specifies shipping company |  [optional] |
| **shippPhone** | **kotlin.String** | Specifies shipping phone |  [optional] |
| **billFirstName** | **kotlin.String** | Specifies billing first name |  [optional] |
| **billLastName** | **kotlin.String** | Specifies billing last name |  [optional] |
| **billAddress1** | **kotlin.String** | Specifies first billing address |  [optional] |
| **billAddress2** | **kotlin.String** | Specifies second billing address |  [optional] |
| **billCity** | **kotlin.String** | Specifies billing city |  [optional] |
| **billPostcode** | **kotlin.String** | Specifies billing postcode |  [optional] |
| **billState** | **kotlin.String** | Specifies billing state code |  [optional] |
| **billCountry** | **kotlin.String** | Specifies billing country code |  [optional] |
| **billCompany** | **kotlin.String** | Specifies billing company |  [optional] |
| **billPhone** | **kotlin.String** | Specifies billing phone |  [optional] |
| **responseFields** | **kotlin.String** | Set this parameter in order to choose which entity fields you want to retrieve |  [optional] |



