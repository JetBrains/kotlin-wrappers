// Automatically generated - do not modify!

package typescript

sealed external interface CompletionEntryLabelDetails {
    /**
     * An optional string which is rendered less prominently directly after
     * {@link CompletionEntry.name name}, without any spacing. Should be
     * used for function signatures or type annotations.
     */
    var detail: String?

    /**
     * An optional string which is rendered less prominently after
     * {@link CompletionEntryLabelDetails.detail}. Should be used for fully qualified
     * names or file path.
     */
    var description: String?
}
