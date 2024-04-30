@file:JsModule("@preact/signals-react")

package preact.signals.react

import preact.signals.core.Signal

external fun <T> useSignal(
    value: T,
): Signal<T>
