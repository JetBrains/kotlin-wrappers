// Automatically generated - do not modify!

package typescript

sealed external interface PerNonRelativeNameCache<T> {
    operator fun get(directory: String): T?
    operator fun set(
        directory: String,
        result: T,
    )
}
