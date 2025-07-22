// Automatically generated - do not modify!

package vscode

/**
 * Options for creating a {@link TelemetryLogger}
 */
external interface TelemetryLoggerOptions {
    /**
    // ORIGINAL SOURCE

    /**
     * Whether or not you want to avoid having the built-in common properties such as os, extension name, etc injected into the data object.
     * Defaults to `false` if not defined.
    */
    readonly ignoreBuiltInCommonProperties?: boolean;

    /**
     * Whether or not unhandled errors on the extension host caused by your extension should be logged to your sender.
     * Defaults to `false` if not defined.
    */
    readonly ignoreUnhandledErrors?: boolean;

    /**
     * Any additional common properties which should be injected into the data object.
    */
    readonly additionalCommonProperties?: Record<string, any>;

    // ORIGINAL SOURCE
     **/
}
