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

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import org.openapitools.client.models.ModelResponseSubscriberList

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class SubscriberApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.api2cart.com/v1.1")
        }
    }

    /**
     * subscriber.list
     * Get subscribers list
     * @param start This parameter sets the number from which you want to get entities (optional, default to 0)
     * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 (optional, default to 10)
     * @param subscribed Filter by subscription status (optional)
     * @param storeId Store Id (optional)
     * @param email Filter subscribers by email (optional)
     * @param params Set this parameter in order to choose which entity fields you want to retrieve (optional, default to "force_all")
     * @param exclude Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all (optional)
     * @param createdFrom Retrieve entities from their creation date (optional)
     * @param createdTo Retrieve entities to their creation date (optional)
     * @param modifiedFrom Retrieve entities from their modification date (optional)
     * @param modifiedTo Retrieve entities to their modification date (optional)
     * @param pageCursor Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) (optional)
     * @param responseFields Set this parameter in order to choose which entity fields you want to retrieve (optional)
     * @return ModelResponseSubscriberList
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun subscriberList(start: kotlin.Int? = 0, count: kotlin.Int? = 10, subscribed: kotlin.Boolean? = null, storeId: kotlin.String? = null, email: kotlin.String? = null, params: kotlin.String? = "force_all", exclude: kotlin.String? = null, createdFrom: kotlin.String? = null, createdTo: kotlin.String? = null, modifiedFrom: kotlin.String? = null, modifiedTo: kotlin.String? = null, pageCursor: kotlin.String? = null, responseFields: kotlin.String? = null) : ModelResponseSubscriberList {
        val localVarResponse = subscriberListWithHttpInfo(start = start, count = count, subscribed = subscribed, storeId = storeId, email = email, params = params, exclude = exclude, createdFrom = createdFrom, createdTo = createdTo, modifiedFrom = modifiedFrom, modifiedTo = modifiedTo, pageCursor = pageCursor, responseFields = responseFields)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ModelResponseSubscriberList
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * subscriber.list
     * Get subscribers list
     * @param start This parameter sets the number from which you want to get entities (optional, default to 0)
     * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 (optional, default to 10)
     * @param subscribed Filter by subscription status (optional)
     * @param storeId Store Id (optional)
     * @param email Filter subscribers by email (optional)
     * @param params Set this parameter in order to choose which entity fields you want to retrieve (optional, default to "force_all")
     * @param exclude Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all (optional)
     * @param createdFrom Retrieve entities from their creation date (optional)
     * @param createdTo Retrieve entities to their creation date (optional)
     * @param modifiedFrom Retrieve entities from their modification date (optional)
     * @param modifiedTo Retrieve entities to their modification date (optional)
     * @param pageCursor Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) (optional)
     * @param responseFields Set this parameter in order to choose which entity fields you want to retrieve (optional)
     * @return ApiResponse<ModelResponseSubscriberList?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun subscriberListWithHttpInfo(start: kotlin.Int?, count: kotlin.Int?, subscribed: kotlin.Boolean?, storeId: kotlin.String?, email: kotlin.String?, params: kotlin.String?, exclude: kotlin.String?, createdFrom: kotlin.String?, createdTo: kotlin.String?, modifiedFrom: kotlin.String?, modifiedTo: kotlin.String?, pageCursor: kotlin.String?, responseFields: kotlin.String?) : ApiResponse<ModelResponseSubscriberList?> {
        val localVariableConfig = subscriberListRequestConfig(start = start, count = count, subscribed = subscribed, storeId = storeId, email = email, params = params, exclude = exclude, createdFrom = createdFrom, createdTo = createdTo, modifiedFrom = modifiedFrom, modifiedTo = modifiedTo, pageCursor = pageCursor, responseFields = responseFields)

        return request<Unit, ModelResponseSubscriberList>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation subscriberList
     *
     * @param start This parameter sets the number from which you want to get entities (optional, default to 0)
     * @param count This parameter sets the entity amount that has to be retrieved. Max allowed count&#x3D;250 (optional, default to 10)
     * @param subscribed Filter by subscription status (optional)
     * @param storeId Store Id (optional)
     * @param email Filter subscribers by email (optional)
     * @param params Set this parameter in order to choose which entity fields you want to retrieve (optional, default to "force_all")
     * @param exclude Set this parameter in order to choose which entity fields you want to ignore. Works only if parameter &#x60;params&#x60; equal force_all (optional)
     * @param createdFrom Retrieve entities from their creation date (optional)
     * @param createdTo Retrieve entities to their creation date (optional)
     * @param modifiedFrom Retrieve entities from their modification date (optional)
     * @param modifiedTo Retrieve entities to their modification date (optional)
     * @param pageCursor Used to retrieve entities via cursor-based pagination (it can&#39;t be used with any other filtering parameter) (optional)
     * @param responseFields Set this parameter in order to choose which entity fields you want to retrieve (optional)
     * @return RequestConfig
     */
    fun subscriberListRequestConfig(start: kotlin.Int?, count: kotlin.Int?, subscribed: kotlin.Boolean?, storeId: kotlin.String?, email: kotlin.String?, params: kotlin.String?, exclude: kotlin.String?, createdFrom: kotlin.String?, createdTo: kotlin.String?, modifiedFrom: kotlin.String?, modifiedTo: kotlin.String?, pageCursor: kotlin.String?, responseFields: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (start != null) {
                    put("start", listOf(start.toString()))
                }
                if (count != null) {
                    put("count", listOf(count.toString()))
                }
                if (subscribed != null) {
                    put("subscribed", listOf(subscribed.toString()))
                }
                if (storeId != null) {
                    put("store_id", listOf(storeId.toString()))
                }
                if (email != null) {
                    put("email", listOf(email.toString()))
                }
                if (params != null) {
                    put("params", listOf(params.toString()))
                }
                if (exclude != null) {
                    put("exclude", listOf(exclude.toString()))
                }
                if (createdFrom != null) {
                    put("created_from", listOf(createdFrom.toString()))
                }
                if (createdTo != null) {
                    put("created_to", listOf(createdTo.toString()))
                }
                if (modifiedFrom != null) {
                    put("modified_from", listOf(modifiedFrom.toString()))
                }
                if (modifiedTo != null) {
                    put("modified_to", listOf(modifiedTo.toString()))
                }
                if (pageCursor != null) {
                    put("page_cursor", listOf(pageCursor.toString()))
                }
                if (responseFields != null) {
                    put("response_fields", listOf(responseFields.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/subscriber.list.json",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
