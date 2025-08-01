// Automatically generated - do not modify!

package vscode

/**
 * A debug adapter factory that creates [debug adapter trackers][DebugAdapterTracker].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTrackerFactory)
 */
external interface DebugAdapterTrackerFactory {
    /**
     * The method 'createDebugAdapterTracker' is called at the start of a debug session in order
     * to return a "tracker" object that provides read-access to the communication between the editor and a debug adapter.
     *
     * @param session The [debug session][DebugSession] for which the debug adapter tracker will be used.
     * @returns A [debug adapter tracker][DebugAdapterTracker] or undefined.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugAdapterTrackerFactory.createDebugAdapterTracker)
     */
    fun createDebugAdapterTracker(session: DebugSession): ProviderResult<DebugAdapterTracker>
}
