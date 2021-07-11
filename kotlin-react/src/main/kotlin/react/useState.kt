@file:JsModule("react")
@file:JsNonModule

package react

external fun <T : Any> useState(): StateInstance<T?>

external fun <T> useState(
    initialValue: T,
): StateInstance<T>

external fun <T> useState(
    initializer: () -> T,
): StateInstance<T>
