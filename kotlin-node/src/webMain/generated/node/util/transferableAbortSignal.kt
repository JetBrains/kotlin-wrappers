// Automatically generated - do not modify!

@file:JsModule("node:util")

package node.util

/**
 * Marks the given `AbortSignal` as transferable so that it can be used with`structuredClone()` and `postMessage()`.
 *
 * ```js
 * const signal = transferableAbortSignal(AbortSignal.timeout(100));
 * const channel = new MessageChannel();
 * channel.port2.postMessage(signal, [signal]);
 * ```
 * @since v18.11.0
 * @param signal The AbortSignal
 * @returns The same AbortSignal
 */
external fun transferableAbortSignal(signal: web.abort.AbortSignal): web.abort.AbortSignal
