// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.objects.JsPlainObject

/**
 * The event that is fired when an element in the [TreeView] is expanded or collapsed
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeViewExpansionEvent)
 */
@JsPlainObject
external interface TreeViewExpansionEvent<T : JsAny?> {
    /**
     * Element that is expanded or collapsed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeViewExpansionEvent.element)
     */
    val element: T
}
