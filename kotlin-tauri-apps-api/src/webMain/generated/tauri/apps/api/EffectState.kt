// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api


/**
 * Window effect state **macOS only**
 *
 * @see https://developer.apple.com/documentation/appkit/nsvisualeffectview/state
 *
 * @since 2.0.0
 */
sealed external interface EffectState {
    companion object {
        /**
         *  Make window effect state follow the window's active state **macOS only**
         */
        val FollowsWindowActiveState: EffectState

        /**
         *  Make window effect state always active **macOS only**
         */
        val Active: EffectState

        /**
         *  Make window effect state always inactive **macOS only**
         */
        val Inactive: EffectState
    }
}
