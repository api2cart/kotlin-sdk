
# ProductAddSpecificsInnerBookingDetails

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **location** | **kotlin.String** |  |  |
| **type** | [**inline**](#Type) |  |  |
| **sessionsCount** | **kotlin.Int** |  |  |
| **timeStrictValue** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  |
| **timeStrictType** | [**inline**](#TimeStrictType) |  |  |
| **availabilities** | [**kotlin.collections.List&lt;ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner&gt;**](ProductAddSpecificsInnerBookingDetailsAvailabilitiesInner.md) |  |  |
| **sessionDuration** | **kotlin.Int** |  |  [optional] |
| **sessionGap** | **kotlin.Int** |  |  [optional] |
| **overrides** | [**kotlin.collections.List&lt;ProductAddSpecificsInnerBookingDetailsOverridesInner&gt;**](ProductAddSpecificsInnerBookingDetailsOverridesInner.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | date, date_time |


<a id="TimeStrictType"></a>
## Enum: time_strict_type
| Name | Value |
| ---- | ----- |
| timeStrictType | days, hours, minutes |



