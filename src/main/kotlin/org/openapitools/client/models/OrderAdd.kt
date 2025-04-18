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

import org.openapitools.client.models.OrderAddNoteAttributesInner
import org.openapitools.client.models.OrderAddOrderItemInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param orderStatus Defines order status.
 * @param customerEmail Defines the customer specified by email for whom order has to be created
 * @param billFirstName Specifies billing first name
 * @param billLastName Specifies billing last name
 * @param billAddress1 Specifies first billing address
 * @param billCity Specifies billing city
 * @param billPostcode Specifies billing postcode
 * @param billState Specifies billing state code
 * @param billCountry Specifies billing country code
 * @param orderItem 
 * @param id Defines order's id
 * @param orderId Defines the order id if it is supported by the cart
 * @param storeId Defines store id where the order should be assigned
 * @param channelId Channel ID
 * @param sendNotifications Send notifications to customer after order was created
 * @param sendAdminNotifications Notify admin when new order was created.
 * @param shippFirstName Specifies shipping first name
 * @param shippLastName Specifies shipping last name
 * @param shippAddress1 Specifies first shipping address
 * @param shippCity Specifies shipping city
 * @param shippPostcode Specifies shipping postcode
 * @param shippState Specifies shipping state code
 * @param shippCountry Specifies shipping country code
 * @param totalPrice Defines order's total price
 * @param date Specifies an order creation date in format Y-m-d H:i:s
 * @param orderPaymentMethod Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid'
 * @param transactionId Payment transaction id
 * @param orderShippingMethod Defines order shipping method
 * @param currency Currency code of order
 * @param billAddress2 Specifies second billing address
 * @param billCompany Specifies billing company
 * @param billPhone Specifies billing phone
 * @param billFax Specifies billing fax
 * @param comment Specifies order comment
 * @param adminComment Specifies admin's order comment
 * @param adminPrivateComment Specifies private admin's order comment
 * @param customerFirstName Specifies customer's first name
 * @param customerLastName Specifies customer’s last name
 * @param customerPhone Specifies customer’s phone
 * @param customerCountry Specifies customer's address ISO code or name of country
 * @param customerBirthday Specifies customer’s birthday
 * @param customerFax Specifies customer’s fax
 * @param shippAddress2 Specifies second address line of a shipping street address
 * @param shippCompany Specifies shipping company
 * @param shippPhone Specifies shipping phone
 * @param shippFax Specifies shipping fax
 * @param dateModified Specifies order's  modification date
 * @param dateFinished Specifies order's  finished date
 * @param subtotalPrice Total price of all ordered products multiplied by their number, excluding tax, shipping price and discounts
 * @param taxPrice The value of tax cost for order
 * @param pricesIncTax Indicates whether prices and subtotal includes tax.
 * @param shippingPrice Specifies order's shipping price
 * @param shippingTax Specifies order's shipping price tax
 * @param carrierId Defines tracking carrier id
 * @param warehouseId This parameter is used for selecting a warehouse where you need to set/modify a product quantity.
 * @param discount Specifies order's discount
 * @param couponDiscount Specifies order's coupon discount
 * @param coupons Coupons that will be applied to order
 * @param giftCertificateDiscount Discounts for order with gift certificates
 * @param fulfillmentStatus Create order with fulfillment status
 * @param financialStatus Create order with financial status
 * @param totalPaid Defines total paid amount for the order
 * @param externalSource Identifying the system used to generate the order
 * @param tags Order tags
 * @param inventoryBehaviour The behaviour to use when updating inventory.<hr><div style=\"font-style:normal\">Values description:<div style=\"margin-left: 2%; padding-top: 2%\"><div style=\"font-size:85%\"><b>bypass</b> = Do not claim inventory </br></br><b>decrement_ignoring_policy</b> = Ignore the product's </br> inventory policy and claim amounts</br></br><b>decrement_obeying_policy</b> =  Obey the product's </br> inventory policy.</br></br></div></div></div>
 * @param createInvoice Defines whether the invoice is created automatically along with the order
 * @param noteAttributes Defines note attributes
 * @param totalWeight Defines the sum of all line item weights in grams for the order
 * @param clearCache Is cache clear required
 * @param origin The source of the order
 */


