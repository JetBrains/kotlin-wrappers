// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

/**
 * Navigation bar interface designed for visual studio's dual-column layout.
 * This does not form a proper tree.
 * The navbar is returned as a list of top-level items, each of which has a list of child items.
 * Child items always have an empty array for their `childItems`.
 */
sealed external interface NavigationBarItem {
    var text: String
    var kind: ScriptElementKind
    var kindModifiers: String
    var spans: ReadonlyArray<TextSpan>
    var childItems: ReadonlyArray<NavigationBarItem>
    var indent: Int
    var bolded: Boolean
    var grayed: Boolean
}
