### issues

* Without `examples/mui-materials/webpack.config.d/workaround-for-mui-libraries-while-using-es2015-compiler-option.js`,
  `jsBrowserDevelopmentRun` gives an error:

```
Compiled with problems:
ERROR
Cannot find module '@mui/material/Box'
webpackMissingModule@webpack-internal:///./kotlin/mui-materials/example/mui/View.mjs:5:50
@webpack-internal:///./kotlin/mui-materials/example/mui/View.mjs:5:142
./kotlin/mui-materials/example/mui/View.mjs@http://localhost:8080/index.js:1649:1
__webpack_require__@http://localhost:8080/index.js:1682:32
fn@http://localhost:8080/index.js:1888:21
@webpack-internal:///./kotlin/mui-materials/example/mui/Main.mjs:7:86
./kotlin/mui-materials/example/mui/Main.mjs@http://localhost:8080/index.js:1638:1
__webpack_require__@http://localhost:8080/index.js:1682:32
fn@http://localhost:8080/index.js:1888:21
./kotlin/mui-materials.mjs@http://localhost:8080/index.js:1619:112
__webpack_require__@http://localhost:8080/index.js:1682:32
@http://localhost:8080/index.js:2782:56
@http://localhost:8080/index.js:2785:12
webpackUniversalModuleDefinition@http://localhost:8080/index.js:17:27
@http://localhost:8080/index.js:18:3
ERROR in ./kotlin/mui-materials/example/mui/View.mjs 1:0-57
Module not found: Error: Can't resolve '@mui/material/Box' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/kotlin/mui-materials/example/mui'
Did you mean 'index.js'?
BREAKING CHANGE: The request '@mui/material/Box' failed to resolve only because it was resolved as fully specified
(probably because the origin is strict EcmaScript Module, e. g. a module with javascript mimetype, a '*.mjs' file, or a '*.js' file where the package.json contains '"type": "module"').
The extension in the request is mandatory for it to be fully specified.
Add the extension to the request.
ERROR in ./kotlin/mui-materials/example/mui/View.mjs 2:0-61
Module not found: Error: Can't resolve '@mui/material/Divider' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/kotlin/mui-materials/example/mui'
Did you mean 'index.js'?
BREAKING CHANGE: The request '@mui/material/Divider' failed to resolve only because it was resolved as fully specified
(probably because the origin is strict EcmaScript Module, e. g. a module with javascript mimetype, a '*.mjs' file, or a '*.js' file where the package.json contains '"type": "module"').
The extension in the request is mandatory for it to be fully specified.
Add the extension to the request.
ERROR in ./kotlin/mui-materials/example/mui/View.mjs 3:0-64
Module not found: Error: Can't resolve '@mui/material/Typography' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/kotlin/mui-materials/example/mui'
Did you mean 'index.js'?
BREAKING CHANGE: The request '@mui/material/Typography' failed to resolve only because it was resolved as fully specified
(probably because the origin is strict EcmaScript Module, e. g. a module with javascript mimetype, a '*.mjs' file, or a '*.js' file where the package.json contains '"type": "module"').
The extension in the request is mandatory for it to be fully specified.
Add the extension to the request.
```

* With the patch, jsBrowserDevelopmentRun works.

### Run

```shell
./../gradlew mui-materials:jsBrowserDevelopmentRun
```
