
# ProductOptionAdd

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Defines option&#39;s name |  |
| **type** | [**inline**](#Type) | Defines option&#39;s type that has to be added |  |
| **productId** | **kotlin.String** | Defines product id where the option should be added |  [optional] |
| **defaultOptionValue** | **kotlin.String** | Defines default option value that has to be added |  [optional] |
| **optionValues** | **kotlin.String** | Defines option values that has to be added |  [optional] |
| **description** | **kotlin.String** | Defines option&#39;s description |  [optional] |
| **avail** | **kotlin.Boolean** | Defines whether the option is available |  [optional] |
| **sortOrder** | **kotlin.Int** | Sort number in the list |  [optional] |
| **required** | **kotlin.Boolean** | Defines if the option is required |  [optional] |
| **propertyValues** | [**kotlin.collections.List&lt;ProductOptionAddValuesInner&gt;**](ProductOptionAddValuesInner.md) | An array of option values.&lt;/b&gt; |  [optional] |
| **clearCache** | **kotlin.Boolean** | Is cache clear required |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | option_type_select, option_type_text, option_type_radio, option_type_checkbox, option_type_textarea, option_type_readonly, option_type_multiselect, option_type_multicheckbox, option_type_file, option_type_date, option_type_datetime, option_type_time |



