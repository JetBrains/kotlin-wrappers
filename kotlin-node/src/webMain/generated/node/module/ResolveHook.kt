// Automatically generated - do not modify!

package node.module

typealias ResolveHook = (
    specifier: String,
    context: ResolveHookContext,
    nextResolve: (
        specifier: String,
        context: ResolveHookContext?, /* use undefined for default */
    ) -> js.promise.PromiseResult<ResolveFnOutput>,
) -> js.promise.PromiseResult<ResolveFnOutput>
