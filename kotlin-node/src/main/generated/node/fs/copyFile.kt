// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun copyFile(
    src: PathLike,
    dest: PathLike,
    mode: Number,
) {
    copyFileAsync(
        src = src,
        dest = dest,
        mode = mode,
    ).await()
}
