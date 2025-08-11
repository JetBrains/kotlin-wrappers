package js.disposable

/**
 * Suspend analog of [AutoCloseable]
 */
fun interface SuspendAutoCloseable {
    suspend fun close()
}
