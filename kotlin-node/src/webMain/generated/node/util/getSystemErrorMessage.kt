// Automatically generated - do not modify!

@file:JsModule("node:util")

package node.util

/**
 * Returns the string message for a numeric error code that comes from a Node.js
 * API.
 * The mapping between error codes and string messages is platform-dependent.
 *
 * ```js
 * fs.access('file/that/does/not/exist', (err) => {
 *   const message = util.getSystemErrorMessage(err.errno);
 *   console.error(message);  // no such file or directory
 * });
 * ```
 * @since v22.12.0
 */
external fun getSystemErrorMessage(err: Number): String
