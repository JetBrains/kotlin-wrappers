// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.promise.Promise
import js.void.Void
import seskar.js.JsAsync

@JsAsync
external suspend fun extractTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
)

@JsName("extractTar")
external fun extractTarAsync(
    archivePath: String,
    compressionMethod: CompressionMethod,
): Promise<Void>
