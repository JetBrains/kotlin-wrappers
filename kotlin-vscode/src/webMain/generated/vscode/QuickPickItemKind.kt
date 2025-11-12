// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Defines the kind of {@link QuickPickItem quick pick item}.
 */
sealed /* enum */
external interface QuickPickItemKind {
    companion object {
        /**
         * A separator item that provides a visual grouping.
         *
         * When a {@link QuickPickItem} has a kind of {@link Separator}, the item is just a visual separator
         * and does not represent a selectable item. The only property that applies is
         * {@link QuickPickItem.label label}. All other properties on {@link QuickPickItem} will be ignored
         * and have no effect.
         */
        val Separator: QuickPickItemKind // -1

        /**
         * The default kind for an item that can be selected in the quick pick.
         */
        val Default: QuickPickItemKind // 0
    }
}
