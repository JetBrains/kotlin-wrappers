// Automatically generated - do not modify!

@file:JsModule("node:inspector/promises")

package node.inspector

import node.events.EventEmitter

/**
 * The `inspector.Session` is used for dispatching messages to the V8 inspector
 * back-end and receiving message responses and notifications.
 * @since v19.0.0
 */
external class Session : EventEmitter {
    /**
     * Create a new instance of the inspector.Session class.
     * The inspector session needs to be connected through `session.connect()` before the messages can be dispatched to the inspector backend.
     */
    constructor ()

    /**
     * Connects a session to the inspector back-end.
     */
    fun connect()

    /**
     * Connects a session to the inspector back-end.
     * An exception will be thrown if this API was not called on a Worker thread.
     * @since v12.11.0
     */
    fun connectToMainThread()

    /**
     * Immediately close the session. All pending message callbacks will be called with an error.
     * `session.connect()` will need to be called to be able to send messages again.
     * Reconnected session will lose all inspector state, such as enabled agents or configured breakpoints.
     */
    fun disconnect()

    /**
     * Posts a message to the inspector back-end.
     *
     * ```js
     * import { Session } from 'node:inspector/promises';
     * try {
     *   const session = new Session();
     *   session.connect();
     *   const result = await session.post('Runtime.evaluate', { expression: '2 + 2' });
     *   console.log(result);
     * } catch (error) {
     *   console.error(error);
     * }
     * // Output: { result: { type: 'number', value: 4, description: '4' } }
     * ```
     *
     * The latest version of the V8 inspector protocol is published on the
     * [Chrome DevTools Protocol Viewer](https://chromedevtools.github.io/devtools-protocol/v8/).
     *
     * Node.js inspector supports all the Chrome DevTools Protocol domains declared
     * by V8. Chrome DevTools Protocol domain provides an interface for interacting
     * with one of the runtime agents used to inspect the application state and listen
     * to the run-time events.
     */
    @JsName("post")
    fun postAsync(
        method: String,
        params: Any = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: String,
        params: Any = definedExternally,
    ): js.core.Void

    /**
     * Returns supported domains.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.SCHEMA_GETDOMAINS): js.promise.Promise<node.inspector.schema.GetDomainsReturnType>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.SCHEMA_GETDOMAINS): node.inspector.schema.GetDomainsReturnType

    /**
     * Evaluates expression on global object.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_EVALUATE,
        params: node.inspector.runtime.EvaluateParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.EvaluateReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_EVALUATE,
        params: node.inspector.runtime.EvaluateParameterType = definedExternally,
    ): node.inspector.runtime.EvaluateReturnType

    /**
     * Add handler to promise with given promise object id.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_AWAITPROMISE,
        params: node.inspector.runtime.AwaitPromiseParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.AwaitPromiseReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_AWAITPROMISE,
        params: node.inspector.runtime.AwaitPromiseParameterType = definedExternally,
    ): node.inspector.runtime.AwaitPromiseReturnType

    /**
     * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_CALLFUNCTIONON,
        params: node.inspector.runtime.CallFunctionOnParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.CallFunctionOnReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_CALLFUNCTIONON,
        params: node.inspector.runtime.CallFunctionOnParameterType = definedExternally,
    ): node.inspector.runtime.CallFunctionOnReturnType

    /**
     * Returns properties of a given object. Object group of the result is inherited from the target object.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_GETPROPERTIES,
        params: node.inspector.runtime.GetPropertiesParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.GetPropertiesReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_GETPROPERTIES,
        params: node.inspector.runtime.GetPropertiesParameterType = definedExternally,
    ): node.inspector.runtime.GetPropertiesReturnType

    /**
     * Releases remote object with given id.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_RELEASEOBJECT,
        params: node.inspector.runtime.ReleaseObjectParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_RELEASEOBJECT,
        params: node.inspector.runtime.ReleaseObjectParameterType = definedExternally,
    ): js.core.Void

    /**
     * Releases all remote objects that belong to a given group.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_RELEASEOBJECTGROUP,
        params: node.inspector.runtime.ReleaseObjectGroupParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_RELEASEOBJECTGROUP,
        params: node.inspector.runtime.ReleaseObjectGroupParameterType = definedExternally,
    ): js.core.Void

    /**
     * Tells inspected instance to run if it was waiting for debugger to attach.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.RUNTIME_RUNIFWAITINGFORDEBUGGER): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.RUNTIME_RUNIFWAITINGFORDEBUGGER): js.core.Void

    /**
     * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.RUNTIME_ENABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.RUNTIME_ENABLE): js.core.Void

    /**
     * Disables reporting of execution contexts creation.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.RUNTIME_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.RUNTIME_DISABLE): js.core.Void

    /**
     * Discards collected exceptions and console API calls.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.RUNTIME_DISCARDCONSOLEENTRIES): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.RUNTIME_DISCARDCONSOLEENTRIES): js.core.Void

    /**
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_SETCUSTOMOBJECTFORMATTERENABLED,
        params: node.inspector.runtime.SetCustomObjectFormatterEnabledParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_SETCUSTOMOBJECTFORMATTERENABLED,
        params: node.inspector.runtime.SetCustomObjectFormatterEnabledParameterType = definedExternally,
    ): js.core.Void

    /**
     * Compiles expression.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_COMPILESCRIPT,
        params: node.inspector.runtime.CompileScriptParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.CompileScriptReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_COMPILESCRIPT,
        params: node.inspector.runtime.CompileScriptParameterType = definedExternally,
    ): node.inspector.runtime.CompileScriptReturnType

    /**
     * Runs script with given id in a given context.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_RUNSCRIPT,
        params: node.inspector.runtime.RunScriptParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.RunScriptReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_RUNSCRIPT,
        params: node.inspector.runtime.RunScriptParameterType = definedExternally,
    ): node.inspector.runtime.RunScriptReturnType

    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_QUERYOBJECTS,
        params: node.inspector.runtime.QueryObjectsParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.QueryObjectsReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_QUERYOBJECTS,
        params: node.inspector.runtime.QueryObjectsParameterType = definedExternally,
    ): node.inspector.runtime.QueryObjectsReturnType

    /**
     * Returns all let, const and class variables from global scope.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.RUNTIME_GLOBALLEXICALSCOPENAMES,
        params: node.inspector.runtime.GlobalLexicalScopeNamesParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.runtime.GlobalLexicalScopeNamesReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.RUNTIME_GLOBALLEXICALSCOPENAMES,
        params: node.inspector.runtime.GlobalLexicalScopeNamesParameterType = definedExternally,
    ): node.inspector.runtime.GlobalLexicalScopeNamesReturnType

    /**
     * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_ENABLE): js.promise.Promise<node.inspector.debugger.EnableReturnType>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_ENABLE): node.inspector.debugger.EnableReturnType

    /**
     * Disables debugger for given page.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_DISABLE): js.core.Void

    /**
     * Activates / deactivates all breakpoints on the page.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETBREAKPOINTSACTIVE,
        params: node.inspector.debugger.SetBreakpointsActiveParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETBREAKPOINTSACTIVE,
        params: node.inspector.debugger.SetBreakpointsActiveParameterType = definedExternally,
    ): js.core.Void

    /**
     * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETSKIPALLPAUSES,
        params: node.inspector.debugger.SetSkipAllPausesParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETSKIPALLPAUSES,
        params: node.inspector.debugger.SetSkipAllPausesParameterType = definedExternally,
    ): js.core.Void

    /**
     * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETBREAKPOINTBYURL,
        params: node.inspector.debugger.SetBreakpointByUrlParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.SetBreakpointByUrlReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETBREAKPOINTBYURL,
        params: node.inspector.debugger.SetBreakpointByUrlParameterType = definedExternally,
    ): node.inspector.debugger.SetBreakpointByUrlReturnType

    /**
     * Sets JavaScript breakpoint at a given location.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETBREAKPOINT,
        params: node.inspector.debugger.SetBreakpointParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.SetBreakpointReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETBREAKPOINT,
        params: node.inspector.debugger.SetBreakpointParameterType = definedExternally,
    ): node.inspector.debugger.SetBreakpointReturnType

    /**
     * Removes JavaScript breakpoint.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_REMOVEBREAKPOINT,
        params: node.inspector.debugger.RemoveBreakpointParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_REMOVEBREAKPOINT,
        params: node.inspector.debugger.RemoveBreakpointParameterType = definedExternally,
    ): js.core.Void

    /**
     * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_GETPOSSIBLEBREAKPOINTS,
        params: node.inspector.debugger.GetPossibleBreakpointsParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.GetPossibleBreakpointsReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_GETPOSSIBLEBREAKPOINTS,
        params: node.inspector.debugger.GetPossibleBreakpointsParameterType = definedExternally,
    ): node.inspector.debugger.GetPossibleBreakpointsReturnType

    /**
     * Continues execution until specific location is reached.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_CONTINUETOLOCATION,
        params: node.inspector.debugger.ContinueToLocationParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_CONTINUETOLOCATION,
        params: node.inspector.debugger.ContinueToLocationParameterType = definedExternally,
    ): js.core.Void

    /**
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_PAUSEONASYNCCALL,
        params: node.inspector.debugger.PauseOnAsyncCallParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_PAUSEONASYNCCALL,
        params: node.inspector.debugger.PauseOnAsyncCallParameterType = definedExternally,
    ): js.core.Void

    /**
     * Steps over the statement.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_STEPOVER): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_STEPOVER): js.core.Void

    /**
     * Steps into the function call.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_STEPINTO,
        params: node.inspector.debugger.StepIntoParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_STEPINTO,
        params: node.inspector.debugger.StepIntoParameterType = definedExternally,
    ): js.core.Void

    /**
     * Steps out of the function call.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_STEPOUT): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_STEPOUT): js.core.Void

    /**
     * Stops on the next JavaScript statement.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_PAUSE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_PAUSE): js.core.Void

    /**
     * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled before next pause. Returns success when async task is actually scheduled, returns error if no task were scheduled or another scheduleStepIntoAsync was called.
     * @experimental
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_SCHEDULESTEPINTOASYNC): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_SCHEDULESTEPINTOASYNC): js.core.Void

    /**
     * Resumes JavaScript execution.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.DEBUGGER_RESUME): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.DEBUGGER_RESUME): js.core.Void

    /**
     * Returns stack trace with given <code>stackTraceId</code>.
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_GETSTACKTRACE,
        params: node.inspector.debugger.GetStackTraceParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.GetStackTraceReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_GETSTACKTRACE,
        params: node.inspector.debugger.GetStackTraceParameterType = definedExternally,
    ): node.inspector.debugger.GetStackTraceReturnType

    /**
     * Searches for given string in script content.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SEARCHINCONTENT,
        params: node.inspector.debugger.SearchInContentParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.SearchInContentReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SEARCHINCONTENT,
        params: node.inspector.debugger.SearchInContentParameterType = definedExternally,
    ): node.inspector.debugger.SearchInContentReturnType

    /**
     * Edits JavaScript source live.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETSCRIPTSOURCE,
        params: node.inspector.debugger.SetScriptSourceParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.SetScriptSourceReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETSCRIPTSOURCE,
        params: node.inspector.debugger.SetScriptSourceParameterType = definedExternally,
    ): node.inspector.debugger.SetScriptSourceReturnType

    /**
     * Restarts particular call frame from the beginning.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_RESTARTFRAME,
        params: node.inspector.debugger.RestartFrameParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.RestartFrameReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_RESTARTFRAME,
        params: node.inspector.debugger.RestartFrameParameterType = definedExternally,
    ): node.inspector.debugger.RestartFrameReturnType

    /**
     * Returns source for the script with given id.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_GETSCRIPTSOURCE,
        params: node.inspector.debugger.GetScriptSourceParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.GetScriptSourceReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_GETSCRIPTSOURCE,
        params: node.inspector.debugger.GetScriptSourceParameterType = definedExternally,
    ): node.inspector.debugger.GetScriptSourceReturnType

    /**
     * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETPAUSEONEXCEPTIONS,
        params: node.inspector.debugger.SetPauseOnExceptionsParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETPAUSEONEXCEPTIONS,
        params: node.inspector.debugger.SetPauseOnExceptionsParameterType = definedExternally,
    ): js.core.Void

    /**
     * Evaluates expression on a given call frame.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_EVALUATEONCALLFRAME,
        params: node.inspector.debugger.EvaluateOnCallFrameParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.debugger.EvaluateOnCallFrameReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_EVALUATEONCALLFRAME,
        params: node.inspector.debugger.EvaluateOnCallFrameParameterType = definedExternally,
    ): node.inspector.debugger.EvaluateOnCallFrameReturnType

    /**
     * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETVARIABLEVALUE,
        params: node.inspector.debugger.SetVariableValueParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETVARIABLEVALUE,
        params: node.inspector.debugger.SetVariableValueParameterType = definedExternally,
    ): js.core.Void

    /**
     * Changes return value in top frame. Available only at return break position.
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETRETURNVALUE,
        params: node.inspector.debugger.SetReturnValueParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETRETURNVALUE,
        params: node.inspector.debugger.SetReturnValueParameterType = definedExternally,
    ): js.core.Void

    /**
     * Enables or disables async call stacks tracking.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETASYNCCALLSTACKDEPTH,
        params: node.inspector.debugger.SetAsyncCallStackDepthParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETASYNCCALLSTACKDEPTH,
        params: node.inspector.debugger.SetAsyncCallStackDepthParameterType = definedExternally,
    ): js.core.Void

    /**
     * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETBLACKBOXPATTERNS,
        params: node.inspector.debugger.SetBlackboxPatternsParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETBLACKBOXPATTERNS,
        params: node.inspector.debugger.SetBlackboxPatternsParameterType = definedExternally,
    ): js.core.Void

    /**
     * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.DEBUGGER_SETBLACKBOXEDRANGES,
        params: node.inspector.debugger.SetBlackboxedRangesParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.DEBUGGER_SETBLACKBOXEDRANGES,
        params: node.inspector.debugger.SetBlackboxedRangesParameterType = definedExternally,
    ): js.core.Void

    /**
     * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.CONSOLE_ENABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.CONSOLE_ENABLE): js.core.Void

    /**
     * Disables console domain, prevents further console messages from being reported to the client.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.CONSOLE_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.CONSOLE_DISABLE): js.core.Void

    /**
     * Does nothing.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.CONSOLE_CLEARMESSAGES): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.CONSOLE_CLEARMESSAGES): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.PROFILER_ENABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.PROFILER_ENABLE): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.PROFILER_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.PROFILER_DISABLE): js.core.Void

    /**
     * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.PROFILER_SETSAMPLINGINTERVAL,
        params: node.inspector.profiler.SetSamplingIntervalParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.PROFILER_SETSAMPLINGINTERVAL,
        params: node.inspector.profiler.SetSamplingIntervalParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.PROFILER_START): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.PROFILER_START): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.PROFILER_STOP): js.promise.Promise<node.inspector.profiler.StopReturnType>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.PROFILER_STOP): node.inspector.profiler.StopReturnType

    /**
     * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code coverage may be incomplete. Enabling prevents running optimized code and resets execution counters.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.PROFILER_STARTPRECISECOVERAGE,
        params: node.inspector.profiler.StartPreciseCoverageParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.PROFILER_STARTPRECISECOVERAGE,
        params: node.inspector.profiler.StartPreciseCoverageParameterType = definedExternally,
    ): js.core.Void

    /**
     * Disable precise code coverage. Disabling releases unnecessary execution count records and allows executing optimized code.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.PROFILER_STOPPRECISECOVERAGE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.PROFILER_STOPPRECISECOVERAGE): js.core.Void

    /**
     * Collect coverage data for the current isolate, and resets execution counters. Precise code coverage needs to have started.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.PROFILER_TAKEPRECISECOVERAGE,
    ): js.promise.Promise<node.inspector.profiler.TakePreciseCoverageReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.PROFILER_TAKEPRECISECOVERAGE,
    ): node.inspector.profiler.TakePreciseCoverageReturnType

    /**
     * Collect coverage data for the current isolate. The coverage data may be incomplete due to garbage collection.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.PROFILER_GETBESTEFFORTCOVERAGE,
    ): js.promise.Promise<node.inspector.profiler.GetBestEffortCoverageReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.PROFILER_GETBESTEFFORTCOVERAGE,
    ): node.inspector.profiler.GetBestEffortCoverageReturnType

    @JsName("post")
    fun postAsync(method: SessionMethod.HEAPPROFILER_ENABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.HEAPPROFILER_ENABLE): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.HEAPPROFILER_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.HEAPPROFILER_DISABLE): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_STARTTRACKINGHEAPOBJECTS,
        params: node.inspector.heapProfiler.StartTrackingHeapObjectsParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_STARTTRACKINGHEAPOBJECTS,
        params: node.inspector.heapProfiler.StartTrackingHeapObjectsParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_STOPTRACKINGHEAPOBJECTS,
        params: node.inspector.heapProfiler.StopTrackingHeapObjectsParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_STOPTRACKINGHEAPOBJECTS,
        params: node.inspector.heapProfiler.StopTrackingHeapObjectsParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_TAKEHEAPSNAPSHOT,
        params: node.inspector.heapProfiler.TakeHeapSnapshotParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_TAKEHEAPSNAPSHOT,
        params: node.inspector.heapProfiler.TakeHeapSnapshotParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(method: SessionMethod.HEAPPROFILER_COLLECTGARBAGE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.HEAPPROFILER_COLLECTGARBAGE): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_GETOBJECTBYHEAPOBJECTID,
        params: node.inspector.heapProfiler.GetObjectByHeapObjectIdParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.heapProfiler.GetObjectByHeapObjectIdReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_GETOBJECTBYHEAPOBJECTID,
        params: node.inspector.heapProfiler.GetObjectByHeapObjectIdParameterType = definedExternally,
    ): node.inspector.heapProfiler.GetObjectByHeapObjectIdReturnType

    /**
     * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_ADDINSPECTEDHEAPOBJECT,
        params: node.inspector.heapProfiler.AddInspectedHeapObjectParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_ADDINSPECTEDHEAPOBJECT,
        params: node.inspector.heapProfiler.AddInspectedHeapObjectParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_GETHEAPOBJECTID,
        params: node.inspector.heapProfiler.GetHeapObjectIdParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.heapProfiler.GetHeapObjectIdReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_GETHEAPOBJECTID,
        params: node.inspector.heapProfiler.GetHeapObjectIdParameterType = definedExternally,
    ): node.inspector.heapProfiler.GetHeapObjectIdReturnType

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_STARTSAMPLING,
        params: node.inspector.heapProfiler.StartSamplingParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_STARTSAMPLING,
        params: node.inspector.heapProfiler.StartSamplingParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_STOPSAMPLING,
    ): js.promise.Promise<node.inspector.heapProfiler.StopSamplingReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_STOPSAMPLING,
    ): node.inspector.heapProfiler.StopSamplingReturnType

    @JsName("post")
    fun postAsync(
        method: SessionMethod.HEAPPROFILER_GETSAMPLINGPROFILE,
    ): js.promise.Promise<node.inspector.heapProfiler.GetSamplingProfileReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.HEAPPROFILER_GETSAMPLINGPROFILE,
    ): node.inspector.heapProfiler.GetSamplingProfileReturnType

    /**
     * Gets supported tracing categories.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODETRACING_GETCATEGORIES,
    ): js.promise.Promise<node.inspector.nodeTracing.GetCategoriesReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODETRACING_GETCATEGORIES,
    ): node.inspector.nodeTracing.GetCategoriesReturnType

    /**
     * Start trace events collection.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODETRACING_START,
        params: node.inspector.nodeTracing.StartParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODETRACING_START,
        params: node.inspector.nodeTracing.StartParameterType = definedExternally,
    ): js.core.Void

    /**
     * Stop trace events collection. Remaining collected events will be sent as a sequence of
     * dataCollected events followed by tracingComplete event.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.NODETRACING_STOP): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.NODETRACING_STOP): js.core.Void

    /**
     * Sends protocol message over session with given id.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODEWORKER_SENDMESSAGETOWORKER,
        params: node.inspector.nodeWorker.SendMessageToWorkerParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODEWORKER_SENDMESSAGETOWORKER,
        params: node.inspector.nodeWorker.SendMessageToWorkerParameterType = definedExternally,
    ): js.core.Void

    /**
     * Instructs the inspector to attach to running workers. Will also attach to new workers
     * as they start
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODEWORKER_ENABLE,
        params: node.inspector.nodeWorker.EnableParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODEWORKER_ENABLE,
        params: node.inspector.nodeWorker.EnableParameterType = definedExternally,
    ): js.core.Void

    /**
     * Detaches from all running workers and disables attaching to new workers as they are started.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.NODEWORKER_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.NODEWORKER_DISABLE): js.core.Void

    /**
     * Detached from the worker with given sessionId.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODEWORKER_DETACH,
        params: node.inspector.nodeWorker.DetachParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODEWORKER_DETACH,
        params: node.inspector.nodeWorker.DetachParameterType = definedExternally,
    ): js.core.Void

    /**
     * Disables network tracking, prevents network events from being sent to the client.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.NETWORK_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.NETWORK_DISABLE): js.core.Void

    /**
     * Enables network tracking, network events will now be delivered to the client.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NETWORK_ENABLE,
        params: node.inspector.network.EnableParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NETWORK_ENABLE,
        params: node.inspector.network.EnableParameterType = definedExternally,
    ): js.core.Void

    /**
     * Returns post data sent with the request. Returns an error when no data was sent with the request.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NETWORK_GETREQUESTPOSTDATA,
        params: node.inspector.network.GetRequestPostDataParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.network.GetRequestPostDataReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NETWORK_GETREQUESTPOSTDATA,
        params: node.inspector.network.GetRequestPostDataParameterType = definedExternally,
    ): node.inspector.network.GetRequestPostDataReturnType

    /**
     * Returns content served for the given request.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NETWORK_GETRESPONSEBODY,
        params: node.inspector.network.GetResponseBodyParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.network.GetResponseBodyReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NETWORK_GETRESPONSEBODY,
        params: node.inspector.network.GetResponseBodyParameterType = definedExternally,
    ): node.inspector.network.GetResponseBodyReturnType

    /**
     * Enables streaming of the response for the given requestId.
     * If enabled, the dataReceived event contains the data that was received during streaming.
     * @experimental
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NETWORK_STREAMRESOURCECONTENT,
        params: node.inspector.network.StreamResourceContentParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.network.StreamResourceContentReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NETWORK_STREAMRESOURCECONTENT,
        params: node.inspector.network.StreamResourceContentParameterType = definedExternally,
    ): node.inspector.network.StreamResourceContentReturnType

    /**
     * Fetches the resource and returns the content.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NETWORK_LOADNETWORKRESOURCE,
        params: node.inspector.network.LoadNetworkResourceParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.network.LoadNetworkResourceReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NETWORK_LOADNETWORKRESOURCE,
        params: node.inspector.network.LoadNetworkResourceParameterType = definedExternally,
    ): node.inspector.network.LoadNetworkResourceReturnType

    /**
     * Enable the NodeRuntime events except by `NodeRuntime.waitingForDisconnect`.
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.NODERUNTIME_ENABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.NODERUNTIME_ENABLE): js.core.Void

    /**
     * Disable NodeRuntime events
     */
    @JsName("post")
    fun postAsync(method: SessionMethod.NODERUNTIME_DISABLE): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(method: SessionMethod.NODERUNTIME_DISABLE): js.core.Void

    /**
     * Enable the `NodeRuntime.waitingForDisconnect`.
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.NODERUNTIME_NOTIFYWHENWAITINGFORDISCONNECT,
        params: node.inspector.nodeRuntime.NotifyWhenWaitingForDisconnectParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.NODERUNTIME_NOTIFYWHENWAITINGFORDISCONNECT,
        params: node.inspector.nodeRuntime.NotifyWhenWaitingForDisconnectParameterType = definedExternally,
    ): js.core.Void

    @JsName("post")
    fun postAsync(
        method: SessionMethod.TARGET_SETAUTOATTACH,
        params: node.inspector.target.SetAutoAttachParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.TARGET_SETAUTOATTACH,
        params: node.inspector.target.SetAutoAttachParameterType = definedExternally,
    ): js.core.Void

    /**
     * Read a chunk of the stream
     */
    @JsName("post")
    fun postAsync(
        method: SessionMethod.IO_READ,
        params: node.inspector.io.ReadParameterType = definedExternally,
    ): js.promise.Promise<node.inspector.io.ReadReturnType>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.IO_READ,
        params: node.inspector.io.ReadParameterType = definedExternally,
    ): node.inspector.io.ReadReturnType

    @JsName("post")
    fun postAsync(
        method: SessionMethod.IO_CLOSE,
        params: node.inspector.io.CloseParameterType = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun post(
        method: SessionMethod.IO_CLOSE,
        params: node.inspector.io.CloseParameterType = definedExternally,
    ): js.core.Void

    fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
    /**
     * Emitted when any notification from the V8 Inspector is received.
     */

    /**
     * Issued when new execution context is created.
     */

    /**
     * Issued when execution context is destroyed.
     */

    /**
     * Issued when all executionContexts were cleared in browser
     */

    /**
     * Issued when exception was thrown and unhandled.
     */

    /**
     * Issued when unhandled exception was revoked.
     */

    /**
     * Issued when console API was called.
     */

    /**
     * Issued when object should be inspected (for example, as a result of inspect() command line API call).
     */

    /**
     * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
     */

    /**
     * Fired when virtual machine fails to parse the script.
     */

    /**
     * Fired when breakpoint is resolved to an actual script and location.
     */

    /**
     * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
     */

    /**
     * Fired when the virtual machine resumed execution.
     */

    /**
     * Issued when new console message is added.
     */

    /**
     * Sent when new profile recording is started using console.profile() call.
     */

    /**
     * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
     */

    /**
     * If heap objects tracking has been started then backend may send update for one or more fragments
     */

    /**
     * Contains an bucket of collected trace events.
     */

    /**
     * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
     * delivered via dataCollected events.
     */

    /**
     * Issued when attached to a worker.
     */

    /**
     * Issued when detached from the worker.
     */

    /**
     * Notifies about a new protocol message received from the session
     * (session ID is provided in attachedToWorker notification).
     */

    /**
     * Fired when page is about to send HTTP request.
     */

    /**
     * Fired when HTTP response is available.
     */

    /**
     * Fired when data chunk was received over the network.
     */

    /**
     * Fired upon WebSocket creation.
     */

    /**
     * Fired when WebSocket is closed.
     */

    /**
     * Fired when WebSocket handshake response becomes available.
     */

    /**
     * This event is fired instead of `Runtime.executionContextDestroyed` when
     * enabled.
     * It is fired when the Node process finished all code execution and is
     * waiting for all frontends to disconnect.
     */

    /**
     * This event is fired when the runtime is waiting for the debugger. For
     * example, when inspector.waitingForDebugger is called
     */

    fun emit(
        event: String,
        vararg args: Any?,
    ): Boolean

    fun emit(
        event: js.symbol.Symbol,
        vararg args: Any?,
    ): Boolean

    fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
    /**
     * Emitted when any notification from the V8 Inspector is received.
     */

    /**
     * Issued when new execution context is created.
     */

    /**
     * Issued when execution context is destroyed.
     */

    /**
     * Issued when all executionContexts were cleared in browser
     */

    /**
     * Issued when exception was thrown and unhandled.
     */

    /**
     * Issued when unhandled exception was revoked.
     */

    /**
     * Issued when console API was called.
     */

    /**
     * Issued when object should be inspected (for example, as a result of inspect() command line API call).
     */

    /**
     * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
     */

    /**
     * Fired when virtual machine fails to parse the script.
     */

    /**
     * Fired when breakpoint is resolved to an actual script and location.
     */

    /**
     * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
     */

    /**
     * Fired when the virtual machine resumed execution.
     */

    /**
     * Issued when new console message is added.
     */

    /**
     * Sent when new profile recording is started using console.profile() call.
     */

    /**
     * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
     */

    /**
     * If heap objects tracking has been started then backend may send update for one or more fragments
     */

    /**
     * Contains an bucket of collected trace events.
     */

    /**
     * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
     * delivered via dataCollected events.
     */

    /**
     * Issued when attached to a worker.
     */

    /**
     * Issued when detached from the worker.
     */

    /**
     * Notifies about a new protocol message received from the session
     * (session ID is provided in attachedToWorker notification).
     */

    /**
     * Fired when page is about to send HTTP request.
     */

    /**
     * Fired when HTTP response is available.
     */

    /**
     * Fired when data chunk was received over the network.
     */

    /**
     * Fired upon WebSocket creation.
     */

    /**
     * Fired when WebSocket is closed.
     */

    /**
     * Fired when WebSocket handshake response becomes available.
     */

    /**
     * This event is fired instead of `Runtime.executionContextDestroyed` when
     * enabled.
     * It is fired when the Node process finished all code execution and is
     * waiting for all frontends to disconnect.
     */

    /**
     * This event is fired when the runtime is waiting for the debugger. For
     * example, when inspector.waitingForDebugger is called
     */

    fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
    /**
     * Emitted when any notification from the V8 Inspector is received.
     */

    /**
     * Issued when new execution context is created.
     */

    /**
     * Issued when execution context is destroyed.
     */

    /**
     * Issued when all executionContexts were cleared in browser
     */

    /**
     * Issued when exception was thrown and unhandled.
     */

    /**
     * Issued when unhandled exception was revoked.
     */

    /**
     * Issued when console API was called.
     */

    /**
     * Issued when object should be inspected (for example, as a result of inspect() command line API call).
     */

    /**
     * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
     */

    /**
     * Fired when virtual machine fails to parse the script.
     */

    /**
     * Fired when breakpoint is resolved to an actual script and location.
     */

    /**
     * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
     */

    /**
     * Fired when the virtual machine resumed execution.
     */

    /**
     * Issued when new console message is added.
     */

    /**
     * Sent when new profile recording is started using console.profile() call.
     */

    /**
     * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
     */

    /**
     * If heap objects tracking has been started then backend may send update for one or more fragments
     */

    /**
     * Contains an bucket of collected trace events.
     */

    /**
     * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
     * delivered via dataCollected events.
     */

    /**
     * Issued when attached to a worker.
     */

    /**
     * Issued when detached from the worker.
     */

    /**
     * Notifies about a new protocol message received from the session
     * (session ID is provided in attachedToWorker notification).
     */

    /**
     * Fired when page is about to send HTTP request.
     */

    /**
     * Fired when HTTP response is available.
     */

    /**
     * Fired when data chunk was received over the network.
     */

    /**
     * Fired upon WebSocket creation.
     */

    /**
     * Fired when WebSocket is closed.
     */

    /**
     * Fired when WebSocket handshake response becomes available.
     */

    /**
     * This event is fired instead of `Runtime.executionContextDestroyed` when
     * enabled.
     * It is fired when the Node process finished all code execution and is
     * waiting for all frontends to disconnect.
     */

    /**
     * This event is fired when the runtime is waiting for the debugger. For
     * example, when inspector.waitingForDebugger is called
     */

    fun prependListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
    /**
     * Emitted when any notification from the V8 Inspector is received.
     */

    /**
     * Issued when new execution context is created.
     */

    /**
     * Issued when execution context is destroyed.
     */

    /**
     * Issued when all executionContexts were cleared in browser
     */

    /**
     * Issued when exception was thrown and unhandled.
     */

    /**
     * Issued when unhandled exception was revoked.
     */

    /**
     * Issued when console API was called.
     */

    /**
     * Issued when object should be inspected (for example, as a result of inspect() command line API call).
     */

    /**
     * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
     */

    /**
     * Fired when virtual machine fails to parse the script.
     */

    /**
     * Fired when breakpoint is resolved to an actual script and location.
     */

    /**
     * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
     */

    /**
     * Fired when the virtual machine resumed execution.
     */

    /**
     * Issued when new console message is added.
     */

    /**
     * Sent when new profile recording is started using console.profile() call.
     */

    /**
     * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
     */

    /**
     * If heap objects tracking has been started then backend may send update for one or more fragments
     */

    /**
     * Contains an bucket of collected trace events.
     */

    /**
     * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
     * delivered via dataCollected events.
     */

    /**
     * Issued when attached to a worker.
     */

    /**
     * Issued when detached from the worker.
     */

    /**
     * Notifies about a new protocol message received from the session
     * (session ID is provided in attachedToWorker notification).
     */

    /**
     * Fired when page is about to send HTTP request.
     */

    /**
     * Fired when HTTP response is available.
     */

    /**
     * Fired when data chunk was received over the network.
     */

    /**
     * Fired upon WebSocket creation.
     */

    /**
     * Fired when WebSocket is closed.
     */

    /**
     * Fired when WebSocket handshake response becomes available.
     */

    /**
     * This event is fired instead of `Runtime.executionContextDestroyed` when
     * enabled.
     * It is fired when the Node process finished all code execution and is
     * waiting for all frontends to disconnect.
     */

    /**
     * This event is fired when the runtime is waiting for the debugger. For
     * example, when inspector.waitingForDebugger is called
     */

    fun prependOnceListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */) // this
    /**
     * Emitted when any notification from the V8 Inspector is received.
     */

    /**
     * Issued when new execution context is created.
     */

    /**
     * Issued when execution context is destroyed.
     */

    /**
     * Issued when all executionContexts were cleared in browser
     */

    /**
     * Issued when exception was thrown and unhandled.
     */

    /**
     * Issued when unhandled exception was revoked.
     */

    /**
     * Issued when console API was called.
     */

    /**
     * Issued when object should be inspected (for example, as a result of inspect() command line API call).
     */

    /**
     * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
     */

    /**
     * Fired when virtual machine fails to parse the script.
     */

    /**
     * Fired when breakpoint is resolved to an actual script and location.
     */

    /**
     * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
     */

    /**
     * Fired when the virtual machine resumed execution.
     */

    /**
     * Issued when new console message is added.
     */

    /**
     * Sent when new profile recording is started using console.profile() call.
     */

    /**
     * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
     */

    /**
     * If heap objects tracking has been started then backend may send update for one or more fragments
     */

    /**
     * Contains an bucket of collected trace events.
     */

    /**
     * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
     * delivered via dataCollected events.
     */

    /**
     * Issued when attached to a worker.
     */

    /**
     * Issued when detached from the worker.
     */

    /**
     * Notifies about a new protocol message received from the session
     * (session ID is provided in attachedToWorker notification).
     */

    /**
     * Fired when page is about to send HTTP request.
     */

    /**
     * Fired when HTTP response is available.
     */

    /**
     * Fired when data chunk was received over the network.
     */

    /**
     * Fired upon WebSocket creation.
     */

    /**
     * Fired when WebSocket is closed.
     */

    /**
     * Fired when WebSocket handshake response becomes available.
     */

    /**
     * This event is fired instead of `Runtime.executionContextDestroyed` when
     * enabled.
     * It is fired when the Node process finished all code execution and is
     * waiting for all frontends to disconnect.
     */

    /**
     * This event is fired when the runtime is waiting for the debugger. For
     * example, when inspector.waitingForDebugger is called
     */

    @web.events.JsEvent("inspectorNotification")
    val inspectorNotificationEvent: node.events.EventInstance<js.array.Tuple1<InspectorNotification<Any>>>

    @web.events.JsEvent("Runtime.executionContextCreated")
    val RuntimeExecutionContextCreatedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.ExecutionContextCreatedEventDataType>>>

    @web.events.JsEvent("Runtime.executionContextDestroyed")
    val RuntimeExecutionContextDestroyedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.ExecutionContextDestroyedEventDataType>>>

    @web.events.JsEvent("Runtime.executionContextsCleared")
    val RuntimeExecutionContextsClearedEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("Runtime.exceptionThrown")
    val RuntimeExceptionThrownEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.ExceptionThrownEventDataType>>>

    @web.events.JsEvent("Runtime.exceptionRevoked")
    val RuntimeExceptionRevokedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.ExceptionRevokedEventDataType>>>

    @web.events.JsEvent("Runtime.consoleAPICalled")
    val RuntimeConsoleAPICalledEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.ConsoleAPICalledEventDataType>>>

    @web.events.JsEvent("Runtime.inspectRequested")
    val RuntimeInspectRequestedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.runtime.InspectRequestedEventDataType>>>

    @web.events.JsEvent("Debugger.scriptParsed")
    val DebuggerScriptParsedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.debugger.ScriptParsedEventDataType>>>

    @web.events.JsEvent("Debugger.scriptFailedToParse")
    val DebuggerScriptFailedToParseEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.debugger.ScriptFailedToParseEventDataType>>>

    @web.events.JsEvent("Debugger.breakpointResolved")
    val DebuggerBreakpointResolvedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.debugger.BreakpointResolvedEventDataType>>>

    @web.events.JsEvent("Debugger.paused")
    val DebuggerPausedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.debugger.PausedEventDataType>>>

    @web.events.JsEvent("Debugger.resumed")
    val DebuggerResumedEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("Console.messageAdded")
    val ConsoleMessageAddedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.console.MessageAddedEventDataType>>>

    @web.events.JsEvent("Profiler.consoleProfileStarted")
    val ProfilerConsoleProfileStartedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.profiler.ConsoleProfileStartedEventDataType>>>

    @web.events.JsEvent("Profiler.consoleProfileFinished")
    val ProfilerConsoleProfileFinishedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.profiler.ConsoleProfileFinishedEventDataType>>>

    @web.events.JsEvent("HeapProfiler.addHeapSnapshotChunk")
    val HeapProfilerAddHeapSnapshotChunkEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.heapProfiler.AddHeapSnapshotChunkEventDataType>>>

    @web.events.JsEvent("HeapProfiler.resetProfiles")
    val HeapProfilerResetProfilesEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("HeapProfiler.reportHeapSnapshotProgress")
    val HeapProfilerReportHeapSnapshotProgressEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.heapProfiler.ReportHeapSnapshotProgressEventDataType>>>

    @web.events.JsEvent("HeapProfiler.lastSeenObjectId")
    val HeapProfilerLastSeenObjectIdEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.heapProfiler.LastSeenObjectIdEventDataType>>>

    @web.events.JsEvent("HeapProfiler.heapStatsUpdate")
    val HeapProfilerHeapStatsUpdateEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.heapProfiler.HeapStatsUpdateEventDataType>>>

    @web.events.JsEvent("NodeTracing.dataCollected")
    val NodeTracingDataCollectedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.nodeTracing.DataCollectedEventDataType>>>

    @web.events.JsEvent("NodeTracing.tracingComplete")
    val NodeTracingTracingCompleteEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("NodeWorker.attachedToWorker")
    val NodeWorkerAttachedToWorkerEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.nodeWorker.AttachedToWorkerEventDataType>>>

    @web.events.JsEvent("NodeWorker.detachedFromWorker")
    val NodeWorkerDetachedFromWorkerEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.nodeWorker.DetachedFromWorkerEventDataType>>>

    @web.events.JsEvent("NodeWorker.receivedMessageFromWorker")
    val NodeWorkerReceivedMessageFromWorkerEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.nodeWorker.ReceivedMessageFromWorkerEventDataType>>>

    @web.events.JsEvent("Network.requestWillBeSent")
    val NetworkRequestWillBeSentEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.RequestWillBeSentEventDataType>>>

    @web.events.JsEvent("Network.responseReceived")
    val NetworkResponseReceivedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.ResponseReceivedEventDataType>>>

    @web.events.JsEvent("Network.loadingFailed")
    val NetworkLoadingFailedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.LoadingFailedEventDataType>>>

    @web.events.JsEvent("Network.loadingFinished")
    val NetworkLoadingFinishedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.LoadingFinishedEventDataType>>>

    @web.events.JsEvent("Network.dataReceived")
    val NetworkDataReceivedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.DataReceivedEventDataType>>>

    @web.events.JsEvent("Network.webSocketCreated")
    val NetworkWebSocketCreatedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.WebSocketCreatedEventDataType>>>

    @web.events.JsEvent("Network.webSocketClosed")
    val NetworkWebSocketClosedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.WebSocketClosedEventDataType>>>

    @web.events.JsEvent("Network.webSocketHandshakeResponseReceived")
    val NetworkWebSocketHandshakeResponseReceivedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.network.WebSocketHandshakeResponseReceivedEventDataType>>>

    @web.events.JsEvent("NodeRuntime.waitingForDisconnect")
    val NodeRuntimeWaitingForDisconnectEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("NodeRuntime.waitingForDebugger")
    val NodeRuntimeWaitingForDebuggerEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("Target.targetCreated")
    val TargetTargetCreatedEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.target.TargetCreatedEventDataType>>>

    @web.events.JsEvent("Target.attachedToTarget")
    val TargetAttachedToTargetEvent:
            node.events.EventInstance<js.array.Tuple1<InspectorNotification<node.inspector.target.AttachedToTargetEventDataType>>>
}

/**
 * The `inspector.Session` is used for dispatching messages to the V8 inspector
 * back-end and receiving message responses and notifications.
 * @since v19.0.0
 */
