// Generated by Karakum - do not modify it manually!

package node.dns


suspend fun resolveMx(hostname: String): js.array.ReadonlyArray<MxRecord> =
    resolveMxAsync(
        hostname
    ).await()
