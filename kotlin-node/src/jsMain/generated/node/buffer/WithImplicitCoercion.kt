package node.buffer


typealias WithImplicitCoercion<
        @Suppress("UNUSED_TYPEALIAS_PARAMETER")
        T,
        > = Any /* T | {
    valueOf(): T;
} */
