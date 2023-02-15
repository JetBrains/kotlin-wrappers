// Automatically generated - do not modify!

package actions.io

import kotlinx.coroutines.await

suspend fun mv(
    source: String,
    dest: String,
) {
    mvAsync(
        source = source,
        dest = dest,
    ).await()
}

suspend fun mv(
    source: String,
    dest: String,
    options: MoveOptions,
) {
    mvAsync(
        source = source,
        dest = dest,
        options = options,
    ).await()
}
