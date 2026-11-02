// Automatically generated - do not modify!

@file:JsModule("node:url")

package node.url

import web.url.URL

/**
 * This function ensures the correct decodings of percent-encoded characters as
 * well as ensuring a cross-platform valid absolute path string.
 *
 * ```js
 * import { fileURLToPath } from 'node:url';
 *
 * const __filename = fileURLToPath(import.meta.url);
 *
 * new URL('file:///C:/path/').pathname;      // Incorrect: /C:/path/
 * fileURLToPath('file:///C:/path/');         // Correct:   C:\path\ (Windows)
 *
 * new URL('file://nas/foo.txt').pathname;    // Incorrect: /foo.txt
 * fileURLToPath('file://nas/foo.txt');       // Correct:   \\nas\foo.txt (Windows)
 *
 * new URL('file:///你好.txt').pathname;      // Incorrect: /%E4%BD%A0%E5%A5%BD.txt
 * fileURLToPath('file:///你好.txt');         // Correct:   /你好.txt (POSIX)
 *
 * new URL('file:///hello world').pathname;   // Incorrect: /hello%20world
 * fileURLToPath('file:///hello world');      // Correct:   /hello world (POSIX)
 * ```
 *
 * **Security Considerations:**
 *
 * This function decodes percent-encoded characters, including encoded dot-segments
 * (`%2e` as `.` and `%2e%2e` as `..`), and then normalizes the resulting path.
 * This means that encoded directory traversal sequences (such as `%2e%2e`) are
 * decoded and processed as actual path traversal, even though encoded slashes
 * (`%2F`, `%5C`) are correctly rejected.
 *
 * **Applications must not rely on `fileURLToPath()` alone to prevent directory
 * traversal attacks.** Always perform explicit path validation and security checks
 * on the returned path value to ensure it remains within expected boundaries
 * before using it for file system operations.
 * @since v10.12.0
 * @param url The file URL string or URL object to convert to a path.
 * @return The fully-resolved platform-specific Node.js file path.
 */
external fun fileURLToPath(
    url: String,
    options: FileUrlToPathOptions = definedExternally,
): String

/**
 * This function ensures the correct decodings of percent-encoded characters as
 * well as ensuring a cross-platform valid absolute path string.
 *
 * ```js
 * import { fileURLToPath } from 'node:url';
 *
 * const __filename = fileURLToPath(import.meta.url);
 *
 * new URL('file:///C:/path/').pathname;      // Incorrect: /C:/path/
 * fileURLToPath('file:///C:/path/');         // Correct:   C:\path\ (Windows)
 *
 * new URL('file://nas/foo.txt').pathname;    // Incorrect: /foo.txt
 * fileURLToPath('file://nas/foo.txt');       // Correct:   \\nas\foo.txt (Windows)
 *
 * new URL('file:///你好.txt').pathname;      // Incorrect: /%E4%BD%A0%E5%A5%BD.txt
 * fileURLToPath('file:///你好.txt');         // Correct:   /你好.txt (POSIX)
 *
 * new URL('file:///hello world').pathname;   // Incorrect: /hello%20world
 * fileURLToPath('file:///hello world');      // Correct:   /hello world (POSIX)
 * ```
 *
 * **Security Considerations:**
 *
 * This function decodes percent-encoded characters, including encoded dot-segments
 * (`%2e` as `.` and `%2e%2e` as `..`), and then normalizes the resulting path.
 * This means that encoded directory traversal sequences (such as `%2e%2e`) are
 * decoded and processed as actual path traversal, even though encoded slashes
 * (`%2F`, `%5C`) are correctly rejected.
 *
 * **Applications must not rely on `fileURLToPath()` alone to prevent directory
 * traversal attacks.** Always perform explicit path validation and security checks
 * on the returned path value to ensure it remains within expected boundaries
 * before using it for file system operations.
 * @since v10.12.0
 * @param url The file URL string or URL object to convert to a path.
 * @return The fully-resolved platform-specific Node.js file path.
 */
external fun fileURLToPath(
    url: URL,
    options: FileUrlToPathOptions = definedExternally,
): String
