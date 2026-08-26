// Automatically generated - do not modify!

package tanstack.virtual.core

external interface Updatable<T, D> {
    operator fun invoke(): T

    fun updateDeps(newDeps: D)
}
