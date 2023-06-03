package js.collections

interface SuspendableIterator<out T> {
    suspend operator fun hasNext(): Boolean
    suspend operator fun next(): T
}
