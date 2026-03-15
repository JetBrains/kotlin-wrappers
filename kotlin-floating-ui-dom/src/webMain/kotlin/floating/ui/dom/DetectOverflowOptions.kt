package floating.ui.dom

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DetectOverflowOptions :
    floating.ui.core.DetectOverflowOptions {

    override val boundary: Boundary?
}
