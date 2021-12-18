@file:JsModule("@emotion/css")
@file:JsNonModule

package emotion.css

external fun getRegisteredStyles(
    registeredStyles: Array<String>,
    className: String,
): String
