package react

import js.array.Tuple3

typealias ActionStateInstance1<S> = Tuple3<
        /* state: */ S,
        /* dispatch: */ () -> Unit,
        /* isPending: */ Boolean,
        >

typealias ActionStateInstance2<S, P> = Tuple3<
        /* state: */ S,
        /* dispatch: */ (payload: P) -> Unit,
        /* isPending: */ Boolean,
        >
