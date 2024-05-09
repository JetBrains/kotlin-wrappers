// Automatically generated - do not modify!

package actions.cache
suspend fun unlinkFile(
    filePath: node.fs.PathLike,
) {
    unlinkFileAsync(
        filePath = filePath,
    ).await()
}
