package electron


external interface Provider {
    var spellCheck: (words: js.core.ReadonlyArray<String>, callback: (misspeltWords: js.core.ReadonlyArray<String>) -> Unit) -> Unit
}
