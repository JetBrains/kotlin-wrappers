// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.array.ReadonlyArray
import js.promise.Promise

@JsName("findFromManifest")
external fun findFromManifestAsync(
    versionSpec: String,
    stable: Boolean,
    manifest: ReadonlyArray<IToolRelease>,
    archFilter: String = definedExternally,
): Promise<IToolRelease?>
