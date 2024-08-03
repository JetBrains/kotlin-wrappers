package js.symbol.internal

import js.symbol.Symbol

internal fun setOptionalSymbolValue(
    target: Any,
    symbol: Symbol?,
    value: Any,
) {
    symbol ?: return

    target.asDynamic()[symbol] = value
}
