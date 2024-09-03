@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import js.import.Module

typealias ComponentModule<P> = Module<ComponentType<P>>

inline fun <P : Props> ComponentModule(
    default: ComponentType<P>,
): ComponentModule<P> =
    Module(default)
