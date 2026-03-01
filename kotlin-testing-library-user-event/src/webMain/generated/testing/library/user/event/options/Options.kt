// Automatically generated - do not modify!

package testing.library.user.event.options

// unhandled import: keyboardKey from "./system/keyboard"
// unhandled import: pointerKey from "./system/pointer"
import testing.library.user.event.system.keyboard.keyboardKey
import testing.library.user.event.system.pointer.shared.pointerKey

external interface Options {
    /**
     * When using `userEvent.upload`, automatically discard files
     * that don't match an `accept` property if it exists.
     *
     * @default true
     */
    var applyAccept: Boolean?

    /**
     * We intend to automatically apply modifier keys for printable characters in the future.
     * I.e. `A` implying `{Shift>}a{/Shift}` if caps lock is not active.
     *
     * This options allows you to opt out of this change in foresight.
     * The feature therefore will not constitute a breaking change.
     *
     * @default true
     */
    var autoModify: Boolean?

    /**
     * Between some subsequent inputs like typing a series of characters
     * the code execution is delayed per `setTimeout` for (at least) `delay` milliseconds.
     * This moves the next changes at least to next macro task
     * and allows other (asynchronous) code to run between events.
     *
     * `null` prevents `setTimeout` from being called.
     *
     * @default 0
     */
    var delay: Double?

    /**
     * The document.
     *
     * This defaults to the owner document of an element if an API is called directly with an element and without setup.
     * Otherwise it falls back to the global document.
     *
     * @default element.ownerDocument??globalThis.document
     */
    var document: web.dom.Document?

    /**
     * An array of keyboard keys the keyboard device consists of.
     *
     * This allows to plug in different layouts / localizations.
     *
     * Defaults to a "standard" US-104-QWERTY keyboard.
     */
    var keyboardMap: js.array.ReadonlyArray<keyboardKey>?

    /**
     * An array of available pointer keys.
     *
     * This allows to plug in different pointer devices.
     */
    var pointerMap: js.array.ReadonlyArray<pointerKey>?

    /**
     * The pointer API includes a check if an element has or inherits `pointer-events: none`.
     * This check is known to be expensive and very expensive when checking deeply nested nodes.
     * This option determines how often the pointer related APIs perform the check.
     *
     * This is a binary flag option. You can combine multiple Levels.
     *
     * @default PointerEventsCheckLevel.EachCall
     */
    var pointerEventsCheck: (Any /* PointerEventsCheckLevel | number */)?

    /**
     * `userEvent.type` automatically releases any keys still pressed at the end of the call.
     * This option allows to opt out of this feature.
     *
     * @default false
     */
    var skipAutoClose: Boolean?

    /**
     * `userEvent.type` implies a click at the end of the element content/value.
     * This option allows to opt out of this feature.
     *
     * @default false
     */
    var skipClick: Boolean?

    /**
     * `userEvent.click` implies moving the cursor to the target element first.
     * This options allows to opt out of this feature.
     *
     * @default false
     */
    var skipHover: Boolean?

    /**
     * Write selected data to Clipboard API when a `cut` or `copy` is triggered.
     *
     * The Clipboard API is usually not available to test code.
     * Our `setup` replaces the `navigator.clipboard` property with a stub.
     *
     * Defaults to `false` when calling the APIs directly.
     * Defaults to `true` when calling the APIs per `setup`.
     */
    var writeToClipboard: Boolean?

    /**
     * A function to be called internally to advance your fake timers (if applicable)
     *
     * @example jest.advanceTimersByTime
     */
    var advanceTimers: (Any /* ((delay: number) => Promise<void>) | ((delay: number) => void) */)?
}
