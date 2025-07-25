// Automatically generated - do not modify!

package vscode

/**
 * Represents the connection of two locations. Provides additional metadata over normal [locations][Location],
 * including an origin range.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LocationLink)
 */
external interface LocationLink {
    /**
     * Span of the origin of this link.
     *
     * Used as the underlined span for mouse definition hover. Defaults to the word range at
     * the definition position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LocationLink.originSelectionRange)
     */
    var originSelectionRange: Range?

    /**
     * The target resource identifier of this link.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LocationLink.targetUri)
     */
    var targetUri: Uri

    /**
     * The full target range of this link.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LocationLink.targetRange)
     */
    var targetRange: Range

    /**
     * The span of this link.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LocationLink.targetSelectionRange)
     */
    var targetSelectionRange: Range?
}
