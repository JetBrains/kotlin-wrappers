package electron.core


external interface Screen : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/screen
    /**
     * Emitted when `newDisplay` has been added.
     */
    fun on(event: ScreenEvent.DISPLAY_ADDED, listener: (event: Event, newDisplay: Display) -> Unit): Unit /* this */

    /**
     * Emitted when one or more metrics change in a `display`. The `changedMetrics` is
     * an array of strings that describe the changes. Possible changes are `bounds`,
     * `workArea`, `scaleFactor` and `rotation`.
     */
    fun on(event: ScreenEvent.DISPLAY_METRICS_CHANGED, listener: (event: Event, display: Display, changedMetrics: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */

    /**
     * Emitted when `oldDisplay` has been removed.
     */
    fun on(event: ScreenEvent.DISPLAY_REMOVED, listener: (event: Event, oldDisplay: Display) -> Unit): Unit /* this */
    fun once(event: ScreenEvent.DISPLAY_ADDED, listener: (event: Event, newDisplay: Display) -> Unit): Unit /* this */
    fun once(event: ScreenEvent.DISPLAY_METRICS_CHANGED, listener: (event: Event, display: Display, changedMetrics: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */
    fun once(event: ScreenEvent.DISPLAY_REMOVED, listener: (event: Event, oldDisplay: Display) -> Unit): Unit /* this */
    fun addListener(event: ScreenEvent.DISPLAY_ADDED, listener: (event: Event, newDisplay: Display) -> Unit): Unit /* this */
    fun addListener(event: ScreenEvent.DISPLAY_METRICS_CHANGED, listener: (event: Event, display: Display, changedMetrics: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */
    fun addListener(event: ScreenEvent.DISPLAY_REMOVED, listener: (event: Event, oldDisplay: Display) -> Unit): Unit /* this */
    fun removeListener(event: ScreenEvent.DISPLAY_ADDED, listener: (event: Event, newDisplay: Display) -> Unit): Unit /* this */
    fun removeListener(event: ScreenEvent.DISPLAY_METRICS_CHANGED, listener: (event: Event, display: Display, changedMetrics: js.core.ReadonlyArray<String>) -> Unit): Unit /* this */
    fun removeListener(event: ScreenEvent.DISPLAY_REMOVED, listener: (event: Event, oldDisplay: Display) -> Unit): Unit /* this */

    /**
     * Converts a screen DIP point to a screen physical point. The DPI scale is
     * performed relative to the display containing the DIP point.
     *
     * @platform win32
     */
    fun dipToScreenPoint(point: Point): Point

    /**
     * Converts a screen DIP rect to a screen physical rect. The DPI scale is performed
     * relative to the display nearest to `window`. If `window` is null, scaling will
     * be performed to the display nearest to `rect`.
     *
     * @platform win32
     */
    fun dipToScreenRect(window: BrowserWindow?, rect: Rectangle): Rectangle

    /**
     * An array of displays that are currently available.
     */
    fun getAllDisplays(): js.core.ReadonlyArray<Display>

    /**
     * The current absolute position of the mouse pointer.
     *
     * **Note:** The return value is a DIP point, not a screen physical point.
     */
    fun getCursorScreenPoint(): Point

    /**
     * The display that most closely intersects the provided bounds.
     */
    fun getDisplayMatching(rect: Rectangle): Display

    /**
     * The display nearest the specified point.
     */
    fun getDisplayNearestPoint(point: Point): Display

    /**
     * The primary display.
     */
    fun getPrimaryDisplay(): Display

    /**
     * Converts a screen physical point to a screen DIP point. The DPI scale is
     * performed relative to the display containing the physical point.
     *
     * @platform win32
     */
    fun screenToDipPoint(point: Point): Point

    /**
     * Converts a screen physical rect to a screen DIP rect. The DPI scale is performed
     * relative to the display nearest to `window`. If `window` is null, scaling will
     * be performed to the display nearest to `rect`.
     *
     * @platform win32
     */
    fun screenToDipRect(window: BrowserWindow?, rect: Rectangle): Rectangle
}
