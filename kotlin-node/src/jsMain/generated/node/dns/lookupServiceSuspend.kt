package node.dns

import js.promise.await


suspend fun lookupService(address: String, port: Number): LookupServiceResultPayload =
    lookupServiceAsync(
        address, port
    ).await()
