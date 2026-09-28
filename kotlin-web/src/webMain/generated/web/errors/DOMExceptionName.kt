// Automatically generated - do not modify!

package web.errors

import js.errors.JsErrorName
import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names)
 */
@JsUnion
external interface DOMExceptionName :
    JsErrorName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names)
 */
inline fun DOMExceptionName(
    value: String,
): DOMExceptionName =
    unsafeCast(value)

/**
 * The index is not in the allowed range. For example, this can be thrown by the [Range] object
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#indexsizeerror)
 */
inline val DOMExceptionName.Companion.IndexSizeError: DOMExceptionName
    get() = DOMExceptionName("IndexSizeError")

/**
 * The node tree hierarchy is not correct
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#hierarchyrequesterror)
 */
inline val DOMExceptionName.Companion.HierarchyRequestError: DOMExceptionName
    get() = DOMExceptionName("HierarchyRequestError")

/**
 * The object is in the wrong [Document]
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#wrongdocumenterror)
 */
inline val DOMExceptionName.Companion.WrongDocumentError: DOMExceptionName
    get() = DOMExceptionName("WrongDocumentError")

/**
 * The string contains invalid characters
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidcharactererror)
 */
inline val DOMExceptionName.Companion.InvalidCharacterError: DOMExceptionName
    get() = DOMExceptionName("InvalidCharacterError")

/**
 * The object cannot be modified
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#nomodificationallowederror)
 */
inline val DOMExceptionName.Companion.NoModificationAllowedError: DOMExceptionName
    get() = DOMExceptionName("NoModificationAllowedError")

/**
 * The object cannot be found here
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notfounderror)
 */
inline val DOMExceptionName.Companion.NotFoundError: DOMExceptionName
    get() = DOMExceptionName("NotFoundError")

/**
 * The operation is not supported
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notsupportederror)
 */
inline val DOMExceptionName.Companion.NotSupportedError: DOMExceptionName
    get() = DOMExceptionName("NotSupportedError")

/**
 * The attribute is in use
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#inuseattributeerror)
 */
inline val DOMExceptionName.Companion.InUseAttributeError: DOMExceptionName
    get() = DOMExceptionName("InUseAttributeError")

/**
 * The object is in an invalid state
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidstateerror)
 */
inline val DOMExceptionName.Companion.InvalidStateError: DOMExceptionName
    get() = DOMExceptionName("InvalidStateError")

/**
 * The string did not match the expected pattern
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#syntaxerror)
 */
inline val DOMExceptionName.Companion.SyntaxError: DOMExceptionName
    get() = DOMExceptionName("SyntaxError")

/**
 * The object cannot be modified in this way
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidmodificationerror)
 */
inline val DOMExceptionName.Companion.InvalidModificationError: DOMExceptionName
    get() = DOMExceptionName("InvalidModificationError")

/**
 * The operation is not allowed by Namespaces in XML
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#namespaceerror)
 */
inline val DOMExceptionName.Companion.NamespaceError: DOMExceptionName
    get() = DOMExceptionName("NamespaceError")

/**
 * The object does not support the operation or argument
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidaccesserror)
 */
inline val DOMExceptionName.Companion.InvalidAccessError: DOMExceptionName
    get() = DOMExceptionName("InvalidAccessError")

/**
 * The operation is insecure
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#securityerror)
 */
inline val DOMExceptionName.Companion.SecurityError: DOMExceptionName
    get() = DOMExceptionName("SecurityError")

/**
 * A network error occurred
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#networkerror)
 */
inline val DOMExceptionName.Companion.NetworkError: DOMExceptionName
    get() = DOMExceptionName("NetworkError")

/**
 * The operation was aborted
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#aborterror)
 */
inline val DOMExceptionName.Companion.AbortError: DOMExceptionName
    get() = DOMExceptionName("AbortError")

/**
 * The given URL does not match another URL
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#urlmismatcherror)
 */
inline val DOMExceptionName.Companion.URLMismatchError: DOMExceptionName
    get() = DOMExceptionName("URLMismatchError")

/**
 * The quota has been exceeded
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#quotaexceedederror)
 */
inline val DOMExceptionName.Companion.QuotaExceededError: DOMExceptionName
    get() = DOMExceptionName("QuotaExceededError")

/**
 * The operation timed out
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#timeouterror)
 */
inline val DOMExceptionName.Companion.TimeoutError: DOMExceptionName
    get() = DOMExceptionName("TimeoutError")

/**
 * The node is incorrect or has an incorrect ancestor for this operation
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidnodetypeerror)
 */
inline val DOMExceptionName.Companion.InvalidNodeTypeError: DOMExceptionName
    get() = DOMExceptionName("InvalidNodeTypeError")

/**
 * The object cannot be cloned
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#datacloneerror)
 */
inline val DOMExceptionName.Companion.DataCloneError: DOMExceptionName
    get() = DOMExceptionName("DataCloneError")

/**
 * The encoding or decoding operation failed
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#encodingerror)
 */
inline val DOMExceptionName.Companion.EncodingError: DOMExceptionName
    get() = DOMExceptionName("EncodingError")

/**
 * The input/output read operation failed
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notreadableerror)
 */
inline val DOMExceptionName.Companion.NotReadableError: DOMExceptionName
    get() = DOMExceptionName("NotReadableError")

/**
 * The operation failed for an unknown transient reason (e.g., out of memory)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#unknownerror)
 */
inline val DOMExceptionName.Companion.UnknownError: DOMExceptionName
    get() = DOMExceptionName("UnknownError")

/**
 * A mutation operation in a transaction failed because a constraint was not satisfied
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#constrainterror)
 */
inline val DOMExceptionName.Companion.ConstraintError: DOMExceptionName
    get() = DOMExceptionName("ConstraintError")

/**
 * Provided data is inadequate
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#dataerror)
 */
inline val DOMExceptionName.Companion.DataError: DOMExceptionName
    get() = DOMExceptionName("DataError")

/**
 * A request was placed against a transaction that is currently not active or is finished
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#transactioninactiveerror)
 */
inline val DOMExceptionName.Companion.TransactionInactiveError: DOMExceptionName
    get() = DOMExceptionName("TransactionInactiveError")

/**
 * The mutating operation was attempted in a "readonly" transaction
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#readonlyerror)
 */
inline val DOMExceptionName.Companion.ReadOnlyError: DOMExceptionName
    get() = DOMExceptionName("ReadOnlyError")

/**
 * An attempt was made to open a database using a lower version than the existing version
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#versionerror)
 */
inline val DOMExceptionName.Companion.VersionError: DOMExceptionName
    get() = DOMExceptionName("VersionError")

/**
 * The operation failed for an operation-specific reason
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#operationerror)
 */
inline val DOMExceptionName.Companion.OperationError: DOMExceptionName
    get() = DOMExceptionName("OperationError")

/**
 * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notallowederror)
 */
inline val DOMExceptionName.Companion.NotAllowedError: DOMExceptionName
    get() = DOMExceptionName("NotAllowedError")
