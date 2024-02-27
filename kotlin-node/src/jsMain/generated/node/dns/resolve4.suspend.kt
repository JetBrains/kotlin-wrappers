// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun resolve4(hostname: String): js.array.ReadonlyArray<String> =
    resolve4Async(
        hostname
    ).await()


suspend fun resolve4(hostname: String, options: ResolveWithTtlOptions): js.array.ReadonlyArray<RecordWithTtl> =
    resolve4Async(
        hostname, options
    ).await()


suspend fun resolve4(hostname: String, options: ResolveOptions): Any /* string[] | RecordWithTtl[] */ =
    resolve4Async(
        hostname, options
    ).await()