// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun unlink(
    path: PathLike,
) {
    unlinkAsync(
        path = path,
    ).await()
}
