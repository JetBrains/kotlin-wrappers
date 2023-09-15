package node.dns

import js.promise.await


suspend fun resolve4(hostname: String): js.core.ReadonlyArray<String> =
    resolve4Async(
        hostname
    ).await()


suspend fun resolve4(hostname: String, options: ResolveWithTtlOptions): js.core.ReadonlyArray<RecordWithTtl> =
    resolve4Async(
        hostname, options
    ).await()


suspend fun resolve4(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
    resolve4Async(
        hostname, options
    ).await()
