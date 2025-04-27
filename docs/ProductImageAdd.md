
# ProductImageAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Defines image&#39;s types that are specified by comma-separated list |  |
| **imageName** | **kotlin.String** | Defines image&#39;s name |  |
| **productId** | **kotlin.String** | Defines product id where the image should be added |  [optional] |
| **productVariantId** | **kotlin.String** | Defines product&#39;s variants specified by variant id |  [optional] |
| **variantIds** | **kotlin.String** | Defines product&#39;s variants ids |  [optional] |
| **optionValueIds** | **kotlin.String** | Defines product&#39;s option values ids |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **langId** | **kotlin.String** | Add product image on specified language id |  [optional] |
| **url** | **kotlin.String** | Defines URL of the image that has to be added |  [optional] |
| **content** | **kotlin.String** | Content(body) encoded in base64 of image file |  [optional] |
| **label** | **kotlin.String** | Defines alternative text that has to be attached to the picture |  [optional] |
| **mime** | **kotlin.String** | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. |  [optional] |
| **position** | **kotlin.Int** | Defines image’s position in the list |  [optional] |
| **useLatestApiVersion** | **kotlin.Boolean** | Use the latest platform API version |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | small, base, additional, thumbnail |



