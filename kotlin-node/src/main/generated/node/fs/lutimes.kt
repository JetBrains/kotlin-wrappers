// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun lutimes(
    path: PathLike,
    atime: Any, /* string | number | Date */
    mtime: Any, /* string | number | Date */
) {
    lutimesAsync(
        path = path,
        atime = atime,
        mtime = mtime,
    ).await()
}
