// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun uploadToBlobStorage(
    authenticatedUploadURL: String,
    uploadStream: WaterMarkedUploadStream,
    contentType: String,
): BlobUploadResponse

@JsName("uploadToBlobStorage")
external fun uploadToBlobStorageAsync(
    authenticatedUploadURL: String,
    uploadStream: WaterMarkedUploadStream,
    contentType: String,
): Promise<BlobUploadResponse>
