package electron


external interface ResolvedHost {
// Docs: https://electronjs.org/docs/api/structures/resolved-host
    /**
     * resolved DNS entries for the hostname
     */
    var endpoints: js.core.ReadonlyArray<ResolvedEndpoint>
}
