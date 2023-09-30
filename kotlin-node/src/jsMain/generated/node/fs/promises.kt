@file:JsModule("node:fs/promises")

package node.fs


/**
 * The `fs/promises` API provides asynchronous file system methods that return
 * promises.
 *
 * The promise APIs use the underlying Node.js threadpool to perform file
 * system operations off the event loop thread. These operations are not
 * synchronized or threadsafe. Care must be taken when performing multiple
 * concurrent modifications on the same file or data corruption may occur.
 * @since v10.0.0
 */
