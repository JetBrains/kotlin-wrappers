@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.command

import js.core.StringLike
import js.reflect.unsafeCast

external interface Command :
    StringLike {
    companion object
}

/**
 * The button will show a `dialog` as modal. If the dialog is already modal, no action will be taken.
 * This is a declarative equivalent of calling the `HTMLDialogElement.showModal()` method on the `<dialog>` element.
 */
inline val Command.Companion.showModal: Command
    get() = Command("show-modal")

/**
 * The button will close a `dialog` element. If the dialog is already closed, no action will be taken.
 * This is a declarative equivalent of calling the `HTMLDialogElement.close()` method on the `<dialog>` element.
 */
inline val Command.Companion.close: Command
    get() = Command("close")

/**
 * The button will trigger a `cancel` event on a `dialog` element to request that the browser dismiss it, followed by a `close` event.
 * This differs from the `close` command in that authors can call `Event.preventDefault()` on the `cancel` event to prevent the `<dialog>` from closing. If the dialog is already closed, no action will be taken.
 * This is a declarative equivalent of calling the `HTMLDialogElement.requestClose()` method on the `<dialog>` element.
 */
inline val Command.Companion.requestClose: Command
    get() = Command("request-close")

/**
 * The button will show a hidden popover. If you try to show an already showing popover, no action will be taken. See "Popover API" for more details.
 * This is equivalent to setting a value of `show` for the `popovertargetaction` attribute, and also provides a declarative equivalent to calling the `HTMLElement.showPopover()` method on the popover element.
 */
inline val Command.Companion.showPopover: Command
    get() = Command("show-popover")

/**
 * The button will hide a showing popover.If you try to hide an already hidden popover, no action will be taken. See "Popover API" for more details.
 * This is equivalent to setting a value of `hide` for the `popovertargetaction` attribute, and also provides a declarative equivalent to calling the `HTMLElement.hidePopover()` method on the popover element.
 */
inline val Command.Companion.hidePopover: Command
    get() = Command("hide-popover")

/**
 * The button will toggle a popover between showing and hidden. If the popover is hidden, it will be shown; if the popover is showing, it will be hidden. See "Popover API" for more details.
 * This is equivalent to setting a value of `toggle` for the `popovertargetaction` attribute, and also provides a declarative equivalent to calling the `HTMLElement.togglePopover()` method on the popover element.
 */
inline val Command.Companion.togglePopover: Command
    get() = Command("toggle-popover")

inline fun Command(
    value: String,
): Command =
    unsafeCast(value)
