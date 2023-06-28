// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.core.ReadonlyArray
import js.promise.Promise

@JsName("_findMatch")
external fun _findMatchAsync(
    versionSpec: String,
    stable: Boolean,
    candidates: ReadonlyArray<IToolRelease>,
    archFilter: String,
): Promise<IToolRelease?>
