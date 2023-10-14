@file:JsModule("node:readline")

package node.readline


/**
 * The `readline.clearScreenDown()` method clears the given `TTY` stream from
 * the current position of the cursor down.
 * @since v0.7.7
 * @param callback Invoked once the operation completes.
 * @return `false` if `stream` wishes for the calling code to wait for the `'drain'` event to be emitted before continuing to write additional data; otherwise `true`.
 */
external fun clearScreenDown(stream: node.WritableStream, callback: () -> Unit = definedExternally): Boolean
