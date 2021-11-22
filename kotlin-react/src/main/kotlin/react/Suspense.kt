@file:JsModule("react")
@file:JsNonModule

package react

external interface SuspenseProps : PropsWithChildren

external val Suspense: ComponentType<SuspenseProps>
