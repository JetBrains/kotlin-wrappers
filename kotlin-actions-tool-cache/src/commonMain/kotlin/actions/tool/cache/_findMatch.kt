// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.array.ReadonlyArray
import js.promise.Promise

external fun _findMatch(
    versionSpec: String,
    stable: Boolean,
    candidates: ReadonlyArray<IToolRelease>,
    archFilter: String,
): Promise<IToolRelease?>
