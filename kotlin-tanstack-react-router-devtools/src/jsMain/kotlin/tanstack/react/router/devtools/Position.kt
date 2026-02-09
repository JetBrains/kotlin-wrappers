package tanstack.react.router.devtools

import js.reflect.unsafeCast

sealed external interface Position {
    companion object
}

inline val Position.Companion.topLeft: Position
    get() = unsafeCast("top-left")

inline val Position.Companion.topRight: Position
    get() = unsafeCast("top-right")

inline val Position.Companion.bottomLeft: Position
    get() = unsafeCast("bottom-left")

inline val Position.Companion.bottomRight: Position
    get() = unsafeCast("bottom-right")
