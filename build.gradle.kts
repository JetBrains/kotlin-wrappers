plugins {
    kotlin("js") apply false
    `node-conventions`
}

tasks.wrapper {
    gradleVersion = "7.3.2"
}
