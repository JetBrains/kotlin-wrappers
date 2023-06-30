package electron


external interface CustomScheme {
    // Docs: https://electronjs.org/docs/api/structures/custom-scheme
    var privileges: Privileges?

    /**
     * Custom schemes to be registered with options.
     */
    var scheme: String
}
