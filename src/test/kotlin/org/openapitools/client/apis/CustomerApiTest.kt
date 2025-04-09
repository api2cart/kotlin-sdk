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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.CustomerApi
import org.openapitools.client.models.AccountConfigUpdate200Response
import org.openapitools.client.models.AttributeAdd200Response
import org.openapitools.client.models.CustomerAdd
import org.openapitools.client.models.CustomerAdd200Response
import org.openapitools.client.models.CustomerAddressAdd
import org.openapitools.client.models.CustomerCount200Response
import org.openapitools.client.models.CustomerDelete200Response
import org.openapitools.client.models.CustomerFind200Response
import org.openapitools.client.models.CustomerGroupAdd200Response
import org.openapitools.client.models.CustomerInfo200Response
import org.openapitools.client.models.CustomerUpdate
import org.openapitools.client.models.ModelResponseCustomerAttributeList
import org.openapitools.client.models.ModelResponseCustomerGroupList
import org.openapitools.client.models.ModelResponseCustomerList
import org.openapitools.client.models.ModelResponseCustomerWishlistList

class CustomerApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomerApi
        //val apiInstance = CustomerApi()

        // to test customerAdd
        should("test customerAdd") {
            // uncomment below to test customerAdd
            //val customerAdd : CustomerAdd =  // CustomerAdd | 
            //val result : CustomerAdd200Response = apiInstance.customerAdd(customerAdd)
            //result shouldBe ("TODO")
        }

        // to test customerAddressAdd
        should("test customerAddressAdd") {
            // uncomment below to test customerAddressAdd
            //val customerAddressAdd : CustomerAddressAdd =  // CustomerAddressAdd | 
            //val result : AttributeAdd200Response = apiInstance.customerAddressAdd(customerAddressAdd)
            //result shouldBe ("TODO")
        }

        // to test customerAttributeList
        should("test customerAttributeList") {
            // uncomment below to test customerAttributeList
            //val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val langId : kotlin.String = 3 // kotlin.String | Language id
            //val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : ModelResponseCustomerAttributeList = apiInstance.customerAttributeList(customerId, count, pageCursor, storeId, langId, params, exclude, responseFields)
            //result shouldBe ("TODO")
        }

        // to test customerCount
        should("test customerCount") {
            // uncomment below to test customerCount
            //val groupId : kotlin.String = 3 // kotlin.String | Customer group_id
            //val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
            //val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
            //val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
            //val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
            //val storeId : kotlin.String = 1 // kotlin.String | Counts customer specified by store id
            //val customerListId : kotlin.String = exampleListId // kotlin.String | The numeric ID of the customer list in Demandware.
            //val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
            //val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
            //val findWhere : kotlin.String = email // kotlin.String | Counts customers that are searched specified by field
            //val ids : kotlin.String = 24,25 // kotlin.String | Counts customers specified by ids
            //val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
            //val result : CustomerCount200Response = apiInstance.customerCount(groupId, createdFrom, createdTo, modifiedFrom, modifiedTo, storeId, customerListId, avail, findValue, findWhere, ids, sinceId)
            //result shouldBe ("TODO")
        }

        // to test customerDelete
        should("test customerDelete") {
            // uncomment below to test customerDelete
            //val id : kotlin.String = 10 // kotlin.String | Identifies customer specified by the id
            //val result : CustomerDelete200Response = apiInstance.customerDelete(id)
            //result shouldBe ("TODO")
        }

        // to test customerFind
        should("test customerFind") {
            // uncomment below to test customerFind
            //val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
            //val findWhere : kotlin.String = email // kotlin.String | Entity search that is specified by the comma-separated unique fields
            //val findParams : kotlin.String = regex // kotlin.String | Entity search that is specified by comma-separated parameters
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val result : CustomerFind200Response = apiInstance.customerFind(findValue, findWhere, findParams, storeId)
            //result shouldBe ("TODO")
        }

        // to test customerGroupAdd
        should("test customerGroupAdd") {
            // uncomment below to test customerGroupAdd
            //val name : kotlin.String = new_group // kotlin.String | Customer group name
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val storesIds : kotlin.String = 1,2 // kotlin.String | Assign customer group to the stores that is specified by comma-separated stores' id
            //val result : CustomerGroupAdd200Response = apiInstance.customerGroupAdd(name, storeId, storesIds)
            //result shouldBe ("TODO")
        }

        // to test customerGroupList
        should("test customerGroupList") {
            // uncomment below to test customerGroupList
            //val disableCache : kotlin.Boolean = false // kotlin.Boolean | Disable cache for current request
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val langId : kotlin.String = 3 // kotlin.String | Language id
            //val groupIds : kotlin.String = 1,2,3 // kotlin.String | Groups that will be assigned to a customer
            //val params : kotlin.String = id,model,price,images // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = false // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : ModelResponseCustomerGroupList = apiInstance.customerGroupList(disableCache, pageCursor, start, count, storeId, langId, groupIds, params, exclude, responseFields)
            //result shouldBe ("TODO")
        }

        // to test customerInfo
        should("test customerInfo") {
            // uncomment below to test customerInfo
            //val id : kotlin.String = 10 // kotlin.String | Retrieves customer's info specified by customer id
            //val params : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val responseFields : kotlin.String = {result{id,parent_id,sku,upc,images,combination}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val storeId : kotlin.String = 1 // kotlin.String | Retrieves customer info specified by store id
            //val result : CustomerInfo200Response = apiInstance.customerInfo(id, params, responseFields, exclude, storeId)
            //result shouldBe ("TODO")
        }

        // to test customerList
        should("test customerList") {
            // uncomment below to test customerList
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
            //val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
            //val modifiedFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their modification date
            //val modifiedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their modification date
            //val params : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val responseFields : kotlin.String = {result{customer}} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val exclude : kotlin.String = id,email // kotlin.String | Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter `params` equal force_all
            //val groupId : kotlin.String = 3 // kotlin.String | Customer group_id
            //val storeId : kotlin.String = 1 // kotlin.String | Retrieves customers specified by store id
            //val customerListId : kotlin.String = exampleListId // kotlin.String | The numeric ID of the customer list in Demandware.
            //val avail : kotlin.Boolean = false // kotlin.Boolean | Defines category's visibility status
            //val findValue : kotlin.String = mail@gmail.com // kotlin.String | Entity search that is specified by some value
            //val findWhere : kotlin.String = email // kotlin.String | Customer search that is specified by field
            //val sortBy : kotlin.String = value_id // kotlin.String | Set field to sort by
            //val sortDirection : kotlin.String = asc // kotlin.String | Set sorting direction
            //val ids : kotlin.String = 24,25 // kotlin.String | Retrieves customers specified by ids
            //val sinceId : kotlin.String = 56 // kotlin.String | Retrieve entities starting from the specified id.
            //val result : ModelResponseCustomerList = apiInstance.customerList(pageCursor, start, count, createdFrom, createdTo, modifiedFrom, modifiedTo, params, responseFields, exclude, groupId, storeId, customerListId, avail, findValue, findWhere, sortBy, sortDirection, ids, sinceId)
            //result shouldBe ("TODO")
        }

        // to test customerUpdate
        should("test customerUpdate") {
            // uncomment below to test customerUpdate
            //val customerUpdate : CustomerUpdate =  // CustomerUpdate | 
            //val result : AccountConfigUpdate200Response = apiInstance.customerUpdate(customerUpdate)
            //result shouldBe ("TODO")
        }

        // to test customerWishlistList
        should("test customerWishlistList") {
            // uncomment below to test customerWishlistList
            //val customerId : kotlin.String = 5 // kotlin.String | Retrieves orders specified by customer id
            //val id : kotlin.String = 10 // kotlin.String | Entity id
            //val storeId : kotlin.String = 1 // kotlin.String | Store Id
            //val start : kotlin.Int = 0 // kotlin.Int | This parameter sets the number from which you want to get entities
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val responseFields : kotlin.String = {return_code,return_message,pagination,result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : ModelResponseCustomerWishlistList = apiInstance.customerWishlistList(customerId, id, storeId, start, count, pageCursor, responseFields)
            //result shouldBe ("TODO")
        }

    }
}
