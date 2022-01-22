// Automatically generated - do not modify!

package typescript

/**
 * Represents a single refactoring action - for example, the "Extract Method..." refactor might
 * offer several actions, each corresponding to a surround class or closure to extract into.
 */
external interface RefactorActionInfo {
    /**
     * The programmatic name of the refactoring action
     */
    var name: String

    /**
     * A description of this refactoring action to show to the user.
     * If the parent refactoring is inlined away, this will be the only text shown,
     * so this description should make sense by itself if the parent is inlineable=true
     */
    var description: String

    /**
     * A message to show to the user if the refactoring cannot be applied in
     * the current context.
     */
    var notApplicableReason: String?

    /**
     * The hierarchical dotted name of the refactor action.
     */
    var kind: String?
}
