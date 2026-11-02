// Automatically generated - do not modify!

package electron.core

@Suppress("INTERFACE_WITH_SUPERCLASS")
external interface PowerMonitor : node.events.EventEmitter {
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

    @web.events.JsEvent("lock-screen")
    val lockScreenEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("on-ac")
    val onAcEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("on-battery")
    val onBatteryEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("resume")
    val resumeEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("shutdown")
    val shutdownEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("speed-limit-change")
    val speedLimitChangeEvent:
            node.events.EventInstance<js.array.Tuple1<Event<PowerMonitorSpeedLimitChangeEventParams>>>

    @web.events.JsEvent("suspend")
    val suspendEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("thermal-state-change")
    val thermalStateChangeEvent:
            node.events.EventInstance<js.array.Tuple1<Event<PowerMonitorThermalStateChangeEventParams>>>

    @web.events.JsEvent("unlock-screen")
    val unlockScreenEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("user-did-become-active")
    val userDidBecomeActiveEvent: node.events.EventInstance<js.array.Tuple>

    @web.events.JsEvent("user-did-resign-active")
    val userDidResignActiveEvent: node.events.EventInstance<js.array.Tuple>
}
