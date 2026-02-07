// Automatically generated - do not modify!

package testing.library.react

// unhandled import: * as ReactDOMClient from "react-dom/client"
// unhandled import: act as reactDeprecatedAct from "react-dom/test-utils"
// unhandled import: act as reactAct from "react"

external interface RenderHookResult<Result, Props> {
    /**
     * Triggers a re-render. The props will be passed to your renderHook callback.
     */
    var rerender: (props: Props? /* use undefined for default */) -> Unit

    /**
     * This is a stable reference to the latest value returned by your renderHook
     * callback
     */
    var result: RenderHookResultResult<Result>

    /**
     * Unmounts the test component. This is useful for when you need to test
     * any cleanup your useEffects have.
     */
    var unmount: () -> Unit
}
