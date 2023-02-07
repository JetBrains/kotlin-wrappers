// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface CodeAction {
    /** Description of the code action to display in the UI of the editor */
    var description: String

    /** Text changes to apply to each file as part of the code action */
    var changes: ReadonlyArray<FileTextChanges>

    /**
     * If the user accepts the code fix, the editor should send the action back in a `applyAction` request.
     * This allows the language service to have side effects (e.g. installing dependencies) upon a code fix.
     */
    var commands: ReadonlyArray<CodeActionCommand>?
}
