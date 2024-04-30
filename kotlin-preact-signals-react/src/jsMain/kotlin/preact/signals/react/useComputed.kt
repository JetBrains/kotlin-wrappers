@file:JsModule("@preact/signals-react")

package preact.signals.react

import preact.signals.core.ReadonlySignal

external fun <T> useComputed(
    compute: () -> T,
): ReadonlySignal<T>
