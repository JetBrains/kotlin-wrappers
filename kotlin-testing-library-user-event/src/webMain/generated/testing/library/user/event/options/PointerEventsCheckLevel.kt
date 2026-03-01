// Automatically generated - do not modify!

@file:JsModule("@testing-library/user-event/dist/esm/options")

package testing.library.user.event.options

// unhandled import: keyboardKey from "./system/keyboard"
// unhandled import: pointerKey from "./system/pointer"

sealed external interface PointerEventsCheckLevel {
    companion object {
        /**
         * Check pointer events on every user interaction that triggers a bunch of events.
         * E.g. once for releasing a mouse button even though this triggers `pointerup`, `mouseup`, `click`, etc...
         */
        val EachTrigger: PointerEventsCheckLevel

        /** Check each target once per call to pointer (related) API */
        val EachApiCall: PointerEventsCheckLevel

        /** Check each event target once */
        val EachTarget: PointerEventsCheckLevel

        /** No pointer events check */
        val Never: PointerEventsCheckLevel
    }
}
