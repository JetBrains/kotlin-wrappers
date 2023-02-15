// Automatically generated - do not modify!

package actions.exec

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun exec(
    commandLine: String,
): Number =
    execAsync(
        commandLine = commandLine,
    ).await()

suspend fun exec(
    commandLine: String,
    args: ReadonlyArray<String>,
): Number =
    execAsync(
        commandLine = commandLine,
        args = args,
    ).await()

suspend fun exec(
    commandLine: String,
    args: ReadonlyArray<String>,
    options: ExecOptions,
): Number =
    execAsync(
        commandLine = commandLine,
        args = args,
        options = options,
    ).await()
