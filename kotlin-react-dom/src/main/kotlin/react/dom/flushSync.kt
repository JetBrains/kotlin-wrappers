@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun flushSync(
    callback: () -> Unit,
)
