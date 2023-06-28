// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.core.ReadonlyArray
import js.promise.Promise

@JsName("getManifestFromRepo")
external fun getManifestFromRepoAsync(
    owner: String,
    repo: String,
    auth: String = definedExternally,
    branch: String = definedExternally,
): Promise<ReadonlyArray<IToolRelease>>
