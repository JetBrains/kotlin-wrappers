plugins {
    kotlin("js") apply false
}

subprojects {
    repositories {
        mavenCentral()
    }
}

tasks.wrapper {
    gradleVersion = "7.2"
}
