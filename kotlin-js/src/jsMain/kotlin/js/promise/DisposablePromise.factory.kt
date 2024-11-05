package js.promise

import js.reflect.unsafeCast
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

    return unsafeCast(promise)
}
