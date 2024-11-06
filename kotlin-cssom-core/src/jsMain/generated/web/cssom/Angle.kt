// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Angle

inline val Number.deg: Angle
    get() = unsafeCast("${this}deg")

inline val Number.rad: Angle
    get() = unsafeCast("${this}rad")

inline val Number.grad: Angle
    get() = unsafeCast("${this}grad")

inline val Number.turn: Angle
    get() = unsafeCast("${this}turn")
