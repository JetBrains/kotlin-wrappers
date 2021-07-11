@file:JsModule("react")
@file:JsNonModule

package react

// Imperative Methods Hook (16.8+)
external fun useImperativeHandle(
    ref: RRef,
    createInstance: () -> dynamic,
    inputs: RDependenciesArray,
)
