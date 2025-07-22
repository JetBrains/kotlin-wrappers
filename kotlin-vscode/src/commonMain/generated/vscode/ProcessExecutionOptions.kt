// Automatically generated - do not modify!

package vscode

/**
 * Options for a process execution
 */
external interface ProcessExecutionOptions {
    /**
    // ORIGINAL SOURCE

    /**
     * The current working directory of the executed program or shell.
     * If omitted the tools current workspace root is used.
    */
    cwd?: string;

    /**
     * The additional environment of the executed program or shell. If omitted
     * the parent process' environment is used. If provided it is merged with
     * the parent process' environment.
    */
    env?: { [key: string]: string };

    // ORIGINAL SOURCE
     **/
}
