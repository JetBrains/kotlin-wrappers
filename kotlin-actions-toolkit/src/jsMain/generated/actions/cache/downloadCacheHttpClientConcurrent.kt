// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun downloadCacheHttpClientConcurrent(
    archiveLocation: String,
    archivePath: node.fs.PathLike,
    options: DownloadOptions,
)

@JsName("downloadCacheHttpClientConcurrent")
external fun downloadCacheHttpClientConcurrentAsync(
    archiveLocation: String,
    archivePath: node.fs.PathLike,
    options: DownloadOptions,
): Promise<Void>
