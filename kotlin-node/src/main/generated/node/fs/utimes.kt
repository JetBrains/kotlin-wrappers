// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun utimes(
    path: PathLike,
    atime: Any, /* string | number | Date */
    mtime: Any, /* string | number | Date */
) {
    utimesAsync(
        path = path,
        atime = atime,
        mtime = mtime,
    ).await()
}
