package js.promise

import js.symbol.Symbol
import js.symbol.internal.setOptionalSymbolValue

fun <T> DisposablePromise(
    promise: Promise<T>,
    dispose: () -> Unit,
): DisposablePromise<T> {
    setOptionalSymbolValue(
        target = promise,
        symbol = Symbol.dispose,
        value = dispose,
    )

    return promise.unsafeCast<DisposablePromise<T>>()
}
