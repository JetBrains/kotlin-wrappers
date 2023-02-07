package react.redux

import kotlinext.js.js
import react.HOC
import react.Props

fun <A, R> rConnect(
    options: (Options<Any, Props, Props, DispatchProps<A, R>>.() -> Unit) = {},
): HOC<DispatchProps<A, R>, Props> {
    return connect<Any, A, R, Props, Props, Props, DispatchProps<A, R>>(
        undefined,
        undefined,
        undefined,
        js {
            getDisplayName = { name: String -> "RConnect($name)" }
            methodName = "rConnect"
            options(this)
        }.unsafeCast<Options<Any, Props, Props, DispatchProps<A, R>>>()
    )
}

fun <S, OP : Props, P : Props> rConnect(
    mapStateToProps: P.(S, OP) -> Unit,
    options: (Options<S, OP, P, P>.() -> Unit) = {},
): HOC<P, OP> {
    return connect<S, Any, Any, OP, P, Props, P>(
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

fun <A, R, OP : Props, P : Props> rConnect(
    mapDispatchToProps: P.((A) -> R, OP) -> Unit,
    options: (Options<Any, OP, Props, P>.() -> Unit) = {},
): HOC<P, OP> {
    return connect<Any, A, R, OP, Props, P, P>(
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
        }.unsafeCast<Options<Any, OP, Props, P>>()
    )
}

fun <S, A, R, OP : Props, SP : Props, DP : Props, P : Props> rConnect(
    mapStateToProps: SP.(S, OP) -> Unit,
    mapDispatchToProps: DP.((A) -> R, OP) -> Unit,
    options: (Options<S, OP, SP, P>.() -> Unit) = {},
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

fun <S, A, R, OP : Props, SP : Props, DP : Props, P : Props> rConnect(
    mapStateToProps: SP.(S, OP) -> Unit,
    mapDispatchToProps: DP.((A) -> R, OP) -> Unit,
    mergeProps: P.(SP, DP, OP) -> Unit,
    options: (Options<S, OP, SP, P>.() -> Unit) = {},
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
