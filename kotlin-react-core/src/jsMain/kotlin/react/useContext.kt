@file:JsModule("react")

package react

// Context Hook (16.8+)
external fun <T> useContext(
    context: Context<T>,
): T
