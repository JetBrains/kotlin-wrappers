// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * McpStdioServerDefinition represents an MCP server available by running
 * a local process and operating on its stdin and stdout streams. The process
 * will be spawned as a child process of the extension host and by default
 * will not run in a shell environment.
 */
open external class McpStdioServerDefinition {
    /**
    // ORIGINAL SOURCE

    /**
     * The human-readable name of the server.
    */
    readonly label: string;

    /**
     * The working directory used to start the server.
    */
    cwd?: Uri;

    /**
     * The command used to start the server. Node.js-based servers may use
     * `process.execPath` to use the editor's version of Node.js to run the script.
    */
    command: string;

    /**
     * Additional command-line arguments passed to the server.
    */
    args: string[];

    /**
     * Optional additional environment information for the server. Variables
     * in this environment will overwrite or remove (if null) the default
     * environment variables of the editor's extension host.
    */
    env: Record<string, string | number | null>;

    /**
     * Optional version identification for the server. If this changes, the
     * editor will indicate that tools have changed and prompt to refresh them.
    */
    version?: string;

    /**
     * @param label The human-readable name of the server.
     * @param command The command used to start the server.
     * @param args Additional command-line arguments passed to the server.
     * @param env Optional additional environment information for the server.
     * @param version Optional version identification for the server.
    */
    constructor(label: string, command: string, args?: string[], env?: Record<string, string | number | null>, version?: string);

    // ORIGINAL SOURCE
     **/
}
