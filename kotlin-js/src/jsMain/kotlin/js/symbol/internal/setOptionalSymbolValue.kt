package js.symbol.internal

import js.reflect.Reflect
import js.symbol.Symbol

internal fun setOptionalSymbolValue(
    target: Any,
    symbol: Symbol?,
    value: Any,
) {
    symbol ?: return

    Reflect.set(
        target = target,
        propertyKey = symbol,
        value = value,
    )
}
