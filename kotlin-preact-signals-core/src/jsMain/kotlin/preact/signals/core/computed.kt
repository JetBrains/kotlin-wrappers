@file:JsModule("@preact/signals-core")

package preact.signals.core

/**
 * Create a new signal that is computed based on the values of other signals.
 *
 * The returned computed signal is read-only, and its value is automatically
 * updated when any signals accessed from within the callback function change.
 *
 * @param fn The effect callback.
 * @returns A new read-only signal.
 */
external fun <T> computed(
    fn: () -> T,
): ReadonlySignal<T>
