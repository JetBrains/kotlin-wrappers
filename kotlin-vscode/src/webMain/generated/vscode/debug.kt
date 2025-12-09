// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.*

/**
 * Namespace for debug functionality.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug)
 */
external object debug {
    /**
     * The currently active [debug session][DebugSession] or `undefined`. The active debug session is the one
     * represented by the debug action floating window or the one currently shown in the drop down menu of the debug action floating window.
     * If no debug session is active, the value is `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.activeDebugSession)
     */
    var activeDebugSession: DebugSession?

    /**
     * The currently active [debug console][DebugConsole].
     * If no debug session is active, output sent to the debug console is not shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.activeDebugConsole)
     */
    var activeDebugConsole: DebugConsole

    /**
     * List of breakpoints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.breakpoints)
     */
    var breakpoints: ReadonlyArray<Breakpoint>

    /**
     * An [Event] which fires when the [active debug session][debug.activeDebugSession]
     * has changed. *Note* that the event also fires when the active debug session changes
     * to `undefined`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidChangeActiveDebugSession)
     */
    val onDidChangeActiveDebugSession: Event<DebugSession?>

    /**
     * An [Event] which fires when a new [debug session][DebugSession] has been started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidStartDebugSession)
     */
    val onDidStartDebugSession: Event<DebugSession>

    /**
     * An [Event] which fires when a custom DAP event is received from the [debug session][DebugSession].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidReceiveDebugSessionCustomEvent)
     */
    val onDidReceiveDebugSessionCustomEvent: Event<DebugSessionCustomEvent>

    /**
     * An [Event] which fires when a [debug session][DebugSession] has terminated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidTerminateDebugSession)
     */
    val onDidTerminateDebugSession: Event<DebugSession>

    /**
     * An [Event] that is emitted when the set of breakpoints is added, removed, or changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidChangeBreakpoints)
     */
    val onDidChangeBreakpoints: Event<BreakpointsChangeEvent>

    /**
     * The currently focused thread or stack frame, or `undefined` if no
     * thread or stack is focused. A thread can be focused any time there is
     * an active debug session, while a stack frame can only be focused when
     * a session is paused and the call stack has been retrieved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.activeStackItem)
     */
    val activeStackItem: JsAny /* DebugThread | DebugStackFrame */?

    /**
     * An event which fires when the [debug.activeStackItem] has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.onDidChangeActiveStackItem)
     */
    val onDidChangeActiveStackItem: Event<JsAny /* DebugThread | DebugStackFrame */?>

    /**
     * Register a [debug configuration provider][DebugConfigurationProvider] for a specific debug type.
     * The optional [triggerKind][DebugConfigurationProviderTriggerKind] can be used to specify when the `provideDebugConfigurations` method of the provider is triggered.
     * Currently two trigger kinds are possible: with the value `Initial` (or if no trigger kind argument is given) the `provideDebugConfigurations` method is used to provide the initial debug configurations to be copied into a newly created launch.json.
     * With the trigger kind `Dynamic` the `provideDebugConfigurations` method is used to dynamically determine debug configurations to be presented to the user (in addition to the static configurations from the launch.json).
     * Please note that the `triggerKind` argument only applies to the `provideDebugConfigurations` method: so the `resolveDebugConfiguration` methods are not affected at all.
     * Registering a single provider with resolve methods for different trigger kinds, results in the same resolve methods called multiple times.
     * More than one provider can be registered for the same type.
     *
     * @param debugType The debug type for which the provider is registered.
     * @param provider The [debug configuration provider][DebugConfigurationProvider] to register.
     * @param triggerKind The [trigger][DebugConfigurationProviderTriggerKind] for which the 'provideDebugConfiguration' method of the provider is registered. If `triggerKind` is missing, the value `DebugConfigurationProviderTriggerKind.Initial` is assumed.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.registerDebugConfigurationProvider)
     */
    fun registerDebugConfigurationProvider(
        debugType: String,
        provider: DebugConfigurationProvider,
        triggerKind: DebugConfigurationProviderTriggerKind = definedExternally,
    ): Disposable

    /**
     * Register a [debug adapter descriptor factory][DebugAdapterDescriptorFactory] for a specific debug type.
     * An extension is only allowed to register a DebugAdapterDescriptorFactory for the debug type(s) defined by the extension. Otherwise an error is thrown.
     * Registering more than one DebugAdapterDescriptorFactory for a debug type results in an error.
     *
     * @param debugType The debug type for which the factory is registered.
     * @param factory The [debug adapter descriptor factory][DebugAdapterDescriptorFactory] to register.
     * @returns A [Disposable] that unregisters this factory when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.registerDebugAdapterDescriptorFactory)
     */
    fun registerDebugAdapterDescriptorFactory(
        debugType: String,
        factory: DebugAdapterDescriptorFactory,
    ): Disposable

    /**
     * Register a debug adapter tracker factory for the given debug type.
     *
     * @param debugType The debug type for which the factory is registered or '*' for matching all debug types.
     * @param factory The [debug adapter tracker factory][DebugAdapterTrackerFactory] to register.
     * @returns A [Disposable] that unregisters this factory when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.registerDebugAdapterTrackerFactory)
     */
    fun registerDebugAdapterTrackerFactory(
        debugType: String,
        factory: DebugAdapterTrackerFactory,
    ): Disposable

    /**
     * Start debugging by using either a named launch or named compound configuration,
     * or by directly passing a [DebugConfiguration].
     * The named configurations are looked up in '.vscode/launch.json' found in the given folder.
     * Before debugging starts, all unsaved files are saved and the launch configurations are brought up-to-date.
     * Folder specific variables used in the configuration (e.g. '${workspaceFolder}') are resolved against the given folder.
     * @param folder The [workspace folder][WorkspaceFolder] for looking up named configurations and resolving variables or `undefined` for a non-folder setup.
     * @param nameOrConfiguration Either the name of a debug or compound configuration or a [DebugConfiguration] object.
     * @param parentSessionOrOptions Debug session options. When passed a parent [debug session][DebugSession], assumes options with just this parent session.
     * @returns A thenable that resolves when debugging could be successfully started.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.startDebugging)
     */
    @JsName("startDebugging")
    fun startDebuggingAsync(
        folder: WorkspaceFolder?,
        nameOrConfiguration: String,
        parentSessionOrOptions: DebugSession = definedExternally,
    ): PromiseLike<JsBoolean>

    @JsName("startDebugging")
    fun startDebuggingAsync(
        folder: WorkspaceFolder?,
        nameOrConfiguration: String,
        parentSessionOrOptions: DebugSessionOptions,
    ): PromiseLike<JsBoolean>

    @JsName("startDebugging")
    fun startDebuggingAsync(
        folder: WorkspaceFolder?,
        nameOrConfiguration: DebugConfiguration,
        parentSessionOrOptions: DebugSession = definedExternally,
    ): PromiseLike<JsBoolean>

    @JsName("startDebugging")
    fun startDebuggingAsync(
        folder: WorkspaceFolder?,
        nameOrConfiguration: DebugConfiguration,
        parentSessionOrOptions: DebugSessionOptions,
    ): PromiseLike<JsBoolean>

    /**
     * Stop the given debug session or stop all debug sessions if session is omitted.
     *
     * @param session The [debug session][DebugSession] to stop; if omitted all sessions are stopped.
     * @returns A thenable that resolves when the session(s) have been stopped.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.stopDebugging)
     */
    @JsName("stopDebugging")
    fun stopDebuggingAsync(session: DebugSession = definedExternally): PromiseLike<Void>

    /**
     * Add breakpoints.
     * @param breakpoints The breakpoints to add.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.addBreakpoints)
     */
    fun addBreakpoints(breakpoints: ReadonlyArray<Breakpoint>)

    /**
     * Remove breakpoints.
     * @param breakpoints The breakpoints to remove.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.removeBreakpoints)
     */
    fun removeBreakpoints(breakpoints: ReadonlyArray<Breakpoint>)

    /**
     * Converts a "Source" descriptor object received via the Debug Adapter Protocol into a Uri that can be used to load its contents.
     * If the source descriptor is based on a path, a file Uri is returned.
     * If the source descriptor uses a reference number, a specific debug Uri (scheme 'debug') is constructed that requires a corresponding ContentProvider and a running debug session
     *
     * If the "Source" descriptor has insufficient information for creating the Uri, an error is thrown.
     *
     * @param source An object conforming to the [Source](https://microsoft.github.io/debug-adapter-protocol/specification#Types_Source) type defined in the Debug Adapter Protocol.
     * @param session An optional debug session that will be used when the source descriptor uses a reference number to load the contents from an active debug session.
     * @returns A uri that can be used to load the contents of the source.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#debug.asDebugSourceUri)
     */
    fun asDebugSourceUri(
        source: DebugProtocolSource,
        session: DebugSession = definedExternally,
    ): Uri
}
