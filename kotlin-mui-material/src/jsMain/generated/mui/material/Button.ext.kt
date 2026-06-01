// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed external interface ButtonColor {
    companion object {
        @JsValue("inherit")
        val inherit: ButtonColor

        @JsValue("primary")
        val primary: ButtonColor

        @JsValue("secondary")
        val secondary: ButtonColor

        @JsValue("success")
        val success: ButtonColor

        @JsValue("error")
        val error: ButtonColor

        @JsValue("info")
        val info: ButtonColor

        @JsValue("warning")
        val warning: ButtonColor
    }
}

sealed external interface ButtonVariant {
    companion object {
        @JsValue("text")
        val text: ButtonVariant

        @JsValue("outlined")
        val outlined: ButtonVariant

        @JsValue("contained")
        val contained: ButtonVariant
    }
}

sealed external interface LoadingPosition {
    companion object {
        @JsValue("start")
        val start: LoadingPosition

        @JsValue("end")
        val end: LoadingPosition

        @JsValue("center")
        val center: LoadingPosition
    }
}
