// Automatically generated - do not modify!

package typescript

sealed external interface IncompleteCompletionsCache {
    fun get(): CompletionInfo?
    fun set(response: CompletionInfo): Unit
    fun clear(): Unit
}
