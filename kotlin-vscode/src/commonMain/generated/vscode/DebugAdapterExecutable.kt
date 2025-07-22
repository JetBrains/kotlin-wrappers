// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a debug adapter executable and optional arguments and runtime options passed to it.
 */
open external class DebugAdapterExecutable {
    /**
    // ORIGINAL SOURCE


    /**
     * Creates a description for a debug adapter based on an executable program.
     *
     * @param command The command or executable path that implements the debug adapter.
     * @param args Optional arguments to be passed to the command or executable.
     * @param options Optional options to be used when starting the command or executable.
    */
    constructor(command: string, args?: string[], options?: DebugAdapterExecutableOptions);

    /**
     * The command or path of the debug adapter executable.
     * A command must be either an absolute path of an executable or the name of an command to be looked up via the PATH environment variable.
     * The special value 'node' will be mapped to the editor's built-in Node.js runtime.
    */
    readonly command: string;

    /**
     * The arguments passed to the debug adapter executable. Defaults to an empty array.
    */
    readonly args: string[];

    /**
     * Optional options to be used when the debug adapter is started.
     * Defaults to undefined.
    */
    readonly options?: DebugAdapterExecutableOptions;

    // ORIGINAL SOURCE
     **/
}
