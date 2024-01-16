// Automatically generated - do not modify!

package typescript

sealed external interface GetCompletionsAtPositionOptions : UserPreferences {
    /**
     * If the editor is asking for completions because a certain character was typed
     * (as opposed to when the user explicitly requested them) this should be set.
     */
    var triggerCharacter: CompletionsTriggerCharacter?
    var triggerKind: CompletionTriggerKind?

    /**
     * Include a `symbol` property on each completion entry object.
     * Symbols reference cyclic data structures and sometimes an entire TypeChecker instance,
     * so use caution when serializing or retaining completion entries retrieved with this option.
     * @default false
     */
    var includeSymbol: Boolean?
}
