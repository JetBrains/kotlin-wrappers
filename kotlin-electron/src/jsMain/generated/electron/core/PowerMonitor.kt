package electron.core


external interface PowerMonitor : node.events.IEventEmitter {
// Docs: https://electronjs.org/docs/api/power-monitor
    /**
     * Emitted when the system is about to lock the screen.
     *
     * @platform darwin,win32
     */
    fun on(event: PowerMonitorEvent.LOCK_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the system changes to AC power.
     *
     * @platform darwin,win32
     */
    fun on(event: PowerMonitorEvent.ON_AC, listener: Function<*>): Unit /* this */

    /**
     * Emitted when system changes to battery power.
     *
     * @platform darwin
     */
    fun on(event: PowerMonitorEvent.ON_BATTERY, listener: Function<*>): Unit /* this */

    /**
     * Emitted when system is resuming.
     */
    fun on(event: PowerMonitorEvent.RESUME, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the system is about to reboot or shut down. If the event handler
     * invokes `e.preventDefault()`, Electron will attempt to delay system shutdown in
     * order for the app to exit cleanly. If `e.preventDefault()` is called, the app
     * should exit as soon as possible by calling something like `app.quit()`.
     *
     * @platform linux,darwin
     */
    fun on(event: PowerMonitorEvent.SHUTDOWN, listener: Function<*>): Unit /* this */

    /**
     * Notification of a change in the operating system's advertised speed limit for
     * CPUs, in percent. Values below 100 indicate that the system is impairing
     * processing power due to thermal management.
     *
     * @platform darwin,win32
     */
    fun on(event: PowerMonitorEvent.SPEED_LIMIT_CHANGE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the system is suspending.
     */
    fun on(event: PowerMonitorEvent.SUSPEND, listener: Function<*>): Unit /* this */

    /**
     * Emitted when the thermal state of the system changes. Notification of a change
     * in the thermal status of the system, such as entering a critical temperature
     * range. Depending on the severity, the system might take steps to reduce said
     * temperature, for example, throttling the CPU or switching on the fans if
     * available.
     *
     * Apps may react to the new state by reducing expensive computing tasks (e.g.
     * video encoding), or notifying the user. The same state might be received
     * repeatedly.
     *
     * See
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * nce/Conceptual/power_efficiency_guidelines_osx/RespondToThermalStateChanges.html
     *
     * @platform darwin
     */
    fun on(event: PowerMonitorEvent.THERMAL_STATE_CHANGE, listener: Function<*>): Unit /* this */

    /**
     * Emitted as soon as the systems screen is unlocked.
     *
     * @platform darwin,win32
     */
    fun on(event: PowerMonitorEvent.UNLOCK_SCREEN, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a login session is activated. See documentation for more
     * information.
     *
     * @platform darwin
     */
    fun on(event: PowerMonitorEvent.USER_DID_BECOME_ACTIVE, listener: Function<*>): Unit /* this */

    /**
     * Emitted when a login session is deactivated. See documentation for more
     * information.
     *
     * @platform darwin
     */
    fun on(event: PowerMonitorEvent.USER_DID_RESIGN_ACTIVE, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.LOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.ON_AC, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.ON_BATTERY, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.RESUME, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.SHUTDOWN, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.SPEED_LIMIT_CHANGE, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.SUSPEND, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.THERMAL_STATE_CHANGE, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.UNLOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.USER_DID_BECOME_ACTIVE, listener: Function<*>): Unit /* this */
    fun once(event: PowerMonitorEvent.USER_DID_RESIGN_ACTIVE, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.LOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.ON_AC, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.ON_BATTERY, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.RESUME, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.SHUTDOWN, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.SPEED_LIMIT_CHANGE, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.SUSPEND, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.THERMAL_STATE_CHANGE, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.UNLOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.USER_DID_BECOME_ACTIVE, listener: Function<*>): Unit /* this */
    fun addListener(event: PowerMonitorEvent.USER_DID_RESIGN_ACTIVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.LOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.ON_AC, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.ON_BATTERY, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.RESUME, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.SHUTDOWN, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.SPEED_LIMIT_CHANGE, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.SUSPEND, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.THERMAL_STATE_CHANGE, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.UNLOCK_SCREEN, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.USER_DID_BECOME_ACTIVE, listener: Function<*>): Unit /* this */
    fun removeListener(event: PowerMonitorEvent.USER_DID_RESIGN_ACTIVE, listener: Function<*>): Unit /* this */

    /**
     * The system's current thermal state. Can be `unknown`, `nominal`, `fair`,
     * `serious`, or `critical`.
     *
     * @platform darwin
     */
    fun getCurrentThermalState(): (PowerMonitorGetCurrentThermalStateResult)

    /**
     * The system's current idle state. Can be `active`, `idle`, `locked` or `unknown`.
     *
     * Calculate the system idle state. `idleThreshold` is the amount of time (in
     * seconds) before considered idle.  `locked` is available on supported systems
     * only.
     */
    fun getSystemIdleState(idleThreshold: Double): (PowerMonitorGetSystemIdleStateResult)

    /**
     * Idle time in seconds
     *
     * Calculate system idle time in seconds.
     */
    fun getSystemIdleTime(): Double

    /**
     * Whether the system is on battery power.
     *
     * To monitor for changes in this property, use the `on-battery` and `on-ac`
     * events.
     */
    fun isOnBatteryPower(): Boolean

    /**
     * A `boolean` property. True if the system is on battery power.
     *
     * See `powerMonitor.isOnBatteryPower()`.
     */
    var onBatteryPower: Boolean
}
