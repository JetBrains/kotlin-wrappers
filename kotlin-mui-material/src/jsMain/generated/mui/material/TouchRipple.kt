// Automatically generated - do not modify!

@file:JsModule("@mui/material/ButtonBase/TouchRipple")

package mui.material

import mui.system.StandardProps
import react.FC
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLElement

external interface TouchRippleProps :
    StandardProps,
    HTMLAttributes<HTMLElement> {
    var center: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TouchRippleClasses?
}

external interface StartActionOptions {
    var pulsate: Boolean?

    var center: Boolean?
}

external interface TouchRippleActions {
    fun start(
        event: SyntheticEvent<*, *> = definedExternally,
        options: StartActionOptions = definedExternally,
        callback: () -> Unit = definedExternally,
    )

    fun pulsate(event: SyntheticEvent<*, *> = definedExternally)
    fun stop(event: SyntheticEvent<*, *> = definedExternally, callback: () -> Unit = definedExternally)
}


@JsName("default")
external val TouchRipple: FC<TouchRippleProps>
