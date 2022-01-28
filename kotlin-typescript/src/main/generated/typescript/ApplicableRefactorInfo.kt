// Automatically generated - do not modify!

package typescript

/**
 * A set of one or more available refactoring actions, grouped under a parent refactoring.
 */
sealed external interface ApplicableRefactorInfo {
    /**
     * The programmatic name of the refactoring
     */
    var name: String

    /**
     * A description of this refactoring category to show to the user.
     * If the refactoring gets inlined (see below), this text will not be visible.
     */
    var description: String

    /**
     * Inlineable refactorings can have their actions hoisted out to the top level
     * of a context menu. Non-inlineanable refactorings should always be shown inside
     * their parent grouping.
     *
     * If not specified, this value is assumed to be 'true'
     */
    var inlineable: Boolean?
    var actions: ReadonlyArray<RefactorActionInfo>
}
