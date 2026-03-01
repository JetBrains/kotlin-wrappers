// Automatically generated - do not modify!

package testing.library.user.event.setup.setup

// unhandled import: dispatchEvent from "../event"
// unhandled import: dispatchUIEvent from "../event"
// unhandled import: Options from "../options"
// unhandled import: System from "../system"
// unhandled import: userEventApi from "./api"
// unhandled import: DirectOptions from "./directApi"
import testing.library.user.event.setup.api.UserEventApi
import testing.library.user.event.system.System
import web.dom.Element
import web.events.Event

external interface Instance : UserEventApi {
    var config: Config
    var dispatchEvent: (
        // this: Instance,
        target: Element,
        event: Event,
        preventDefault: Boolean?, // use undefined for default
    ) -> Boolean
    var dispatchUIEvent: Function<Any?> // <K extends EventType>(this: Instance, target: Element, type: K, init?: EventTypeInit<K> | undefined, preventDefault?: boolean | undefined) => boolean
    var system: System
    var levelRefs: js.objects.ReadonlyRecord<Double, Any?>
}
