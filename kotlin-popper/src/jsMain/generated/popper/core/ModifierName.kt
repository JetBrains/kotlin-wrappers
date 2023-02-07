// Automatically generated - do not modify!

package popper.core

import js.core.jso

external interface ModifierName<Options> : Name

inline fun <Options> ModifierName<Options>.modifier(
    block: Modifier<Options>.() -> Unit,
): Modifier<Options> =
    jso {
        name = this@modifier
        block()
    }
