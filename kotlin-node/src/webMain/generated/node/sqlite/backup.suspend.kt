// Automatically generated - do not modify!

package node.sqlite

import node.fs.PathLike

@seskar.js.JsAsync
external suspend fun backup(
    sourceDb: DatabaseSync,
    path: PathLike,
    options: BackupOptions = definedExternally,
): Double
