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

import org.openapitools.client.models.CustomerAddConsentsInner
import org.openapitools.client.models.CustomerUpdateAddressInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Entity id
 * @param groupId Customer group_id
 * @param groupIds Groups that will be assigned to a customer
 * @param group Defines the group where the customer
 * @param email Defines customer's email
 * @param phone Defines customer's phone number
 * @param firstName Defines customer's first name
 * @param lastName Defines customer's last name
 * @param birthDay Defines customer's birthday
 * @param newsLetterSubscription Defines whether the newsletter subscription is available for the user
 * @param consents Defines consents to notifications
 * @param tags Customer tags
 * @param gender Defines customer's gender
 * @param storeId Store Id
 * @param note The customer note.
 * @param status Defines customer's status
 * @param address 
 */


data class CustomerUpdate (

    /* Entity id */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Customer group_id */
    @Json(name = "group_id")
    val groupId: kotlin.String? = null,

    /* Groups that will be assigned to a customer */
    @Json(name = "group_ids")
    val groupIds: kotlin.String? = null,

    /* Defines the group where the customer */
    @Json(name = "group")
    val group: kotlin.String? = null,

    /* Defines customer's email */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* Defines customer's phone number */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* Defines customer's first name */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* Defines customer's last name */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* Defines customer's birthday */
    @Json(name = "birth_day")
    val birthDay: kotlin.String? = null,

    /* Defines whether the newsletter subscription is available for the user */
    @Json(name = "news_letter_subscription")
    val newsLetterSubscription: kotlin.Boolean? = null,

    /* Defines consents to notifications */
    @Json(name = "consents")
    val consents: kotlin.collections.List<CustomerAddConsentsInner>? = null,

    /* Customer tags */
    @Json(name = "tags")
    val tags: kotlin.String? = null,

    /* Defines customer's gender */
    @Json(name = "gender")
    val gender: kotlin.String? = null,

    /* Store Id */
    @Json(name = "store_id")
    val storeId: kotlin.String? = null,

    /* The customer note. */
    @Json(name = "note")
    val note: kotlin.String? = null,

    /* Defines customer's status */
    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "address")
    val address: kotlin.collections.List<CustomerUpdateAddressInner>? = null

) {


}

