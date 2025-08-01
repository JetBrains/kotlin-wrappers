// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * Accessibility information which controls screen reader behavior.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AccessibilityInformation)
 */
@JsPlainObject
external interface AccessibilityInformation {
    /**
     * Label to be read out by a screen reader once the item has focus.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AccessibilityInformation.label)
     */
    val label: String

    /**
     * Role of the widget which defines how a screen reader interacts with it.
     * The role should be set in special cases when for example a tree-like element behaves like a checkbox.
     * If role is not specified the editor will pick the appropriate role automatically.
     * More about aria roles can be found here https://w3c.github.io/aria/#widget_roles
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AccessibilityInformation.role)
     */
    val role: String?
}
