@file:JsModule("react-router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


/**
 * Component to use for rendering lazily loaded data from returning defer()
 * in a loader function
 */
external val Await: react.FC<AwaitProps>
