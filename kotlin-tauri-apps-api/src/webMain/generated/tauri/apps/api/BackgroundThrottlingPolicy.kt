// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/**
 * Background throttling policy
 *
 * @since 2.0.0
 */
sealed external interface BackgroundThrottlingPolicy {
    companion object {
        val Disabled: BackgroundThrottlingPolicy
        val Throttle: BackgroundThrottlingPolicy
        val Suspend: BackgroundThrottlingPolicy
    }
}
