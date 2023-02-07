// Automatically generated - do not modify!

package typescript

sealed external interface GetCompletionsAtPositionOptions : UserPreferences {
    /**
     * If the editor is asking for completions because a certain character was typed
     * (as opposed to when the user explicitly requested them) this should be set.
     */
    var triggerCharacter: CompletionsTriggerCharacter?
    var triggerKind: CompletionTriggerKind?


}
