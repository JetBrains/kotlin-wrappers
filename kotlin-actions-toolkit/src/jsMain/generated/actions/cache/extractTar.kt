// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise

external suspend fun extractTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
)

@JsName("extractTar")
external fun extractTarAsync(
    archivePath: String,
    compressionMethod: CompressionMethod,
): Promise<Void>
