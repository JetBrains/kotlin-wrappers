// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Options for a shell execution
*/
export interface ShellExecutionOptions {
/**
 * The shell executable.
*/
executable?: string;

/**
 * The arguments to be passed to the shell executable used to run the task. Most shells
 * require special arguments to execute a command. For  example `bash` requires the `-c`
 * argument to execute a command, `PowerShell` requires `-Command` and `cmd` requires both
 * `/d` and `/c`.
*/
shellArgs?: string[];

/**
 * The shell quotes supported by this shell.
*/
shellQuoting?: ShellQuotingOptions;

/**
 * The current working directory of the executed shell.
 * If omitted the tools current workspace root is used.
*/
cwd?: string;

/**
 * The additional environment of the executed shell. If omitted
 * the parent process' environment is used. If provided it is merged with
 * the parent process' environment.
*/
env?: { [key: string]: string };
}

// ORIGINAL SOURCE
 **/
