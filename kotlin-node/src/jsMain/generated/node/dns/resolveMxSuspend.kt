package node.dns

import js.promise.await


suspend fun resolveMx(hostname: String): js.core.ReadonlyArray<MxRecord> =
    resolveMxAsync(
        hostname
    ).await()
