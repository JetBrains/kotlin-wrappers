// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise

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
