package react

import js.array.JsTuple3

typealias ActionStateInstance1<S> = JsTuple3<
        /* state: */ S,
        /* dispatch: */ () -> Unit,
        /* isPending: */ Boolean,
        >

typealias ActionStateInstance2<S, P> = JsTuple3<
        /* state: */ S,
        /* dispatch: */ (payload: P) -> Unit,
        /* isPending: */ Boolean,
        >
