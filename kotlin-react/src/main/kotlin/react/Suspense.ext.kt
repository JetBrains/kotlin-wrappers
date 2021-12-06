import react.Render
import react.SuspenseProps
import react.createElement

// 16.6+
fun SuspenseProps.fallback(handler: Render) {
    asDynamic().fallback = createElement(handler)
}
