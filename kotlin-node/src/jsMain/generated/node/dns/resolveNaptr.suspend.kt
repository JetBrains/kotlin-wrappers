// Generated by Karakum - do not modify it manually!

package node.dns

import js.promise.await


suspend fun resolveNaptr(hostname: String): js.array.ReadonlyArray<NaptrRecord> =
    resolveNaptrAsync(
        hostname
    ).await()
