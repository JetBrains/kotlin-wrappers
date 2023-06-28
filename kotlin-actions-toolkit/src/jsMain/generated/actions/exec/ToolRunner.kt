// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.core.ReadonlyArray
import js.promise.Promise

external class ToolRunner : node.events.EventEmitter {
    constructor(
        toolPath: String,
        args: ReadonlyArray<String> = definedExternally,
        options: ExecOptions = definedExternally,
    )

    /**
     * Exec a tool.
     * Output will be streamed to the live console.
     * Returns promise with return code
     *
     * @param     tool     path to tool to exec
     * @param     options  optional exec options.  See ExecOptions
     * @returns   number
     */
    fun exec(): Promise<Number>
}
