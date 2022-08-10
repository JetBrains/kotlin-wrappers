// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun chown(
    path: PathLike,
    uid: Number,
    gid: Number,
) {
    chownAsync(
        path = path,
        uid = uid,
        gid = gid,
    ).await()
}
