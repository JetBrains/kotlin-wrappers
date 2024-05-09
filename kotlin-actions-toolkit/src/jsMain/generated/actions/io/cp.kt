// Automatically generated - do not modify!

package actions.io
suspend fun cp(
    source: String,
    dest: String,
) {
    cpAsync(
        source = source,
        dest = dest,
    ).await()
}

suspend fun cp(
    source: String,
    dest: String,
    options: CopyOptions,
) {
    cpAsync(
        source = source,
        dest = dest,
        options = options,
    ).await()
}
