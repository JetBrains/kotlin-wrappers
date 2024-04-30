@file:JsModule("@preact/signals-core")

package preact.signals.core

/**
 * Run a callback function that can access signal values without
 * subscribing to the signal updates.
 *
 * @param fn The callback function.
 * @returns The value returned by the callback.
 */
external fun <T> untracked(
    fn: () -> T,
): T
