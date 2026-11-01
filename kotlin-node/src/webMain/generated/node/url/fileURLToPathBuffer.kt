// Automatically generated - do not modify!

@file:JsModule("node:url")

package node.url

import node.buffer.NonSharedBuffer
import web.url.URL

/**
 * Like `url.fileURLToPath(...)` except that instead of returning a string
 * representation of the path, a `Buffer` is returned. This conversion is
 * helpful when the input URL contains percent-encoded segments that are
 * not valid UTF-8 / Unicode sequences.
 *
 * **Security Considerations:**
 *
 * This function has the same security considerations as `url.fileURLToPath()`.
 * It decodes percent-encoded characters, including encoded dot-segments
 * (`%2e` as `.` and `%2e%2e` as `..`), and normalizes the path. **Applications
 * must not rely on this function alone to prevent directory traversal attacks.**
 * Always perform explicit path validation on the returned buffer value before
 * using it for file system operations.
 * @since v24.3.0
 * @param url The file URL string or URL object to convert to a path.
 * @returns The fully-resolved platform-specific Node.js file path
 * as a `Buffer`.
 */
external fun fileURLToPathBuffer(
    url: String,
    options: FileUrlToPathOptions = definedExternally,
): NonSharedBuffer

/**
 * Like `url.fileURLToPath(...)` except that instead of returning a string
 * representation of the path, a `Buffer` is returned. This conversion is
 * helpful when the input URL contains percent-encoded segments that are
 * not valid UTF-8 / Unicode sequences.
 *
 * **Security Considerations:**
 *
 * This function has the same security considerations as `url.fileURLToPath()`.
 * It decodes percent-encoded characters, including encoded dot-segments
 * (`%2e` as `.` and `%2e%2e` as `..`), and normalizes the path. **Applications
 * must not rely on this function alone to prevent directory traversal attacks.**
 * Always perform explicit path validation on the returned buffer value before
 * using it for file system operations.
 * @since v24.3.0
 * @param url The file URL string or URL object to convert to a path.
 * @returns The fully-resolved platform-specific Node.js file path
 * as a `Buffer`.
 */
external fun fileURLToPathBuffer(
    url: URL,
    options: FileUrlToPathOptions = definedExternally,
): NonSharedBuffer
