// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.promise.Promise
import js.void.Void
import seskar.js.JsAsync

@JsAsync
external suspend fun downloadCache(
    archiveLocation: String,
    archivePath: String,
    options: DownloadOptions = definedExternally,
)

@JsName("downloadCache")
external fun downloadCacheAsync(
    archiveLocation: String,
    archivePath: String,
    options: DownloadOptions = definedExternally,
): Promise<Void>
