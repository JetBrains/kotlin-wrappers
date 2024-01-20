// Generated by Karakum - do not modify it manually!


package node.inspector.profiler


/**
 * Coverage data for a JavaScript script.
 */

sealed external interface ScriptCoverage {
    /**
     * JavaScript script id.
     */
    var scriptId: node.inspector.runtime.ScriptId

    /**
     * JavaScript script name or url.
     */
    var url: String

    /**
     * Functions contained in the script that has coverage data.
     */
    var functions: js.array.ReadonlyArray<FunctionCoverage>
}