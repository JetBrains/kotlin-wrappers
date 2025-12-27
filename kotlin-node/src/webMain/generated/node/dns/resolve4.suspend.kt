// Automatically generated - do not modify!

package node.dns

@seskar.js.JsAsync
external suspend fun resolve4(hostname: String): js.array.ReadonlyArray<String>

@seskar.js.JsAsync
external suspend fun resolve4(
    hostname: String,
    options: ResolveWithTtlOptions,
): js.array.ReadonlyArray<RecordWithTtl>

@seskar.js.JsAsync
external suspend fun resolve4(hostname: String, options: ResolveOptions): Any // string[] | RecordWithTtl[]
