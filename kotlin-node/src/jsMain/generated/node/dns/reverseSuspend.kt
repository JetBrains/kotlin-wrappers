package node.dns

import js.promise.await


suspend fun reverse(ip: String): js.core.ReadonlyArray<String> =
    reverseAsync(
        ip
    ).await()
