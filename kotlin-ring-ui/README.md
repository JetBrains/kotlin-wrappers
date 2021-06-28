[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)

# kotlin-ring-ui
[Ring UI](https://github.com/JetBrains/ring-ui) is an official open-source JetBrains library for writing web interfaces for JetBrains and not-so-JetBrains products and sites. This library provides thin layer wrapper to use it in Kotlin/JS.

# Usage
The webpack requires additional configuration to work with this library.

The following rule must be added to `webpack.config.d`:
```js
const ringConfig = require('@jetbrains/ring-ui/webpack.config').config;

config.module.rules.push(...ringConfig.module.rules)
```
