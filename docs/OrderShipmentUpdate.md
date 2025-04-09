
# OrderShipmentUpdate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **shipmentId** | **kotlin.String** | Shipment id indicates the number of delivery |  |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **orderId** | **kotlin.String** | Defines the order that will be updated |  [optional] |
| **trackingNumbers** | [**kotlin.collections.List&lt;OrderShipmentAddTrackingNumbersInner&gt;**](OrderShipmentAddTrackingNumbersInner.md) | Defines shipment&#39;s tracking numbers that have to be added&lt;/br&gt; How set tracking numbers to appropriate carrier:&lt;ul&gt;&lt;li&gt;tracking_numbers[]&#x3D;a2c.demo1,a2c.demo2 - set default carrier&lt;/li&gt;&lt;li&gt;tracking_numbers[&lt;b&gt;carrier_id&lt;/b&gt;]&#x3D;a2c.demo - set appropriate carrier&lt;/li&gt;&lt;/ul&gt;To get the list of carriers IDs that are available in your store, use the &lt;a href &#x3D; \&quot;https://api2cart.com/docs/#/cart/CartInfo\&quot;&gt;cart.info&lt;/a &gt; method |  [optional] |
| **replace** | **kotlin.Boolean** | Allows rewrite tracking numbers |  [optional] |
| **isShipped** | **kotlin.Boolean** | Defines shipment&#39;s status |  [optional] |
| **trackingLink** | **kotlin.String** | Defines custom tracking link |  [optional] |
| **deliveredAt** | **kotlin.String** | Defines the date of delivery |  [optional] |
| **shipmentProvider** | **kotlin.String** | Defines company name that provide tracking of shipment |  [optional] |



