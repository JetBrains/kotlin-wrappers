// Automatically generated - do not modify!

@file:JsModule("node:buffer")

package node.buffer

import web.blob.Blob

/**
 * Resolves a `'blob:nodedata:...'` an associated `Blob` object registered using
 * a prior call to `URL.createObjectURL()`.
 * @since v16.7.0
 * @param id A `'blob:nodedata:...` URL string returned by a prior call to `URL.createObjectURL()`.
 */
external fun resolveObjectURL(id: String): Blob?
