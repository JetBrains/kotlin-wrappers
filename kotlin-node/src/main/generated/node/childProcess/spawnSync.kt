// Automatically generated - do not modify!

@file:JsModule("node:child_process")
@file:JsNonModule

package node.childProcess

import kotlinx.js.ReadonlyArray
import node.buffer.Buffer

/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
): SpawnSyncReturns<Buffer>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    options: SpawnSyncOptionsWithStringEncoding,
): SpawnSyncReturns<String>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    options: SpawnSyncOptionsWithBufferEncoding,
): SpawnSyncReturns<Buffer>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    options: SpawnSyncOptions = definedExternally,
): Any /* SpawnSyncReturns<string | Buffer> */


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    args: ReadonlyArray<String>,
): SpawnSyncReturns<Buffer>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    args: ReadonlyArray<String>,
    options: SpawnSyncOptionsWithStringEncoding,
): SpawnSyncReturns<String>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    args: ReadonlyArray<String>,
    options: SpawnSyncOptionsWithBufferEncoding,
): SpawnSyncReturns<Buffer>


/**
 * The `child_process.spawnSync()` method is generally identical to {@link spawn} with the exception that the function will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the process intercepts and handles the `SIGTERM` signal
 * and doesn't exit, the parent process will wait until the child process has
 * exited.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @param args List of string arguments.
 */
external fun spawnSync(
    command: String,
    args: ReadonlyArray<String> = definedExternally,
    options: SpawnSyncOptions = definedExternally,
): Any /* SpawnSyncReturns<string | Buffer> */
