package electron


external interface PowerSaveBlocker {
// Docs: https://electronjs.org/docs/api/power-save-blocker
    /**
     * Whether the corresponding `powerSaveBlocker` has started.
     */
    fun isStarted(id: Double): Boolean

    /**
     * The blocker ID that is assigned to this power blocker.
     *
     * Starts preventing the system from entering lower-power mode. Returns an integer
     * identifying the power save blocker.
     *
     * **Note:** `prevent-display-sleep` has higher precedence over
     * `prevent-app-suspension`. Only the highest precedence type takes effect. In
     * other words, `prevent-display-sleep` always takes precedence over
     * `prevent-app-suspension`.
     *
     * For example, an API calling A requests for `prevent-app-suspension`, and another
     * calling B requests for `prevent-display-sleep`. `prevent-display-sleep` will be
     * used until B stops its request. After that, `prevent-app-suspension` is used.
     */
    fun start(type: PowerSaveBlockerStartType): Double

    /**
     * Stops the specified power save blocker.
     */
    fun stop(id: Double): Unit
}
