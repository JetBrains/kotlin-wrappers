// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun getManifestFromRepo(
    owner: String,
    repo: String,
    auth: String = definedExternally,
    branch: String = definedExternally,
): ReadonlyArray<IToolRelease>

@JsName("getManifestFromRepo")
external fun getManifestFromRepoAsync(
    owner: String,
    repo: String,
    auth: String = definedExternally,
    branch: String = definedExternally,
): Promise<ReadonlyArray<IToolRelease>>
