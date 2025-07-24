// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * The execution of a task happens as an external process
 * without shell interaction.
 */
open external class ProcessExecution {
    /**
     * Creates a process execution.
     *
     * @param process The process to start.
     * @param options Optional options for the started process.
     */
    constructor(
        process: String,
        options: ProcessExecutionOptions = definedExternally,
    )

    /**
     * Creates a process execution.
     *
     * @param process The process to start.
     * @param args Arguments to be passed to the process.
     * @param options Optional options for the started process.
     */
    constructor(
        process: String,
        args: ReadonlyArray<JsString>,
        options: ProcessExecutionOptions = definedExternally,
    )

    /**
     * The process to be executed.
     */
    var process: String

    /**
     * The arguments passed to the process. Defaults to an empty array.
     */
    var args: ReadonlyArray<JsString>

    /**
     * The process options used when the process is executed.
     * Defaults to undefined.
     */
    var options: ProcessExecutionOptions?
}
