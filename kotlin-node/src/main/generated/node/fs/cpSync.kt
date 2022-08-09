// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronously copies the entire directory structure from `src` to `dest`,
 * including subdirectories and files.
 *
 * When copying a directory to another directory, globs are not supported and
 * behavior is similar to `cp dir1/ dir2/`.
 * @since v16.7.0
 * @experimental
 * @param src source path to copy.
 * @param dest destination path to copy to.
 */
external fun cpSync(
    source: dynamic, /* string | URL */
    destination: dynamic, /* string | URL */
    opts: CopySyncOptions = definedExternally,
)
