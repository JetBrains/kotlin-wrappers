// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package vscode

import js.array.ReadonlyArray
import js.core.JsAny

/**
 * Represents a Tree view
 */
external interface TreeView<T : JsAny?> :
    Disposable {
    /**
     * Event that is fired when an element is expanded
     */
    val onDidExpandElement: Event<TreeViewExpansionEvent<T>>

    /**
     * Event that is fired when an element is collapsed
     */
    val onDidCollapseElement: Event<TreeViewExpansionEvent<T>>

    /**
     * Currently selected elements.
     */
    val selection: ReadonlyArray<T>

    /**
     * Event that is fired when the [selection][TreeView.selection] has changed
     */
    val onDidChangeSelection: Event<TreeViewSelectionChangeEvent<T>>

    /**
     * `true` if the [tree view][TreeView] is visible otherwise `false`.
     */
    val visible: Boolean

    /**
     * Event that is fired when [visibility][TreeView.visible] has changed
     */
    val onDidChangeVisibility: Event<TreeViewVisibilityChangeEvent>

    /**
     * An event to signal that an element or root has either been checked or unchecked.
     */
    val onDidChangeCheckboxState: Event<TreeCheckboxChangeEvent<T>>

    /**
     * An optional human-readable message that will be rendered in the view.
     * Setting the message to null, undefined, or empty string will remove the message from the view.
     */
    var message: String?

    /**
     * The tree view title is initially taken from the extension package.json
     * Changes to the title property will be properly reflected in the UI in the title of the view.
     */
    var title: String?

    /**
     * An optional human-readable description which is rendered less prominently in the title of the view.
     * Setting the title description to null, undefined, or empty string will remove the description from the view.
     */
    var description: String?

    /**
     * The badge to display for this TreeView.
     * To remove the badge, set to undefined.
     */
    var badge: ViewBadge?

    /**
     * Reveals the given element in the tree view.
     * If the tree view is not visible then the tree view is shown and element is revealed.
     *
     * By default revealed element is selected.
     * In order to not to select, set the option `select` to `false`.
     * In order to focus, set the option `focus` to `true`.
     * In order to expand the revealed element, set the option `expand` to `true`. To expand recursively set `expand` to the number of levels to expand.
     *
     * * *NOTE:* You can expand only to 3 levels maximum.
     * * *NOTE:* The [TreeDataProvider] that the `TreeView` [is registered with} with must implement {@link TreeDataProvider.getParent getParent][window.createTreeView] method to access this API.
     */
    /*
    reveal(element: T, options?: {
        /**
         * If true, then the element will be selected.
         */
        readonly select?: boolean;
        /**
         * If true, then the element will be focused.
         */
        readonly focus?: boolean;
        /**
         * If true, then the element will be expanded. If a number is passed, then up to that number of levels of children will be expanded
         */
        readonly expand?: boolean | number;
    }): Thenable<void>
    */
}
