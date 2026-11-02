// Automatically generated - do not modify!

package node.module

typealias LoadHook = (
    url: String,
    context: LoadHookContext,
    nextLoad: (
        url: String,
        context: LoadHookContext?, /* use undefined for default */
    ) -> js.promise.PromiseResult<LoadFnOutput>,
) -> js.promise.PromiseResult<LoadFnOutput>
