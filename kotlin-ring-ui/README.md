[![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)](https://mvnrepository.com/artifact/org.jetbrains.kotlin-wrappers/kotlin-ring-ui)

# kotlin-ring-ui
[Ring UI](https://github.com/JetBrains/ring-ui) is a collection of UI components which aims to provide all of the necessary building blocks for web-based products built inside JetBrains, as well as third-party plugins developed for JetBrains' products.

# Usage
Additional webpack configuration is required to work with Ring UI. Please add the following to your webpack configuration file:
```js
const ringConfig = require('@jetbrains/ring-ui/webpack.config').config;

config.module.rules.push(...ringConfig.module.rules)
```
