// Automatically generated - do not modify!

@file:JsModule("node:child_process")
@file:JsNonModule

package node.childProcess

import kotlinx.js.ReadonlyArray

/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
): node.buffer.Buffer


/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
    options: ExecFileSyncOptionsWithStringEncoding,
): String


/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
    options: ExecFileSyncOptionsWithBufferEncoding,
): node.buffer.Buffer


/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
    args: ReadonlyArray<String>,
): node.buffer.Buffer


/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
    args: ReadonlyArray<String>,
    options: ExecFileSyncOptionsWithStringEncoding,
): String


/**
 * The `child_process.execFileSync()` method is generally identical to {@link execFile} with the exception that the method will not
 * return until the child process has fully closed. When a timeout has been
 * encountered and `killSignal` is sent, the method won't return until the process
 * has completely exited.
 *
 * If the child process intercepts and handles the `SIGTERM` signal and
 * does not exit, the parent process will still wait until the child process has
 * exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw an `Error` that will include the full result of the underlying {@link spawnSync}.
 *
 * **If the `shell` option is enabled, do not pass unsanitized user input to this**
 * **function. Any input containing shell metacharacters may be used to trigger**
 * **arbitrary command execution.**
 * @since v0.11.12
 * @param file The name or path of the executable file to run.
 * @param args List of string arguments.
 * @return The stdout from the command.
 */
external fun execFileSync(
    file: String,
    args: ReadonlyArray<String>,
    options: ExecFileSyncOptionsWithBufferEncoding,
): node.buffer.Buffer
