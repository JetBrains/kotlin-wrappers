// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import js.core.Void
import kotlin.js.Promise

/**
 * Asynchronously copies the entire directory structure from `src` to `dest`,
 * including subdirectories and files.
 *
 * When copying a directory to another directory, globs are not supported and
 * behavior is similar to `cp dir1/ dir2/`.
 * @since v16.7.0
 * @experimental
 * @param src source path to copy.
 * @param dest destination path to copy to.
 * @return Fulfills with `undefined` upon success.
 */
@JsName("cp")
external fun cpAsync(
    source: Any, /* string | URL */
    destination: Any, /* string | URL */
    opts: CopyOptions = definedExternally,
): Promise<Void>
