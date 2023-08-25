// Automatically generated - do not modify!

package node.fs

import js.promise.await

suspend fun copyFile(
    src: PathLike,
    dest: PathLike,
) {
    copyFileAsync(
        src = src,
        dest = dest,
    ).await()
}

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
