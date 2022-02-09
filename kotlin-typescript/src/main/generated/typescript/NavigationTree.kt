// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Node in a tree of nested declarations in a file.
 * The top node is always a script or module node.
 */
sealed external interface NavigationTree {
    /** Name of the declaration, or a short description, e.g. "<class>". */
    var text: String
    var kind: ScriptElementKind

    /** ScriptElementKindModifier separated by commas, e.g. "public,abstract" */
    var kindModifiers: String

    /**
     * Spans of the nodes that generated this declaration.
     * There will be more than one if this is the result of merging.
     */
    var spans: ReadonlyArray<TextSpan>
    var nameSpan: TextSpan?

    /** Present if non-empty */
    var childItems: ReadonlyArray<NavigationTree>?
}
