// Automatically generated - do not modify!

@file:JsModule("@mui/base/TrapFocus")
@file:JsNonModule

package mui.base

import kotlinx.js.ReadonlyArray

external interface TrapFocusProps : react.Props {
    /**
     * If `true`, focus is locked.
     */
    var open: Boolean

    /**
     * Returns an array of ordered tabbable nodes (i.e. in tab order) within the root.
     * For instance, you can provide the "tabbable" npm dependency.
     * @param {HTMLElement} root
     */
    var getTabbable: ((root: org.w3c.dom.HTMLElement) -> ReadonlyArray<String>)?

    /**
     * This prop extends the `open` prop.
     * It allows to toggle the open state without having to wait for a rerender when changing the `open` prop.
     * This prop should be memoized.
     * It can be used to support multiple trap focus mounted at the same time.
     * @default function defaultIsEnabled() {
     *   return true;
     * }
     */
    var isEnabled: (() -> Boolean)?

    /**
     * A single child content element.
     */
    var children: react.ReactElement<*>

    /**
     * If `true`, the trap focus will not automatically shift focus to itself when it opens, and
     * replace it to the last focused element when it closes.
     * This also works correctly with any trap focus children that have the `disableAutoFocus` prop.
     *
     * Generally this should never be set to `true` as it makes the trap focus less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableAutoFocus: Boolean?

    /**
     * If `true`, the trap focus will not prevent focus from leaving the trap focus while open.
     *
     * Generally this should never be set to `true` as it makes the trap focus less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableEnforceFocus: Boolean?

    /**
     * If `true`, the trap focus will not restore focus to previously focused element once
     * trap focus is hidden or unmounted.
     * @default false
     */
    var disableRestoreFocus: Boolean?
}

/**
 * Utility component that locks focus inside the component.
 *
 * Demos:
 *
 * - [Trap focus](https://mui.com/base/react-trap-focus/)
 *
 * API:
 *
 * - [TrapFocus API](https://mui.com/base/api/trap-focus/)
 */
@JsName("default")
external val TrapFocus: react.FC<TrapFocusProps>
