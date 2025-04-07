// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun getExecOutput(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): ExecOutput

@JsName("getExecOutput")
external fun getExecOutputAsync(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Promise<ExecOutput>
