// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun utimes(
    path: PathLike,
    atime: TimeLike,
    mtime: TimeLike,
) {
    utimesAsync(
        path = path,
        atime = atime,
        mtime = mtime,
    ).await()
}
