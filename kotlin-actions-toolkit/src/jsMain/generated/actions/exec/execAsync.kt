// Automatically generated - do not modify!

@file:JsModule("@actions/exec")

package actions.exec

import js.array.ReadonlyArray
import js.promise.Promise

@JsName("exec")
external fun execAsync(
    commandLine: String,
    args: ReadonlyArray<String> = definedExternally,
    options: ExecOptions = definedExternally,
): Promise<Number>
