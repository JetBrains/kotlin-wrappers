@file:JsModule("react")
@file:JsNonModule

package react

// Context Hook (16.8+)
external fun <T> useContext(
    context: Context<T>,
): T
