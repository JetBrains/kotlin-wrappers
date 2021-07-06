// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external interface QueryErrorResetBoundaryValue {
    var clearReset: () -> Unit
    var isReset: () -> Boolean
    var reset: () -> Unit
}

external val useQueryErrorResetBoundary: () -> QueryErrorResetBoundaryValue

external interface QueryErrorResetBoundaryProps : react.RProps {
    var children: dynamic
}

external val QueryErrorResetBoundary: react.RClass<QueryErrorResetBoundaryProps>
