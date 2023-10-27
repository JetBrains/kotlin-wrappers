@file:JsModule("node:child_process")

package node.childProcess


/**
 * Spawns a shell then executes the `command` within that shell, buffering any
 * generated output. The `command` string passed to the exec function is processed
 * directly by the shell and special characters (vary based on [shell](https://en.wikipedia.org/wiki/List_of_command-line_interpreters))
 * need to be dealt with accordingly:
 *
 * ```js
 * const { exec } = require('child_process');
 *
 * exec('"/path/to/test file/test.sh" arg1 arg2');
 * // Double quotes are used so that the space in the path is not interpreted as
 * // a delimiter of multiple arguments.
 *
 * exec('echo "The \\$HOME variable is $HOME"');
 * // The $HOME variable is escaped in the first instance, but not in the second.
 * ```
 *
 * **Never pass unsanitized user input to this function. Any input containing shell**
 * **metacharacters may be used to trigger arbitrary command execution.**
 *
 * If a `callback` function is provided, it is called with the arguments`(error, stdout, stderr)`. On success, `error` will be `null`. On error,`error` will be an instance of `Error`. The
 * `error.code` property will be
 * the exit code of the process. By convention, any exit code other than `0`indicates an error. `error.signal` will be the signal that terminated the
 * process.
 *
 * The `stdout` and `stderr` arguments passed to the callback will contain the
 * stdout and stderr output of the child process. By default, Node.js will decode
 * the output as UTF-8 and pass strings to the callback. The `encoding` option
 * can be used to specify the character encoding used to decode the stdout and
 * stderr output. If `encoding` is `'buffer'`, or an unrecognized character
 * encoding, `Buffer` objects will be passed to the callback instead.
 *
 * ```js
 * const { exec } = require('child_process');
 * exec('cat *.js missing_file | wc -l', (error, stdout, stderr) => {
 *   if (error) {
 *     console.error(`exec error: ${error}`);
 *     return;
 *   }
 *   console.log(`stdout: ${stdout}`);
 *   console.error(`stderr: ${stderr}`);
 * });
 * ```
 *
 * If `timeout` is greater than `0`, the parent will send the signal
 * identified by the `killSignal` property (the default is `'SIGTERM'`) if the
 * child runs longer than `timeout` milliseconds.
 *
 * Unlike the [`exec(3)`](http://man7.org/linux/man-pages/man3/exec.3.html) POSIX system call, `child_process.exec()` does not replace
 * the existing process and uses a shell to execute the command.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a `Promise` for an `Object` with `stdout` and `stderr` properties. The returned`ChildProcess` instance is attached to the `Promise` as a `child` property. In
 * case of an error (including any error resulting in an exit code other than 0), a
 * rejected promise is returned, with the same `error` object given in the
 * callback, but with two additional properties `stdout` and `stderr`.
 *
 * ```js
 * const util = require('util');
 * const exec = util.promisify(require('child_process').exec);
 *
 * async function lsExample() {
 *   const { stdout, stderr } = await exec('ls');
 *   console.log('stdout:', stdout);
 *   console.error('stderr:', stderr);
 * }
 * lsExample();
 * ```
 *
 * If the `signal` option is enabled, calling `.abort()` on the corresponding`AbortController` is similar to calling `.kill()` on the child process except
 * the error passed to the callback will be an `AbortError`:
 *
 * ```js
 * const { exec } = require('child_process');
 * const controller = new AbortController();
 * const { signal } = controller;
 * const child = exec('grep ssh', { signal }, (error) => {
 *   console.log(error); // an AbortError
 * });
 * controller.abort();
 * ```
 * @since v0.1.90
 * @param command The command to run, with space-separated arguments.
 * @param callback called with the output when process terminates.
 */
external fun exec(
    command: String,
    callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally,
): ChildProcess

// `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
external fun exec(
    command: String,
    options: ExecBufferOptions,
    callback: (error: ExecException?, stdout: node.buffer.Buffer, stderr: node.buffer.Buffer) -> Unit = definedExternally,
): ChildProcess

// `options` with well known `encoding` means stdout/stderr are definitely `string`.
external fun exec(
    command: String,
    options: ExecStringOptions,
    callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally,
): ChildProcess

// `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
// There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
external fun exec(
    command: String,
    options: ExecStringOptions,
    callback: (error: ExecException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit = definedExternally,
): ChildProcess

// `options` without an `encoding` means stdout/stderr are definitely `string`.
external fun exec(
    command: String,
    options: ExecOptions,
    callback: (error: ExecException?, stdout: String, stderr: String) -> Unit = definedExternally,
): ChildProcess

// fallback if nothing else matches. Worst case is always `string | Buffer`.
external fun exec(
    command: String,
    options: (ExecObjectEncodingOptions)?,
    callback: (error: ExecException?, stdout: Any /* string | Buffer */, stderr: Any /* string | Buffer */) -> Unit = definedExternally,
): ChildProcess
