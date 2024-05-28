// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun downloadCacheHttpClient(
    archiveLocation: String,
    archivePath: String,
)

@JsName("downloadCacheHttpClient")
external fun downloadCacheHttpClientAsync(
    archiveLocation: String,
    archivePath: String,
): Promise<Void>
