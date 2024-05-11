// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise

external suspend fun listTar(
    archivePath: String,
    compressionMethod: CompressionMethod,
)

@JsName("listTar")
external fun listTarAsync(
    archivePath: String,
    compressionMethod: CompressionMethod,
): Promise<Void>
