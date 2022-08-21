// Automatically generated - do not modify!

@file:JsModule("node:child_process")
@file:JsNonModule

package node.childProcess

import node.buffer.Buffer

/**
 * The `child_process.execSync()` method is generally identical to {@link exec} with the exception that the method will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the child process intercepts and handles the `SIGTERM`signal and doesn't exit, the parent process will wait until the child process
 * has exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw.
 * The `Error` object will contain the entire result from {@link spawnSync}.
 *
 * **Never pass unsanitized user input to this function. Any input containing shell**
 * **metacharacters may be used to trigger arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @return The stdout from the command.
 */
external fun execSync(
    command: String,
): Buffer


/**
 * The `child_process.execSync()` method is generally identical to {@link exec} with the exception that the method will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the child process intercepts and handles the `SIGTERM`signal and doesn't exit, the parent process will wait until the child process
 * has exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw.
 * The `Error` object will contain the entire result from {@link spawnSync}.
 *
 * **Never pass unsanitized user input to this function. Any input containing shell**
 * **metacharacters may be used to trigger arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @return The stdout from the command.
 */
external fun execSync(
    command: String,
    options: ExecSyncOptionsWithStringEncoding,
): String


/**
 * The `child_process.execSync()` method is generally identical to {@link exec} with the exception that the method will not return
 * until the child process has fully closed. When a timeout has been encountered
 * and `killSignal` is sent, the method won't return until the process has
 * completely exited. If the child process intercepts and handles the `SIGTERM`signal and doesn't exit, the parent process will wait until the child process
 * has exited.
 *
 * If the process times out or has a non-zero exit code, this method will throw.
 * The `Error` object will contain the entire result from {@link spawnSync}.
 *
 * **Never pass unsanitized user input to this function. Any input containing shell**
 * **metacharacters may be used to trigger arbitrary command execution.**
 * @since v0.11.12
 * @param command The command to run.
 * @return The stdout from the command.
 */
external fun execSync(
    command: String,
    options: ExecSyncOptionsWithBufferEncoding,
): Buffer
