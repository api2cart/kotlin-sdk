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

import org.openapitools.client.models.OrderFinancialStatusList200ResponseResultOrderFinancialStatusesInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param orderFinancialStatuses 
 */


data class OrderFinancialStatusList200ResponseResult (

    @Json(name = "order_financial_statuses")
    val orderFinancialStatuses: kotlin.collections.List<OrderFinancialStatusList200ResponseResultOrderFinancialStatusesInner>? = null

) {


}

