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

import org.openapitools.client.apis.BatchApi
import org.openapitools.client.models.ModelResponseBatchJobList
import org.openapitools.client.models.ResponseBatchJobResult

class BatchApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BatchApi
        //val apiInstance = BatchApi()

        // to test batchJobList
        should("test batchJobList") {
            // uncomment below to test batchJobList
            //val count : kotlin.Int = 20 // kotlin.Int | This parameter sets the entity amount that has to be retrieved. Max allowed count=250
            //val pageCursor : kotlin.String =  // kotlin.String | Used to retrieve entities via cursor-based pagination (it can't be used with any other filtering parameter)
            //val createdFrom : kotlin.String = 2010-07-29 13:45:52 // kotlin.String | Retrieve entities from their creation date
            //val createdTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities to their creation date
            //val processedFrom : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities according to their processing datetime
            //val processedTo : kotlin.String = 2100-08-29 13:45:52 // kotlin.String | Retrieve entities according to their processing datetime
            //val ids : kotlin.String = 24,25 // kotlin.String | Filter batch jobs by ids
            //val responseFields : kotlin.String = {result} // kotlin.String | Set this parameter in order to choose which entity fields you want to retrieve
            //val result : ModelResponseBatchJobList = apiInstance.batchJobList(count, pageCursor, createdFrom, createdTo, processedFrom, processedTo, ids, responseFields)
            //result shouldBe ("TODO")
        }

        // to test batchJobResult
        should("test batchJobResult") {
            // uncomment below to test batchJobResult
            //val id : kotlin.String = 10 // kotlin.String | Entity id
            //val result : ResponseBatchJobResult = apiInstance.batchJobResult(id)
            //result shouldBe ("TODO")
        }

    }
}
