
# ProductVariantImageAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **productVariantId** | **kotlin.String** | Defines product&#39;s variants specified by variant id |  |
| **imageName** | **kotlin.String** | Defines image&#39;s name |  |
| **type** | [**inline**](#Type) | Defines image&#39;s types that are specified by comma-separated list |  |
| **productId** | **kotlin.String** | Defines product id where the variant image has to be added |  [optional] |
| **storeId** | **kotlin.String** | Store Id |  [optional] |
| **url** | **kotlin.String** | Defines URL of the image that has to be added |  [optional] |
| **content** | **kotlin.String** | Content(body) encoded in base64 of image file |  [optional] |
| **label** | **kotlin.String** | Defines alternative text that has to be attached to the picture |  [optional] |
| **mime** | **kotlin.String** | Mime type of image http://en.wikipedia.org/wiki/Internet_media_type. |  [optional] |
| **position** | **kotlin.Int** | Defines image’s position in the list |  [optional] |
| **optionId** | **kotlin.String** | Defines option id of the product variant for which the image will be added |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | small, base, additional, thumbnail |



