[![JetBrains team project](http://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

# Kotlin Wrappers

This repository hosts a number of [Kotlin](https://kotlinlang.org) wrappers for popular JavaScript libraries: react, react-dom, and mocha.

To learn more please refer to the READMEs of individual modules: 
[kotlin-extensions](kotlin-extensions/README.md), 
[kotlin-mocha](kotlin-mocha/README.md), 
[kotlin-react](kotlin-react/README.md), 
[kotlin-react-dom](kotlin-react-dom/README.md).

All wrappers are available on npm: `npm install @jetbrains/<wrapper name>`

Artifacts installable using Maven and Gradle are published to [Bintray](https://bintray.com/kotlin/kotlin-js-wrappers).

## Examples

1. [To-do list example](examples/src/main/kotlin/example/Todo.kt) 

2. [Tic-Tac-Toe example](examples/src/main/kotlin/example/TicTacToe.kt)

3. A port of "Thinking in React" [example](examples/src/main/kotlin/example/Product.kt)

4. An [example of using axios](examples/src/main/kotlin/example/AxiosSearch.kt) to fetch remote data. It also demonstrates how to add typings for an external library.

5. An [example of using Quill](examples/src/main/kotlin/example/Quill.kt) that shows how to use an external React component.

Follow these examples to learn how to start developing your React apps with Kotlin. Good luck and have fun! 
You also can clone [my-kotlin-react-sample](https://github.com/ScottHuangZL/my-kotlin-app) to see the result directly.

## Real-world examples

[KotlinConf App](https://github.com/JetBrains/kotlinconf-app/) — an application developed at JetBrains to showcase multiplatform projects in Kotlin. The web-based part of the app is written using React and Kotlin/JS.

## Contributing

Contributions to this project are welcome! Please see the open [issues](https://github.com/JetBrains/kotlin-wrappers/issues) or chat with us on the **#react** channel in our [Slack](http://slack.kotlinlang.org/). 
