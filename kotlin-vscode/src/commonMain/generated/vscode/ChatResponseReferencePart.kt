// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a part of a chat response that is a reference, rendered separately from the content.
 */
open external class ChatResponseReferencePart {
    /**
    // ORIGINAL SOURCE

    /**
     * The reference target.
    */
    value: Uri | Location;

    /**
     * The icon for the reference.
    */
    iconPath?: IconPath;

    /**
     * Create a new ChatResponseReferencePart.
     * @param value A uri or location
     * @param iconPath Icon for the reference shown in UI
    */
    constructor(value: Uri | Location, iconPath?: IconPath);

    // ORIGINAL SOURCE
     **/
}
