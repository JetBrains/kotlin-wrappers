// Automatically generated - do not modify!

package mui.base

import js.array.ReadonlyArray
import web.html.HTMLElement

external interface FocusTrapProps : react.PropsWithChildren {
    /**
     * If `true`, focus is locked.
     */
    var open: Boolean

    /**
     * Returns an array of ordered tabbable nodes (i.e. in tab order) within the root.
     * For instance, you can provide the "tabbable" npm dependency.
     * @param {HTMLElement} root
     */
    var getTabbable: ((root: HTMLElement) -> ReadonlyArray<String>)?

    /**
     * This prop extends the `open` prop.
     * It allows to toggle the open state without having to wait for a rerender when changing the `open` prop.
     * This prop should be memoized.
     * It can be used to support multiple focus trap mounted at the same time.
     * @default function defaultIsEnabled(): boolean {
     *   return true;
     * }
     */
    var isEnabled: (() -> Boolean)?

    /**
     * A single child content element.
     */
    override var children: react.ReactNode? /* react.ReactElement<*>? */

    /**
     * If `true`, the focus trap will not automatically shift focus to itself when it opens, and
     * replace it to the last focused element when it closes.
     * This also works correctly with any focus trap children that have the `disableAutoFocus` prop.
     *
     * Generally this should never be set to `true` as it makes the focus trap less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableAutoFocus: Boolean?

    /**
     * If `true`, the focus trap will not prevent focus from leaving the focus trap while open.
     *
     * Generally this should never be set to `true` as it makes the focus trap less
     * accessible to assistive technologies, like screen readers.
     * @default false
     */
    var disableEnforceFocus: Boolean?

    /**
     * If `true`, the focus trap will not restore focus to previously focused element once
     * focus trap is hidden or unmounted.
     * @default false
     */
    var disableRestoreFocus: Boolean?
}
