// Automatically generated - do not modify!

package node.inspector.runtime

sealed external interface GetPropertiesParameterType {
    /**
     * Identifier of the object to return properties for.
     */
    var objectId: RemoteObjectId

    /**
     * If true, returns properties belonging only to the element itself, not to its prototype chain.
     */
    var ownProperties: Boolean?

    /**
     * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
     * @experimental
     */
    var accessorPropertiesOnly: Boolean?

    /**
     * Whether preview should be generated for the results.
     * @experimental
     */
    var generatePreview: Boolean?
}
