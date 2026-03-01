// Automatically generated - do not modify!

package testing.library.user.event.setup

// unhandled import: setupMain from "./setup"
// unhandled import: * as directApi from "./directApi"
import js.promise.Promise
import testing.library.user.event.generated.Temp1
import testing.library.user.event.generated.Temp2
import testing.library.user.event.options.Options
import testing.library.user.event.pointer.PointerInput
import testing.library.user.event.setup.directApi.DirectOptions
import testing.library.user.event.system.System
import web.data.DataTransfer
import web.dom.Element
import web.html.HTMLElement

external interface UserEvent {
    val setup: (options: Options? /* use undefined for default */) -> UserEvent
    val clear: (element: Element) -> Promise<js.core.Void>
    val click: (element: Element, options: DirectOptions? /* use undefined for default */) -> Promise<js.core.Void>
    val copy: (options: DirectOptions? /* use undefined for default */) -> Promise<DataTransfer?>
    val cut: (options: DirectOptions? /* use undefined for default */) -> Promise<DataTransfer?>
    val dblClick: (element: Element, options: DirectOptions? /* use undefined for default */) -> Promise<js.core.Void>
    val deselectOptions: (
        select: Element,
        values: Any, /* string | HTMLElement | HTMLElement[] | string[] */
        options: DirectOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    val hover: (element: Element, options: DirectOptions? /* use undefined for default */) -> Promise<js.core.Void>
    val keyboard: (text: String, options: DirectOptions? /* use undefined for default */) -> Promise<System>
    val pointer: (input: PointerInput, options: DirectOptions? /* use undefined for default */) -> Promise<System>
    val paste: (
        clipboardData: Any?, /* string | DataTransfer | undefined */ /* use undefined for default */
        options: DirectOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    val selectOptions: (
        select: Element,
        values: Any, /* string | HTMLElement | HTMLElement[] | string[] */
        options: DirectOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    val tripleClick: (
        element: Element,
        options: DirectOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    val type: (
        element: Element,
        text: String,
        options: (Temp1)?, // use undefined for default
    ) -> Promise<js.core.Void>
    val unhover: (element: Element, options: DirectOptions? /* use undefined for default */) -> Promise<js.core.Void>
    val upload: (
        element: HTMLElement,
        fileOrFiles: Any, /* File | File[] */
        options: DirectOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    val tab: (options: (Temp2)? /* use undefined for default */) -> Promise<js.core.Void>
}
