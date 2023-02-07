// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun lutimes(
    path: PathLike,
    atime: TimeLike,
    mtime: TimeLike,
) {
    lutimesAsync(
        path = path,
        atime = atime,
        mtime = mtime,
    ).await()
}
