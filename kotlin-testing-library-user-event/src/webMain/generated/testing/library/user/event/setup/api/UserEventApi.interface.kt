// Automatically generated - do not modify!

package testing.library.user.event.setup.api

// unhandled import: click from "../convenience"
// unhandled import: dblClick from "../convenience"
// unhandled import: tripleClick from "../convenience"
// unhandled import: hover from "../convenience"
// unhandled import: unhover from "../convenience"
// unhandled import: tab from "../convenience"
// unhandled import: keyboard from "../keyboard"
// unhandled import: copy from "../clipboard"
// unhandled import: cut from "../clipboard"
// unhandled import: paste from "../clipboard"
// unhandled import: pointer from "../pointer"
// unhandled import: clear from "../utility"
// unhandled import: deselectOptions from "../utility"
// unhandled import: selectOptions from "../utility"
// unhandled import: type from "../utility"
// unhandled import: upload from "../utility"
import js.promise.Promise
import testing.library.user.event.generated.Temp0
import testing.library.user.event.pointer.PointerInput
import testing.library.user.event.utility.type.typeOptions
import web.data.DataTransfer
import web.dom.Element
import web.html.HTMLElement

external interface UserEventApi {
    var click: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var dblClick: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var tripleClick: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var hover: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var unhover: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var tab: (/* this: Instance, */ options: (Temp0)? /* use undefined for default */) -> Promise<js.core.Void>
    var keyboard: (/* this: Instance, */ text: String) -> Promise<js.core.Void>
    var copy: (/* this: Instance, */) -> Promise<DataTransfer?>
    var cut: (/* this: Instance, */) -> Promise<DataTransfer?>
    var paste: (
        // this: Instance,
        clipboardData: Any?, /* string | DataTransfer | undefined */ // use undefined for default
    ) -> Promise<js.core.Void>
    var pointer: (/* this: Instance, */ input: PointerInput) -> Promise<js.core.Void>
    var clear: (/* this: Instance, */ element: Element) -> Promise<js.core.Void>
    var deselectOptions: (
        // this: Instance,
        select: Element,
        values: Any, // string | HTMLElement | HTMLElement[] | string[]
    ) -> Promise<js.core.Void>
    var selectOptions: (
        // this: Instance,
        select: Element,
        values: Any, // string | HTMLElement | HTMLElement[] | string[]
    ) -> Promise<js.core.Void>
    var type: (
        // this: Instance,
        element: Element,
        text: String,
        options: typeOptions?, // use undefined for default
    ) -> Promise<js.core.Void>
    var upload: (
        // this: Instance,
        element: HTMLElement,
        fileOrFiles: Any, // File | File[]
    ) -> Promise<js.core.Void>
}
