// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.core.ReadonlyArray
import js.promise.Promise

@JsName("getExecOutput")
external fun getExecOutputAsync(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Promise<ExecOutput>
