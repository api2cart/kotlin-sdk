
# OrderShipmentAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.String** | Defines the order for which the shipment will be created |  [optional] |
| **warehouseId** | **kotlin.String** | This parameter is used for selecting a warehouse where you need to set/modify a product quantity. |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **shipmentProvider** | **kotlin.String** | Defines company name that provide tracking of shipment |  [optional] |
| **shippingMethod** | **kotlin.String** | Define shipping method |  [optional] |
| **items** | [**kotlin.collections.List&lt;OrderShipmentAddItemsInner&gt;**](OrderShipmentAddItemsInner.md) | Defines items in the order that will be shipped |  [optional] |
| **trackingNumbers** | [**kotlin.collections.List&lt;OrderShipmentAddTrackingNumbersInner&gt;**](OrderShipmentAddTrackingNumbersInner.md) | Defines shipment&#39;s tracking numbers that have to be added&lt;/br&gt; How set tracking numbers to appropriate carrier:&lt;ul&gt;&lt;li&gt;tracking_numbers[]&#x3D;a2c.demo1,a2c.demo2 - set default carrier&lt;/li&gt;&lt;li&gt;tracking_numbers[&lt;b&gt;carrier_id&lt;/b&gt;]&#x3D;a2c.demo - set appropriate carrier&lt;/li&gt;&lt;/ul&gt;To get the list of carriers IDs that are available in your store, use the &lt;a href &#x3D; \&quot;https://api2cart.com/docs/#/cart/CartInfo\&quot;&gt;cart.info&lt;/a &gt; method |  [optional] |
| **trackingLink** | **kotlin.String** | Defines custom tracking link |  [optional] |
| **isShipped** | **kotlin.Boolean** | Defines shipment&#39;s status |  [optional] |
| **sendNotifications** | **kotlin.Boolean** | Send notifications to customer after shipment was created |  [optional] |
| **adjustStock** | **kotlin.Boolean** | This parameter is used for adjust stock. |  [optional] |
| **enableCache** | **kotlin.Boolean** | If the value is &#39;true&#39; and order exist in our cache, we will use order.info from cache to prepare shipment items. |  [optional] |
| **checkProcessStatus** | **kotlin.Boolean** | Disable or enable check process status. Please note that the response will be slower due to additional requests to the store. |  [optional] |
| **useLatestApiVersion** | **kotlin.Boolean** | Use the latest platform API version |  [optional] |



