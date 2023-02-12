// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.ReadonlyArray
import js.core.Void
import kotlin.js.Promise

@JsName("createTar")
external fun createTarAsync(
    archiveFolder: String,
    sourceDirectories: ReadonlyArray<String>,
    compressionMethod: CompressionMethod,
): Promise<Void>
