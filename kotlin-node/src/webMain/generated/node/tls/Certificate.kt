// Automatically generated - do not modify!

package node.tls

sealed external interface Certificate : node.Dict<Any /* string | string[] */> {
    /**
     * Country code.
     */
    var C: (Any /* string | string[] */)?

    /**
     * Street.
     */
    var ST: (Any /* string | string[] */)?

    /**
     * Locality.
     */
    var L: (Any /* string | string[] */)?

    /**
     * Organization.
     */
    var O: (Any /* string | string[] */)?

    /**
     * Organizational unit.
     */
    var OU: (Any /* string | string[] */)?

    /**
     * Common name.
     */
    var CN: (Any /* string | string[] */)?
}
