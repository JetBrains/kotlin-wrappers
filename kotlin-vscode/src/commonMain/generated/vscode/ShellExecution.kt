// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents a task execution that happens inside a shell.
*/
export class ShellExecution {
/**
 * Creates a shell execution with a full command line.
 *
 * @param commandLine The command line to execute.
 * @param options Optional options for the started the shell.
*/
constructor(commandLine: string, options?: ShellExecutionOptions);

/**
 * Creates a shell execution with a command and arguments. For the real execution the editor will
 * construct a command line from the command and the arguments. This is subject to interpretation
 * especially when it comes to quoting. If full control over the command line is needed please
 * use the constructor that creates a `ShellExecution` with the full command line.
 *
 * @param command The command to execute.
 * @param args The command arguments.
 * @param options Optional options for the started the shell.
*/
constructor(command: string | ShellQuotedString, args: Array<string | ShellQuotedString>, options?: ShellExecutionOptions);

/**
 * The shell command line. Is `undefined` if created with a command and arguments.
*/
commandLine: string | undefined;

/**
 * The shell command. Is `undefined` if created with a full command line.
*/
command: string | ShellQuotedString | undefined;

/**
 * The shell args. Is `undefined` if created with a full command line.
*/
args: Array<string | ShellQuotedString> | undefined;

/**
 * The shell options used when the command line is executed in a shell.
 * Defaults to undefined.
*/
options?: ShellExecutionOptions;
}

// ORIGINAL SOURCE
 **/
