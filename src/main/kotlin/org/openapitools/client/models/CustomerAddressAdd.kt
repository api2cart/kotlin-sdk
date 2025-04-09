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
 * @param customerId Defines customer id
 * @param address1 Specifies customer's address address1
 * @param city Specifies customer's address city
 * @param country Specifies customer's address ISO code or name of country
 * @param postcode Specifies customer's address postcode
 * @param storeId Store Id
 * @param firstName Defines customer's address first name
 * @param lastName Defines customer's address last name
 * @param company Defines customer's address company
 * @param address2 Specifies customer's address address2
 * @param state Specifies customer's address ISO code or name of state
 * @param identificationNumber Specifies the national ID card number of this person, or a unique tax identification number for customer's address
 * @param types Specifies customer's address types
 * @param default Specifies whether the customer's address is used by default
 * @param phone Defines customer's address phone number
 * @param phoneMobile Defines customer's address mobile phone number
 * @param fax Defines customer's address fax
 * @param website Defines Link to customer's address website
 * @param gender Defines customer's address gender
 * @param taxId Add Tax Id
 * @param alias Specifies customer's alias in the address book
 */


data class CustomerAddressAdd (

    /* Defines customer id */
    @Json(name = "customer_id")
    val customerId: kotlin.String,

    /* Specifies customer's address address1 */
    @Json(name = "address1")
    val address1: kotlin.String,

    /* Specifies customer's address city */
    @Json(name = "city")
    val city: kotlin.String,

    /* Specifies customer's address ISO code or name of country */
    @Json(name = "country")
    val country: kotlin.String,

    /* Specifies customer's address postcode */
    @Json(name = "postcode")
    val postcode: kotlin.String,

    /* Store Id */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* Defines customer's address first name */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* Defines customer's address last name */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* Defines customer's address company */
    @Json(name = "company")
    val company: kotlin.String? = null,

    /* Specifies customer's address address2 */
    @Json(name = "address2")
    val address2: kotlin.String? = null,

    /* Specifies customer's address ISO code or name of state */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* Specifies the national ID card number of this person, or a unique tax identification number for customer's address */
    @Json(name = "identification_number")
    val identificationNumber: kotlin.String? = null,

    /* Specifies customer's address types */
    @Json(name = "types")
    val types: kotlin.collections.List<kotlin.String>? = null,

    /* Specifies whether the customer's address is used by default */
    @Json(name = "default")
    val default: kotlin.Boolean? = null,

    /* Defines customer's address phone number */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* Defines customer's address mobile phone number */
    @Json(name = "phone_mobile")
    val phoneMobile: kotlin.String? = null,

    /* Defines customer's address fax */
    @Json(name = "fax")
    val fax: kotlin.String? = null,

    /* Defines Link to customer's address website */
    @Json(name = "website")
    val website: kotlin.String? = null,

    /* Defines customer's address gender */
    @Json(name = "gender")
    val gender: kotlin.String? = null,

    /* Add Tax Id */
    @Json(name = "tax_id")
    val taxId: kotlin.String? = null,

    /* Specifies customer's alias in the address book */
    @Json(name = "alias")
    val alias: kotlin.String? = null

) {


}

