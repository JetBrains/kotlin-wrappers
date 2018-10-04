package react.redux

import kotlinext.js.*
import react.*

fun <S, OP : RProps, P : RProps> rConnect(
    mapStateToProps: P.(S, OP) -> Unit,
    options: (Options<S, OP, P, P>.() -> Unit) = {}
): HOC<P, OP> {
    return connect<S, Any, Any, OP, P, RProps, P>(
        { state: S, ownProps: OP ->
            js {
                mapStateToProps(this, state, ownProps)
            }.unsafeCast<P>()
        },
        undefined,
        undefined,
        js {
            getDisplayName = { name: String -> "RConnect($name)" }
            methodName = "rConnect"
            options(this)
        }.unsafeCast<Options<S, OP, P, P>>()
    )
}

fun <A, R, OP : RProps, P : RProps> rConnect(
    mapDispatchToProps: P.((A) -> R, OP) -> Unit,
    options: (Options<Any, OP, RProps, P>.() -> Unit) = {}
): HOC<P, OP> {
    return connect<Any, A, R, OP, RProps, P, P>(
        undefined,
        { dispatch, ownProps ->
            js {
                mapDispatchToProps(this, dispatch, ownProps)
            }.unsafeCast<P>()
        },
        undefined,
        js {
            getDisplayName = { name: String -> "RConnect($name)" }
            methodName = "rConnect"
            options(this)
        }.unsafeCast<Options<Any, OP, RProps, P>>()
    )
}

fun <S, A, R, OP : RProps, SP : RProps, DP : RProps, P : RProps> rConnect(
    mapStateToProps: SP.(S, OP) -> Unit,
    mapDispatchToProps: DP.((A) -> R, OP) -> Unit,
    options: (Options<S, OP, SP, P>.() -> Unit) = {}
): HOC<P, OP> {
    return connect<S, A, R, OP, SP, DP, P>(
        { state, ownProps ->
            js {
                mapStateToProps(this, state, ownProps)
            }.unsafeCast<SP>()
        },
        { dispatch, ownProps ->
            js {
                mapDispatchToProps(this, dispatch, ownProps)
            }.unsafeCast<DP>()
        },
        undefined,
        js {
            getDisplayName = { name: String -> "RConnect($name)" }
            methodName = "rConnect"
            options(this)
        }.unsafeCast<Options<S, OP, SP, P>>()
    )
}

fun <S, A, R, OP : RProps, SP : RProps, DP : RProps, P : RProps> rConnect(
    mapStateToProps: SP.(S, OP) -> Unit,
    mapDispatchToProps: DP.((A) -> R, OP) -> Unit,
    mergeProps: P.(SP, DP, OP) -> Unit,
    options: (Options<S, OP, SP, P>.() -> Unit) = {}
): HOC<P, OP> {
    return connect<S, A, R, OP, SP, DP, P>(
        { state, ownProps ->
            js {
                mapStateToProps(this, state, ownProps)
            }.unsafeCast<SP>()
        },
        { dispatch, ownProps ->
            js {
                mapDispatchToProps(this, dispatch, ownProps)
            }.unsafeCast<DP>()
        },
        { stateProps, dispatchProps, ownProps ->
            js {
                mergeProps(this, stateProps, dispatchProps, ownProps)
            }.unsafeCast<P>()
        },
        js {
            getDisplayName = { name: String -> "RConnect($name)" }
            methodName = "rConnect"
            options(this)
        }.unsafeCast<Options<S, OP, SP, P>>()
    )
}
