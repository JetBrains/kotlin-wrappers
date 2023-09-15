package node.dns

import js.promise.await


suspend fun resolveSrv(hostname: String): js.core.ReadonlyArray<SrvRecord> =
    resolveSrvAsync(
        hostname
    ).await()
