// Automatically generated - do not modify!

package web.streams

sealed external interface ReadableStreamReadDoneResult<T> :
    ReadableStreamReadResult<T> {
    var done: Boolean /* true */
    var value: T?
}
