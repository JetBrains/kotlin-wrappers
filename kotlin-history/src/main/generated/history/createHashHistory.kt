// Automatically generated - do not modify!

@file:JsModule("history")
@file:JsNonModule

package history

/**
 * Hash history stores the location in window.location.hash. This makes it ideal
 * for situations where you don't want to send the location to the server for
 * some reason, either because you do cannot configure it or the URL space is
 * reserved for something else.
 *
 * @see https://github.com/ReactTraining/history/tree/master/docs/api-reference.md#createhashhistory
 */
external fun createHashHistory(
    options: HashHistoryOptions = definedExternally,
): HashHistory
