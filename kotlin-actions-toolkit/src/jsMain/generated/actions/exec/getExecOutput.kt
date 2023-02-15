// Automatically generated - do not modify!

package actions.exec

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun getExecOutput(
    commandLine: String,
): ExecOutput =
    getExecOutputAsync(
        commandLine = commandLine,
    ).await()

suspend fun getExecOutput(
    commandLine: String,
    args: ReadonlyArray<String>,
): ExecOutput =
    getExecOutputAsync(
        commandLine = commandLine,
        args = args,
    ).await()

suspend fun getExecOutput(
    commandLine: String,
    args: ReadonlyArray<String>,
    options: ExecOptions,
): ExecOutput =
    getExecOutputAsync(
        commandLine = commandLine,
        args = args,
        options = options,
    ).await()
