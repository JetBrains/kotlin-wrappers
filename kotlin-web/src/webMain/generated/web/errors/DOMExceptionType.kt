// Automatically generated - do not modify!

package web.errors

/**
 * [MDN Reference]([MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#error_names))
 */
sealed /* marker */
interface DOMExceptionType {
    /**
     * The index is not in the allowed range. For example, this can be thrown by the [Range] object
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#indexsizeerror)
     */
    sealed /* marker */
    interface IndexSizeError :
        DOMExceptionType

    /**
     * The node tree hierarchy is not correct
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#hierarchyrequesterror)
     */
    sealed /* marker */
    interface HierarchyRequestError :
        DOMExceptionType

    /**
     * The object is in the wrong [Document]
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#wrongdocumenterror)
     */
    sealed /* marker */
    interface WrongDocumentError :
        DOMExceptionType

    /**
     * The string contains invalid characters
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidcharactererror)
     */
    sealed /* marker */
    interface InvalidCharacterError :
        DOMExceptionType

    /**
     * The object cannot be modified
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#nomodificationallowederror)
     */
    sealed /* marker */
    interface NoModificationAllowedError :
        DOMExceptionType

    /**
     * The object cannot be found here
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notfounderror)
     */
    sealed /* marker */
    interface NotFoundError :
        DOMExceptionType

    /**
     * The operation is not supported
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notsupportederror)
     */
    sealed /* marker */
    interface NotSupportedError :
        DOMExceptionType

    /**
     * The attribute is in use
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#inuseattributeerror)
     */
    sealed /* marker */
    interface InUseAttributeError :
        DOMExceptionType

    /**
     * The object is in an invalid state
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidstateerror)
     */
    sealed /* marker */
    interface InvalidStateError :
        DOMExceptionType

    /**
     * The string did not match the expected pattern
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#syntaxerror)
     */
    sealed /* marker */
    interface SyntaxError :
        DOMExceptionType

    /**
     * The object cannot be modified in this way
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidmodificationerror)
     */
    sealed /* marker */
    interface InvalidModificationError :
        DOMExceptionType

    /**
     * The operation is not allowed by Namespaces in XML
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#namespaceerror)
     */
    sealed /* marker */
    interface NamespaceError :
        DOMExceptionType

    /**
     * The object does not support the operation or argument
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidaccesserror)
     */
    sealed /* marker */
    interface InvalidAccessError :
        DOMExceptionType

    /**
     * The operation is insecure
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#securityerror)
     */
    sealed /* marker */
    interface SecurityError :
        DOMExceptionType

    /**
     * A network error occurred
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#networkerror)
     */
    sealed /* marker */
    interface NetworkError :
        DOMExceptionType

    /**
     * The operation was aborted
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#aborterror)
     */
    sealed /* marker */
    interface AbortError :
        DOMExceptionType

    /**
     * The given URL does not match another URL
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#urlmismatcherror)
     */
    sealed /* marker */
    interface URLMismatchError :
        DOMExceptionType

    /**
     * The quota has been exceeded
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#quotaexceedederror)
     */
    sealed /* marker */
    interface QuotaExceededError :
        DOMExceptionType

    /**
     * The operation timed out
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#timeouterror)
     */
    sealed /* marker */
    interface TimeoutError :
        DOMExceptionType

    /**
     * The node is incorrect or has an incorrect ancestor for this operation
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#invalidnodetypeerror)
     */
    sealed /* marker */
    interface InvalidNodeTypeError :
        DOMExceptionType

    /**
     * The object cannot be cloned
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#datacloneerror)
     */
    sealed /* marker */
    interface DataCloneError :
        DOMExceptionType

    /**
     * The encoding or decoding operation failed
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#encodingerror)
     */
    sealed /* marker */
    interface EncodingError :
        DOMExceptionType

    /**
     * The input/output read operation failed
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notreadableerror)
     */
    sealed /* marker */
    interface NotReadableError :
        DOMExceptionType

    /**
     * The operation failed for an unknown transient reason (e.g., out of memory)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#unknownerror)
     */
    sealed /* marker */
    interface UnknownError :
        DOMExceptionType

    /**
     * A mutation operation in a transaction failed because a constraint was not satisfied
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#constrainterror)
     */
    sealed /* marker */
    interface ConstraintError :
        DOMExceptionType

    /**
     * Provided data is inadequate
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#dataerror)
     */
    sealed /* marker */
    interface DataError :
        DOMExceptionType

    /**
     * A request was placed against a transaction that is currently not active or is finished
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#transactioninactiveerror)
     */
    sealed /* marker */
    interface TransactionInactiveError :
        DOMExceptionType

    /**
     * The mutating operation was attempted in a "readonly" transaction
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#readonlyerror)
     */
    sealed /* marker */
    interface ReadOnlyError :
        DOMExceptionType

    /**
     * An attempt was made to open a database using a lower version than the existing version
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#versionerror)
     */
    sealed /* marker */
    interface VersionError :
        DOMExceptionType

    /**
     * The operation failed for an operation-specific reason
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#operationerror)
     */
    sealed /* marker */
    interface OperationError :
        DOMExceptionType

    /**
     * The request is not allowed by the user agent or the platform in the current context, possibly because the user denied permission
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException#notallowederror)
     */
    sealed /* marker */
    interface NotAllowedError :
        DOMExceptionType
}
