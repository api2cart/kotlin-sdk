
# ProductAddBatch

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **payload** | [**kotlin.collections.List&lt;ProductAddBatchPayloadInner&gt;**](ProductAddBatchPayloadInner.md) | Contains an array of product objects. The list of properties may vary depending on the specific platform. |  |
| **nestedItemsUpdateBehaviour** | [**inline**](#NestedItemsUpdateBehaviour) |  Determines how updates to nested items should be handled.&lt;hr&gt;&lt;div style&#x3D;\&quot;font-style:normal\&quot;&gt;  Values description:  &lt;div style&#x3D;\&quot;margin-left: 2%; padding-top: 2%\&quot;&gt;    &lt;div style&#x3D;\&quot;font-size:85%\&quot;&gt;      &lt;b&gt;  replace&lt;/b&gt;: This option indicates that the nested items should be completely replaced with the new data provided. &lt;/br&gt;      &lt;b&gt;  merge&lt;/b&gt;: With this option, updates to nested items are merged with the existing data. &lt;/br&gt;    &lt;/div&gt;  &lt;/div&gt;&lt;/div&gt; |  [optional] |
| **clearCache** | **kotlin.Boolean** |  |  [optional] |
| **reindex** | **kotlin.Boolean** |  |  [optional] |


<a id="NestedItemsUpdateBehaviour"></a>
## Enum: nested_items_update_behaviour
| Name | Value |
| ---- | ----- |
| nestedItemsUpdateBehaviour | replace, merge |



