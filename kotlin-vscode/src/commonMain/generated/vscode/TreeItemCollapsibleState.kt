// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Collapsible state of the tree item
 */
sealed /* enum */
external interface TreeItemCollapsibleState {
    companion object {
        /**
         * Determines an item can be neither collapsed nor expanded. Implies it has no children.
         */
        val None: TreeItemCollapsibleState // 0

        /**
         * Determines an item is collapsed
         */
        val Collapsed: TreeItemCollapsibleState // 1

        /**
         * Determines an item is expanded
         */
        val Expanded: TreeItemCollapsibleState // 2
    }
}