data class OrderAdd (

    /* Defines order status. */
    @Json(name = "order_status")
    val orderStatus: kotlin.String,

    /* Defines the customer specified by email for whom order has to be created */
    @Json(name = "customer_email")
    val customerEmail: kotlin.String,

    /* Specifies billing first name */
    @Json(name = "bill_first_name")
    val billFirstName: kotlin.String,

    /* Specifies billing last name */
    @Json(name = "bill_last_name")
    val billLastName: kotlin.String,

    /* Specifies first billing address */
    @Json(name = "bill_address_1")
    val billAddress1: kotlin.String,

    /* Specifies billing city */
    @Json(name = "bill_city")
    val billCity: kotlin.String,

    /* Specifies billing postcode */
    @Json(name = "bill_postcode")
    val billPostcode: kotlin.String,

    /* Specifies billing state code */
    @Json(name = "bill_state")
    val billState: kotlin.String,

    /* Specifies billing country code */
    @Json(name = "bill_country")
    val billCountry: kotlin.String,

    @Json(name = "order_item")
    val orderItem: kotlin.collections.List<OrderAddOrderItemInner>,

    /* Defines order's id */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Defines the order id if it is supported by the cart */
    @Json(name = "order_id")
    val orderId: kotlin.String? = null,

    /* Defines store id where the order should be assigned */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* Channel ID */
    @Json(name = "channel_id")
    val channelId: kotlin.String? = null,

    /* Send notifications to customer after order was created */
    @Json(name = "send_notifications")
    val sendNotifications: kotlin.Boolean? = false,

    /* Notify admin when new order was created. */
    @Json(name = "send_admin_notifications")
    val sendAdminNotifications: kotlin.Boolean? = false,

    /* Specifies shipping first name */
    @Json(name = "shipp_first_name")
    val shippFirstName: kotlin.String? = null,

    /* Specifies shipping last name */
    @Json(name = "shipp_last_name")
    val shippLastName: kotlin.String? = null,

    /* Specifies first shipping address */
    @Json(name = "shipp_address_1")
    val shippAddress1: kotlin.String? = null,

    /* Specifies shipping city */
    @Json(name = "shipp_city")
    val shippCity: kotlin.String? = null,

    /* Specifies shipping postcode */
    @Json(name = "shipp_postcode")
    val shippPostcode: kotlin.String? = null,

    /* Specifies shipping state code */
    @Json(name = "shipp_state")
    val shippState: kotlin.String? = null,

    /* Specifies shipping country code */
    @Json(name = "shipp_country")
    val shippCountry: kotlin.String? = null,

    /* Defines order's total price */
    @Json(name = "total_price")
    val totalPrice: java.math.BigDecimal? = null,

    /* Specifies an order creation date in format Y-m-d H:i:s */
    @Json(name = "date")
    val date: kotlin.String? = null,

    /* Defines order payment method.<br/>Setting order_payment_method on Shopify will also change financial_status field value to 'paid' */
    @Json(name = "order_payment_method")
    val orderPaymentMethod: kotlin.String? = null,

    /* Payment transaction id */
    @Json(name = "transaction_id")
    val transactionId: kotlin.String? = null,

    /* Defines order shipping method */
    @Json(name = "order_shipping_method")
    val orderShippingMethod: kotlin.String? = null,

    /* Currency code of order */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* Specifies second billing address */
    @Json(name = "bill_address_2")
    val billAddress2: kotlin.String? = null,

    /* Specifies billing company */
    @Json(name = "bill_company")
    val billCompany: kotlin.String? = null,

    /* Specifies billing phone */
    @Json(name = "bill_phone")
    val billPhone: kotlin.String? = null,

    /* Specifies billing fax */
    @Json(name = "bill_fax")
    val billFax: kotlin.String? = null,

    /* Specifies order comment */
    @Json(name = "comment")
    val comment: kotlin.String? = null,

    /* Specifies admin's order comment */
    @Json(name = "admin_comment")
    val adminComment: kotlin.String? = null,

    /* Specifies private admin's order comment */
    @Json(name = "admin_private_comment")
    val adminPrivateComment: kotlin.String? = null,

    /* Specifies customer's first name */
    @Json(name = "customer_first_name")
    val customerFirstName: kotlin.String? = null,

    /* Specifies customer’s last name */
    @Json(name = "customer_last_name")
    val customerLastName: kotlin.String? = null,

    /* Specifies customer’s phone */
    @Json(name = "customer_phone")
    val customerPhone: kotlin.String? = null,

    /* Specifies customer's address ISO code or name of country */
    @Json(name = "customer_country")
    val customerCountry: kotlin.String? = null,

    /* Specifies customer’s birthday */
    @Json(name = "customer_birthday")
    val customerBirthday: kotlin.String? = null,

    /* Specifies customer’s fax */
    @Json(name = "customer_fax")
    val customerFax: kotlin.String? = null,

    /* Specifies second address line of a shipping street address */
    @Json(name = "shipp_address_2")
    val shippAddress2: kotlin.String? = null,

    /* Specifies shipping company */
    @Json(name = "shipp_company")
    val shippCompany: kotlin.String? = null,

    /* Specifies shipping phone */
    @Json(name = "shipp_phone")
    val shippPhone: kotlin.String? = null,

    /* Specifies shipping fax */
    @Json(name = "shipp_fax")
    val shippFax: kotlin.String? = null,

    /* Specifies order's  modification date */
    @Json(name = "date_modified")
    val dateModified: kotlin.String? = null,

    /* Specifies order's  finished date */
    @Json(name = "date_finished")
    val dateFinished: kotlin.String? = null,

    /* Total price of all ordered products multiplied by their number, excluding tax, shipping price and discounts */
    @Json(name = "subtotal_price")
    val subtotalPrice: java.math.BigDecimal? = null,

    /* The value of tax cost for order */
    @Json(name = "tax_price")
    val taxPrice: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Indicates whether prices and subtotal includes tax. */
    @Json(name = "prices_inc_tax")
    val pricesIncTax: kotlin.Boolean? = false,

    /* Specifies order's shipping price */
    @Json(name = "shipping_price")
    val shippingPrice: java.math.BigDecimal? = java.math.BigDecimal("0"),

    /* Specifies order's shipping price tax */
    @Json(name = "shipping_tax")
    val shippingTax: java.math.BigDecimal? = null,

    /* Defines tracking carrier id */
    @Json(name = "carrier_id")
    val carrierId: kotlin.String? = null,

    /* This parameter is used for selecting a warehouse where you need to set/modify a product quantity. */
    @Json(name = "warehouse_id")
    val warehouseId: kotlin.String? = null,

    /* Specifies order's discount */
    @Json(name = "discount")
    val discount: java.math.BigDecimal? = null,

    /* Specifies order's coupon discount */
    @Json(name = "coupon_discount")
    val couponDiscount: java.math.BigDecimal? = null,

    /* Coupons that will be applied to order */
    @Json(name = "coupons")
    val coupons: kotlin.collections.List<kotlin.String>? = null,

    /* Discounts for order with gift certificates */
    @Json(name = "gift_certificate_discount")
    val giftCertificateDiscount: java.math.BigDecimal? = null,

    /* Create order with fulfillment status */
    @Json(name = "fulfillment_status")
    val fulfillmentStatus: kotlin.String? = null,

    /* Create order with financial status */
    @Json(name = "financial_status")
    val financialStatus: kotlin.String? = null,

    /* Defines total paid amount for the order */
    @Json(name = "total_paid")
    val totalPaid: java.math.BigDecimal? = null,

    /* Identifying the system used to generate the order */
    @Json(name = "external_source")
    val externalSource: kotlin.String? = null,

    /* Order tags */
    @Json(name = "tags")
    val tags: kotlin.String? = null,

    /* The behaviour to use when updating inventory.<hr><div style=\"font-style:normal\">Values description:<div style=\"margin-left: 2%; padding-top: 2%\"><div style=\"font-size:85%\"><b>bypass</b> = Do not claim inventory </br></br><b>decrement_ignoring_policy</b> = Ignore the product's </br> inventory policy and claim amounts</br></br><b>decrement_obeying_policy</b> =  Obey the product's </br> inventory policy.</br></br></div></div></div> */
    @Json(name = "inventory_behaviour")
    val inventoryBehaviour: kotlin.String? = "bypass",

    /* Defines whether the invoice is created automatically along with the order */
    @Json(name = "create_invoice")
    val createInvoice: kotlin.Boolean? = false,

    /* Defines note attributes */
    @Json(name = "note_attributes")
    val noteAttributes: kotlin.collections.List<OrderAddNoteAttributesInner>? = null,

    /* Defines the sum of all line item weights in grams for the order */
    @Json(name = "total_weight")
    val totalWeight: kotlin.Int? = null,

    /* Is cache clear required */
    @Json(name = "clear_cache")
    val clearCache: kotlin.Boolean? = true,

    /* The source of the order */
    @Json(name = "origin")
    val origin: kotlin.String? = null

) {


}

