// Automatically generated - do not modify!

@file:JsModule("node:url")

package node.url

/**
 * This function ensures the correct decodings of percent-encoded characters as
 * well as ensuring a cross-platform valid absolute path string.
 *
 * ```js
 * import { fileURLToPath } from 'url';
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
 * @since v10.12.0
 * @param url The file URL string or URL object to convert to a path.
 * @return The fully-resolved platform-specific Node.js file path.
 */
external fun fileURLToPath(
    url: Any, /* string | URL */
): String
