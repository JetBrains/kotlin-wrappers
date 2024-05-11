// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise

external suspend fun createTar(
    archiveFolder: String,
    sourceDirectories: ReadonlyArray<String>,
    compressionMethod: CompressionMethod,
)

@JsName("createTar")
external fun createTarAsync(
    archiveFolder: String,
    sourceDirectories: ReadonlyArray<String>,
    compressionMethod: CompressionMethod,
): Promise<Void>
