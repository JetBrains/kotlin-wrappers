package electron.core


external interface CertificatePrincipal {
// Docs: https://electronjs.org/docs/api/structures/certificate-principal
    /**
     * Common Name.
     */
    var commonName: String

    /**
     * Country or region.
     */
    var country: String

    /**
     * Locality.
     */
    var locality: String

    /**
     * Organization names.
     */
    var organizations: js.core.ReadonlyArray<String>

    /**
     * Organization Unit names.
     */
    var organizationUnits: js.core.ReadonlyArray<String>

    /**
     * State or province.
     */
    var state: String
}
