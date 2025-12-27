// Automatically generated - do not modify!

@file:JsModule("node:util")

package node.util

import web.abort.AbortController

/**
 * Creates and returns an `AbortController` instance whose `AbortSignal` is marked
 * as transferable and can be used with `structuredClone()` or `postMessage()`.
 * @since v18.11.0
 * @returns A transferable AbortController
 */
external fun transferableAbortController(): AbortController
