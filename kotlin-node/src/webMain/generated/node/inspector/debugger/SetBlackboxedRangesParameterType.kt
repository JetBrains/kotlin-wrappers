// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface SetBlackboxedRangesParameterType {
    /**
     * Id of the script.
     */
    var scriptId: node.inspector.runtime.ScriptId
    var positions: js.array.ReadonlyArray<ScriptPosition>
}
