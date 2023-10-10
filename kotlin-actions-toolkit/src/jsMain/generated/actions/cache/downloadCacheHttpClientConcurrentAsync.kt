// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise

@JsName("downloadCacheHttpClientConcurrent")
external fun downloadCacheHttpClientConcurrentAsync(
    archiveLocation: String,
    archivePath: node.fs.PathLike,
    options: DownloadOptions,
): Promise<Void>
