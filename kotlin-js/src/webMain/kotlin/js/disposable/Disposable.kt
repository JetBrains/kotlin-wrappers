package js.disposable

import js.core.Void
import js.hacks.safeFactory
import js.symbol.Symbol

external interface Disposable

operator fun Disposable.get(
    key: Symbol.dispose,
): () -> Void =
    safeFactory(Symbol.dispose)
