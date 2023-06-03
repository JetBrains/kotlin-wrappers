package js.collections

interface SuspendableIterator<out T> {
    suspend operator fun hasNext(): Boolean
    operator fun next(): T
}
