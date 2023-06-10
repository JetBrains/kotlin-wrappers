// Automatically generated - do not modify!

@file:JsModule("@mui/material/ButtonBase/TouchRipple")

package mui.material

external interface StartActionOptions {
    var pulsate: Boolean?

    var center: Boolean?
}

external interface TouchRippleActions {
    fun start(
        event: react.dom.events.SyntheticEvent<*, *> = definedExternally,
        options: StartActionOptions = definedExternally,
        callback: () -> Unit = definedExternally,
    )

    fun pulsate(event: react.dom.events.SyntheticEvent<*, *> = definedExternally)
    fun stop(event: react.dom.events.SyntheticEvent<*, *> = definedExternally, callback: () -> Unit = definedExternally)
}


@JsName("default")
external val TouchRipple: react.FC<TouchRippleProps>
