// Automatically generated - do not modify!

package tanstack.virtual.core

import seskar.js.JsNativeInvoke

external interface Updatable<T, D> {
    @JsNativeInvoke
    operator fun invoke(): T

    fun updateDeps(newDeps: D)
}
