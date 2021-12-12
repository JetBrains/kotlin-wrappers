// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createMixins")
@file:JsNonModule

package mui.material.styles

external interface BaseCSSProperties {
    // var `@font-face`: dynamic
}

external interface CSSProperties {
// Allow pseudo selectors and media queries
// `unknown` is used since TS does not allow assigning an interface without
// an index signature to one with an index signature. This is to allow type safe
// module augmentation.
// Technically we want any key not typed in `BaseCSSProperties` to be of type
// `CSSProperties` but this doesn't work. The index signature needs to cover
// BaseCSSProperties as well. Usually you would use `BaseCSSProperties[keyof BaseCSSProperties]`
// but this would not allow assigning React.CSSProperties to CSSProperties
// [k: string]: unknown | CSSProperties
}

external interface Mixins {
    var toolbar: dynamic
}

external interface MixinsOptions {
// ... use interface declaration merging to add custom mixin options
}
