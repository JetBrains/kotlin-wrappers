// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun lchown(
    path: PathLike,
    uid: Number,
    gid: Number,
) {
    lchownAsync(
        path = path,
        uid = uid,
        gid = gid,
    ).await()
}
