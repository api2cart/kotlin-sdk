
# OrderAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderStatus** | **kotlin.String** | Defines order status. |  |
| **customerEmail** | **kotlin.String** | Defines the customer specified by email for whom order has to be created |  |
| **billFirstName** | **kotlin.String** | Specifies billing first name |  |
| **billLastName** | **kotlin.String** | Specifies billing last name |  |
| **billAddress1** | **kotlin.String** | Specifies first billing address |  |
| **billCity** | **kotlin.String** | Specifies billing city |  |
| **billPostcode** | **kotlin.String** | Specifies billing postcode |  |
| **billState** | **kotlin.String** | Specifies billing state code |  |
| **billCountry** | **kotlin.String** | Specifies billing country code |  |
| **orderItem** | [**kotlin.collections.List&lt;OrderAddOrderItemInner&gt;**](OrderAddOrderItemInner.md) |  |  |
| **id** | **kotlin.String** | Defines order&#39;s id |  [optional] |
| **orderId** | **kotlin.String** | Defines the order id if it is supported by the cart |  [optional] |
| **storeId** | **kotlin.String** | Defines store id where the order should be assigned |  [optional] |
| **channelId** | **kotlin.String** | Channel ID |  [optional] |
| **fulfillmentStatus** | **kotlin.String** | Create order with fulfillment status |  [optional] |
| **financialStatus** | **kotlin.String** | Create order with financial status |  [optional] |
| **customerFirstName** | **kotlin.String** | Specifies customer&#39;s first name |  [optional] |
| **customerLastName** | **kotlin.String** | Specifies customer’s last name |  [optional] |
| **customerPhone** | **kotlin.String** | Specifies customer’s phone |  [optional] |
| **customerCountry** | **kotlin.String** | Specifies customer&#39;s address ISO code or name of country |  [optional] |
| **customerBirthday** | **kotlin.String** | Specifies customer’s birthday |  [optional] |
| **customerFax** | **kotlin.String** | Specifies customer’s fax |  [optional] |
| **orderPaymentMethod** | **kotlin.String** | Defines order payment method.&lt;br/&gt;Setting order_payment_method on Shopify will also change financial_status field value to &#39;paid&#39; |  [optional] |
| **transactionId** | **kotlin.String** | Payment transaction id |  [optional] |
| **currency** | **kotlin.String** | Currency code of order |  [optional] |
| **date** | **kotlin.String** | Specifies an order creation date in format Y-m-d H:i:s |  [optional] |
| **dateModified** | **kotlin.String** | Specifies order&#39;s  modification date |  [optional] |
| **dateFinished** | **kotlin.String** | Specifies order&#39;s  finished date |  [optional] |
| **billAddress2** | **kotlin.String** | Specifies second billing address |  [optional] |
| **billCompany** | **kotlin.String** | Specifies billing company |  [optional] |
| **billPhone** | **kotlin.String** | Specifies billing phone |  [optional] |
| **billFax** | **kotlin.String** | Specifies billing fax |  [optional] |
| **shippFirstName** | **kotlin.String** | Specifies shipping first name |  [optional] |
| **shippLastName** | **kotlin.String** | Specifies shipping last name |  [optional] |
| **shippAddress1** | **kotlin.String** | Specifies first shipping address |  [optional] |
| **shippAddress2** | **kotlin.String** | Specifies second address line of a shipping street address |  [optional] |
| **shippCity** | **kotlin.String** | Specifies shipping city |  [optional] |
| **shippPostcode** | **kotlin.String** | Specifies shipping postcode |  [optional] |
| **shippState** | **kotlin.String** | Specifies shipping state code |  [optional] |
| **shippCountry** | **kotlin.String** | Specifies shipping country code |  [optional] |
| **shippCompany** | **kotlin.String** | Specifies shipping company |  [optional] |
| **shippPhone** | **kotlin.String** | Specifies shipping phone |  [optional] |
| **shippFax** | **kotlin.String** | Specifies shipping fax |  [optional] |
| **subtotalPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total price of all ordered products multiplied by their number, excluding tax, shipping price and discounts |  [optional] |
| **taxPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The value of tax cost for order |  [optional] |
| **totalPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines order&#39;s total price |  [optional] |
| **totalPaid** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Defines total paid amount for the order |  [optional] |
| **totalWeight** | **kotlin.Int** | Defines the sum of all line item weights in grams for the order |  [optional] |
| **pricesIncTax** | **kotlin.Boolean** | Indicates whether prices and subtotal includes tax. |  [optional] |
| **shippingPrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies order&#39;s shipping price |  [optional] |
| **shippingTax** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies order&#39;s shipping price tax |  [optional] |
| **discount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies order&#39;s discount |  [optional] |
| **couponDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Specifies order&#39;s coupon discount |  [optional] |
| **giftCertificateDiscount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Discounts for order with gift certificates |  [optional] |
| **orderShippingMethod** | **kotlin.String** | Defines order shipping method |  [optional] |
| **carrierId** | **kotlin.String** | Defines tracking carrier id |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **coupons** | **kotlin.collections.List&lt;kotlin.String&gt;** | Coupons that will be applied to order |  [optional] |
| **tags** | **kotlin.String** | Order tags |  [optional] |
| **comment** | **kotlin.String** | Specifies order comment |  [optional] |
| **adminComment** | **kotlin.String** | Specifies admin&#39;s order comment |  [optional] |
| **adminPrivateComment** | **kotlin.String** | Specifies private admin&#39;s order comment |  [optional] |
| **sendNotifications** | **kotlin.Boolean** | Send notifications to customer after order was created |  [optional] |
| **sendAdminNotifications** | **kotlin.Boolean** | Notify admin when new order was created. |  [optional] |
| **externalSource** | **kotlin.String** | Identifying the system used to generate the order |  [optional] |
| **inventoryBehaviour** | **kotlin.String** | The behaviour to use when updating inventory.&lt;hr&gt;&lt;div style&#x3D;\&quot;font-style:normal\&quot;&gt;Values description:&lt;div style&#x3D;\&quot;margin-left: 2%; padding-top: 2%\&quot;&gt;&lt;div style&#x3D;\&quot;font-size:85%\&quot;&gt;&lt;b&gt;bypass&lt;/b&gt; &#x3D; Do not claim inventory &lt;/br&gt;&lt;/br&gt;&lt;b&gt;decrement_ignoring_policy&lt;/b&gt; &#x3D; Ignore the product&#39;s &lt;/br&gt; inventory policy and claim amounts&lt;/br&gt;&lt;/br&gt;&lt;b&gt;decrement_obeying_policy&lt;/b&gt; &#x3D;  Obey the product&#39;s &lt;/br&gt; inventory policy.&lt;/br&gt;&lt;/br&gt;&lt;/div&gt;&lt;/div&gt;&lt;/div&gt; |  [optional] |
| **createInvoice** | **kotlin.Boolean** | Defines whether the invoice is created automatically along with the order |  [optional] |
| **noteAttributes** | [**kotlin.collections.List&lt;OrderAddNoteAttributesInner&gt;**](OrderAddNoteAttributesInner.md) | Defines note attributes |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |
| **origin** | **kotlin.String** | The source of the order |  [optional] |



