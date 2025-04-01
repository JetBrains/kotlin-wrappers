// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun uploadZipToBlobStorage(
    authenticatedUploadURL: String,
    zipUploadStream: ZipUploadStream,
): BlobUploadResponse

@JsName("uploadZipToBlobStorage")
external fun uploadZipToBlobStorageAsync(
    authenticatedUploadURL: String,
    zipUploadStream: ZipUploadStream,
): Promise<BlobUploadResponse>
