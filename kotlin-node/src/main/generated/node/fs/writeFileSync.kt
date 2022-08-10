// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Returns `undefined`.
 *
 * The `mode` option only affects the newly created file. See {@link open} for more details.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link writeFile}.
 * @since v0.1.29
 * @param file filename or file descriptor
 */
external fun writeFileSync(
    file: PathOrFileDescriptor,
    data: Any, /* string | NodeJS.ArrayBufferView */
    options: WriteFileOptions = definedExternally,
)
