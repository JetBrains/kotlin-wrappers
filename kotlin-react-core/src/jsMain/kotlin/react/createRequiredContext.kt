@file:JsModule("react")
@file:JsNonModule

package react

@JsName("createContext")
external fun <T : Any> createRequiredContext(): RequiredContext<T>
