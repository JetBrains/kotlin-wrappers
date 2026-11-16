// Automatically generated - do not modify!

package typescript

import typescript.sync.CompletionInfo

external interface IncompleteCompletionsCache {
    fun get(): CompletionInfo?

    fun set(response: CompletionInfo)

    fun clear()
}
