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

external interface QueryErrorResetBoundaryProps : react.Props {
    var children: dynamic
}

external val QueryErrorResetBoundary: react.FC<QueryErrorResetBoundaryProps>
