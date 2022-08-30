package kotlinx.js

interface SuspendableIterator<out T> {
    operator fun next(): T
    suspend operator fun hasNext(): Boolean
}
