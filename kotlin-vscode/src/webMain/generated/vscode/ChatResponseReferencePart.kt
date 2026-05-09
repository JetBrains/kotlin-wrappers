// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a part of a chat response that is a reference, rendered separately from the content.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseReferencePart)
 */
open external class ChatResponseReferencePart {
    /**
     * The reference target.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseReferencePart.value)
     */
    var value: JsAny /* Uri | Location */

    /**
     * The icon for the reference.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseReferencePart.iconPath)
     */
    var iconPath: IconPath?

    /**
     * Create a new ChatResponseReferencePart.
     * @param value A uri or location
     * @param iconPath Icon for the reference shown in UI
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseReferencePart.constructor)
     */
    constructor(
        value: Uri,
        iconPath: IconPath = definedExternally,
    )

    constructor(
        value: Location,
        iconPath: IconPath = definedExternally,
    )
}
