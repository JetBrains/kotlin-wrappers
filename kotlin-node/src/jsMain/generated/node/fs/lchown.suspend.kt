// Generated by Karakum - do not modify it manually!

package node.fs

import js.promise.await


suspend fun lchown(path: PathLike, uid: Number, gid: Number): Unit =
    lchownAsync(
        path, uid, gid
    ).await()
