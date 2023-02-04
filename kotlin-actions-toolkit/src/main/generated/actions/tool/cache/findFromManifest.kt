// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.core.ReadonlyArray
import kotlin.js.Promise

external fun findFromManifest(
    versionSpec: String,
    stable: Boolean,
    manifest: ReadonlyArray<IToolRelease>,
    archFilter: String = definedExternally,
): Promise<IToolRelease?>
