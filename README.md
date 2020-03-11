[![JetBrains team project](https://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)

# Kotlin Wrappers

This repository hosts a number of [Kotlin](https://kotlinlang.org) wrappers for popular JavaScript libraries, such as
[React](https://reactjs.org/), [Mocha](https://mochajs.org/), and [styled-components](https://www.styled-components.com/).

To learn more please refer to the READMEs of individual modules:
* [kotlin-css](kotlin-css/README.md), 
* [kotlin-extensions](kotlin-extensions/README.md), 
* [kotlin-mocha](kotlin-mocha/README.md), 
* [kotlin-react](kotlin-react/README.md), 
* [kotlin-react-dom](kotlin-react-dom/README.md),
* [kotlin-react-redux](kotlin-react-redux/README.md),
* [kotlin-react-router-dom](kotlin-react-router-dom/README.md),
* [kotlin-redux](kotlin-redux/README.md),
* [kotlin-styled](kotlin-styled/README.md).

All wrappers are available on npm: `npm install @jetbrains/<wrapper name>`

Artifacts installable using Maven and Gradle are published to [Bintray](https://bintray.com/kotlin/kotlin-js-wrappers).

**All packages require JDK 8 to be installed.**

## Examples

1. [To-do list example](examples/src/main/kotlin/example/Todo.kt) 

2. [Tic-Tac-Toe example](examples/src/main/kotlin/example/TicTacToe.kt)

3. A port of "Thinking in React" [example](examples/src/main/kotlin/example/Product.kt)

4. An [example of using axios](examples/src/main/kotlin/example/AxiosSearch.kt) to fetch remote data. It also 
demonstrates how to add typings for an external library.

5. An [example of using Quill](examples/src/main/kotlin/example/Quill.kt) that shows how to use an external React component.

Follow these examples to learn how to start developing your React apps with Kotlin. Good luck and have fun! 
You also can clone [my-kotlin-react-sample](https://github.com/ScottHuangZL/my-kotlin-app) to see the result directly.

## Contributing

Contributions to this project are welcome! Please see the open 
[issues](https://github.com/JetBrains/kotlin-wrappers/issues) or chat with us on the **#react** channel in our 
[Slack](https://slack.kotlinlang.org/). 
