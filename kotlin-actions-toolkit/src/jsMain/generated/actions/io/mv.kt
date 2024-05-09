// Automatically generated - do not modify!

package actions.io
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
