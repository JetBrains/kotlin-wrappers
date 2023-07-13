package js.iterable

interface SuspendableIterator<out T> {
    suspend operator fun hasNext(): Boolean
    operator fun next(): T
}
