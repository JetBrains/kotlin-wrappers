package electron.core

import kotlin.js.Promise


external interface WebFrame : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/web-frame
    /**
     * Attempts to free memory that is no longer being used (like images from a
     * previous navigation).
     *
     * Note that blindly calling this method probably makes Electron slower since it
     * will have to refill these emptied caches, you should only call it if an event in
     * your app has occurred that makes you think your page is actually using less
     * memory (i.e. you have navigated from a super heavy page to a mostly empty one,
     * and intend to stay there).
     */
    fun clearCache(): Unit

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * execution throws or results in a rejected promise.
     *
     * Evaluates `code` in page.
     *
     * In the browser window some HTML APIs like `requestFullScreen` can only be
     * invoked by a gesture from the user. Setting `userGesture` to `true` will remove
     * this limitation.
     */
    fun executeJavaScript(code: String, userGesture: Boolean = definedExternally, callback: (result: Any?, error: Throwable /* JsError */) -> Unit = definedExternally): Promise<Any?>

    /**
     * A promise that resolves with the result of the executed code or is rejected if
     * execution could not start.
     *
     * Works like `executeJavaScript` but evaluates `scripts` in an isolated context.
     *
     * Note that when the execution of script fails, the returned promise will not
     * reject and the `result` would be `undefined`. This is because Chromium does not
     * dispatch errors of isolated worlds to foreign worlds.
     */
    fun executeJavaScriptInIsolatedWorld(
        worldId: Double,
        scripts: js.core.ReadonlyArray<WebSource>,
        userGesture: Boolean = definedExternally,
        callback: (result: Any?, error: Throwable /* JsError */) -> Unit = definedExternally
    ): Promise<Any?>

    /**
     * A child of `webFrame` with the supplied `name`, `null` would be returned if
     * there's no such frame or if the frame is not in the current renderer process.
     */
    fun findFrameByName(name: String): WebFrame

    /**
     * that has the supplied `routingId`, `null` if not found.
     */
    fun findFrameByRoutingId(routingId: Double): WebFrame

    /**
     * The frame element in `webFrame's` document selected by `selector`, `null` would
     * be returned if `selector` does not select a frame or if the frame is not in the
     * current renderer process.
     */
    fun getFrameForSelector(selector: String): WebFrame

    /**
     * * `images` MemoryUsageDetails
     * * `scripts` MemoryUsageDetails
     * * `cssStyleSheets` MemoryUsageDetails
     * * `xslStyleSheets` MemoryUsageDetails
     * * `fonts` MemoryUsageDetails
     * * `other` MemoryUsageDetails
     *
     * Returns an object describing usage information of Blink's internal memory
     * caches.
     *
     * This will generate:
     */
    fun getResourceUsage(): ResourceUsage

    /**
     * A list of suggested words for a given word. If the word is spelled correctly,
     * the result will be empty.
     */
    fun getWordSuggestions(word: String): js.core.ReadonlyArray<String>

    /**
     * The current zoom factor.
     */
    fun getZoomFactor(): Double

    /**
     * The current zoom level.
     */
    fun getZoomLevel(): Double

    /**
     * A key for the inserted CSS that can later be used to remove the CSS via
     * `webFrame.removeInsertedCSS(key)`.
     *
     * Injects CSS into the current web page and returns a unique key for the inserted
     * stylesheet.
     */
    fun insertCSS(css: String, options: InsertCSSOptions = definedExternally): String

    /**
     * Inserts `text` to the focused element.
     */
    fun insertText(text: String): Unit

    /**
     * True if the word is misspelled according to the built in spellchecker, false
     * otherwise. If no dictionary is loaded, always return false.
     */
    fun isWordMisspelled(word: String): Boolean

    /**
     * Removes the inserted CSS from the current web page. The stylesheet is identified
     * by its key, which is returned from `webFrame.insertCSS(css)`.
     */
    fun removeInsertedCSS(key: String): Unit

    /**
     * Set the security origin, content security policy and name of the isolated world.
     * Note: If the `csp` is specified, then the `securityOrigin` also has to be
     * specified.
     */
    fun setIsolatedWorldInfo(worldId: Double, info: Info): Unit

    /**
     * Sets a provider for spell checking in input fields and text areas.
     *
     * If you want to use this method you must disable the builtin spellchecker when
     * you construct the window.
     *
     * The `provider` must be an object that has a `spellCheck` method that accepts an
     * array of individual words for spellchecking. The `spellCheck` function runs
     * asynchronously and calls the `callback` function with an array of misspelt words
     * when complete.
     *
     * An example of using node-spellchecker as provider:
     */
    fun setSpellCheckProvider(language: String, provider: Provider): Unit

    /**
     * Sets the maximum and minimum pinch-to-zoom level.
     *
     * > **NOTE**: Visual zoom is disabled by default in Electron. To re-enable it,
     * call:
     *
     * > **NOTE**: Visual zoom only applies to pinch-to-zoom behavior. Cmd+/-/0 zoom
     * shortcuts are controlled by the 'zoomIn', 'zoomOut', and 'resetZoom' MenuItem
     * roles in the application Menu. To disable shortcuts, manually define the Menu
     * and omit zoom roles from the definition.
     */
    fun setVisualZoomLevelLimits(minimumLevel: Double, maximumLevel: Double): Unit

    /**
     * Changes the zoom factor to the specified factor. Zoom factor is zoom percent
     * divided by 100, so 300% = 3.0.
     *
     * The factor must be greater than 0.0.
     */
    fun setZoomFactor(factor: Double): Unit

    /**
     * Changes the zoom level to the specified level. The original size is 0 and each
     * increment above or below represents zooming 20% larger or smaller to default
     * limits of 300% and 50% of original size, respectively.
     *
     * > **NOTE**: The zoom policy at the Chromium level is same-origin, meaning that
     * the zoom level for a specific domain propagates across all instances of windows
     * with the same domain. Differentiating the window URLs will make zoom work
     * per-window.
     */
    fun setZoomLevel(level: Double): Unit

    /**
     * A `WebFrame | null` representing the first child frame of `webFrame`, the
     * property would be `null` if `webFrame` has no children or if first child is not
     * in the current renderer process.
     *
     */
    val firstChild: WebFrame?

    /**
     * A `WebFrame | null` representing next sibling frame, the property would be
     * `null` if `webFrame` is the last frame in its parent or if the next sibling is
     * not in the current renderer process.
     *
     */
    val nextSibling: WebFrame?

    /**
     * A `WebFrame | null` representing the frame which opened `webFrame`, the property
     * would be `null` if there's no opener or opener is not in the current renderer
     * process.
     *
     */
    val opener: WebFrame?

    /**
     * A `WebFrame | null` representing parent frame of `webFrame`, the property would
     * be `null` if `webFrame` is top or parent is not in the current renderer process.
     *
     */
    val parent: WebFrame?

    /**
     * An `Integer` representing the unique frame id in the current renderer process.
     * Distinct WebFrame instances that refer to the same underlying frame will have
     * the same `routingId`.
     *
     */
    val routingId: Double

    /**
     * A `WebFrame | null` representing top frame in frame hierarchy to which
     * `webFrame` belongs, the property would be `null` if top frame is not in the
     * current renderer process.
     *
     */
    val top: WebFrame?
}
