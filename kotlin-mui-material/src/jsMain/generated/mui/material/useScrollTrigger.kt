// Automatically generated - do not modify!

@file:JsModule("@mui/material/useScrollTrigger")

package mui.material

external interface UseScrollTriggerOptions {
    var disableHysteresis: Boolean?

    var target: web.events.EventTarget? /* web.dom.Node? or web.window.Window? */

    var threshold: Number?
}

@JsName("default")
external fun useScrollTrigger(
    options: UseScrollTriggerOptions? = definedExternally,
): Boolean
