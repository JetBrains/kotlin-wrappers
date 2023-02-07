// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.ReadonlyArray
import js.core.Void
import kotlin.js.Promise

external fun saveCache(
    paths: ReadonlyArray<String>,
    key: String,
    options: UploadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): Promise<Number>

external fun saveCache(
    cacheId: Number,
    archivePath: String,
    options: UploadOptions = definedExternally,
): Promise<Void>
