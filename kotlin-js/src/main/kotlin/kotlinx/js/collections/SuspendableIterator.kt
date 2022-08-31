package kotlinx.js.collections

interface SuspendableIterator<out T> {
    operator fun next(): T
    suspend operator fun hasNext(): Boolean
}
