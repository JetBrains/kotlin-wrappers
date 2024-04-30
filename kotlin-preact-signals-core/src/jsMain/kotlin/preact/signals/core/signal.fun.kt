@file:JsModule("@preact/signals-core")

package preact.signals.core

/**
 * Create a new plain signal.
 *
 * @param value The initial value for the signal.
 * @returns A new signal.
 */
external fun <T> signal(
    value: T,
): Signal<T>
