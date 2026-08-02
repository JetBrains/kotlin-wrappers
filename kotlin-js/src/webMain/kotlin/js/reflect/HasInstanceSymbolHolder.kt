package js.reflect

import js.symbol.Symbol

external interface HasInstanceSymbolHolder {
    operator fun get(
        key: Symbol.hasInstance,
    ): HasInstance
}
