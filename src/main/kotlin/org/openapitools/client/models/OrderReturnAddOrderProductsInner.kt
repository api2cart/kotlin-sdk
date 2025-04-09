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
 * @param orderProductId Defines which products from the order should be returned
 * @param orderProductQuantity Defines how many product units from the order should be returned
 * @param orderProductReasonId Defines the ID of the return reason
 * @param orderProductActionId Defines the ID of the return action
 * @param orderProductCustomerComment Defines the customer's comment for return
 * @param orderProductHandlingStatus Defines handling status
 * @param orderProductCondition Defines the product condition
 * @param orderProductReason Defines return reason
 * @param orderProductStatus Defines product return status
 */


data class OrderReturnAddOrderProductsInner (

    /* Defines which products from the order should be returned */
    @Json(name = "order_product_id")
    val orderProductId: kotlin.String,

    /* Defines how many product units from the order should be returned */
    @Json(name = "order_product_quantity")
    val orderProductQuantity: kotlin.Int,

    /* Defines the ID of the return reason */
    @Json(name = "order_product_reason_id")
    val orderProductReasonId: kotlin.String,

    /* Defines the ID of the return action */
    @Json(name = "order_product_action_id")
    val orderProductActionId: kotlin.String,

    /* Defines the customer's comment for return */
    @Json(name = "order_product_customer_comment")
    val orderProductCustomerComment: kotlin.String? = null,

    /* Defines handling status */
    @Json(name = "order_product_handling_status")
    val orderProductHandlingStatus: kotlin.String? = null,

    /* Defines the product condition */
    @Json(name = "order_product_condition")
    val orderProductCondition: kotlin.String? = null,

    /* Defines return reason */
    @Json(name = "order_product_reason")
    val orderProductReason: kotlin.String? = null,

    /* Defines product return status */
    @Json(name = "order_product_status")
    val orderProductStatus: kotlin.String? = null

) {


}

