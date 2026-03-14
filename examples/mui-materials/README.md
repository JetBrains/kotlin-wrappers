### issues

* Without `examples/mui-materials/webpack.config.d/workaround-for-mui-libraries-while-using-es2015-compiler-option.js`,
  jsBrowserDevelopmentRun gives
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
* with the patch,
```
  Compiled with problems:
  ERROR
  Cannot find module '@emotion/styled'
  webpackMissingModule@webpack-internal:///./node_modules/@mui/styled-engine/index.js:12:50
  @webpack-internal:///./node_modules/@mui/styled-engine/index.js:12:140
  ./node_modules/@mui/styled-engine/index.js@http://localhost:8080/index.js:693:1
  __webpack_require__@http://localhost:8080/index.js:2814:32
  fn@http://localhost:8080/index.js:3020:21
  @webpack-internal:///./node_modules/@mui/system/esm/createBox.js:10:95
  ./node_modules/@mui/system/esm/createBox.js@http://localhost:8080/index.js:770:1
  __webpack_require__@http://localhost:8080/index.js:2814:32
  fn@http://localhost:8080/index.js:3020:21
  @webpack-internal:///./node_modules/@mui/material/Box/Box.js:5:88
  ./node_modules/@mui/material/Box/Box.js@http://localhost:8080/index.js:363:1
  __webpack_require__@http://localhost:8080/index.js:2814:32
  fn@http://localhost:8080/index.js:3020:21
  @webpack-internal:///./kotlin/mui-materials/example/mui/View.mjs:5:94
  ./kotlin/mui-materials/example/mui/View.mjs@http://localhost:8080/index.js:2781:1
  __webpack_require__@http://localhost:8080/index.js:2814:32
  fn@http://localhost:8080/index.js:3020:21
  @webpack-internal:///./kotlin/mui-materials/example/mui/Main.mjs:7:86
  ./kotlin/mui-materials/example/mui/Main.mjs@http://localhost:8080/index.js:2770:1
  __webpack_require__@http://localhost:8080/index.js:2814:32
  fn@http://localhost:8080/index.js:3020:21
  ./kotlin/mui-materials.mjs@http://localhost:8080/index.js:2751:112
  __webpack_require__@http://localhost:8080/index.js:2814:32
  @http://localhost:8080/index.js:3914:56
  @http://localhost:8080/index.js:3917:12
  webpackUniversalModuleDefinition@http://localhost:8080/index.js:17:27
  @http://localhost:8080/index.js:18:3
  ERROR in ./node_modules/@mui/styled-engine/GlobalStyles/GlobalStyles.js 5:0-40
  Module not found: Error: Can't resolve '@emotion/react' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/node_modules/@mui/styled-engine/GlobalStyles'
  ERROR in ./node_modules/@mui/styled-engine/StyledEngineProvider/StyledEngineProvider.js 5:0-47
  Module not found: Error: Can't resolve '@emotion/react' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/node_modules/@mui/styled-engine/StyledEngineProvider'
  ERROR in ./node_modules/@mui/styled-engine/index.js 11:0-39
  Module not found: Error: Can't resolve '@emotion/styled' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/node_modules/@mui/styled-engine'
  ERROR in ./node_modules/@mui/styled-engine/index.js 45:0-62
  Module not found: Error: Can't resolve '@emotion/react' in '/home/mkienenb/IdeaProjects/kotlin-wrappers/examples/build/js/packages/mui-materials/node_modules/@mui/styled-engine'
```
*   jsBrowserDevelopmentRun gives `index.js` is not found both with and without the patch,


### Run

```shell
./../gradlew mui-materials:jsBrowserDevelopmentRun
```
