// Automatically generated - do not modify!

@file:JsModule("@mui/material/ButtonBase/TouchRipple")

package mui.material

import react.FC
import react.dom.events.SyntheticEvent

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
