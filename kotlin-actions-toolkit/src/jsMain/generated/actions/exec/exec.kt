// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.array.ReadonlyArray
import js.promise.Promise

external suspend fun exec(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Number

@JsName("exec")
external fun execAsync(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Promise<Number>
