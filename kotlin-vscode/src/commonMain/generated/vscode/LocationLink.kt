// Automatically generated - do not modify!

package vscode

/**
 * Represents the connection of two locations. Provides additional metadata over normal {@link Location locations},
 * including an origin range.
 */
external interface LocationLink {
    /**
     * Span of the origin of this link.
     *
     * Used as the underlined span for mouse definition hover. Defaults to the word range at
     * the definition position.
     */
    var originSelectionRange: Range?

    /**
     * The target resource identifier of this link.
     */
    var targetUri: Uri

    /**
     * The full target range of this link.
     */
    var targetRange: Range

    /**
     * The span of this link.
     */
    var targetSelectionRange: Range?
}
