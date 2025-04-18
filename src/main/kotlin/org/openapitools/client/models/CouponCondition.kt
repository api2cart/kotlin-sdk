/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param entity 
 * @param matchItems 
 * @param key 
 * @param `operator` 
 * @param `value` 
 * @param logicOperator 
 * @param subConditions 
 * @param additionalFields 
 * @param customFields 
 */


data class CouponCondition (

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "entity")
    val entity: kotlin.String? = null,

    @Json(name = "match_items")
    val matchItems: kotlin.String? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "operator")
    val `operator`: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "logic_operator")
    val logicOperator: kotlin.String? = null,

    @Json(name = "sub-conditions")
    val subConditions: kotlin.collections.List<CouponCondition>? = null,

    @Json(name = "additional_fields")
    val additionalFields: kotlin.Any? = null,

    @Json(name = "custom_fields")
    val customFields: kotlin.Any? = null

) {


}

