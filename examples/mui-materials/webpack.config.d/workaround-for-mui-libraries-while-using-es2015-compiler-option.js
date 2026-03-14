/**
 *
 * Needed for `@mui/*` libraries while using `target = "es2015"` compiler option.
 * There will be the next error without this WA:
 *
 *   Did you mean `index.js`?
 *
 *   BREAKING CHANGE: The request '@mui/base/Slider' failed to resolve only because it was resolved as fully specified
 *   (probably because the origin is strict EcmaScript Module, e.g., a module with JavaScript mimetype, a `*.mjs` file, or a `*.js` file where the package.json contains `"type": "module"`).
 *   The extension in the request is mandatory for it to be fully specified.
 *   Add the extension to the request.
 *
 *
 * Explanation:
 *   MUI libraries don't provide `"export"` field in `package.json`. At the same time, Kotlin Wrappers for MUI libraries do not use fully specified imports.
 *   But fully specified imports are required for Webpack with `es` module kind enabled.
 *
 * Thus it can be removed in the future when `"export"` field will be declared in `package.json` of every MUI library, or MUI Kotlin Wrappers will use fully specified imports.
 *
 */
config.module.rules.push({
    test: /\.m?js$/i,
    resolve: {
        fullySpecified: false,
    },
})
