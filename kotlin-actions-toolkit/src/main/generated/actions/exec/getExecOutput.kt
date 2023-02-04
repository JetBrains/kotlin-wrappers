// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.core.ReadonlyArray
import kotlin.js.Promise

external fun getExecOutput(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Promise<ExecOutput>
