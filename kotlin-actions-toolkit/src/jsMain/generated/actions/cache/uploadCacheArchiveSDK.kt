// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.objects.ReadonlyRecord
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun uploadCacheArchiveSDK(
    signedUploadURL: String,
    archivePath: String,
    options: UploadOptions = definedExternally,
): ReadonlyRecord<String, Any> /* BlobUploadCommonResponse */

@JsName("uploadCacheArchiveSDK")
external fun uploadCacheArchiveSDKAsync(
    signedUploadURL: String,
    archivePath: String,
    options: UploadOptions = definedExternally,
): Promise<ReadonlyRecord<String, Any> /* BlobUploadCommonResponse */>
